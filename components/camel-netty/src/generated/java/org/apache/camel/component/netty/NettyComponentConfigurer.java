/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.netty;

import java.util.HashMap;
import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class NettyComponentConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer {

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
        case "maximumPoolSize": ((NettyComponent) target).setMaximumPoolSize(property(camelContext, int.class, value)); return true;
        case "configuration": ((NettyComponent) target).setConfiguration(property(camelContext, org.apache.camel.component.netty.NettyConfiguration.class, value)); return true;
        case "executorService": ((NettyComponent) target).setExecutorService(property(camelContext, io.netty.util.concurrent.EventExecutorGroup.class, value)); return true;
        case "useGlobalSslContextParameters": ((NettyComponent) target).setUseGlobalSslContextParameters(property(camelContext, boolean.class, value)); return true;
        case "sslContextParameters": ((NettyComponent) target).setSslContextParameters(property(camelContext, org.apache.camel.support.jsse.SSLContextParameters.class, value)); return true;
        case "basicPropertyBinding": ((NettyComponent) target).setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "lazyStartProducer": ((NettyComponent) target).setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "bridgeErrorHandler": ((NettyComponent) target).setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
            default: return false;
        }
    }

    private static boolean doConfigureIgnoreCase(CamelContext camelContext, Object target, String name, Object value) {
        switch (name.toLowerCase()) {
        case "maximumpoolsize": ((NettyComponent) target).setMaximumPoolSize(property(camelContext, int.class, value)); return true;
        case "configuration": ((NettyComponent) target).setConfiguration(property(camelContext, org.apache.camel.component.netty.NettyConfiguration.class, value)); return true;
        case "executorservice": ((NettyComponent) target).setExecutorService(property(camelContext, io.netty.util.concurrent.EventExecutorGroup.class, value)); return true;
        case "useglobalsslcontextparameters": ((NettyComponent) target).setUseGlobalSslContextParameters(property(camelContext, boolean.class, value)); return true;
        case "sslcontextparameters": ((NettyComponent) target).setSslContextParameters(property(camelContext, org.apache.camel.support.jsse.SSLContextParameters.class, value)); return true;
        case "basicpropertybinding": ((NettyComponent) target).setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "lazystartproducer": ((NettyComponent) target).setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "bridgeerrorhandler": ((NettyComponent) target).setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
            default: return false;
        }
    }

}

