/*
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
package org.apache.camel.builder.endpoint.dsl;

import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;
import org.apache.camel.ExchangePattern;
import org.apache.camel.LoggingLevel;
import org.apache.camel.builder.EndpointConsumerBuilder;
import org.apache.camel.builder.EndpointProducerBuilder;
import org.apache.camel.builder.endpoint.AbstractEndpointBuilder;
import org.apache.camel.spi.ExceptionHandler;
import org.apache.camel.spi.PollingConsumerPollStrategy;
import org.apache.camel.spi.ScheduledPollConsumerScheduler;

/**
 * The slack component allows you to send messages to Slack.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface SlackEndpointBuilderFactory {


    /**
     * Builder for endpoint consumers for the Slack component.
     */
    public interface SlackEndpointConsumerBuilder
            extends
                EndpointConsumerBuilder {
        default AdvancedSlackEndpointConsumerBuilder advanced() {
            return (AdvancedSlackEndpointConsumerBuilder) this;
        }
        /**
         * The channel name (syntax #name) or slackuser (syntax userName) to
         * send a message directly to an user.
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        default SlackEndpointConsumerBuilder channel(String channel) {
            setProperty("channel", channel);
            return this;
        }
        /**
         * Allows for bridging the consumer to the Camel routing Error Handler,
         * which mean any exceptions occurred while the consumer is trying to
         * pickup incoming messages, or the likes, will now be processed as a
         * message and handled by the routing Error Handler. By default the
         * consumer will use the org.apache.camel.spi.ExceptionHandler to deal
         * with exceptions, that will be logged at WARN or ERROR level and
         * ignored.
         * The option is a <code>boolean</code> type.
         * @group consumer
         */
        default SlackEndpointConsumerBuilder bridgeErrorHandler(
                boolean bridgeErrorHandler) {
            setProperty("bridgeErrorHandler", bridgeErrorHandler);
            return this;
        }
        /**
         * Allows for bridging the consumer to the Camel routing Error Handler,
         * which mean any exceptions occurred while the consumer is trying to
         * pickup incoming messages, or the likes, will now be processed as a
         * message and handled by the routing Error Handler. By default the
         * consumer will use the org.apache.camel.spi.ExceptionHandler to deal
         * with exceptions, that will be logged at WARN or ERROR level and
         * ignored.
         * The option will be converted to a <code>boolean</code> type.
         * @group consumer
         */
        default SlackEndpointConsumerBuilder bridgeErrorHandler(
                String bridgeErrorHandler) {
            setProperty("bridgeErrorHandler", bridgeErrorHandler);
            return this;
        }
        /**
         * The Max Result for the poll.
         * The option is a <code>java.lang.String</code> type.
         * @group consumer
         */
        default SlackEndpointConsumerBuilder maxResults(String maxResults) {
            setProperty("maxResults", maxResults);
            return this;
        }
        /**
         * If the polling consumer did not poll any files, you can enable this
         * option to send an empty message (no body) instead.
         * The option is a <code>boolean</code> type.
         * @group consumer
         */
        default SlackEndpointConsumerBuilder sendEmptyMessageWhenIdle(
                boolean sendEmptyMessageWhenIdle) {
            setProperty("sendEmptyMessageWhenIdle", sendEmptyMessageWhenIdle);
            return this;
        }
        /**
         * If the polling consumer did not poll any files, you can enable this
         * option to send an empty message (no body) instead.
         * The option will be converted to a <code>boolean</code> type.
         * @group consumer
         */
        default SlackEndpointConsumerBuilder sendEmptyMessageWhenIdle(
                String sendEmptyMessageWhenIdle) {
            setProperty("sendEmptyMessageWhenIdle", sendEmptyMessageWhenIdle);
            return this;
        }
        /**
         * The Server URL of the Slack instance.
         * The option is a <code>java.lang.String</code> type.
         * @group consumer
         */
        default SlackEndpointConsumerBuilder serverUrl(String serverUrl) {
            setProperty("serverUrl", serverUrl);
            return this;
        }
        /**
         * The token to use.
         * The option is a <code>java.lang.String</code> type.
         * @group consumer
         */
        default SlackEndpointConsumerBuilder token(String token) {
            setProperty("token", token);
            return this;
        }
        /**
         * The number of subsequent error polls (failed due some error) that
         * should happen before the backoffMultipler should kick-in.
         * The option is a <code>int</code> type.
         * @group scheduler
         */
        default SlackEndpointConsumerBuilder backoffErrorThreshold(
                int backoffErrorThreshold) {
            setProperty("backoffErrorThreshold", backoffErrorThreshold);
            return this;
        }
        /**
         * The number of subsequent error polls (failed due some error) that
         * should happen before the backoffMultipler should kick-in.
         * The option will be converted to a <code>int</code> type.
         * @group scheduler
         */
        default SlackEndpointConsumerBuilder backoffErrorThreshold(
                String backoffErrorThreshold) {
            setProperty("backoffErrorThreshold", backoffErrorThreshold);
            return this;
        }
        /**
         * The number of subsequent idle polls that should happen before the
         * backoffMultipler should kick-in.
         * The option is a <code>int</code> type.
         * @group scheduler
         */
        default SlackEndpointConsumerBuilder backoffIdleThreshold(
                int backoffIdleThreshold) {
            setProperty("backoffIdleThreshold", backoffIdleThreshold);
            return this;
        }
        /**
         * The number of subsequent idle polls that should happen before the
         * backoffMultipler should kick-in.
         * The option will be converted to a <code>int</code> type.
         * @group scheduler
         */
        default SlackEndpointConsumerBuilder backoffIdleThreshold(
                String backoffIdleThreshold) {
            setProperty("backoffIdleThreshold", backoffIdleThreshold);
            return this;
        }
        /**
         * To let the scheduled polling consumer backoff if there has been a
         * number of subsequent idles/errors in a row. The multiplier is then
         * the number of polls that will be skipped before the next actual
         * attempt is happening again. When this option is in use then
         * backoffIdleThreshold and/or backoffErrorThreshold must also be
         * configured.
         * The option is a <code>int</code> type.
         * @group scheduler
         */
        default SlackEndpointConsumerBuilder backoffMultiplier(
                int backoffMultiplier) {
            setProperty("backoffMultiplier", backoffMultiplier);
            return this;
        }
        /**
         * To let the scheduled polling consumer backoff if there has been a
         * number of subsequent idles/errors in a row. The multiplier is then
         * the number of polls that will be skipped before the next actual
         * attempt is happening again. When this option is in use then
         * backoffIdleThreshold and/or backoffErrorThreshold must also be
         * configured.
         * The option will be converted to a <code>int</code> type.
         * @group scheduler
         */
        default SlackEndpointConsumerBuilder backoffMultiplier(
                String backoffMultiplier) {
            setProperty("backoffMultiplier", backoffMultiplier);
            return this;
        }
        /**
         * Milliseconds before the next poll. You can also specify time values
         * using units, such as 60s (60 seconds), 5m30s (5 minutes and 30
         * seconds), and 1h (1 hour).
         * The option is a <code>long</code> type.
         * @group scheduler
         */
        default SlackEndpointConsumerBuilder delay(long delay) {
            setProperty("delay", delay);
            return this;
        }
        /**
         * Milliseconds before the next poll. You can also specify time values
         * using units, such as 60s (60 seconds), 5m30s (5 minutes and 30
         * seconds), and 1h (1 hour).
         * The option will be converted to a <code>long</code> type.
         * @group scheduler
         */
        default SlackEndpointConsumerBuilder delay(String delay) {
            setProperty("delay", delay);
            return this;
        }
        /**
         * If greedy is enabled, then the ScheduledPollConsumer will run
         * immediately again, if the previous run polled 1 or more messages.
         * The option is a <code>boolean</code> type.
         * @group scheduler
         */
        default SlackEndpointConsumerBuilder greedy(boolean greedy) {
            setProperty("greedy", greedy);
            return this;
        }
        /**
         * If greedy is enabled, then the ScheduledPollConsumer will run
         * immediately again, if the previous run polled 1 or more messages.
         * The option will be converted to a <code>boolean</code> type.
         * @group scheduler
         */
        default SlackEndpointConsumerBuilder greedy(String greedy) {
            setProperty("greedy", greedy);
            return this;
        }
        /**
         * Milliseconds before the first poll starts. You can also specify time
         * values using units, such as 60s (60 seconds), 5m30s (5 minutes and 30
         * seconds), and 1h (1 hour).
         * The option is a <code>long</code> type.
         * @group scheduler
         */
        default SlackEndpointConsumerBuilder initialDelay(long initialDelay) {
            setProperty("initialDelay", initialDelay);
            return this;
        }
        /**
         * Milliseconds before the first poll starts. You can also specify time
         * values using units, such as 60s (60 seconds), 5m30s (5 minutes and 30
         * seconds), and 1h (1 hour).
         * The option will be converted to a <code>long</code> type.
         * @group scheduler
         */
        default SlackEndpointConsumerBuilder initialDelay(String initialDelay) {
            setProperty("initialDelay", initialDelay);
            return this;
        }
        /**
         * The consumer logs a start/complete log line when it polls. This
         * option allows you to configure the logging level for that.
         * The option is a <code>org.apache.camel.LoggingLevel</code> type.
         * @group scheduler
         */
        default SlackEndpointConsumerBuilder runLoggingLevel(
                LoggingLevel runLoggingLevel) {
            setProperty("runLoggingLevel", runLoggingLevel);
            return this;
        }
        /**
         * The consumer logs a start/complete log line when it polls. This
         * option allows you to configure the logging level for that.
         * The option will be converted to a
         * <code>org.apache.camel.LoggingLevel</code> type.
         * @group scheduler
         */
        default SlackEndpointConsumerBuilder runLoggingLevel(
                String runLoggingLevel) {
            setProperty("runLoggingLevel", runLoggingLevel);
            return this;
        }
        /**
         * Allows for configuring a custom/shared thread pool to use for the
         * consumer. By default each consumer has its own single threaded thread
         * pool.
         * The option is a
         * <code>java.util.concurrent.ScheduledExecutorService</code> type.
         * @group scheduler
         */
        default SlackEndpointConsumerBuilder scheduledExecutorService(
                ScheduledExecutorService scheduledExecutorService) {
            setProperty("scheduledExecutorService", scheduledExecutorService);
            return this;
        }
        /**
         * Allows for configuring a custom/shared thread pool to use for the
         * consumer. By default each consumer has its own single threaded thread
         * pool.
         * The option will be converted to a
         * <code>java.util.concurrent.ScheduledExecutorService</code> type.
         * @group scheduler
         */
        default SlackEndpointConsumerBuilder scheduledExecutorService(
                String scheduledExecutorService) {
            setProperty("scheduledExecutorService", scheduledExecutorService);
            return this;
        }
        /**
         * To use a cron scheduler from either camel-spring or camel-quartz2
         * component.
         * The option is a
         * <code>org.apache.camel.spi.ScheduledPollConsumerScheduler</code>
         * type.
         * @group scheduler
         */
        default SlackEndpointConsumerBuilder scheduler(
                ScheduledPollConsumerScheduler scheduler) {
            setProperty("scheduler", scheduler);
            return this;
        }
        /**
         * To use a cron scheduler from either camel-spring or camel-quartz2
         * component.
         * The option will be converted to a
         * <code>org.apache.camel.spi.ScheduledPollConsumerScheduler</code>
         * type.
         * @group scheduler
         */
        default SlackEndpointConsumerBuilder scheduler(String scheduler) {
            setProperty("scheduler", scheduler);
            return this;
        }
        /**
         * To configure additional properties when using a custom scheduler or
         * any of the Quartz2, Spring based scheduler.
         * The option is a <code>java.util.Map&lt;java.lang.String,
         * java.lang.Object&gt;</code> type.
         * @group scheduler
         */
        default SlackEndpointConsumerBuilder schedulerProperties(
                Map<String, Object> schedulerProperties) {
            setProperty("schedulerProperties", schedulerProperties);
            return this;
        }
        /**
         * To configure additional properties when using a custom scheduler or
         * any of the Quartz2, Spring based scheduler.
         * The option will be converted to a
         * <code>java.util.Map&lt;java.lang.String, java.lang.Object&gt;</code>
         * type.
         * @group scheduler
         */
        default SlackEndpointConsumerBuilder schedulerProperties(
                String schedulerProperties) {
            setProperty("schedulerProperties", schedulerProperties);
            return this;
        }
        /**
         * Whether the scheduler should be auto started.
         * The option is a <code>boolean</code> type.
         * @group scheduler
         */
        default SlackEndpointConsumerBuilder startScheduler(
                boolean startScheduler) {
            setProperty("startScheduler", startScheduler);
            return this;
        }
        /**
         * Whether the scheduler should be auto started.
         * The option will be converted to a <code>boolean</code> type.
         * @group scheduler
         */
        default SlackEndpointConsumerBuilder startScheduler(
                String startScheduler) {
            setProperty("startScheduler", startScheduler);
            return this;
        }
        /**
         * Time unit for initialDelay and delay options.
         * The option is a <code>java.util.concurrent.TimeUnit</code> type.
         * @group scheduler
         */
        default SlackEndpointConsumerBuilder timeUnit(TimeUnit timeUnit) {
            setProperty("timeUnit", timeUnit);
            return this;
        }
        /**
         * Time unit for initialDelay and delay options.
         * The option will be converted to a
         * <code>java.util.concurrent.TimeUnit</code> type.
         * @group scheduler
         */
        default SlackEndpointConsumerBuilder timeUnit(String timeUnit) {
            setProperty("timeUnit", timeUnit);
            return this;
        }
        /**
         * Controls if fixed delay or fixed rate is used. See
         * ScheduledExecutorService in JDK for details.
         * The option is a <code>boolean</code> type.
         * @group scheduler
         */
        default SlackEndpointConsumerBuilder useFixedDelay(boolean useFixedDelay) {
            setProperty("useFixedDelay", useFixedDelay);
            return this;
        }
        /**
         * Controls if fixed delay or fixed rate is used. See
         * ScheduledExecutorService in JDK for details.
         * The option will be converted to a <code>boolean</code> type.
         * @group scheduler
         */
        default SlackEndpointConsumerBuilder useFixedDelay(String useFixedDelay) {
            setProperty("useFixedDelay", useFixedDelay);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint consumers for the Slack component.
     */
    public interface AdvancedSlackEndpointConsumerBuilder
            extends
                EndpointConsumerBuilder {
        default SlackEndpointConsumerBuilder basic() {
            return (SlackEndpointConsumerBuilder) this;
        }
        /**
         * To let the consumer use a custom ExceptionHandler. Notice if the
         * option bridgeErrorHandler is enabled then this option is not in use.
         * By default the consumer will deal with exceptions, that will be
         * logged at WARN or ERROR level and ignored.
         * The option is a <code>org.apache.camel.spi.ExceptionHandler</code>
         * type.
         * @group consumer (advanced)
         */
        default AdvancedSlackEndpointConsumerBuilder exceptionHandler(
                ExceptionHandler exceptionHandler) {
            setProperty("exceptionHandler", exceptionHandler);
            return this;
        }
        /**
         * To let the consumer use a custom ExceptionHandler. Notice if the
         * option bridgeErrorHandler is enabled then this option is not in use.
         * By default the consumer will deal with exceptions, that will be
         * logged at WARN or ERROR level and ignored.
         * The option will be converted to a
         * <code>org.apache.camel.spi.ExceptionHandler</code> type.
         * @group consumer (advanced)
         */
        default AdvancedSlackEndpointConsumerBuilder exceptionHandler(
                String exceptionHandler) {
            setProperty("exceptionHandler", exceptionHandler);
            return this;
        }
        /**
         * Sets the exchange pattern when the consumer creates an exchange.
         * The option is a <code>org.apache.camel.ExchangePattern</code> type.
         * @group consumer (advanced)
         */
        default AdvancedSlackEndpointConsumerBuilder exchangePattern(
                ExchangePattern exchangePattern) {
            setProperty("exchangePattern", exchangePattern);
            return this;
        }
        /**
         * Sets the exchange pattern when the consumer creates an exchange.
         * The option will be converted to a
         * <code>org.apache.camel.ExchangePattern</code> type.
         * @group consumer (advanced)
         */
        default AdvancedSlackEndpointConsumerBuilder exchangePattern(
                String exchangePattern) {
            setProperty("exchangePattern", exchangePattern);
            return this;
        }
        /**
         * A pluggable org.apache.camel.PollingConsumerPollingStrategy allowing
         * you to provide your custom implementation to control error handling
         * usually occurred during the poll operation before an Exchange have
         * been created and being routed in Camel.
         * The option is a
         * <code>org.apache.camel.spi.PollingConsumerPollStrategy</code> type.
         * @group consumer (advanced)
         */
        default AdvancedSlackEndpointConsumerBuilder pollStrategy(
                PollingConsumerPollStrategy pollStrategy) {
            setProperty("pollStrategy", pollStrategy);
            return this;
        }
        /**
         * A pluggable org.apache.camel.PollingConsumerPollingStrategy allowing
         * you to provide your custom implementation to control error handling
         * usually occurred during the poll operation before an Exchange have
         * been created and being routed in Camel.
         * The option will be converted to a
         * <code>org.apache.camel.spi.PollingConsumerPollStrategy</code> type.
         * @group consumer (advanced)
         */
        default AdvancedSlackEndpointConsumerBuilder pollStrategy(
                String pollStrategy) {
            setProperty("pollStrategy", pollStrategy);
            return this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * The option is a <code>boolean</code> type.
         * @group advanced
         */
        default AdvancedSlackEndpointConsumerBuilder basicPropertyBinding(
                boolean basicPropertyBinding) {
            setProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * The option will be converted to a <code>boolean</code> type.
         * @group advanced
         */
        default AdvancedSlackEndpointConsumerBuilder basicPropertyBinding(
                String basicPropertyBinding) {
            setProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * The option is a <code>boolean</code> type.
         * @group advanced
         */
        default AdvancedSlackEndpointConsumerBuilder synchronous(
                boolean synchronous) {
            setProperty("synchronous", synchronous);
            return this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * The option will be converted to a <code>boolean</code> type.
         * @group advanced
         */
        default AdvancedSlackEndpointConsumerBuilder synchronous(
                String synchronous) {
            setProperty("synchronous", synchronous);
            return this;
        }
    }

    /**
     * Builder for endpoint producers for the Slack component.
     */
    public interface SlackEndpointProducerBuilder
            extends
                EndpointProducerBuilder {
        default AdvancedSlackEndpointProducerBuilder advanced() {
            return (AdvancedSlackEndpointProducerBuilder) this;
        }
        /**
         * The channel name (syntax #name) or slackuser (syntax userName) to
         * send a message directly to an user.
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        default SlackEndpointProducerBuilder channel(String channel) {
            setProperty("channel", channel);
            return this;
        }
        /**
         * Use a Slack emoji as an avatar.
         * The option is a <code>java.lang.String</code> type.
         * @group producer
         */
        default SlackEndpointProducerBuilder iconEmoji(String iconEmoji) {
            setProperty("iconEmoji", iconEmoji);
            return this;
        }
        /**
         * The avatar that the component will use when sending message to a
         * channel or user.
         * The option is a <code>java.lang.String</code> type.
         * @group producer
         */
        default SlackEndpointProducerBuilder iconUrl(String iconUrl) {
            setProperty("iconUrl", iconUrl);
            return this;
        }
        /**
         * Whether the producer should be started lazy (on the first message).
         * By starting lazy you can use this to allow CamelContext and routes to
         * startup in situations where a producer may otherwise fail during
         * starting and cause the route to fail being started. By deferring this
         * startup to be lazy then the startup failure can be handled during
         * routing messages via Camel's routing error handlers. Beware that when
         * the first message is processed then creating and starting the
         * producer may take a little time and prolong the total processing time
         * of the processing.
         * The option is a <code>boolean</code> type.
         * @group producer
         */
        default SlackEndpointProducerBuilder lazyStartProducer(
                boolean lazyStartProducer) {
            setProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * Whether the producer should be started lazy (on the first message).
         * By starting lazy you can use this to allow CamelContext and routes to
         * startup in situations where a producer may otherwise fail during
         * starting and cause the route to fail being started. By deferring this
         * startup to be lazy then the startup failure can be handled during
         * routing messages via Camel's routing error handlers. Beware that when
         * the first message is processed then creating and starting the
         * producer may take a little time and prolong the total processing time
         * of the processing.
         * The option will be converted to a <code>boolean</code> type.
         * @group producer
         */
        default SlackEndpointProducerBuilder lazyStartProducer(
                String lazyStartProducer) {
            setProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * This is the username that the bot will have when sending messages to
         * a channel or user.
         * The option is a <code>java.lang.String</code> type.
         * @group producer
         */
        default SlackEndpointProducerBuilder username(String username) {
            setProperty("username", username);
            return this;
        }
        /**
         * The incoming webhook URL.
         * The option is a <code>java.lang.String</code> type.
         * @group producer
         */
        default SlackEndpointProducerBuilder webhookUrl(String webhookUrl) {
            setProperty("webhookUrl", webhookUrl);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint producers for the Slack component.
     */
    public interface AdvancedSlackEndpointProducerBuilder
            extends
                EndpointProducerBuilder {
        default SlackEndpointProducerBuilder basic() {
            return (SlackEndpointProducerBuilder) this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * The option is a <code>boolean</code> type.
         * @group advanced
         */
        default AdvancedSlackEndpointProducerBuilder basicPropertyBinding(
                boolean basicPropertyBinding) {
            setProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * The option will be converted to a <code>boolean</code> type.
         * @group advanced
         */
        default AdvancedSlackEndpointProducerBuilder basicPropertyBinding(
                String basicPropertyBinding) {
            setProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * The option is a <code>boolean</code> type.
         * @group advanced
         */
        default AdvancedSlackEndpointProducerBuilder synchronous(
                boolean synchronous) {
            setProperty("synchronous", synchronous);
            return this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * The option will be converted to a <code>boolean</code> type.
         * @group advanced
         */
        default AdvancedSlackEndpointProducerBuilder synchronous(
                String synchronous) {
            setProperty("synchronous", synchronous);
            return this;
        }
    }

    /**
     * Builder for endpoint for the Slack component.
     */
    public interface SlackEndpointBuilder
            extends
                SlackEndpointConsumerBuilder, SlackEndpointProducerBuilder {
        default AdvancedSlackEndpointBuilder advanced() {
            return (AdvancedSlackEndpointBuilder) this;
        }
        /**
         * The channel name (syntax #name) or slackuser (syntax userName) to
         * send a message directly to an user.
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        default SlackEndpointBuilder channel(String channel) {
            setProperty("channel", channel);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint for the Slack component.
     */
    public interface AdvancedSlackEndpointBuilder
            extends
                AdvancedSlackEndpointConsumerBuilder, AdvancedSlackEndpointProducerBuilder {
        default SlackEndpointBuilder basic() {
            return (SlackEndpointBuilder) this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * The option is a <code>boolean</code> type.
         * @group advanced
         */
        default AdvancedSlackEndpointBuilder basicPropertyBinding(
                boolean basicPropertyBinding) {
            setProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * The option will be converted to a <code>boolean</code> type.
         * @group advanced
         */
        default AdvancedSlackEndpointBuilder basicPropertyBinding(
                String basicPropertyBinding) {
            setProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * The option is a <code>boolean</code> type.
         * @group advanced
         */
        default AdvancedSlackEndpointBuilder synchronous(boolean synchronous) {
            setProperty("synchronous", synchronous);
            return this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * The option will be converted to a <code>boolean</code> type.
         * @group advanced
         */
        default AdvancedSlackEndpointBuilder synchronous(String synchronous) {
            setProperty("synchronous", synchronous);
            return this;
        }
    }
    /**
     * The slack component allows you to send messages to Slack.
     * Maven coordinates: org.apache.camel:camel-slack
     */
    default SlackEndpointBuilder slack(String path) {
        class SlackEndpointBuilderImpl extends AbstractEndpointBuilder implements SlackEndpointBuilder, AdvancedSlackEndpointBuilder {
            public SlackEndpointBuilderImpl(String path) {
                super("slack", path);
            }
        }
        return new SlackEndpointBuilderImpl(path);
    }
}