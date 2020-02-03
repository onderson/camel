/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.hazelcast.instance;

import java.util.HashMap;
import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class HazelcastInstanceEndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer {

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
        case "bridgeErrorHandler": ((HazelcastInstanceEndpoint) target).setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "defaultOperation": ((HazelcastInstanceEndpoint) target).setDefaultOperation(property(camelContext, org.apache.camel.component.hazelcast.HazelcastOperation.class, value)); return true;
        case "hazelcastInstance": ((HazelcastInstanceEndpoint) target).setHazelcastInstance(property(camelContext, com.hazelcast.core.HazelcastInstance.class, value)); return true;
        case "hazelcastInstanceName": ((HazelcastInstanceEndpoint) target).setHazelcastInstanceName(property(camelContext, java.lang.String.class, value)); return true;
        case "exceptionHandler": ((HazelcastInstanceEndpoint) target).setExceptionHandler(property(camelContext, org.apache.camel.spi.ExceptionHandler.class, value)); return true;
        case "exchangePattern": ((HazelcastInstanceEndpoint) target).setExchangePattern(property(camelContext, org.apache.camel.ExchangePattern.class, value)); return true;
        case "basicPropertyBinding": ((HazelcastInstanceEndpoint) target).setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "synchronous": ((HazelcastInstanceEndpoint) target).setSynchronous(property(camelContext, boolean.class, value)); return true;
            default: return false;
        }
    }

    private static boolean doConfigureIgnoreCase(CamelContext camelContext, Object target, String name, Object value) {
        switch (name.toLowerCase()) {
        case "bridgeerrorhandler": ((HazelcastInstanceEndpoint) target).setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "defaultoperation": ((HazelcastInstanceEndpoint) target).setDefaultOperation(property(camelContext, org.apache.camel.component.hazelcast.HazelcastOperation.class, value)); return true;
        case "hazelcastinstance": ((HazelcastInstanceEndpoint) target).setHazelcastInstance(property(camelContext, com.hazelcast.core.HazelcastInstance.class, value)); return true;
        case "hazelcastinstancename": ((HazelcastInstanceEndpoint) target).setHazelcastInstanceName(property(camelContext, java.lang.String.class, value)); return true;
        case "exceptionhandler": ((HazelcastInstanceEndpoint) target).setExceptionHandler(property(camelContext, org.apache.camel.spi.ExceptionHandler.class, value)); return true;
        case "exchangepattern": ((HazelcastInstanceEndpoint) target).setExchangePattern(property(camelContext, org.apache.camel.ExchangePattern.class, value)); return true;
        case "basicpropertybinding": ((HazelcastInstanceEndpoint) target).setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "synchronous": ((HazelcastInstanceEndpoint) target).setSynchronous(property(camelContext, boolean.class, value)); return true;
            default: return false;
        }
    }

}

