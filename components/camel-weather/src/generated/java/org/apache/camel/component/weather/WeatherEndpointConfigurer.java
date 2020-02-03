/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.weather;

import java.util.HashMap;
import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class WeatherEndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer {

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
        case "appid": ((WeatherEndpoint) target).getConfiguration().setAppid(property(camelContext, java.lang.String.class, value)); return true;
        case "headerName": ((WeatherEndpoint) target).getConfiguration().setHeaderName(property(camelContext, java.lang.String.class, value)); return true;
        case "language": ((WeatherEndpoint) target).getConfiguration().setLanguage(property(camelContext, org.apache.camel.component.weather.WeatherLanguage.class, value)); return true;
        case "mode": ((WeatherEndpoint) target).getConfiguration().setMode(property(camelContext, org.apache.camel.component.weather.WeatherMode.class, value)); return true;
        case "period": ((WeatherEndpoint) target).getConfiguration().setPeriod(property(camelContext, java.lang.String.class, value)); return true;
        case "units": ((WeatherEndpoint) target).getConfiguration().setUnits(property(camelContext, org.apache.camel.component.weather.WeatherUnits.class, value)); return true;
        case "weatherApi": ((WeatherEndpoint) target).getConfiguration().setWeatherApi(property(camelContext, org.apache.camel.component.weather.WeatherApi.class, value)); return true;
        case "bridgeErrorHandler": ((WeatherEndpoint) target).setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "sendEmptyMessageWhenIdle": ((WeatherEndpoint) target).setSendEmptyMessageWhenIdle(property(camelContext, boolean.class, value)); return true;
        case "exceptionHandler": ((WeatherEndpoint) target).setExceptionHandler(property(camelContext, org.apache.camel.spi.ExceptionHandler.class, value)); return true;
        case "exchangePattern": ((WeatherEndpoint) target).setExchangePattern(property(camelContext, org.apache.camel.ExchangePattern.class, value)); return true;
        case "pollStrategy": ((WeatherEndpoint) target).setPollStrategy(property(camelContext, org.apache.camel.spi.PollingConsumerPollStrategy.class, value)); return true;
        case "lazyStartProducer": ((WeatherEndpoint) target).setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "basicPropertyBinding": ((WeatherEndpoint) target).setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "httpConnectionManager": ((WeatherEndpoint) target).getConfiguration().setHttpConnectionManager(property(camelContext, org.apache.commons.httpclient.HttpConnectionManager.class, value)); return true;
        case "synchronous": ((WeatherEndpoint) target).setSynchronous(property(camelContext, boolean.class, value)); return true;
        case "backoffErrorThreshold": ((WeatherEndpoint) target).setBackoffErrorThreshold(property(camelContext, int.class, value)); return true;
        case "backoffIdleThreshold": ((WeatherEndpoint) target).setBackoffIdleThreshold(property(camelContext, int.class, value)); return true;
        case "backoffMultiplier": ((WeatherEndpoint) target).setBackoffMultiplier(property(camelContext, int.class, value)); return true;
        case "delay": ((WeatherEndpoint) target).setDelay(property(camelContext, long.class, value)); return true;
        case "greedy": ((WeatherEndpoint) target).setGreedy(property(camelContext, boolean.class, value)); return true;
        case "initialDelay": ((WeatherEndpoint) target).setInitialDelay(property(camelContext, long.class, value)); return true;
        case "repeatCount": ((WeatherEndpoint) target).setRepeatCount(property(camelContext, long.class, value)); return true;
        case "runLoggingLevel": ((WeatherEndpoint) target).setRunLoggingLevel(property(camelContext, org.apache.camel.LoggingLevel.class, value)); return true;
        case "scheduledExecutorService": ((WeatherEndpoint) target).setScheduledExecutorService(property(camelContext, java.util.concurrent.ScheduledExecutorService.class, value)); return true;
        case "scheduler": ((WeatherEndpoint) target).setScheduler(property(camelContext, java.lang.String.class, value)); return true;
        case "schedulerProperties": ((WeatherEndpoint) target).setSchedulerProperties(property(camelContext, java.util.Map.class, value)); return true;
        case "startScheduler": ((WeatherEndpoint) target).setStartScheduler(property(camelContext, boolean.class, value)); return true;
        case "timeUnit": ((WeatherEndpoint) target).setTimeUnit(property(camelContext, java.util.concurrent.TimeUnit.class, value)); return true;
        case "useFixedDelay": ((WeatherEndpoint) target).setUseFixedDelay(property(camelContext, boolean.class, value)); return true;
        case "cnt": ((WeatherEndpoint) target).getConfiguration().setCnt(property(camelContext, java.lang.Integer.class, value)); return true;
        case "ids": ((WeatherEndpoint) target).getConfiguration().setIds(property(camelContext, java.lang.String.class, value)); return true;
        case "lat": ((WeatherEndpoint) target).getConfiguration().setLat(property(camelContext, java.lang.String.class, value)); return true;
        case "location": ((WeatherEndpoint) target).getConfiguration().setLocation(property(camelContext, java.lang.String.class, value)); return true;
        case "lon": ((WeatherEndpoint) target).getConfiguration().setLon(property(camelContext, java.lang.String.class, value)); return true;
        case "rightLon": ((WeatherEndpoint) target).getConfiguration().setRightLon(property(camelContext, java.lang.String.class, value)); return true;
        case "topLat": ((WeatherEndpoint) target).getConfiguration().setTopLat(property(camelContext, java.lang.String.class, value)); return true;
        case "zip": ((WeatherEndpoint) target).getConfiguration().setZip(property(camelContext, java.lang.String.class, value)); return true;
        case "zoom": ((WeatherEndpoint) target).getConfiguration().setZoom(property(camelContext, java.lang.Integer.class, value)); return true;
        case "proxyAuthDomain": ((WeatherEndpoint) target).getConfiguration().setProxyAuthDomain(property(camelContext, java.lang.String.class, value)); return true;
        case "proxyAuthHost": ((WeatherEndpoint) target).getConfiguration().setProxyAuthHost(property(camelContext, java.lang.String.class, value)); return true;
        case "proxyAuthMethod": ((WeatherEndpoint) target).getConfiguration().setProxyAuthMethod(property(camelContext, java.lang.String.class, value)); return true;
        case "proxyAuthPassword": ((WeatherEndpoint) target).getConfiguration().setProxyAuthPassword(property(camelContext, java.lang.String.class, value)); return true;
        case "proxyAuthUsername": ((WeatherEndpoint) target).getConfiguration().setProxyAuthUsername(property(camelContext, java.lang.String.class, value)); return true;
        case "proxyHost": ((WeatherEndpoint) target).getConfiguration().setProxyHost(property(camelContext, java.lang.String.class, value)); return true;
        case "proxyPort": ((WeatherEndpoint) target).getConfiguration().setProxyPort(property(camelContext, java.lang.Integer.class, value)); return true;
        case "geolocationAccessKey": ((WeatherEndpoint) target).getConfiguration().setGeolocationAccessKey(property(camelContext, java.lang.String.class, value)); return true;
        case "geolocationRequestHostIP": ((WeatherEndpoint) target).getConfiguration().setGeolocationRequestHostIP(property(camelContext, java.lang.String.class, value)); return true;
            default: return false;
        }
    }

    private static boolean doConfigureIgnoreCase(CamelContext camelContext, Object target, String name, Object value) {
        switch (name.toLowerCase()) {
        case "appid": ((WeatherEndpoint) target).getConfiguration().setAppid(property(camelContext, java.lang.String.class, value)); return true;
        case "headername": ((WeatherEndpoint) target).getConfiguration().setHeaderName(property(camelContext, java.lang.String.class, value)); return true;
        case "language": ((WeatherEndpoint) target).getConfiguration().setLanguage(property(camelContext, org.apache.camel.component.weather.WeatherLanguage.class, value)); return true;
        case "mode": ((WeatherEndpoint) target).getConfiguration().setMode(property(camelContext, org.apache.camel.component.weather.WeatherMode.class, value)); return true;
        case "period": ((WeatherEndpoint) target).getConfiguration().setPeriod(property(camelContext, java.lang.String.class, value)); return true;
        case "units": ((WeatherEndpoint) target).getConfiguration().setUnits(property(camelContext, org.apache.camel.component.weather.WeatherUnits.class, value)); return true;
        case "weatherapi": ((WeatherEndpoint) target).getConfiguration().setWeatherApi(property(camelContext, org.apache.camel.component.weather.WeatherApi.class, value)); return true;
        case "bridgeerrorhandler": ((WeatherEndpoint) target).setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "sendemptymessagewhenidle": ((WeatherEndpoint) target).setSendEmptyMessageWhenIdle(property(camelContext, boolean.class, value)); return true;
        case "exceptionhandler": ((WeatherEndpoint) target).setExceptionHandler(property(camelContext, org.apache.camel.spi.ExceptionHandler.class, value)); return true;
        case "exchangepattern": ((WeatherEndpoint) target).setExchangePattern(property(camelContext, org.apache.camel.ExchangePattern.class, value)); return true;
        case "pollstrategy": ((WeatherEndpoint) target).setPollStrategy(property(camelContext, org.apache.camel.spi.PollingConsumerPollStrategy.class, value)); return true;
        case "lazystartproducer": ((WeatherEndpoint) target).setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "basicpropertybinding": ((WeatherEndpoint) target).setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "httpconnectionmanager": ((WeatherEndpoint) target).getConfiguration().setHttpConnectionManager(property(camelContext, org.apache.commons.httpclient.HttpConnectionManager.class, value)); return true;
        case "synchronous": ((WeatherEndpoint) target).setSynchronous(property(camelContext, boolean.class, value)); return true;
        case "backofferrorthreshold": ((WeatherEndpoint) target).setBackoffErrorThreshold(property(camelContext, int.class, value)); return true;
        case "backoffidlethreshold": ((WeatherEndpoint) target).setBackoffIdleThreshold(property(camelContext, int.class, value)); return true;
        case "backoffmultiplier": ((WeatherEndpoint) target).setBackoffMultiplier(property(camelContext, int.class, value)); return true;
        case "delay": ((WeatherEndpoint) target).setDelay(property(camelContext, long.class, value)); return true;
        case "greedy": ((WeatherEndpoint) target).setGreedy(property(camelContext, boolean.class, value)); return true;
        case "initialdelay": ((WeatherEndpoint) target).setInitialDelay(property(camelContext, long.class, value)); return true;
        case "repeatcount": ((WeatherEndpoint) target).setRepeatCount(property(camelContext, long.class, value)); return true;
        case "runlogginglevel": ((WeatherEndpoint) target).setRunLoggingLevel(property(camelContext, org.apache.camel.LoggingLevel.class, value)); return true;
        case "scheduledexecutorservice": ((WeatherEndpoint) target).setScheduledExecutorService(property(camelContext, java.util.concurrent.ScheduledExecutorService.class, value)); return true;
        case "scheduler": ((WeatherEndpoint) target).setScheduler(property(camelContext, java.lang.String.class, value)); return true;
        case "schedulerproperties": ((WeatherEndpoint) target).setSchedulerProperties(property(camelContext, java.util.Map.class, value)); return true;
        case "startscheduler": ((WeatherEndpoint) target).setStartScheduler(property(camelContext, boolean.class, value)); return true;
        case "timeunit": ((WeatherEndpoint) target).setTimeUnit(property(camelContext, java.util.concurrent.TimeUnit.class, value)); return true;
        case "usefixeddelay": ((WeatherEndpoint) target).setUseFixedDelay(property(camelContext, boolean.class, value)); return true;
        case "cnt": ((WeatherEndpoint) target).getConfiguration().setCnt(property(camelContext, java.lang.Integer.class, value)); return true;
        case "ids": ((WeatherEndpoint) target).getConfiguration().setIds(property(camelContext, java.lang.String.class, value)); return true;
        case "lat": ((WeatherEndpoint) target).getConfiguration().setLat(property(camelContext, java.lang.String.class, value)); return true;
        case "location": ((WeatherEndpoint) target).getConfiguration().setLocation(property(camelContext, java.lang.String.class, value)); return true;
        case "lon": ((WeatherEndpoint) target).getConfiguration().setLon(property(camelContext, java.lang.String.class, value)); return true;
        case "rightlon": ((WeatherEndpoint) target).getConfiguration().setRightLon(property(camelContext, java.lang.String.class, value)); return true;
        case "toplat": ((WeatherEndpoint) target).getConfiguration().setTopLat(property(camelContext, java.lang.String.class, value)); return true;
        case "zip": ((WeatherEndpoint) target).getConfiguration().setZip(property(camelContext, java.lang.String.class, value)); return true;
        case "zoom": ((WeatherEndpoint) target).getConfiguration().setZoom(property(camelContext, java.lang.Integer.class, value)); return true;
        case "proxyauthdomain": ((WeatherEndpoint) target).getConfiguration().setProxyAuthDomain(property(camelContext, java.lang.String.class, value)); return true;
        case "proxyauthhost": ((WeatherEndpoint) target).getConfiguration().setProxyAuthHost(property(camelContext, java.lang.String.class, value)); return true;
        case "proxyauthmethod": ((WeatherEndpoint) target).getConfiguration().setProxyAuthMethod(property(camelContext, java.lang.String.class, value)); return true;
        case "proxyauthpassword": ((WeatherEndpoint) target).getConfiguration().setProxyAuthPassword(property(camelContext, java.lang.String.class, value)); return true;
        case "proxyauthusername": ((WeatherEndpoint) target).getConfiguration().setProxyAuthUsername(property(camelContext, java.lang.String.class, value)); return true;
        case "proxyhost": ((WeatherEndpoint) target).getConfiguration().setProxyHost(property(camelContext, java.lang.String.class, value)); return true;
        case "proxyport": ((WeatherEndpoint) target).getConfiguration().setProxyPort(property(camelContext, java.lang.Integer.class, value)); return true;
        case "geolocationaccesskey": ((WeatherEndpoint) target).getConfiguration().setGeolocationAccessKey(property(camelContext, java.lang.String.class, value)); return true;
        case "geolocationrequesthostip": ((WeatherEndpoint) target).getConfiguration().setGeolocationRequestHostIP(property(camelContext, java.lang.String.class, value)); return true;
            default: return false;
        }
    }

}

