/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.jooq;

import java.util.HashMap;
import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class JooqEndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer {

    @Override
    public boolean configure(CamelContext camelContext, Object target, String name, Object value, boolean ignoreCase) {
        if (ignoreCase) {
            return doConfigureIgnoreCase(camelContext, target, name, value);
        } else {
            return doConfigure(camelContext, target, name, value);
        }
    }

    private static boolean doConfigure(CamelContext camelContext, Object target, String name, Object value) {
        switch (name) {
        case "bridgeErrorHandler": ((JooqEndpoint) target).setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "consumeDelete": ((JooqEndpoint) target).getConfiguration().setConsumeDelete(property(camelContext, boolean.class, value)); return true;
        case "sendEmptyMessageWhenIdle": ((JooqEndpoint) target).setSendEmptyMessageWhenIdle(property(camelContext, boolean.class, value)); return true;
        case "exceptionHandler": ((JooqEndpoint) target).setExceptionHandler(property(camelContext, org.apache.camel.spi.ExceptionHandler.class, value)); return true;
        case "exchangePattern": ((JooqEndpoint) target).setExchangePattern(property(camelContext, org.apache.camel.ExchangePattern.class, value)); return true;
        case "pollStrategy": ((JooqEndpoint) target).setPollStrategy(property(camelContext, org.apache.camel.spi.PollingConsumerPollStrategy.class, value)); return true;
        case "lazyStartProducer": ((JooqEndpoint) target).setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "operation": ((JooqEndpoint) target).getConfiguration().setOperation(property(camelContext, org.apache.camel.component.jooq.JooqOperation.class, value)); return true;
        case "query": ((JooqEndpoint) target).getConfiguration().setQuery(property(camelContext, java.lang.String.class, value)); return true;
        case "basicPropertyBinding": ((JooqEndpoint) target).setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "synchronous": ((JooqEndpoint) target).setSynchronous(property(camelContext, boolean.class, value)); return true;
        case "backoffErrorThreshold": ((JooqEndpoint) target).setBackoffErrorThreshold(property(camelContext, int.class, value)); return true;
        case "backoffIdleThreshold": ((JooqEndpoint) target).setBackoffIdleThreshold(property(camelContext, int.class, value)); return true;
        case "backoffMultiplier": ((JooqEndpoint) target).setBackoffMultiplier(property(camelContext, int.class, value)); return true;
        case "delay": ((JooqEndpoint) target).setDelay(property(camelContext, long.class, value)); return true;
        case "greedy": ((JooqEndpoint) target).setGreedy(property(camelContext, boolean.class, value)); return true;
        case "initialDelay": ((JooqEndpoint) target).setInitialDelay(property(camelContext, long.class, value)); return true;
        case "repeatCount": ((JooqEndpoint) target).setRepeatCount(property(camelContext, long.class, value)); return true;
        case "runLoggingLevel": ((JooqEndpoint) target).setRunLoggingLevel(property(camelContext, org.apache.camel.LoggingLevel.class, value)); return true;
        case "scheduledExecutorService": ((JooqEndpoint) target).setScheduledExecutorService(property(camelContext, java.util.concurrent.ScheduledExecutorService.class, value)); return true;
        case "scheduler": ((JooqEndpoint) target).setScheduler(property(camelContext, java.lang.String.class, value)); return true;
        case "schedulerProperties": ((JooqEndpoint) target).setSchedulerProperties(property(camelContext, java.util.Map.class, value)); return true;
        case "startScheduler": ((JooqEndpoint) target).setStartScheduler(property(camelContext, boolean.class, value)); return true;
        case "timeUnit": ((JooqEndpoint) target).setTimeUnit(property(camelContext, java.util.concurrent.TimeUnit.class, value)); return true;
        case "useFixedDelay": ((JooqEndpoint) target).setUseFixedDelay(property(camelContext, boolean.class, value)); return true;
            default: return false;
        }
    }

    private static boolean doConfigureIgnoreCase(CamelContext camelContext, Object target, String name, Object value) {
        switch (name.toLowerCase()) {
        case "bridgeerrorhandler": ((JooqEndpoint) target).setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "consumedelete": ((JooqEndpoint) target).getConfiguration().setConsumeDelete(property(camelContext, boolean.class, value)); return true;
        case "sendemptymessagewhenidle": ((JooqEndpoint) target).setSendEmptyMessageWhenIdle(property(camelContext, boolean.class, value)); return true;
        case "exceptionhandler": ((JooqEndpoint) target).setExceptionHandler(property(camelContext, org.apache.camel.spi.ExceptionHandler.class, value)); return true;
        case "exchangepattern": ((JooqEndpoint) target).setExchangePattern(property(camelContext, org.apache.camel.ExchangePattern.class, value)); return true;
        case "pollstrategy": ((JooqEndpoint) target).setPollStrategy(property(camelContext, org.apache.camel.spi.PollingConsumerPollStrategy.class, value)); return true;
        case "lazystartproducer": ((JooqEndpoint) target).setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "operation": ((JooqEndpoint) target).getConfiguration().setOperation(property(camelContext, org.apache.camel.component.jooq.JooqOperation.class, value)); return true;
        case "query": ((JooqEndpoint) target).getConfiguration().setQuery(property(camelContext, java.lang.String.class, value)); return true;
        case "basicpropertybinding": ((JooqEndpoint) target).setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "synchronous": ((JooqEndpoint) target).setSynchronous(property(camelContext, boolean.class, value)); return true;
        case "backofferrorthreshold": ((JooqEndpoint) target).setBackoffErrorThreshold(property(camelContext, int.class, value)); return true;
        case "backoffidlethreshold": ((JooqEndpoint) target).setBackoffIdleThreshold(property(camelContext, int.class, value)); return true;
        case "backoffmultiplier": ((JooqEndpoint) target).setBackoffMultiplier(property(camelContext, int.class, value)); return true;
        case "delay": ((JooqEndpoint) target).setDelay(property(camelContext, long.class, value)); return true;
        case "greedy": ((JooqEndpoint) target).setGreedy(property(camelContext, boolean.class, value)); return true;
        case "initialdelay": ((JooqEndpoint) target).setInitialDelay(property(camelContext, long.class, value)); return true;
        case "repeatcount": ((JooqEndpoint) target).setRepeatCount(property(camelContext, long.class, value)); return true;
        case "runlogginglevel": ((JooqEndpoint) target).setRunLoggingLevel(property(camelContext, org.apache.camel.LoggingLevel.class, value)); return true;
        case "scheduledexecutorservice": ((JooqEndpoint) target).setScheduledExecutorService(property(camelContext, java.util.concurrent.ScheduledExecutorService.class, value)); return true;
        case "scheduler": ((JooqEndpoint) target).setScheduler(property(camelContext, java.lang.String.class, value)); return true;
        case "schedulerproperties": ((JooqEndpoint) target).setSchedulerProperties(property(camelContext, java.util.Map.class, value)); return true;
        case "startscheduler": ((JooqEndpoint) target).setStartScheduler(property(camelContext, boolean.class, value)); return true;
        case "timeunit": ((JooqEndpoint) target).setTimeUnit(property(camelContext, java.util.concurrent.TimeUnit.class, value)); return true;
        case "usefixeddelay": ((JooqEndpoint) target).setUseFixedDelay(property(camelContext, boolean.class, value)); return true;
            default: return false;
        }
    }

}

