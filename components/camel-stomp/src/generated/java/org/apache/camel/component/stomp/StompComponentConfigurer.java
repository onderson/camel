/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.stomp;

import java.util.HashMap;
import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class StompComponentConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer {

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
        case "configuration": ((StompComponent) target).setConfiguration(property(camelContext, org.apache.camel.component.stomp.StompConfiguration.class, value)); return true;
        case "brokerURL": ((StompComponent) target).setBrokerURL(property(camelContext, java.lang.String.class, value)); return true;
        case "login": ((StompComponent) target).setLogin(property(camelContext, java.lang.String.class, value)); return true;
        case "passcode": ((StompComponent) target).setPasscode(property(camelContext, java.lang.String.class, value)); return true;
        case "host": ((StompComponent) target).setHost(property(camelContext, java.lang.String.class, value)); return true;
        case "useGlobalSslContextParameters": ((StompComponent) target).setUseGlobalSslContextParameters(property(camelContext, boolean.class, value)); return true;
        case "headerFilterStrategy": ((StompComponent) target).setHeaderFilterStrategy(property(camelContext, org.apache.camel.spi.HeaderFilterStrategy.class, value)); return true;
        case "basicPropertyBinding": ((StompComponent) target).setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "lazyStartProducer": ((StompComponent) target).setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "bridgeErrorHandler": ((StompComponent) target).setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
            default: return false;
        }
    }

    private static boolean doConfigureIgnoreCase(CamelContext camelContext, Object target, String name, Object value) {
        switch (name.toLowerCase()) {
        case "configuration": ((StompComponent) target).setConfiguration(property(camelContext, org.apache.camel.component.stomp.StompConfiguration.class, value)); return true;
        case "brokerurl": ((StompComponent) target).setBrokerURL(property(camelContext, java.lang.String.class, value)); return true;
        case "login": ((StompComponent) target).setLogin(property(camelContext, java.lang.String.class, value)); return true;
        case "passcode": ((StompComponent) target).setPasscode(property(camelContext, java.lang.String.class, value)); return true;
        case "host": ((StompComponent) target).setHost(property(camelContext, java.lang.String.class, value)); return true;
        case "useglobalsslcontextparameters": ((StompComponent) target).setUseGlobalSslContextParameters(property(camelContext, boolean.class, value)); return true;
        case "headerfilterstrategy": ((StompComponent) target).setHeaderFilterStrategy(property(camelContext, org.apache.camel.spi.HeaderFilterStrategy.class, value)); return true;
        case "basicpropertybinding": ((StompComponent) target).setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "lazystartproducer": ((StompComponent) target).setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "bridgeerrorhandler": ((StompComponent) target).setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
            default: return false;
        }
    }

}

