/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.olingo2;

import java.util.HashMap;
import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class Olingo2EndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer {

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
        case "connectTimeout": ((Olingo2Endpoint) target).getConfiguration().setConnectTimeout(property(camelContext, int.class, value)); return true;
        case "contentType": ((Olingo2Endpoint) target).getConfiguration().setContentType(property(camelContext, java.lang.String.class, value)); return true;
        case "filterAlreadySeen": ((Olingo2Endpoint) target).getConfiguration().setFilterAlreadySeen(property(camelContext, boolean.class, value)); return true;
        case "httpAsyncClientBuilder": ((Olingo2Endpoint) target).getConfiguration().setHttpAsyncClientBuilder(property(camelContext, org.apache.http.impl.nio.client.HttpAsyncClientBuilder.class, value)); return true;
        case "httpClientBuilder": ((Olingo2Endpoint) target).getConfiguration().setHttpClientBuilder(property(camelContext, org.apache.http.impl.client.HttpClientBuilder.class, value)); return true;
        case "httpHeaders": ((Olingo2Endpoint) target).getConfiguration().setHttpHeaders(property(camelContext, java.util.Map.class, value)); return true;
        case "inBody": ((Olingo2Endpoint) target).setInBody(property(camelContext, java.lang.String.class, value)); return true;
        case "proxy": ((Olingo2Endpoint) target).getConfiguration().setProxy(property(camelContext, org.apache.http.HttpHost.class, value)); return true;
        case "serviceUri": ((Olingo2Endpoint) target).getConfiguration().setServiceUri(property(camelContext, java.lang.String.class, value)); return true;
        case "socketTimeout": ((Olingo2Endpoint) target).getConfiguration().setSocketTimeout(property(camelContext, int.class, value)); return true;
        case "sslContextParameters": ((Olingo2Endpoint) target).getConfiguration().setSslContextParameters(property(camelContext, org.apache.camel.support.jsse.SSLContextParameters.class, value)); return true;
        case "bridgeErrorHandler": ((Olingo2Endpoint) target).setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "sendEmptyMessageWhenIdle": ((Olingo2Endpoint) target).setSendEmptyMessageWhenIdle(property(camelContext, boolean.class, value)); return true;
        case "splitResult": ((Olingo2Endpoint) target).getConfiguration().setSplitResult(property(camelContext, boolean.class, value)); return true;
        case "exceptionHandler": ((Olingo2Endpoint) target).setExceptionHandler(property(camelContext, org.apache.camel.spi.ExceptionHandler.class, value)); return true;
        case "exchangePattern": ((Olingo2Endpoint) target).setExchangePattern(property(camelContext, org.apache.camel.ExchangePattern.class, value)); return true;
        case "pollStrategy": ((Olingo2Endpoint) target).setPollStrategy(property(camelContext, org.apache.camel.spi.PollingConsumerPollStrategy.class, value)); return true;
        case "lazyStartProducer": ((Olingo2Endpoint) target).setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "basicPropertyBinding": ((Olingo2Endpoint) target).setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "synchronous": ((Olingo2Endpoint) target).setSynchronous(property(camelContext, boolean.class, value)); return true;
        case "backoffErrorThreshold": ((Olingo2Endpoint) target).setBackoffErrorThreshold(property(camelContext, int.class, value)); return true;
        case "backoffIdleThreshold": ((Olingo2Endpoint) target).setBackoffIdleThreshold(property(camelContext, int.class, value)); return true;
        case "backoffMultiplier": ((Olingo2Endpoint) target).setBackoffMultiplier(property(camelContext, int.class, value)); return true;
        case "delay": ((Olingo2Endpoint) target).setDelay(property(camelContext, long.class, value)); return true;
        case "greedy": ((Olingo2Endpoint) target).setGreedy(property(camelContext, boolean.class, value)); return true;
        case "initialDelay": ((Olingo2Endpoint) target).setInitialDelay(property(camelContext, long.class, value)); return true;
        case "repeatCount": ((Olingo2Endpoint) target).setRepeatCount(property(camelContext, long.class, value)); return true;
        case "runLoggingLevel": ((Olingo2Endpoint) target).setRunLoggingLevel(property(camelContext, org.apache.camel.LoggingLevel.class, value)); return true;
        case "scheduledExecutorService": ((Olingo2Endpoint) target).setScheduledExecutorService(property(camelContext, java.util.concurrent.ScheduledExecutorService.class, value)); return true;
        case "scheduler": ((Olingo2Endpoint) target).setScheduler(property(camelContext, java.lang.String.class, value)); return true;
        case "schedulerProperties": ((Olingo2Endpoint) target).setSchedulerProperties(property(camelContext, java.util.Map.class, value)); return true;
        case "startScheduler": ((Olingo2Endpoint) target).setStartScheduler(property(camelContext, boolean.class, value)); return true;
        case "timeUnit": ((Olingo2Endpoint) target).setTimeUnit(property(camelContext, java.util.concurrent.TimeUnit.class, value)); return true;
        case "useFixedDelay": ((Olingo2Endpoint) target).setUseFixedDelay(property(camelContext, boolean.class, value)); return true;
            default: return false;
        }
    }

    private static boolean doConfigureIgnoreCase(CamelContext camelContext, Object target, String name, Object value) {
        switch (name.toLowerCase()) {
        case "connecttimeout": ((Olingo2Endpoint) target).getConfiguration().setConnectTimeout(property(camelContext, int.class, value)); return true;
        case "contenttype": ((Olingo2Endpoint) target).getConfiguration().setContentType(property(camelContext, java.lang.String.class, value)); return true;
        case "filteralreadyseen": ((Olingo2Endpoint) target).getConfiguration().setFilterAlreadySeen(property(camelContext, boolean.class, value)); return true;
        case "httpasyncclientbuilder": ((Olingo2Endpoint) target).getConfiguration().setHttpAsyncClientBuilder(property(camelContext, org.apache.http.impl.nio.client.HttpAsyncClientBuilder.class, value)); return true;
        case "httpclientbuilder": ((Olingo2Endpoint) target).getConfiguration().setHttpClientBuilder(property(camelContext, org.apache.http.impl.client.HttpClientBuilder.class, value)); return true;
        case "httpheaders": ((Olingo2Endpoint) target).getConfiguration().setHttpHeaders(property(camelContext, java.util.Map.class, value)); return true;
        case "inbody": ((Olingo2Endpoint) target).setInBody(property(camelContext, java.lang.String.class, value)); return true;
        case "proxy": ((Olingo2Endpoint) target).getConfiguration().setProxy(property(camelContext, org.apache.http.HttpHost.class, value)); return true;
        case "serviceuri": ((Olingo2Endpoint) target).getConfiguration().setServiceUri(property(camelContext, java.lang.String.class, value)); return true;
        case "sockettimeout": ((Olingo2Endpoint) target).getConfiguration().setSocketTimeout(property(camelContext, int.class, value)); return true;
        case "sslcontextparameters": ((Olingo2Endpoint) target).getConfiguration().setSslContextParameters(property(camelContext, org.apache.camel.support.jsse.SSLContextParameters.class, value)); return true;
        case "bridgeerrorhandler": ((Olingo2Endpoint) target).setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "sendemptymessagewhenidle": ((Olingo2Endpoint) target).setSendEmptyMessageWhenIdle(property(camelContext, boolean.class, value)); return true;
        case "splitresult": ((Olingo2Endpoint) target).getConfiguration().setSplitResult(property(camelContext, boolean.class, value)); return true;
        case "exceptionhandler": ((Olingo2Endpoint) target).setExceptionHandler(property(camelContext, org.apache.camel.spi.ExceptionHandler.class, value)); return true;
        case "exchangepattern": ((Olingo2Endpoint) target).setExchangePattern(property(camelContext, org.apache.camel.ExchangePattern.class, value)); return true;
        case "pollstrategy": ((Olingo2Endpoint) target).setPollStrategy(property(camelContext, org.apache.camel.spi.PollingConsumerPollStrategy.class, value)); return true;
        case "lazystartproducer": ((Olingo2Endpoint) target).setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "basicpropertybinding": ((Olingo2Endpoint) target).setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "synchronous": ((Olingo2Endpoint) target).setSynchronous(property(camelContext, boolean.class, value)); return true;
        case "backofferrorthreshold": ((Olingo2Endpoint) target).setBackoffErrorThreshold(property(camelContext, int.class, value)); return true;
        case "backoffidlethreshold": ((Olingo2Endpoint) target).setBackoffIdleThreshold(property(camelContext, int.class, value)); return true;
        case "backoffmultiplier": ((Olingo2Endpoint) target).setBackoffMultiplier(property(camelContext, int.class, value)); return true;
        case "delay": ((Olingo2Endpoint) target).setDelay(property(camelContext, long.class, value)); return true;
        case "greedy": ((Olingo2Endpoint) target).setGreedy(property(camelContext, boolean.class, value)); return true;
        case "initialdelay": ((Olingo2Endpoint) target).setInitialDelay(property(camelContext, long.class, value)); return true;
        case "repeatcount": ((Olingo2Endpoint) target).setRepeatCount(property(camelContext, long.class, value)); return true;
        case "runlogginglevel": ((Olingo2Endpoint) target).setRunLoggingLevel(property(camelContext, org.apache.camel.LoggingLevel.class, value)); return true;
        case "scheduledexecutorservice": ((Olingo2Endpoint) target).setScheduledExecutorService(property(camelContext, java.util.concurrent.ScheduledExecutorService.class, value)); return true;
        case "scheduler": ((Olingo2Endpoint) target).setScheduler(property(camelContext, java.lang.String.class, value)); return true;
        case "schedulerproperties": ((Olingo2Endpoint) target).setSchedulerProperties(property(camelContext, java.util.Map.class, value)); return true;
        case "startscheduler": ((Olingo2Endpoint) target).setStartScheduler(property(camelContext, boolean.class, value)); return true;
        case "timeunit": ((Olingo2Endpoint) target).setTimeUnit(property(camelContext, java.util.concurrent.TimeUnit.class, value)); return true;
        case "usefixeddelay": ((Olingo2Endpoint) target).setUseFixedDelay(property(camelContext, boolean.class, value)); return true;
            default: return false;
        }
    }

}

