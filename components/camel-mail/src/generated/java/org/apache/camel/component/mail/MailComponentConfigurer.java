/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.mail;

import java.util.HashMap;
import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class MailComponentConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer {

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
        case "configuration": ((MailComponent) target).setConfiguration(property(camelContext, org.apache.camel.component.mail.MailConfiguration.class, value)); return true;
        case "contentTypeResolver": ((MailComponent) target).setContentTypeResolver(property(camelContext, org.apache.camel.component.mail.ContentTypeResolver.class, value)); return true;
        case "useGlobalSslContextParameters": ((MailComponent) target).setUseGlobalSslContextParameters(property(camelContext, boolean.class, value)); return true;
        case "headerFilterStrategy": ((MailComponent) target).setHeaderFilterStrategy(property(camelContext, org.apache.camel.spi.HeaderFilterStrategy.class, value)); return true;
        case "basicPropertyBinding": ((MailComponent) target).setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "lazyStartProducer": ((MailComponent) target).setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "bridgeErrorHandler": ((MailComponent) target).setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
            default: return false;
        }
    }

    private static boolean doConfigureIgnoreCase(CamelContext camelContext, Object target, String name, Object value) {
        switch (name.toLowerCase()) {
        case "configuration": ((MailComponent) target).setConfiguration(property(camelContext, org.apache.camel.component.mail.MailConfiguration.class, value)); return true;
        case "contenttyperesolver": ((MailComponent) target).setContentTypeResolver(property(camelContext, org.apache.camel.component.mail.ContentTypeResolver.class, value)); return true;
        case "useglobalsslcontextparameters": ((MailComponent) target).setUseGlobalSslContextParameters(property(camelContext, boolean.class, value)); return true;
        case "headerfilterstrategy": ((MailComponent) target).setHeaderFilterStrategy(property(camelContext, org.apache.camel.spi.HeaderFilterStrategy.class, value)); return true;
        case "basicpropertybinding": ((MailComponent) target).setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "lazystartproducer": ((MailComponent) target).setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "bridgeerrorhandler": ((MailComponent) target).setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
            default: return false;
        }
    }

}

