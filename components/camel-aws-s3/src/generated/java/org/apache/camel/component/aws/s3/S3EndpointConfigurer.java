/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.aws.s3;

import java.util.HashMap;
import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class S3EndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer {

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
        case "amazonS3Client": ((S3Endpoint) target).getConfiguration().setAmazonS3Client(property(camelContext, com.amazonaws.services.s3.AmazonS3.class, value)); return true;
        case "autoCreateBucket": ((S3Endpoint) target).getConfiguration().setAutoCreateBucket(property(camelContext, boolean.class, value)); return true;
        case "pathStyleAccess": ((S3Endpoint) target).getConfiguration().setPathStyleAccess(property(camelContext, boolean.class, value)); return true;
        case "policy": ((S3Endpoint) target).getConfiguration().setPolicy(property(camelContext, java.lang.String.class, value)); return true;
        case "proxyHost": ((S3Endpoint) target).getConfiguration().setProxyHost(property(camelContext, java.lang.String.class, value)); return true;
        case "proxyPort": ((S3Endpoint) target).getConfiguration().setProxyPort(property(camelContext, java.lang.Integer.class, value)); return true;
        case "proxyProtocol": ((S3Endpoint) target).getConfiguration().setProxyProtocol(property(camelContext, com.amazonaws.Protocol.class, value)); return true;
        case "region": ((S3Endpoint) target).getConfiguration().setRegion(property(camelContext, java.lang.String.class, value)); return true;
        case "useIAMCredentials": ((S3Endpoint) target).getConfiguration().setUseIAMCredentials(property(camelContext, boolean.class, value)); return true;
        case "encryptionMaterials": ((S3Endpoint) target).getConfiguration().setEncryptionMaterials(property(camelContext, com.amazonaws.services.s3.model.EncryptionMaterials.class, value)); return true;
        case "useEncryption": ((S3Endpoint) target).getConfiguration().setUseEncryption(property(camelContext, boolean.class, value)); return true;
        case "bridgeErrorHandler": ((S3Endpoint) target).setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "deleteAfterRead": ((S3Endpoint) target).getConfiguration().setDeleteAfterRead(property(camelContext, boolean.class, value)); return true;
        case "delimiter": ((S3Endpoint) target).getConfiguration().setDelimiter(property(camelContext, java.lang.String.class, value)); return true;
        case "fileName": ((S3Endpoint) target).getConfiguration().setFileName(property(camelContext, java.lang.String.class, value)); return true;
        case "includeBody": ((S3Endpoint) target).getConfiguration().setIncludeBody(property(camelContext, boolean.class, value)); return true;
        case "maxConnections": ((S3Endpoint) target).setMaxConnections(property(camelContext, int.class, value)); return true;
        case "maxMessagesPerPoll": ((S3Endpoint) target).setMaxMessagesPerPoll(property(camelContext, int.class, value)); return true;
        case "prefix": ((S3Endpoint) target).getConfiguration().setPrefix(property(camelContext, java.lang.String.class, value)); return true;
        case "sendEmptyMessageWhenIdle": ((S3Endpoint) target).setSendEmptyMessageWhenIdle(property(camelContext, boolean.class, value)); return true;
        case "autocloseBody": ((S3Endpoint) target).getConfiguration().setAutocloseBody(property(camelContext, boolean.class, value)); return true;
        case "exceptionHandler": ((S3Endpoint) target).setExceptionHandler(property(camelContext, org.apache.camel.spi.ExceptionHandler.class, value)); return true;
        case "exchangePattern": ((S3Endpoint) target).setExchangePattern(property(camelContext, org.apache.camel.ExchangePattern.class, value)); return true;
        case "pollStrategy": ((S3Endpoint) target).setPollStrategy(property(camelContext, org.apache.camel.spi.PollingConsumerPollStrategy.class, value)); return true;
        case "deleteAfterWrite": ((S3Endpoint) target).getConfiguration().setDeleteAfterWrite(property(camelContext, boolean.class, value)); return true;
        case "keyName": ((S3Endpoint) target).getConfiguration().setKeyName(property(camelContext, java.lang.String.class, value)); return true;
        case "lazyStartProducer": ((S3Endpoint) target).setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "multiPartUpload": ((S3Endpoint) target).getConfiguration().setMultiPartUpload(property(camelContext, boolean.class, value)); return true;
        case "operation": ((S3Endpoint) target).getConfiguration().setOperation(property(camelContext, org.apache.camel.component.aws.s3.S3Operations.class, value)); return true;
        case "partSize": ((S3Endpoint) target).getConfiguration().setPartSize(property(camelContext, long.class, value)); return true;
        case "serverSideEncryption": ((S3Endpoint) target).getConfiguration().setServerSideEncryption(property(camelContext, java.lang.String.class, value)); return true;
        case "storageClass": ((S3Endpoint) target).getConfiguration().setStorageClass(property(camelContext, java.lang.String.class, value)); return true;
        case "awsKMSKeyId": ((S3Endpoint) target).getConfiguration().setAwsKMSKeyId(property(camelContext, java.lang.String.class, value)); return true;
        case "useAwsKMS": ((S3Endpoint) target).getConfiguration().setUseAwsKMS(property(camelContext, boolean.class, value)); return true;
        case "basicPropertyBinding": ((S3Endpoint) target).setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "synchronous": ((S3Endpoint) target).setSynchronous(property(camelContext, boolean.class, value)); return true;
        case "accelerateModeEnabled": ((S3Endpoint) target).getConfiguration().setAccelerateModeEnabled(property(camelContext, boolean.class, value)); return true;
        case "chunkedEncodingDisabled": ((S3Endpoint) target).getConfiguration().setChunkedEncodingDisabled(property(camelContext, boolean.class, value)); return true;
        case "dualstackEnabled": ((S3Endpoint) target).getConfiguration().setDualstackEnabled(property(camelContext, boolean.class, value)); return true;
        case "forceGlobalBucketAccessEnabled": ((S3Endpoint) target).getConfiguration().setForceGlobalBucketAccessEnabled(property(camelContext, boolean.class, value)); return true;
        case "payloadSigningEnabled": ((S3Endpoint) target).getConfiguration().setPayloadSigningEnabled(property(camelContext, boolean.class, value)); return true;
        case "backoffErrorThreshold": ((S3Endpoint) target).setBackoffErrorThreshold(property(camelContext, int.class, value)); return true;
        case "backoffIdleThreshold": ((S3Endpoint) target).setBackoffIdleThreshold(property(camelContext, int.class, value)); return true;
        case "backoffMultiplier": ((S3Endpoint) target).setBackoffMultiplier(property(camelContext, int.class, value)); return true;
        case "delay": ((S3Endpoint) target).setDelay(property(camelContext, long.class, value)); return true;
        case "greedy": ((S3Endpoint) target).setGreedy(property(camelContext, boolean.class, value)); return true;
        case "initialDelay": ((S3Endpoint) target).setInitialDelay(property(camelContext, long.class, value)); return true;
        case "repeatCount": ((S3Endpoint) target).setRepeatCount(property(camelContext, long.class, value)); return true;
        case "runLoggingLevel": ((S3Endpoint) target).setRunLoggingLevel(property(camelContext, org.apache.camel.LoggingLevel.class, value)); return true;
        case "scheduledExecutorService": ((S3Endpoint) target).setScheduledExecutorService(property(camelContext, java.util.concurrent.ScheduledExecutorService.class, value)); return true;
        case "scheduler": ((S3Endpoint) target).setScheduler(property(camelContext, java.lang.String.class, value)); return true;
        case "schedulerProperties": ((S3Endpoint) target).setSchedulerProperties(property(camelContext, java.util.Map.class, value)); return true;
        case "startScheduler": ((S3Endpoint) target).setStartScheduler(property(camelContext, boolean.class, value)); return true;
        case "timeUnit": ((S3Endpoint) target).setTimeUnit(property(camelContext, java.util.concurrent.TimeUnit.class, value)); return true;
        case "useFixedDelay": ((S3Endpoint) target).setUseFixedDelay(property(camelContext, boolean.class, value)); return true;
        case "accessKey": ((S3Endpoint) target).getConfiguration().setAccessKey(property(camelContext, java.lang.String.class, value)); return true;
        case "secretKey": ((S3Endpoint) target).getConfiguration().setSecretKey(property(camelContext, java.lang.String.class, value)); return true;
            default: return false;
        }
    }

    private static boolean doConfigureIgnoreCase(CamelContext camelContext, Object target, String name, Object value) {
        switch (name.toLowerCase()) {
        case "amazons3client": ((S3Endpoint) target).getConfiguration().setAmazonS3Client(property(camelContext, com.amazonaws.services.s3.AmazonS3.class, value)); return true;
        case "autocreatebucket": ((S3Endpoint) target).getConfiguration().setAutoCreateBucket(property(camelContext, boolean.class, value)); return true;
        case "pathstyleaccess": ((S3Endpoint) target).getConfiguration().setPathStyleAccess(property(camelContext, boolean.class, value)); return true;
        case "policy": ((S3Endpoint) target).getConfiguration().setPolicy(property(camelContext, java.lang.String.class, value)); return true;
        case "proxyhost": ((S3Endpoint) target).getConfiguration().setProxyHost(property(camelContext, java.lang.String.class, value)); return true;
        case "proxyport": ((S3Endpoint) target).getConfiguration().setProxyPort(property(camelContext, java.lang.Integer.class, value)); return true;
        case "proxyprotocol": ((S3Endpoint) target).getConfiguration().setProxyProtocol(property(camelContext, com.amazonaws.Protocol.class, value)); return true;
        case "region": ((S3Endpoint) target).getConfiguration().setRegion(property(camelContext, java.lang.String.class, value)); return true;
        case "useiamcredentials": ((S3Endpoint) target).getConfiguration().setUseIAMCredentials(property(camelContext, boolean.class, value)); return true;
        case "encryptionmaterials": ((S3Endpoint) target).getConfiguration().setEncryptionMaterials(property(camelContext, com.amazonaws.services.s3.model.EncryptionMaterials.class, value)); return true;
        case "useencryption": ((S3Endpoint) target).getConfiguration().setUseEncryption(property(camelContext, boolean.class, value)); return true;
        case "bridgeerrorhandler": ((S3Endpoint) target).setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "deleteafterread": ((S3Endpoint) target).getConfiguration().setDeleteAfterRead(property(camelContext, boolean.class, value)); return true;
        case "delimiter": ((S3Endpoint) target).getConfiguration().setDelimiter(property(camelContext, java.lang.String.class, value)); return true;
        case "filename": ((S3Endpoint) target).getConfiguration().setFileName(property(camelContext, java.lang.String.class, value)); return true;
        case "includebody": ((S3Endpoint) target).getConfiguration().setIncludeBody(property(camelContext, boolean.class, value)); return true;
        case "maxconnections": ((S3Endpoint) target).setMaxConnections(property(camelContext, int.class, value)); return true;
        case "maxmessagesperpoll": ((S3Endpoint) target).setMaxMessagesPerPoll(property(camelContext, int.class, value)); return true;
        case "prefix": ((S3Endpoint) target).getConfiguration().setPrefix(property(camelContext, java.lang.String.class, value)); return true;
        case "sendemptymessagewhenidle": ((S3Endpoint) target).setSendEmptyMessageWhenIdle(property(camelContext, boolean.class, value)); return true;
        case "autoclosebody": ((S3Endpoint) target).getConfiguration().setAutocloseBody(property(camelContext, boolean.class, value)); return true;
        case "exceptionhandler": ((S3Endpoint) target).setExceptionHandler(property(camelContext, org.apache.camel.spi.ExceptionHandler.class, value)); return true;
        case "exchangepattern": ((S3Endpoint) target).setExchangePattern(property(camelContext, org.apache.camel.ExchangePattern.class, value)); return true;
        case "pollstrategy": ((S3Endpoint) target).setPollStrategy(property(camelContext, org.apache.camel.spi.PollingConsumerPollStrategy.class, value)); return true;
        case "deleteafterwrite": ((S3Endpoint) target).getConfiguration().setDeleteAfterWrite(property(camelContext, boolean.class, value)); return true;
        case "keyname": ((S3Endpoint) target).getConfiguration().setKeyName(property(camelContext, java.lang.String.class, value)); return true;
        case "lazystartproducer": ((S3Endpoint) target).setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "multipartupload": ((S3Endpoint) target).getConfiguration().setMultiPartUpload(property(camelContext, boolean.class, value)); return true;
        case "operation": ((S3Endpoint) target).getConfiguration().setOperation(property(camelContext, org.apache.camel.component.aws.s3.S3Operations.class, value)); return true;
        case "partsize": ((S3Endpoint) target).getConfiguration().setPartSize(property(camelContext, long.class, value)); return true;
        case "serversideencryption": ((S3Endpoint) target).getConfiguration().setServerSideEncryption(property(camelContext, java.lang.String.class, value)); return true;
        case "storageclass": ((S3Endpoint) target).getConfiguration().setStorageClass(property(camelContext, java.lang.String.class, value)); return true;
        case "awskmskeyid": ((S3Endpoint) target).getConfiguration().setAwsKMSKeyId(property(camelContext, java.lang.String.class, value)); return true;
        case "useawskms": ((S3Endpoint) target).getConfiguration().setUseAwsKMS(property(camelContext, boolean.class, value)); return true;
        case "basicpropertybinding": ((S3Endpoint) target).setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "synchronous": ((S3Endpoint) target).setSynchronous(property(camelContext, boolean.class, value)); return true;
        case "acceleratemodeenabled": ((S3Endpoint) target).getConfiguration().setAccelerateModeEnabled(property(camelContext, boolean.class, value)); return true;
        case "chunkedencodingdisabled": ((S3Endpoint) target).getConfiguration().setChunkedEncodingDisabled(property(camelContext, boolean.class, value)); return true;
        case "dualstackenabled": ((S3Endpoint) target).getConfiguration().setDualstackEnabled(property(camelContext, boolean.class, value)); return true;
        case "forceglobalbucketaccessenabled": ((S3Endpoint) target).getConfiguration().setForceGlobalBucketAccessEnabled(property(camelContext, boolean.class, value)); return true;
        case "payloadsigningenabled": ((S3Endpoint) target).getConfiguration().setPayloadSigningEnabled(property(camelContext, boolean.class, value)); return true;
        case "backofferrorthreshold": ((S3Endpoint) target).setBackoffErrorThreshold(property(camelContext, int.class, value)); return true;
        case "backoffidlethreshold": ((S3Endpoint) target).setBackoffIdleThreshold(property(camelContext, int.class, value)); return true;
        case "backoffmultiplier": ((S3Endpoint) target).setBackoffMultiplier(property(camelContext, int.class, value)); return true;
        case "delay": ((S3Endpoint) target).setDelay(property(camelContext, long.class, value)); return true;
        case "greedy": ((S3Endpoint) target).setGreedy(property(camelContext, boolean.class, value)); return true;
        case "initialdelay": ((S3Endpoint) target).setInitialDelay(property(camelContext, long.class, value)); return true;
        case "repeatcount": ((S3Endpoint) target).setRepeatCount(property(camelContext, long.class, value)); return true;
        case "runlogginglevel": ((S3Endpoint) target).setRunLoggingLevel(property(camelContext, org.apache.camel.LoggingLevel.class, value)); return true;
        case "scheduledexecutorservice": ((S3Endpoint) target).setScheduledExecutorService(property(camelContext, java.util.concurrent.ScheduledExecutorService.class, value)); return true;
        case "scheduler": ((S3Endpoint) target).setScheduler(property(camelContext, java.lang.String.class, value)); return true;
        case "schedulerproperties": ((S3Endpoint) target).setSchedulerProperties(property(camelContext, java.util.Map.class, value)); return true;
        case "startscheduler": ((S3Endpoint) target).setStartScheduler(property(camelContext, boolean.class, value)); return true;
        case "timeunit": ((S3Endpoint) target).setTimeUnit(property(camelContext, java.util.concurrent.TimeUnit.class, value)); return true;
        case "usefixeddelay": ((S3Endpoint) target).setUseFixedDelay(property(camelContext, boolean.class, value)); return true;
        case "accesskey": ((S3Endpoint) target).getConfiguration().setAccessKey(property(camelContext, java.lang.String.class, value)); return true;
        case "secretkey": ((S3Endpoint) target).getConfiguration().setSecretKey(property(camelContext, java.lang.String.class, value)); return true;
            default: return false;
        }
    }

}

