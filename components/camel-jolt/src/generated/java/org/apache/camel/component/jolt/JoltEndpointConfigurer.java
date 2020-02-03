/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.jolt;

import java.util.HashMap;
import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class JoltEndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer {

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
        case "contentCache": ((JoltEndpoint) target).setContentCache(property(camelContext, boolean.class, value)); return true;
        case "inputType": ((JoltEndpoint) target).setInputType(property(camelContext, org.apache.camel.component.jolt.JoltInputOutputType.class, value)); return true;
        case "lazyStartProducer": ((JoltEndpoint) target).setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "outputType": ((JoltEndpoint) target).setOutputType(property(camelContext, org.apache.camel.component.jolt.JoltInputOutputType.class, value)); return true;
        case "transformDsl": ((JoltEndpoint) target).setTransformDsl(property(camelContext, org.apache.camel.component.jolt.JoltTransformType.class, value)); return true;
        case "basicPropertyBinding": ((JoltEndpoint) target).setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "synchronous": ((JoltEndpoint) target).setSynchronous(property(camelContext, boolean.class, value)); return true;
            default: return false;
        }
    }

    private static boolean doConfigureIgnoreCase(CamelContext camelContext, Object target, String name, Object value) {
        switch (name.toLowerCase()) {
        case "contentcache": ((JoltEndpoint) target).setContentCache(property(camelContext, boolean.class, value)); return true;
        case "inputtype": ((JoltEndpoint) target).setInputType(property(camelContext, org.apache.camel.component.jolt.JoltInputOutputType.class, value)); return true;
        case "lazystartproducer": ((JoltEndpoint) target).setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "outputtype": ((JoltEndpoint) target).setOutputType(property(camelContext, org.apache.camel.component.jolt.JoltInputOutputType.class, value)); return true;
        case "transformdsl": ((JoltEndpoint) target).setTransformDsl(property(camelContext, org.apache.camel.component.jolt.JoltTransformType.class, value)); return true;
        case "basicpropertybinding": ((JoltEndpoint) target).setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "synchronous": ((JoltEndpoint) target).setSynchronous(property(camelContext, boolean.class, value)); return true;
            default: return false;
        }
    }

}

