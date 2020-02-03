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
public class HazelcastInstanceComponentConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer {

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
        case "hazelcastInstance": ((HazelcastInstanceComponent) target).setHazelcastInstance(property(camelContext, com.hazelcast.core.HazelcastInstance.class, value)); return true;
        case "hazelcastMode": ((HazelcastInstanceComponent) target).setHazelcastMode(property(camelContext, java.lang.String.class, value)); return true;
        case "basicPropertyBinding": ((HazelcastInstanceComponent) target).setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "bridgeErrorHandler": ((HazelcastInstanceComponent) target).setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
            default: return false;
        }
    }

    private static boolean doConfigureIgnoreCase(CamelContext camelContext, Object target, String name, Object value) {
        switch (name.toLowerCase()) {
        case "hazelcastinstance": ((HazelcastInstanceComponent) target).setHazelcastInstance(property(camelContext, com.hazelcast.core.HazelcastInstance.class, value)); return true;
        case "hazelcastmode": ((HazelcastInstanceComponent) target).setHazelcastMode(property(camelContext, java.lang.String.class, value)); return true;
        case "basicpropertybinding": ((HazelcastInstanceComponent) target).setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "bridgeerrorhandler": ((HazelcastInstanceComponent) target).setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
            default: return false;
        }
    }

}

