/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.google.drive;

import java.util.HashMap;
import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class GoogleDriveComponentConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer {

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
        case "configuration": ((GoogleDriveComponent) target).setConfiguration(property(camelContext, org.apache.camel.component.google.drive.GoogleDriveConfiguration.class, value)); return true;
        case "clientFactory": ((GoogleDriveComponent) target).setClientFactory(property(camelContext, org.apache.camel.component.google.drive.GoogleDriveClientFactory.class, value)); return true;
        case "basicPropertyBinding": ((GoogleDriveComponent) target).setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "lazyStartProducer": ((GoogleDriveComponent) target).setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "bridgeErrorHandler": ((GoogleDriveComponent) target).setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
            default: return false;
        }
    }

    private static boolean doConfigureIgnoreCase(CamelContext camelContext, Object target, String name, Object value) {
        switch (name.toLowerCase()) {
        case "configuration": ((GoogleDriveComponent) target).setConfiguration(property(camelContext, org.apache.camel.component.google.drive.GoogleDriveConfiguration.class, value)); return true;
        case "clientfactory": ((GoogleDriveComponent) target).setClientFactory(property(camelContext, org.apache.camel.component.google.drive.GoogleDriveClientFactory.class, value)); return true;
        case "basicpropertybinding": ((GoogleDriveComponent) target).setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "lazystartproducer": ((GoogleDriveComponent) target).setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "bridgeerrorhandler": ((GoogleDriveComponent) target).setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
            default: return false;
        }
    }

}

