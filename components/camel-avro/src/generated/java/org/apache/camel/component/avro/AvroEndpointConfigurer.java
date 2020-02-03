/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.avro;

import java.util.HashMap;
import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class AvroEndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer {

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
        case "protocol": ((AvroEndpoint) target).getConfiguration().setProtocol(property(camelContext, org.apache.avro.Protocol.class, value)); return true;
        case "protocolClassName": ((AvroEndpoint) target).getConfiguration().setProtocolClassName(property(camelContext, java.lang.String.class, value)); return true;
        case "protocolLocation": ((AvroEndpoint) target).getConfiguration().setProtocolLocation(property(camelContext, java.lang.String.class, value)); return true;
        case "reflectionProtocol": ((AvroEndpoint) target).getConfiguration().setReflectionProtocol(property(camelContext, boolean.class, value)); return true;
        case "singleParameter": ((AvroEndpoint) target).getConfiguration().setSingleParameter(property(camelContext, boolean.class, value)); return true;
        case "uriAuthority": ((AvroEndpoint) target).getConfiguration().setUriAuthority(property(camelContext, java.lang.String.class, value)); return true;
        case "bridgeErrorHandler": ((AvroEndpoint) target).setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "exceptionHandler": ((AvroEndpoint) target).setExceptionHandler(property(camelContext, org.apache.camel.spi.ExceptionHandler.class, value)); return true;
        case "exchangePattern": ((AvroEndpoint) target).setExchangePattern(property(camelContext, org.apache.camel.ExchangePattern.class, value)); return true;
        case "lazyStartProducer": ((AvroEndpoint) target).setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "basicPropertyBinding": ((AvroEndpoint) target).setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "synchronous": ((AvroEndpoint) target).setSynchronous(property(camelContext, boolean.class, value)); return true;
            default: return false;
        }
    }

    private static boolean doConfigureIgnoreCase(CamelContext camelContext, Object target, String name, Object value) {
        switch (name.toLowerCase()) {
        case "protocol": ((AvroEndpoint) target).getConfiguration().setProtocol(property(camelContext, org.apache.avro.Protocol.class, value)); return true;
        case "protocolclassname": ((AvroEndpoint) target).getConfiguration().setProtocolClassName(property(camelContext, java.lang.String.class, value)); return true;
        case "protocollocation": ((AvroEndpoint) target).getConfiguration().setProtocolLocation(property(camelContext, java.lang.String.class, value)); return true;
        case "reflectionprotocol": ((AvroEndpoint) target).getConfiguration().setReflectionProtocol(property(camelContext, boolean.class, value)); return true;
        case "singleparameter": ((AvroEndpoint) target).getConfiguration().setSingleParameter(property(camelContext, boolean.class, value)); return true;
        case "uriauthority": ((AvroEndpoint) target).getConfiguration().setUriAuthority(property(camelContext, java.lang.String.class, value)); return true;
        case "bridgeerrorhandler": ((AvroEndpoint) target).setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "exceptionhandler": ((AvroEndpoint) target).setExceptionHandler(property(camelContext, org.apache.camel.spi.ExceptionHandler.class, value)); return true;
        case "exchangepattern": ((AvroEndpoint) target).setExchangePattern(property(camelContext, org.apache.camel.ExchangePattern.class, value)); return true;
        case "lazystartproducer": ((AvroEndpoint) target).setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "basicpropertybinding": ((AvroEndpoint) target).setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "synchronous": ((AvroEndpoint) target).setSynchronous(property(camelContext, boolean.class, value)); return true;
            default: return false;
        }
    }

}

