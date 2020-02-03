/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.workday;

import java.util.HashMap;
import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class WorkdayEndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer {

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
        case "bridgeErrorHandler": ((WorkdayEndpoint) target).setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "exceptionHandler": ((WorkdayEndpoint) target).setExceptionHandler(property(camelContext, org.apache.camel.spi.ExceptionHandler.class, value)); return true;
        case "exchangePattern": ((WorkdayEndpoint) target).setExchangePattern(property(camelContext, org.apache.camel.ExchangePattern.class, value)); return true;
        case "lazyStartProducer": ((WorkdayEndpoint) target).setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "basicPropertyBinding": ((WorkdayEndpoint) target).setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "httpConnectionManager": ((WorkdayEndpoint) target).getWorkdayConfiguration().setHttpConnectionManager(property(camelContext, org.apache.http.impl.conn.PoolingHttpClientConnectionManager.class, value)); return true;
        case "synchronous": ((WorkdayEndpoint) target).setSynchronous(property(camelContext, boolean.class, value)); return true;
        case "format": ((WorkdayEndpoint) target).getWorkdayConfiguration().setFormat(property(camelContext, java.lang.String.class, value)); return true;
        case "host": ((WorkdayEndpoint) target).getWorkdayConfiguration().setHost(property(camelContext, java.lang.String.class, value)); return true;
        case "clientId": ((WorkdayEndpoint) target).getWorkdayConfiguration().setClientId(property(camelContext, java.lang.String.class, value)); return true;
        case "clientSecret": ((WorkdayEndpoint) target).getWorkdayConfiguration().setClientSecret(property(camelContext, java.lang.String.class, value)); return true;
        case "tokenRefresh": ((WorkdayEndpoint) target).getWorkdayConfiguration().setTokenRefresh(property(camelContext, java.lang.String.class, value)); return true;
        case "tenant": ((WorkdayEndpoint) target).getWorkdayConfiguration().setTenant(property(camelContext, java.lang.String.class, value)); return true;
            default: return false;
        }
    }

    private static boolean doConfigureIgnoreCase(CamelContext camelContext, Object target, String name, Object value) {
        switch (name.toLowerCase()) {
        case "bridgeerrorhandler": ((WorkdayEndpoint) target).setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "exceptionhandler": ((WorkdayEndpoint) target).setExceptionHandler(property(camelContext, org.apache.camel.spi.ExceptionHandler.class, value)); return true;
        case "exchangepattern": ((WorkdayEndpoint) target).setExchangePattern(property(camelContext, org.apache.camel.ExchangePattern.class, value)); return true;
        case "lazystartproducer": ((WorkdayEndpoint) target).setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "basicpropertybinding": ((WorkdayEndpoint) target).setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "httpconnectionmanager": ((WorkdayEndpoint) target).getWorkdayConfiguration().setHttpConnectionManager(property(camelContext, org.apache.http.impl.conn.PoolingHttpClientConnectionManager.class, value)); return true;
        case "synchronous": ((WorkdayEndpoint) target).setSynchronous(property(camelContext, boolean.class, value)); return true;
        case "format": ((WorkdayEndpoint) target).getWorkdayConfiguration().setFormat(property(camelContext, java.lang.String.class, value)); return true;
        case "host": ((WorkdayEndpoint) target).getWorkdayConfiguration().setHost(property(camelContext, java.lang.String.class, value)); return true;
        case "clientid": ((WorkdayEndpoint) target).getWorkdayConfiguration().setClientId(property(camelContext, java.lang.String.class, value)); return true;
        case "clientsecret": ((WorkdayEndpoint) target).getWorkdayConfiguration().setClientSecret(property(camelContext, java.lang.String.class, value)); return true;
        case "tokenrefresh": ((WorkdayEndpoint) target).getWorkdayConfiguration().setTokenRefresh(property(camelContext, java.lang.String.class, value)); return true;
        case "tenant": ((WorkdayEndpoint) target).getWorkdayConfiguration().setTenant(property(camelContext, java.lang.String.class, value)); return true;
            default: return false;
        }
    }

}

