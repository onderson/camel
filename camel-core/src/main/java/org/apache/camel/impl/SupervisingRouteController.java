/**
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.impl;

import java.util.Collection;
import java.util.EventObject;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

import org.apache.camel.CamelContext;
import org.apache.camel.Exchange;
import org.apache.camel.Experimental;
import org.apache.camel.Route;
import org.apache.camel.RuntimeCamelException;
import org.apache.camel.ServiceStatus;
import org.apache.camel.StartupListener;
import org.apache.camel.management.event.CamelContextStartedEvent;
import org.apache.camel.model.RouteDefinition;
import org.apache.camel.spi.HasId;
import org.apache.camel.spi.RouteContext;
import org.apache.camel.spi.RouteController;
import org.apache.camel.spi.RoutePolicy;
import org.apache.camel.spi.RoutePolicyFactory;
import org.apache.camel.support.EventNotifierSupport;
import org.apache.camel.util.ObjectHelper;
import org.apache.camel.util.backoff.BackOff;
import org.apache.camel.util.backoff.BackOffContext;
import org.apache.camel.util.backoff.BackOffTimer;
import org.apache.camel.util.function.ThrowingConsumer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * A simple implementation of the {@link RouteController} that delays the startup
 * of the routes after the camel context startup and retries to start failing routes.
 *
 * NOTE: this is experimental/unstable.
 */
@Experimental
public class SupervisingRouteController extends DefaultRouteController {
    private static final Logger LOGGER = LoggerFactory.getLogger(SupervisingRouteController.class);
    private final Object lock;
    private final AtomicBoolean contextStarted;
    private final AtomicInteger routeCount;
    private final Set<RouteHolder> routes;
    private final CamelContextStartupListener listener;
    private final RouteManager routeManager;
    private BackOffTimer timer;
    private ScheduledExecutorService executorService;
    private BackOff defaultBackOff;
    private Map<String, BackOff> backOffConfigurations;

    public SupervisingRouteController() {
        this.lock = new Object();
        this.contextStarted = new AtomicBoolean(false);
        this.routeCount = new AtomicInteger(0);
        this.routes = new TreeSet<>();
        this.routeManager = new RouteManager();
        this.defaultBackOff = BackOff.builder().build();
        this.backOffConfigurations = new HashMap<>();

        try {
            this.listener = new CamelContextStartupListener();
            this.listener.start();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    // *********************************
    // Properties
    // *********************************

    public BackOff getDefaultBackOff() {
        return defaultBackOff;
    }

    public void setDefaultBackOff(BackOff defaultBackOff) {
        this.defaultBackOff = defaultBackOff;
    }

    public Map<String, BackOff> getBackOffConfigurations() {
        return backOffConfigurations;
    }

    public void setBackOffConfigurations(Map<String, BackOff> backOffConfigurations) {
        this.backOffConfigurations = backOffConfigurations;
    }

    public BackOff getBackOff(String id) {
        return backOffConfigurations.getOrDefault(id, defaultBackOff);
    }

    public void setBackOff(String id, BackOff backOff) {
        backOffConfigurations.put(id, backOff);
    }

    // *********************************
    // Lifecycle
    // *********************************

    @Override
    protected void doStart() throws Exception {
        final CamelContext context = getCamelContext();

        context.setAutoStartup(false);
        context.addRoutePolicyFactory(new ManagedRoutePolicyFactory());
        context.addStartupListener(this.listener);
        context.getManagementStrategy().addEventNotifier(this.listener);

        executorService = context.getExecutorServiceManager().newSingleThreadScheduledExecutor(this, "SupervisingRouteController");
        timer = new BackOffTimer(executorService);
    }

    @Override
    protected void doStop() throws Exception {
        if (getCamelContext() != null && executorService != null) {
            getCamelContext().getExecutorServiceManager().shutdown(executorService);
            executorService = null;
            timer = null;
        }
    }

    @Override
    protected void doShutdown() throws Exception {
        if (getCamelContext() != null) {
            getCamelContext().getManagementStrategy().removeEventNotifier(listener);
        }
    }

    // *********************************
    // Route management
    // *********************************

    @Override
    public void startRoute(String routeId) throws Exception {
        final Optional<RouteHolder> route = routes.stream().filter(r -> r.getId().equals(routeId)).findFirst();

        if (!route.isPresent()) {
            // This route is unknown to this controller, apply default behaviour
            // from super class.
            super.startRoute(routeId);
        } else {
            doStartRoute(route.get(), true, r -> super.startRoute(routeId));
        }
    }

    @Override
    public void stopRoute(String routeId) throws Exception {
        final Optional<RouteHolder> route = routes.stream().filter(r -> r.getId().equals(routeId)).findFirst();

        if (!route.isPresent()) {
            // This route is unknown to this controller, apply default behaviour
            // from super class.
            super.stopRoute(routeId);
        } else {
            doStopRoute(route.get(), true, r -> super.stopRoute(routeId));
        }
    }

    @Override
    public void stopRoute(String routeId, long timeout, TimeUnit timeUnit) throws Exception {
        final Optional<RouteHolder> route = routes.stream().filter(r -> r.getId().equals(routeId)).findFirst();

        if (!route.isPresent()) {
            // This route is unknown to this controller, apply default behaviour
            // from super class.
            super.stopRoute(routeId, timeout, timeUnit);
        } else {
            doStopRoute(route.get(), true, r -> super.stopRoute(r.getId(), timeout, timeUnit));
        }
    }

    @Override
    public boolean stopRoute(String routeId, long timeout, TimeUnit timeUnit, boolean abortAfterTimeout) throws Exception {
        final Optional<RouteHolder> route = routes.stream().filter(r -> r.getId().equals(routeId)).findFirst();

        if (!route.isPresent()) {
            // This route is unknown to this controller, apply default behaviour
            // from super class.
            return super.stopRoute(routeId, timeout, timeUnit, abortAfterTimeout);
        } else {
            final AtomicBoolean result = new AtomicBoolean(false);

            doStopRoute(route.get(), true, r -> result.set(super.stopRoute(r.getId(), timeout, timeUnit, abortAfterTimeout)));
            return result.get();
        }
    }

    @Override
    public void suspendRoute(String routeId) throws Exception {
        final Optional<RouteHolder> route = routes.stream().filter(r -> r.getId().equals(routeId)).findFirst();

        if (!route.isPresent()) {
            // This route is unknown to this controller, apply default behaviour
            // from super class.
            super.suspendRoute(routeId);
        } else {
            doStopRoute(route.get(), true, r -> super.suspendRoute(r.getId()));
        }
    }

    @Override
    public void suspendRoute(String routeId, long timeout, TimeUnit timeUnit) throws Exception {
        final Optional<RouteHolder> route = routes.stream().filter(r -> r.getId().equals(routeId)).findFirst();

        if (!route.isPresent()) {
            // This route is unknown to this controller, apply default behaviour
            // from super class.
            super.suspendRoute(routeId, timeout, timeUnit);
        } else {
            doStopRoute(route.get(), true, r -> super.suspendRoute(r.getId(), timeout, timeUnit));
        }
    }

    @Override
    public void resumeRoute(String routeId) throws Exception {
        final Optional<RouteHolder> route = routes.stream().filter(r -> r.getId().equals(routeId)).findFirst();

        if (!route.isPresent()) {
            // This route is unknown to this controller, apply default behaviour
            // from super class.
            super.resumeRoute(routeId);
        } else {
            doStartRoute(route.get(), true, r -> super.startRoute(routeId));
        }
    }

    // *********************************
    // Helpers
    // *********************************

    private void doStopRoute(RouteHolder route,  boolean checker, ThrowingConsumer<RouteHolder, Exception> consumer) throws Exception {
        synchronized (lock) {
            if (checker) {
                // remove them from checked routes so they don't get started by the
                // routes check task as a manual operation on the routes indicates that
                // the route is then managed manually
                routeManager.release(route);
            }

            ServiceStatus status = route.getStatus();
            if (!status.isStoppable()) {
                LOGGER.debug("Route {} status is {}, skipping", route.getId(), status);
                return;
            }

            consumer.accept(route);

            // Mark the route as un-managed
            route.getContext().setRouteController(null);
        }
    }

    private void doStartRoute(RouteHolder route, boolean checker, ThrowingConsumer<RouteHolder, Exception> consumer) throws Exception {
        synchronized (lock) {
            ServiceStatus status = route.getStatus();
            if (!status.isStartable()) {
                LOGGER.debug("Route {} status is {}, skipping", route.getId(), status);
                return;
            }

            try {
                if (checker) {
                    routeManager.release(route);
                }

                // Mark the route as managed
                route.getContext().setRouteController(this);

                consumer.accept(route);
            } catch (Exception e) {

                if (checker) {
                    // if start fails the route is moved to controller supervision
                    // so its get (eventually) restarted
                    routeManager.start(route);
                }

                throw e;
            }
        }
    }

    private void startRoutes() {
        if (!isRunAllowed()) {
            return;
        }

        final List<String> routeList;

        synchronized (lock) {
            routeList = routes.stream()
                .filter(r -> r.getStatus() == ServiceStatus.Stopped)
                .map(RouteHolder::getId)
                .collect(Collectors.toList());
        }

        for (String route: routeList) {
            try {
                startRoute(route);
            } catch (Exception e) {
                // ignored, exception handled by startRoute
            }
        }
    }

    private synchronized void stopRoutes() {
        if (!isRunAllowed()) {
            return;
        }

        final List<String> routeList;

        synchronized (lock) {
            routeList = routes.stream()
                .filter(r -> r.getStatus() == ServiceStatus.Started)
                .map(RouteHolder::getId)
                .collect(Collectors.toList());
        }

        for (String route: routeList) {
            try {
                stopRoute(route);
            } catch (Exception e) {
                // ignored, exception handled by stopRoute
            }
        }
    }

    // *********************************
    // RouteChecker
    // *********************************

    private class RouteManager {
        private final Logger logger;
        private final ConcurrentMap<RouteHolder, CompletableFuture<BackOffContext>> routes;

        RouteManager() {
            this.logger = LoggerFactory.getLogger(RouteManager.class);
            this.routes = new ConcurrentHashMap<>();
        }

        void start(RouteHolder route) {
            route.getContext().setRouteController(SupervisingRouteController.this);

            routes.computeIfAbsent(
                route,
                r -> {
                    BackOff backOff = getBackOff(r.getId());

                    logger.info("Start supervising route: {} with back-off: {}", r.getId(), backOff);

                    // Return this future as cancel does not have effect on the
                    // computation (future chain)
                    CompletableFuture<BackOffContext> future = timer.schedule(backOff, context -> {
                        try {
                            logger.info("Try to restart route: {}", r.getId());

                            doStartRoute(r, false, rx -> SupervisingRouteController.super.startRoute(rx.getId()));
                            return false;
                        } catch (Exception e) {
                            return true;
                        }
                    });

                    future.whenComplete((context, throwable) -> {
                        if (context == null || context.isExhausted()) {
                            // This indicates that the future has been cancelled
                            // or that back-off retry is exhausted thus if the
                            // route is not started it is moved out of the supervisor.

                            if (context != null && context.isExhausted()) {
                                LOGGER.info("Back-off for route {} is exhausted, no more attempts will be made", route.getId());
                            }

                            synchronized (lock) {
                                final ServiceStatus status = route.getStatus();

                                if (status.isStopped() || status.isStopping()) {
                                    LOGGER.info("Route {} has status {}, stop supervising it", route.getId(), status);

                                    r.getContext().setRouteController(null);
                                }
                            }
                        }

                        routes.remove(r);
                    });

                    return future;
                }
            );
        }

        boolean release(RouteHolder route) {
            CompletableFuture<BackOffContext> future = routes.remove(route);
            if (future != null) {
                future.cancel(true);
            }

            return future != null;
        }

        void clear() {
            routes.forEach((k, v) -> v.cancel(true));
            routes.clear();
        }

        boolean isSupervising(RouteHolder route) {
            return routes.containsKey(route);
        }

        Collection<RouteHolder> routes() {
            return routes.keySet();
        }
    }

    // *********************************
    //
    // *********************************

    private class RouteHolder implements HasId, Comparable<RouteHolder> {
        private final int order;
        private final Route route;

        RouteHolder(Route route, int order) {
            this.route = route;
            this.order = order;
        }

        @Override
        public String getId() {
            return this.route.getId();
        }

        public Route get() {
            return this.route;
        }

        public RouteContext getContext() {
            return this.route.getRouteContext();
        }

        public RouteDefinition getDefinition() {
            return this.route.getRouteContext().getRoute();
        }

        public ServiceStatus getStatus() {
            return getContext().getCamelContext().getRouteStatus(getId());
        }

        public int getInitializationOrder() {
            return order;
        }

        public int getStartupOrder() {
            Integer order = getDefinition().getStartupOrder();
            if (order == null) {
                order = Integer.MAX_VALUE;
            }

            return order;
        }

        @Override
        public int compareTo(RouteHolder o) {
            int answer = Integer.compare(getStartupOrder(), o.getStartupOrder());
            if (answer == 0) {
                answer = Integer.compare(getInitializationOrder(), o.getInitializationOrder());
            }

            return answer;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }

            return this.route.equals(((RouteHolder)o).route);
        }

        @Override
        public int hashCode() {
            return route.hashCode();
        }
    }

    // *********************************
    // Policies
    // *********************************

    private class ManagedRoutePolicyFactory implements RoutePolicyFactory {
        private final RoutePolicy policy = new ManagedRoutePolicy();

        @Override
        public RoutePolicy createRoutePolicy(CamelContext camelContext, String routeId, RouteDefinition route) {
            return policy;
        }
    }

    private class ManagedRoutePolicy implements RoutePolicy {
        @Override
        public void onInit(Route route) {
            RouteHolder holder = new RouteHolder(route, routeCount.incrementAndGet());
            if (routes.add(holder)) {
                holder.getContext().setRouteController(SupervisingRouteController.this);
                holder.getDefinition().setAutoStartup("false");

                if (contextStarted.get()) {
                    LOGGER.debug("Context is started: attempt to start route {}", route.getId());
                    try {
                        SupervisingRouteController.this.doStartRoute(
                            holder,
                            true,
                            r -> SupervisingRouteController.super.startRoute(r.getId())
                        );
                    } catch (Exception e) {
                        throw new RuntimeCamelException(e);
                    }
                } else {
                    LOGGER.debug("Context is not started: add route {} to stopped routes", holder.getId());
                }
            }
        }

        @Override
        public void onRemove(Route route) {
            synchronized (lock) {
                routes.removeIf(
                    r -> ObjectHelper.equal(r.get(), route) || ObjectHelper.equal(r.getId(), route.getId())
                );
            }
        }

        @Override
        public void onStart(Route route) {
        }

        @Override
        public void onStop(Route route) {
        }

        @Override
        public void onSuspend(Route route) {
        }

        @Override
        public void onResume(Route route) {
        }

        @Override
        public void onExchangeBegin(Route route, Exchange exchange) {
            // NO-OP
        }

        @Override
        public void onExchangeDone(Route route, Exchange exchange) {
            // NO-OP
        }
    }

    private class CamelContextStartupListener extends EventNotifierSupport implements StartupListener {
        @Override
        public void notify(EventObject event) throws Exception {
            onCamelContextStarted();
        }

        @Override
        public boolean isEnabled(EventObject event) {
            return event instanceof CamelContextStartedEvent;
        }

        @Override
        public void onCamelContextStarted(CamelContext context, boolean alreadyStarted) throws Exception {
            if (alreadyStarted) {
                // Invoke it only if the context was already started as this
                // method is not invoked at last event as documented but after
                // routes warm-up so this is useful for routes deployed after
                // the camel context has been started-up. For standard routes
                // configuration the notification of the camel context started
                // is provided by EventNotifier.
                //
                // We should check why this callback is not invoked at latest
                // stage, or maybe rename it as it is misleading and provide a
                // better alternative for intercept camel events.
                onCamelContextStarted();
            }
        }

        private void onCamelContextStarted() {
            // Start managing the routes only when the camel context is started
            // so start/stop of managed routes do not clash with CamelContext
            // startup
            if (contextStarted.compareAndSet(false, true)) {
                startRoutes();
            }
        }
    }
}
