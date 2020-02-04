/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.sql;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class SqlEndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer {

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
        case "allowNamedParameters": ((SqlEndpoint) target).setAllowNamedParameters(property(camelContext, boolean.class, value)); return true;
        case "dataSource": ((SqlEndpoint) target).setDataSource(property(camelContext, javax.sql.DataSource.class, value)); return true;
        case "dataSourceRef": ((SqlEndpoint) target).setDataSourceRef(property(camelContext, java.lang.String.class, value)); return true;
        case "outputClass": ((SqlEndpoint) target).setOutputClass(property(camelContext, java.lang.String.class, value)); return true;
        case "outputHeader": ((SqlEndpoint) target).setOutputHeader(property(camelContext, java.lang.String.class, value)); return true;
        case "outputType": ((SqlEndpoint) target).setOutputType(property(camelContext, org.apache.camel.component.sql.SqlOutputType.class, value)); return true;
        case "separator": ((SqlEndpoint) target).setSeparator(property(camelContext, char.class, value)); return true;
        case "breakBatchOnConsumeFail": ((SqlEndpoint) target).setBreakBatchOnConsumeFail(property(camelContext, boolean.class, value)); return true;
        case "bridgeErrorHandler": ((SqlEndpoint) target).setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "expectedUpdateCount": ((SqlEndpoint) target).setExpectedUpdateCount(property(camelContext, int.class, value)); return true;
        case "maxMessagesPerPoll": ((SqlEndpoint) target).setMaxMessagesPerPoll(property(camelContext, int.class, value)); return true;
        case "onConsume": ((SqlEndpoint) target).setOnConsume(property(camelContext, java.lang.String.class, value)); return true;
        case "onConsumeBatchComplete": ((SqlEndpoint) target).setOnConsumeBatchComplete(property(camelContext, java.lang.String.class, value)); return true;
        case "onConsumeFailed": ((SqlEndpoint) target).setOnConsumeFailed(property(camelContext, java.lang.String.class, value)); return true;
        case "routeEmptyResultSet": ((SqlEndpoint) target).setRouteEmptyResultSet(property(camelContext, boolean.class, value)); return true;
        case "sendEmptyMessageWhenIdle": ((SqlEndpoint) target).setSendEmptyMessageWhenIdle(property(camelContext, boolean.class, value)); return true;
        case "transacted": ((SqlEndpoint) target).setTransacted(property(camelContext, boolean.class, value)); return true;
        case "useIterator": ((SqlEndpoint) target).setUseIterator(property(camelContext, boolean.class, value)); return true;
        case "exceptionHandler": ((SqlEndpoint) target).setExceptionHandler(property(camelContext, org.apache.camel.spi.ExceptionHandler.class, value)); return true;
        case "exchangePattern": ((SqlEndpoint) target).setExchangePattern(property(camelContext, org.apache.camel.ExchangePattern.class, value)); return true;
        case "pollStrategy": ((SqlEndpoint) target).setPollStrategy(property(camelContext, org.apache.camel.spi.PollingConsumerPollStrategy.class, value)); return true;
        case "processingStrategy": ((SqlEndpoint) target).setProcessingStrategy(property(camelContext, org.apache.camel.component.sql.SqlProcessingStrategy.class, value)); return true;
        case "batch": ((SqlEndpoint) target).setBatch(property(camelContext, boolean.class, value)); return true;
        case "lazyStartProducer": ((SqlEndpoint) target).setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "noop": ((SqlEndpoint) target).setNoop(property(camelContext, boolean.class, value)); return true;
        case "useMessageBodyForSql": ((SqlEndpoint) target).setUseMessageBodyForSql(property(camelContext, boolean.class, value)); return true;
        case "alwaysPopulateStatement": ((SqlEndpoint) target).setAlwaysPopulateStatement(property(camelContext, boolean.class, value)); return true;
        case "basicPropertyBinding": ((SqlEndpoint) target).setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "parametersCount": ((SqlEndpoint) target).setParametersCount(property(camelContext, int.class, value)); return true;
        case "placeholder": ((SqlEndpoint) target).setPlaceholder(property(camelContext, java.lang.String.class, value)); return true;
        case "prepareStatementStrategy": ((SqlEndpoint) target).setPrepareStatementStrategy(property(camelContext, org.apache.camel.component.sql.SqlPrepareStatementStrategy.class, value)); return true;
        case "synchronous": ((SqlEndpoint) target).setSynchronous(property(camelContext, boolean.class, value)); return true;
        case "templateOptions": ((SqlEndpoint) target).setTemplateOptions(property(camelContext, java.util.Map.class, value)); return true;
        case "usePlaceholder": ((SqlEndpoint) target).setUsePlaceholder(property(camelContext, boolean.class, value)); return true;
        case "backoffErrorThreshold": ((SqlEndpoint) target).setBackoffErrorThreshold(property(camelContext, int.class, value)); return true;
        case "backoffIdleThreshold": ((SqlEndpoint) target).setBackoffIdleThreshold(property(camelContext, int.class, value)); return true;
        case "backoffMultiplier": ((SqlEndpoint) target).setBackoffMultiplier(property(camelContext, int.class, value)); return true;
        case "delay": ((SqlEndpoint) target).setDelay(property(camelContext, long.class, value)); return true;
        case "greedy": ((SqlEndpoint) target).setGreedy(property(camelContext, boolean.class, value)); return true;
        case "initialDelay": ((SqlEndpoint) target).setInitialDelay(property(camelContext, long.class, value)); return true;
        case "repeatCount": ((SqlEndpoint) target).setRepeatCount(property(camelContext, long.class, value)); return true;
        case "runLoggingLevel": ((SqlEndpoint) target).setRunLoggingLevel(property(camelContext, org.apache.camel.LoggingLevel.class, value)); return true;
        case "scheduledExecutorService": ((SqlEndpoint) target).setScheduledExecutorService(property(camelContext, java.util.concurrent.ScheduledExecutorService.class, value)); return true;
        case "scheduler": ((SqlEndpoint) target).setScheduler(property(camelContext, java.lang.String.class, value)); return true;
        case "schedulerProperties": ((SqlEndpoint) target).setSchedulerProperties(property(camelContext, java.util.Map.class, value)); return true;
        case "startScheduler": ((SqlEndpoint) target).setStartScheduler(property(camelContext, boolean.class, value)); return true;
        case "timeUnit": ((SqlEndpoint) target).setTimeUnit(property(camelContext, java.util.concurrent.TimeUnit.class, value)); return true;
        case "useFixedDelay": ((SqlEndpoint) target).setUseFixedDelay(property(camelContext, boolean.class, value)); return true;
            default: return false;
        }
    }

    private static boolean doConfigureIgnoreCase(CamelContext camelContext, Object target, String name, Object value) {
        switch (name.toLowerCase()) {
        case "allownamedparameters": ((SqlEndpoint) target).setAllowNamedParameters(property(camelContext, boolean.class, value)); return true;
        case "datasource": ((SqlEndpoint) target).setDataSource(property(camelContext, javax.sql.DataSource.class, value)); return true;
        case "datasourceref": ((SqlEndpoint) target).setDataSourceRef(property(camelContext, java.lang.String.class, value)); return true;
        case "outputclass": ((SqlEndpoint) target).setOutputClass(property(camelContext, java.lang.String.class, value)); return true;
        case "outputheader": ((SqlEndpoint) target).setOutputHeader(property(camelContext, java.lang.String.class, value)); return true;
        case "outputtype": ((SqlEndpoint) target).setOutputType(property(camelContext, org.apache.camel.component.sql.SqlOutputType.class, value)); return true;
        case "separator": ((SqlEndpoint) target).setSeparator(property(camelContext, char.class, value)); return true;
        case "breakbatchonconsumefail": ((SqlEndpoint) target).setBreakBatchOnConsumeFail(property(camelContext, boolean.class, value)); return true;
        case "bridgeerrorhandler": ((SqlEndpoint) target).setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "expectedupdatecount": ((SqlEndpoint) target).setExpectedUpdateCount(property(camelContext, int.class, value)); return true;
        case "maxmessagesperpoll": ((SqlEndpoint) target).setMaxMessagesPerPoll(property(camelContext, int.class, value)); return true;
        case "onconsume": ((SqlEndpoint) target).setOnConsume(property(camelContext, java.lang.String.class, value)); return true;
        case "onconsumebatchcomplete": ((SqlEndpoint) target).setOnConsumeBatchComplete(property(camelContext, java.lang.String.class, value)); return true;
        case "onconsumefailed": ((SqlEndpoint) target).setOnConsumeFailed(property(camelContext, java.lang.String.class, value)); return true;
        case "routeemptyresultset": ((SqlEndpoint) target).setRouteEmptyResultSet(property(camelContext, boolean.class, value)); return true;
        case "sendemptymessagewhenidle": ((SqlEndpoint) target).setSendEmptyMessageWhenIdle(property(camelContext, boolean.class, value)); return true;
        case "transacted": ((SqlEndpoint) target).setTransacted(property(camelContext, boolean.class, value)); return true;
        case "useiterator": ((SqlEndpoint) target).setUseIterator(property(camelContext, boolean.class, value)); return true;
        case "exceptionhandler": ((SqlEndpoint) target).setExceptionHandler(property(camelContext, org.apache.camel.spi.ExceptionHandler.class, value)); return true;
        case "exchangepattern": ((SqlEndpoint) target).setExchangePattern(property(camelContext, org.apache.camel.ExchangePattern.class, value)); return true;
        case "pollstrategy": ((SqlEndpoint) target).setPollStrategy(property(camelContext, org.apache.camel.spi.PollingConsumerPollStrategy.class, value)); return true;
        case "processingstrategy": ((SqlEndpoint) target).setProcessingStrategy(property(camelContext, org.apache.camel.component.sql.SqlProcessingStrategy.class, value)); return true;
        case "batch": ((SqlEndpoint) target).setBatch(property(camelContext, boolean.class, value)); return true;
        case "lazystartproducer": ((SqlEndpoint) target).setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "noop": ((SqlEndpoint) target).setNoop(property(camelContext, boolean.class, value)); return true;
        case "usemessagebodyforsql": ((SqlEndpoint) target).setUseMessageBodyForSql(property(camelContext, boolean.class, value)); return true;
        case "alwayspopulatestatement": ((SqlEndpoint) target).setAlwaysPopulateStatement(property(camelContext, boolean.class, value)); return true;
        case "basicpropertybinding": ((SqlEndpoint) target).setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "parameterscount": ((SqlEndpoint) target).setParametersCount(property(camelContext, int.class, value)); return true;
        case "placeholder": ((SqlEndpoint) target).setPlaceholder(property(camelContext, java.lang.String.class, value)); return true;
        case "preparestatementstrategy": ((SqlEndpoint) target).setPrepareStatementStrategy(property(camelContext, org.apache.camel.component.sql.SqlPrepareStatementStrategy.class, value)); return true;
        case "synchronous": ((SqlEndpoint) target).setSynchronous(property(camelContext, boolean.class, value)); return true;
        case "templateoptions": ((SqlEndpoint) target).setTemplateOptions(property(camelContext, java.util.Map.class, value)); return true;
        case "useplaceholder": ((SqlEndpoint) target).setUsePlaceholder(property(camelContext, boolean.class, value)); return true;
        case "backofferrorthreshold": ((SqlEndpoint) target).setBackoffErrorThreshold(property(camelContext, int.class, value)); return true;
        case "backoffidlethreshold": ((SqlEndpoint) target).setBackoffIdleThreshold(property(camelContext, int.class, value)); return true;
        case "backoffmultiplier": ((SqlEndpoint) target).setBackoffMultiplier(property(camelContext, int.class, value)); return true;
        case "delay": ((SqlEndpoint) target).setDelay(property(camelContext, long.class, value)); return true;
        case "greedy": ((SqlEndpoint) target).setGreedy(property(camelContext, boolean.class, value)); return true;
        case "initialdelay": ((SqlEndpoint) target).setInitialDelay(property(camelContext, long.class, value)); return true;
        case "repeatcount": ((SqlEndpoint) target).setRepeatCount(property(camelContext, long.class, value)); return true;
        case "runlogginglevel": ((SqlEndpoint) target).setRunLoggingLevel(property(camelContext, org.apache.camel.LoggingLevel.class, value)); return true;
        case "scheduledexecutorservice": ((SqlEndpoint) target).setScheduledExecutorService(property(camelContext, java.util.concurrent.ScheduledExecutorService.class, value)); return true;
        case "scheduler": ((SqlEndpoint) target).setScheduler(property(camelContext, java.lang.String.class, value)); return true;
        case "schedulerproperties": ((SqlEndpoint) target).setSchedulerProperties(property(camelContext, java.util.Map.class, value)); return true;
        case "startscheduler": ((SqlEndpoint) target).setStartScheduler(property(camelContext, boolean.class, value)); return true;
        case "timeunit": ((SqlEndpoint) target).setTimeUnit(property(camelContext, java.util.concurrent.TimeUnit.class, value)); return true;
        case "usefixeddelay": ((SqlEndpoint) target).setUseFixedDelay(property(camelContext, boolean.class, value)); return true;
            default: return false;
        }
    }

}
