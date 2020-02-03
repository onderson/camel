/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.google.calendar;

import java.util.HashMap;
import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class GoogleCalendarEndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer {

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
        case "accessToken": ((GoogleCalendarEndpoint) target).getConfiguration().setAccessToken(property(camelContext, java.lang.String.class, value)); return true;
        case "applicationName": ((GoogleCalendarEndpoint) target).getConfiguration().setApplicationName(property(camelContext, java.lang.String.class, value)); return true;
        case "clientId": ((GoogleCalendarEndpoint) target).getConfiguration().setClientId(property(camelContext, java.lang.String.class, value)); return true;
        case "clientSecret": ((GoogleCalendarEndpoint) target).getConfiguration().setClientSecret(property(camelContext, java.lang.String.class, value)); return true;
        case "emailAddress": ((GoogleCalendarEndpoint) target).getConfiguration().setEmailAddress(property(camelContext, java.lang.String.class, value)); return true;
        case "inBody": ((GoogleCalendarEndpoint) target).setInBody(property(camelContext, java.lang.String.class, value)); return true;
        case "p12FileName": ((GoogleCalendarEndpoint) target).getConfiguration().setP12FileName(property(camelContext, java.lang.String.class, value)); return true;
        case "refreshToken": ((GoogleCalendarEndpoint) target).getConfiguration().setRefreshToken(property(camelContext, java.lang.String.class, value)); return true;
        case "scopes": ((GoogleCalendarEndpoint) target).getConfiguration().setScopes(property(camelContext, java.lang.String.class, value)); return true;
        case "user": ((GoogleCalendarEndpoint) target).getConfiguration().setUser(property(camelContext, java.lang.String.class, value)); return true;
        case "bridgeErrorHandler": ((GoogleCalendarEndpoint) target).setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "sendEmptyMessageWhenIdle": ((GoogleCalendarEndpoint) target).setSendEmptyMessageWhenIdle(property(camelContext, boolean.class, value)); return true;
        case "exceptionHandler": ((GoogleCalendarEndpoint) target).setExceptionHandler(property(camelContext, org.apache.camel.spi.ExceptionHandler.class, value)); return true;
        case "exchangePattern": ((GoogleCalendarEndpoint) target).setExchangePattern(property(camelContext, org.apache.camel.ExchangePattern.class, value)); return true;
        case "pollStrategy": ((GoogleCalendarEndpoint) target).setPollStrategy(property(camelContext, org.apache.camel.spi.PollingConsumerPollStrategy.class, value)); return true;
        case "lazyStartProducer": ((GoogleCalendarEndpoint) target).setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "basicPropertyBinding": ((GoogleCalendarEndpoint) target).setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "synchronous": ((GoogleCalendarEndpoint) target).setSynchronous(property(camelContext, boolean.class, value)); return true;
        case "backoffErrorThreshold": ((GoogleCalendarEndpoint) target).setBackoffErrorThreshold(property(camelContext, int.class, value)); return true;
        case "backoffIdleThreshold": ((GoogleCalendarEndpoint) target).setBackoffIdleThreshold(property(camelContext, int.class, value)); return true;
        case "backoffMultiplier": ((GoogleCalendarEndpoint) target).setBackoffMultiplier(property(camelContext, int.class, value)); return true;
        case "delay": ((GoogleCalendarEndpoint) target).setDelay(property(camelContext, long.class, value)); return true;
        case "greedy": ((GoogleCalendarEndpoint) target).setGreedy(property(camelContext, boolean.class, value)); return true;
        case "initialDelay": ((GoogleCalendarEndpoint) target).setInitialDelay(property(camelContext, long.class, value)); return true;
        case "repeatCount": ((GoogleCalendarEndpoint) target).setRepeatCount(property(camelContext, long.class, value)); return true;
        case "runLoggingLevel": ((GoogleCalendarEndpoint) target).setRunLoggingLevel(property(camelContext, org.apache.camel.LoggingLevel.class, value)); return true;
        case "scheduledExecutorService": ((GoogleCalendarEndpoint) target).setScheduledExecutorService(property(camelContext, java.util.concurrent.ScheduledExecutorService.class, value)); return true;
        case "scheduler": ((GoogleCalendarEndpoint) target).setScheduler(property(camelContext, java.lang.String.class, value)); return true;
        case "schedulerProperties": ((GoogleCalendarEndpoint) target).setSchedulerProperties(property(camelContext, java.util.Map.class, value)); return true;
        case "startScheduler": ((GoogleCalendarEndpoint) target).setStartScheduler(property(camelContext, boolean.class, value)); return true;
        case "timeUnit": ((GoogleCalendarEndpoint) target).setTimeUnit(property(camelContext, java.util.concurrent.TimeUnit.class, value)); return true;
        case "useFixedDelay": ((GoogleCalendarEndpoint) target).setUseFixedDelay(property(camelContext, boolean.class, value)); return true;
            default: return false;
        }
    }

    private static boolean doConfigureIgnoreCase(CamelContext camelContext, Object target, String name, Object value) {
        switch (name.toLowerCase()) {
        case "accesstoken": ((GoogleCalendarEndpoint) target).getConfiguration().setAccessToken(property(camelContext, java.lang.String.class, value)); return true;
        case "applicationname": ((GoogleCalendarEndpoint) target).getConfiguration().setApplicationName(property(camelContext, java.lang.String.class, value)); return true;
        case "clientid": ((GoogleCalendarEndpoint) target).getConfiguration().setClientId(property(camelContext, java.lang.String.class, value)); return true;
        case "clientsecret": ((GoogleCalendarEndpoint) target).getConfiguration().setClientSecret(property(camelContext, java.lang.String.class, value)); return true;
        case "emailaddress": ((GoogleCalendarEndpoint) target).getConfiguration().setEmailAddress(property(camelContext, java.lang.String.class, value)); return true;
        case "inbody": ((GoogleCalendarEndpoint) target).setInBody(property(camelContext, java.lang.String.class, value)); return true;
        case "p12filename": ((GoogleCalendarEndpoint) target).getConfiguration().setP12FileName(property(camelContext, java.lang.String.class, value)); return true;
        case "refreshtoken": ((GoogleCalendarEndpoint) target).getConfiguration().setRefreshToken(property(camelContext, java.lang.String.class, value)); return true;
        case "scopes": ((GoogleCalendarEndpoint) target).getConfiguration().setScopes(property(camelContext, java.lang.String.class, value)); return true;
        case "user": ((GoogleCalendarEndpoint) target).getConfiguration().setUser(property(camelContext, java.lang.String.class, value)); return true;
        case "bridgeerrorhandler": ((GoogleCalendarEndpoint) target).setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "sendemptymessagewhenidle": ((GoogleCalendarEndpoint) target).setSendEmptyMessageWhenIdle(property(camelContext, boolean.class, value)); return true;
        case "exceptionhandler": ((GoogleCalendarEndpoint) target).setExceptionHandler(property(camelContext, org.apache.camel.spi.ExceptionHandler.class, value)); return true;
        case "exchangepattern": ((GoogleCalendarEndpoint) target).setExchangePattern(property(camelContext, org.apache.camel.ExchangePattern.class, value)); return true;
        case "pollstrategy": ((GoogleCalendarEndpoint) target).setPollStrategy(property(camelContext, org.apache.camel.spi.PollingConsumerPollStrategy.class, value)); return true;
        case "lazystartproducer": ((GoogleCalendarEndpoint) target).setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "basicpropertybinding": ((GoogleCalendarEndpoint) target).setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "synchronous": ((GoogleCalendarEndpoint) target).setSynchronous(property(camelContext, boolean.class, value)); return true;
        case "backofferrorthreshold": ((GoogleCalendarEndpoint) target).setBackoffErrorThreshold(property(camelContext, int.class, value)); return true;
        case "backoffidlethreshold": ((GoogleCalendarEndpoint) target).setBackoffIdleThreshold(property(camelContext, int.class, value)); return true;
        case "backoffmultiplier": ((GoogleCalendarEndpoint) target).setBackoffMultiplier(property(camelContext, int.class, value)); return true;
        case "delay": ((GoogleCalendarEndpoint) target).setDelay(property(camelContext, long.class, value)); return true;
        case "greedy": ((GoogleCalendarEndpoint) target).setGreedy(property(camelContext, boolean.class, value)); return true;
        case "initialdelay": ((GoogleCalendarEndpoint) target).setInitialDelay(property(camelContext, long.class, value)); return true;
        case "repeatcount": ((GoogleCalendarEndpoint) target).setRepeatCount(property(camelContext, long.class, value)); return true;
        case "runlogginglevel": ((GoogleCalendarEndpoint) target).setRunLoggingLevel(property(camelContext, org.apache.camel.LoggingLevel.class, value)); return true;
        case "scheduledexecutorservice": ((GoogleCalendarEndpoint) target).setScheduledExecutorService(property(camelContext, java.util.concurrent.ScheduledExecutorService.class, value)); return true;
        case "scheduler": ((GoogleCalendarEndpoint) target).setScheduler(property(camelContext, java.lang.String.class, value)); return true;
        case "schedulerproperties": ((GoogleCalendarEndpoint) target).setSchedulerProperties(property(camelContext, java.util.Map.class, value)); return true;
        case "startscheduler": ((GoogleCalendarEndpoint) target).setStartScheduler(property(camelContext, boolean.class, value)); return true;
        case "timeunit": ((GoogleCalendarEndpoint) target).setTimeUnit(property(camelContext, java.util.concurrent.TimeUnit.class, value)); return true;
        case "usefixeddelay": ((GoogleCalendarEndpoint) target).setUseFixedDelay(property(camelContext, boolean.class, value)); return true;
            default: return false;
        }
    }

}

