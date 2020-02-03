/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.google.pubsub;

import java.util.HashMap;
import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class GooglePubsubEndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer {

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
        case "ackMode": ((GooglePubsubEndpoint) target).setAckMode(property(camelContext, org.apache.camel.component.google.pubsub.GooglePubsubConstants.AckMode.class, value)); return true;
        case "concurrentConsumers": ((GooglePubsubEndpoint) target).setConcurrentConsumers(property(camelContext, java.lang.Integer.class, value)); return true;
        case "connectionFactory": ((GooglePubsubEndpoint) target).setConnectionFactory(property(camelContext, org.apache.camel.component.google.pubsub.GooglePubsubConnectionFactory.class, value)); return true;
        case "loggerId": ((GooglePubsubEndpoint) target).setLoggerId(property(camelContext, java.lang.String.class, value)); return true;
        case "maxMessagesPerPoll": ((GooglePubsubEndpoint) target).setMaxMessagesPerPoll(property(camelContext, java.lang.Integer.class, value)); return true;
        case "bridgeErrorHandler": ((GooglePubsubEndpoint) target).setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "exceptionHandler": ((GooglePubsubEndpoint) target).setExceptionHandler(property(camelContext, org.apache.camel.spi.ExceptionHandler.class, value)); return true;
        case "exchangePattern": ((GooglePubsubEndpoint) target).setExchangePattern(property(camelContext, org.apache.camel.ExchangePattern.class, value)); return true;
        case "lazyStartProducer": ((GooglePubsubEndpoint) target).setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "basicPropertyBinding": ((GooglePubsubEndpoint) target).setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "synchronous": ((GooglePubsubEndpoint) target).setSynchronous(property(camelContext, boolean.class, value)); return true;
            default: return false;
        }
    }

    private static boolean doConfigureIgnoreCase(CamelContext camelContext, Object target, String name, Object value) {
        switch (name.toLowerCase()) {
        case "ackmode": ((GooglePubsubEndpoint) target).setAckMode(property(camelContext, org.apache.camel.component.google.pubsub.GooglePubsubConstants.AckMode.class, value)); return true;
        case "concurrentconsumers": ((GooglePubsubEndpoint) target).setConcurrentConsumers(property(camelContext, java.lang.Integer.class, value)); return true;
        case "connectionfactory": ((GooglePubsubEndpoint) target).setConnectionFactory(property(camelContext, org.apache.camel.component.google.pubsub.GooglePubsubConnectionFactory.class, value)); return true;
        case "loggerid": ((GooglePubsubEndpoint) target).setLoggerId(property(camelContext, java.lang.String.class, value)); return true;
        case "maxmessagesperpoll": ((GooglePubsubEndpoint) target).setMaxMessagesPerPoll(property(camelContext, java.lang.Integer.class, value)); return true;
        case "bridgeerrorhandler": ((GooglePubsubEndpoint) target).setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "exceptionhandler": ((GooglePubsubEndpoint) target).setExceptionHandler(property(camelContext, org.apache.camel.spi.ExceptionHandler.class, value)); return true;
        case "exchangepattern": ((GooglePubsubEndpoint) target).setExchangePattern(property(camelContext, org.apache.camel.ExchangePattern.class, value)); return true;
        case "lazystartproducer": ((GooglePubsubEndpoint) target).setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "basicpropertybinding": ((GooglePubsubEndpoint) target).setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "synchronous": ((GooglePubsubEndpoint) target).setSynchronous(property(camelContext, boolean.class, value)); return true;
            default: return false;
        }
    }

}

