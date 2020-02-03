/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.dataset;

import java.util.HashMap;
import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class DataSetTestEndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer {

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
        case "anyOrder": ((DataSetTestEndpoint) target).setAnyOrder(property(camelContext, boolean.class, value)); return true;
        case "assertPeriod": ((DataSetTestEndpoint) target).setAssertPeriod(property(camelContext, long.class, value)); return true;
        case "delimiter": ((DataSetTestEndpoint) target).setDelimiter(property(camelContext, java.lang.String.class, value)); return true;
        case "expectedCount": ((DataSetTestEndpoint) target).setExpectedCount(property(camelContext, int.class, value)); return true;
        case "failFast": ((DataSetTestEndpoint) target).setFailFast(property(camelContext, boolean.class, value)); return true;
        case "lazyStartProducer": ((DataSetTestEndpoint) target).setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "reportGroup": ((DataSetTestEndpoint) target).setReportGroup(property(camelContext, int.class, value)); return true;
        case "resultMinimumWaitTime": ((DataSetTestEndpoint) target).setResultMinimumWaitTime(property(camelContext, long.class, value)); return true;
        case "resultWaitTime": ((DataSetTestEndpoint) target).setResultWaitTime(property(camelContext, long.class, value)); return true;
        case "retainFirst": ((DataSetTestEndpoint) target).setRetainFirst(property(camelContext, int.class, value)); return true;
        case "retainLast": ((DataSetTestEndpoint) target).setRetainLast(property(camelContext, int.class, value)); return true;
        case "sleepForEmptyTest": ((DataSetTestEndpoint) target).setSleepForEmptyTest(property(camelContext, long.class, value)); return true;
        case "split": ((DataSetTestEndpoint) target).setSplit(property(camelContext, boolean.class, value)); return true;
        case "timeout": ((DataSetTestEndpoint) target).setTimeout(property(camelContext, long.class, value)); return true;
        case "copyOnExchange": ((DataSetTestEndpoint) target).setCopyOnExchange(property(camelContext, boolean.class, value)); return true;
        case "basicPropertyBinding": ((DataSetTestEndpoint) target).setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "synchronous": ((DataSetTestEndpoint) target).setSynchronous(property(camelContext, boolean.class, value)); return true;
            default: return false;
        }
    }

    private static boolean doConfigureIgnoreCase(CamelContext camelContext, Object target, String name, Object value) {
        switch (name.toLowerCase()) {
        case "anyorder": ((DataSetTestEndpoint) target).setAnyOrder(property(camelContext, boolean.class, value)); return true;
        case "assertperiod": ((DataSetTestEndpoint) target).setAssertPeriod(property(camelContext, long.class, value)); return true;
        case "delimiter": ((DataSetTestEndpoint) target).setDelimiter(property(camelContext, java.lang.String.class, value)); return true;
        case "expectedcount": ((DataSetTestEndpoint) target).setExpectedCount(property(camelContext, int.class, value)); return true;
        case "failfast": ((DataSetTestEndpoint) target).setFailFast(property(camelContext, boolean.class, value)); return true;
        case "lazystartproducer": ((DataSetTestEndpoint) target).setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "reportgroup": ((DataSetTestEndpoint) target).setReportGroup(property(camelContext, int.class, value)); return true;
        case "resultminimumwaittime": ((DataSetTestEndpoint) target).setResultMinimumWaitTime(property(camelContext, long.class, value)); return true;
        case "resultwaittime": ((DataSetTestEndpoint) target).setResultWaitTime(property(camelContext, long.class, value)); return true;
        case "retainfirst": ((DataSetTestEndpoint) target).setRetainFirst(property(camelContext, int.class, value)); return true;
        case "retainlast": ((DataSetTestEndpoint) target).setRetainLast(property(camelContext, int.class, value)); return true;
        case "sleepforemptytest": ((DataSetTestEndpoint) target).setSleepForEmptyTest(property(camelContext, long.class, value)); return true;
        case "split": ((DataSetTestEndpoint) target).setSplit(property(camelContext, boolean.class, value)); return true;
        case "timeout": ((DataSetTestEndpoint) target).setTimeout(property(camelContext, long.class, value)); return true;
        case "copyonexchange": ((DataSetTestEndpoint) target).setCopyOnExchange(property(camelContext, boolean.class, value)); return true;
        case "basicpropertybinding": ((DataSetTestEndpoint) target).setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "synchronous": ((DataSetTestEndpoint) target).setSynchronous(property(camelContext, boolean.class, value)); return true;
            default: return false;
        }
    }

}

