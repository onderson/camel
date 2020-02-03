/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.aws2.kms;

import java.util.HashMap;
import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class KMS2EndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer {

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
        case "accessKey": ((KMS2Endpoint) target).getConfiguration().setAccessKey(property(camelContext, java.lang.String.class, value)); return true;
        case "kmsClient": ((KMS2Endpoint) target).getConfiguration().setKmsClient(property(camelContext, software.amazon.awssdk.services.kms.KmsClient.class, value)); return true;
        case "lazyStartProducer": ((KMS2Endpoint) target).setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "operation": ((KMS2Endpoint) target).getConfiguration().setOperation(property(camelContext, org.apache.camel.component.aws2.kms.KMS2Operations.class, value)); return true;
        case "proxyHost": ((KMS2Endpoint) target).getConfiguration().setProxyHost(property(camelContext, java.lang.String.class, value)); return true;
        case "proxyPort": ((KMS2Endpoint) target).getConfiguration().setProxyPort(property(camelContext, java.lang.Integer.class, value)); return true;
        case "proxyProtocol": ((KMS2Endpoint) target).getConfiguration().setProxyProtocol(property(camelContext, software.amazon.awssdk.core.Protocol.class, value)); return true;
        case "region": ((KMS2Endpoint) target).getConfiguration().setRegion(property(camelContext, java.lang.String.class, value)); return true;
        case "secretKey": ((KMS2Endpoint) target).getConfiguration().setSecretKey(property(camelContext, java.lang.String.class, value)); return true;
        case "basicPropertyBinding": ((KMS2Endpoint) target).setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "synchronous": ((KMS2Endpoint) target).setSynchronous(property(camelContext, boolean.class, value)); return true;
            default: return false;
        }
    }

    private static boolean doConfigureIgnoreCase(CamelContext camelContext, Object target, String name, Object value) {
        switch (name.toLowerCase()) {
        case "accesskey": ((KMS2Endpoint) target).getConfiguration().setAccessKey(property(camelContext, java.lang.String.class, value)); return true;
        case "kmsclient": ((KMS2Endpoint) target).getConfiguration().setKmsClient(property(camelContext, software.amazon.awssdk.services.kms.KmsClient.class, value)); return true;
        case "lazystartproducer": ((KMS2Endpoint) target).setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "operation": ((KMS2Endpoint) target).getConfiguration().setOperation(property(camelContext, org.apache.camel.component.aws2.kms.KMS2Operations.class, value)); return true;
        case "proxyhost": ((KMS2Endpoint) target).getConfiguration().setProxyHost(property(camelContext, java.lang.String.class, value)); return true;
        case "proxyport": ((KMS2Endpoint) target).getConfiguration().setProxyPort(property(camelContext, java.lang.Integer.class, value)); return true;
        case "proxyprotocol": ((KMS2Endpoint) target).getConfiguration().setProxyProtocol(property(camelContext, software.amazon.awssdk.core.Protocol.class, value)); return true;
        case "region": ((KMS2Endpoint) target).getConfiguration().setRegion(property(camelContext, java.lang.String.class, value)); return true;
        case "secretkey": ((KMS2Endpoint) target).getConfiguration().setSecretKey(property(camelContext, java.lang.String.class, value)); return true;
        case "basicpropertybinding": ((KMS2Endpoint) target).setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "synchronous": ((KMS2Endpoint) target).setSynchronous(property(camelContext, boolean.class, value)); return true;
            default: return false;
        }
    }

}

