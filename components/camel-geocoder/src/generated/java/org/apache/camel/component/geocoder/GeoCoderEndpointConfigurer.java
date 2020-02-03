/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.geocoder;

import java.util.HashMap;
import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class GeoCoderEndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer {

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
        case "headersOnly": ((GeoCoderEndpoint) target).setHeadersOnly(property(camelContext, boolean.class, value)); return true;
        case "language": ((GeoCoderEndpoint) target).setLanguage(property(camelContext, java.lang.String.class, value)); return true;
        case "lazyStartProducer": ((GeoCoderEndpoint) target).setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "basicPropertyBinding": ((GeoCoderEndpoint) target).setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "synchronous": ((GeoCoderEndpoint) target).setSynchronous(property(camelContext, boolean.class, value)); return true;
        case "proxyAuthDomain": ((GeoCoderEndpoint) target).setProxyAuthDomain(property(camelContext, java.lang.String.class, value)); return true;
        case "proxyAuthHost": ((GeoCoderEndpoint) target).setProxyAuthHost(property(camelContext, java.lang.String.class, value)); return true;
        case "proxyAuthMethod": ((GeoCoderEndpoint) target).setProxyAuthMethod(property(camelContext, java.lang.String.class, value)); return true;
        case "proxyAuthPassword": ((GeoCoderEndpoint) target).setProxyAuthPassword(property(camelContext, java.lang.String.class, value)); return true;
        case "proxyAuthUsername": ((GeoCoderEndpoint) target).setProxyAuthUsername(property(camelContext, java.lang.String.class, value)); return true;
        case "proxyHost": ((GeoCoderEndpoint) target).setProxyHost(property(camelContext, java.lang.String.class, value)); return true;
        case "proxyPort": ((GeoCoderEndpoint) target).setProxyPort(property(camelContext, java.lang.Integer.class, value)); return true;
        case "apiKey": ((GeoCoderEndpoint) target).setApiKey(property(camelContext, java.lang.String.class, value)); return true;
        case "clientId": ((GeoCoderEndpoint) target).setClientId(property(camelContext, java.lang.String.class, value)); return true;
        case "clientKey": ((GeoCoderEndpoint) target).setClientKey(property(camelContext, java.lang.String.class, value)); return true;
            default: return false;
        }
    }

    private static boolean doConfigureIgnoreCase(CamelContext camelContext, Object target, String name, Object value) {
        switch (name.toLowerCase()) {
        case "headersonly": ((GeoCoderEndpoint) target).setHeadersOnly(property(camelContext, boolean.class, value)); return true;
        case "language": ((GeoCoderEndpoint) target).setLanguage(property(camelContext, java.lang.String.class, value)); return true;
        case "lazystartproducer": ((GeoCoderEndpoint) target).setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "basicpropertybinding": ((GeoCoderEndpoint) target).setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "synchronous": ((GeoCoderEndpoint) target).setSynchronous(property(camelContext, boolean.class, value)); return true;
        case "proxyauthdomain": ((GeoCoderEndpoint) target).setProxyAuthDomain(property(camelContext, java.lang.String.class, value)); return true;
        case "proxyauthhost": ((GeoCoderEndpoint) target).setProxyAuthHost(property(camelContext, java.lang.String.class, value)); return true;
        case "proxyauthmethod": ((GeoCoderEndpoint) target).setProxyAuthMethod(property(camelContext, java.lang.String.class, value)); return true;
        case "proxyauthpassword": ((GeoCoderEndpoint) target).setProxyAuthPassword(property(camelContext, java.lang.String.class, value)); return true;
        case "proxyauthusername": ((GeoCoderEndpoint) target).setProxyAuthUsername(property(camelContext, java.lang.String.class, value)); return true;
        case "proxyhost": ((GeoCoderEndpoint) target).setProxyHost(property(camelContext, java.lang.String.class, value)); return true;
        case "proxyport": ((GeoCoderEndpoint) target).setProxyPort(property(camelContext, java.lang.Integer.class, value)); return true;
        case "apikey": ((GeoCoderEndpoint) target).setApiKey(property(camelContext, java.lang.String.class, value)); return true;
        case "clientid": ((GeoCoderEndpoint) target).setClientId(property(camelContext, java.lang.String.class, value)); return true;
        case "clientkey": ((GeoCoderEndpoint) target).setClientKey(property(camelContext, java.lang.String.class, value)); return true;
            default: return false;
        }
    }

}

