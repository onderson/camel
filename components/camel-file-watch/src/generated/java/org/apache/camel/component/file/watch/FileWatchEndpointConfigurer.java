/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.file.watch;

import java.util.HashMap;
import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class FileWatchEndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer {

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
        case "antInclude": ((FileWatchEndpoint) target).setAntInclude(property(camelContext, java.lang.String.class, value)); return true;
        case "autoCreate": ((FileWatchEndpoint) target).setAutoCreate(property(camelContext, boolean.class, value)); return true;
        case "bridgeErrorHandler": ((FileWatchEndpoint) target).setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "concurrentConsumers": ((FileWatchEndpoint) target).setConcurrentConsumers(property(camelContext, int.class, value)); return true;
        case "events": ((FileWatchEndpoint) target).setEvents(property(camelContext, java.util.Set.class, value)); return true;
        case "fileHasher": ((FileWatchEndpoint) target).setFileHasher(property(camelContext, io.methvin.watcher.hashing.FileHasher.class, value)); return true;
        case "pollThreads": ((FileWatchEndpoint) target).setPollThreads(property(camelContext, int.class, value)); return true;
        case "queueSize": ((FileWatchEndpoint) target).setQueueSize(property(camelContext, int.class, value)); return true;
        case "recursive": ((FileWatchEndpoint) target).setRecursive(property(camelContext, boolean.class, value)); return true;
        case "useFileHashing": ((FileWatchEndpoint) target).setUseFileHashing(property(camelContext, boolean.class, value)); return true;
        case "exceptionHandler": ((FileWatchEndpoint) target).setExceptionHandler(property(camelContext, org.apache.camel.spi.ExceptionHandler.class, value)); return true;
        case "exchangePattern": ((FileWatchEndpoint) target).setExchangePattern(property(camelContext, org.apache.camel.ExchangePattern.class, value)); return true;
        case "basicPropertyBinding": ((FileWatchEndpoint) target).setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "synchronous": ((FileWatchEndpoint) target).setSynchronous(property(camelContext, boolean.class, value)); return true;
            default: return false;
        }
    }

    private static boolean doConfigureIgnoreCase(CamelContext camelContext, Object target, String name, Object value) {
        switch (name.toLowerCase()) {
        case "antinclude": ((FileWatchEndpoint) target).setAntInclude(property(camelContext, java.lang.String.class, value)); return true;
        case "autocreate": ((FileWatchEndpoint) target).setAutoCreate(property(camelContext, boolean.class, value)); return true;
        case "bridgeerrorhandler": ((FileWatchEndpoint) target).setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "concurrentconsumers": ((FileWatchEndpoint) target).setConcurrentConsumers(property(camelContext, int.class, value)); return true;
        case "events": ((FileWatchEndpoint) target).setEvents(property(camelContext, java.util.Set.class, value)); return true;
        case "filehasher": ((FileWatchEndpoint) target).setFileHasher(property(camelContext, io.methvin.watcher.hashing.FileHasher.class, value)); return true;
        case "pollthreads": ((FileWatchEndpoint) target).setPollThreads(property(camelContext, int.class, value)); return true;
        case "queuesize": ((FileWatchEndpoint) target).setQueueSize(property(camelContext, int.class, value)); return true;
        case "recursive": ((FileWatchEndpoint) target).setRecursive(property(camelContext, boolean.class, value)); return true;
        case "usefilehashing": ((FileWatchEndpoint) target).setUseFileHashing(property(camelContext, boolean.class, value)); return true;
        case "exceptionhandler": ((FileWatchEndpoint) target).setExceptionHandler(property(camelContext, org.apache.camel.spi.ExceptionHandler.class, value)); return true;
        case "exchangepattern": ((FileWatchEndpoint) target).setExchangePattern(property(camelContext, org.apache.camel.ExchangePattern.class, value)); return true;
        case "basicpropertybinding": ((FileWatchEndpoint) target).setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "synchronous": ((FileWatchEndpoint) target).setSynchronous(property(camelContext, boolean.class, value)); return true;
            default: return false;
        }
    }

}

