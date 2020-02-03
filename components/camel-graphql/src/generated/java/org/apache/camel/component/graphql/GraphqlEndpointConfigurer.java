/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.graphql;

import java.util.HashMap;
import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class GraphqlEndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer {

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
        case "lazyStartProducer": ((GraphqlEndpoint) target).setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "operationName": ((GraphqlEndpoint) target).setOperationName(property(camelContext, java.lang.String.class, value)); return true;
        case "proxyHost": ((GraphqlEndpoint) target).setProxyHost(property(camelContext, java.lang.String.class, value)); return true;
        case "query": ((GraphqlEndpoint) target).setQuery(property(camelContext, java.lang.String.class, value)); return true;
        case "queryFile": ((GraphqlEndpoint) target).setQueryFile(property(camelContext, java.lang.String.class, value)); return true;
        case "variables": ((GraphqlEndpoint) target).setVariables(property(camelContext, org.apache.camel.util.json.JsonObject.class, value)); return true;
        case "basicPropertyBinding": ((GraphqlEndpoint) target).setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "synchronous": ((GraphqlEndpoint) target).setSynchronous(property(camelContext, boolean.class, value)); return true;
        case "accessToken": ((GraphqlEndpoint) target).setAccessToken(property(camelContext, java.lang.String.class, value)); return true;
        case "password": ((GraphqlEndpoint) target).setPassword(property(camelContext, java.lang.String.class, value)); return true;
        case "username": ((GraphqlEndpoint) target).setUsername(property(camelContext, java.lang.String.class, value)); return true;
            default: return false;
        }
    }

    private static boolean doConfigureIgnoreCase(CamelContext camelContext, Object target, String name, Object value) {
        switch (name.toLowerCase()) {
        case "lazystartproducer": ((GraphqlEndpoint) target).setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "operationname": ((GraphqlEndpoint) target).setOperationName(property(camelContext, java.lang.String.class, value)); return true;
        case "proxyhost": ((GraphqlEndpoint) target).setProxyHost(property(camelContext, java.lang.String.class, value)); return true;
        case "query": ((GraphqlEndpoint) target).setQuery(property(camelContext, java.lang.String.class, value)); return true;
        case "queryfile": ((GraphqlEndpoint) target).setQueryFile(property(camelContext, java.lang.String.class, value)); return true;
        case "variables": ((GraphqlEndpoint) target).setVariables(property(camelContext, org.apache.camel.util.json.JsonObject.class, value)); return true;
        case "basicpropertybinding": ((GraphqlEndpoint) target).setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "synchronous": ((GraphqlEndpoint) target).setSynchronous(property(camelContext, boolean.class, value)); return true;
        case "accesstoken": ((GraphqlEndpoint) target).setAccessToken(property(camelContext, java.lang.String.class, value)); return true;
        case "password": ((GraphqlEndpoint) target).setPassword(property(camelContext, java.lang.String.class, value)); return true;
        case "username": ((GraphqlEndpoint) target).setUsername(property(camelContext, java.lang.String.class, value)); return true;
            default: return false;
        }
    }

}

