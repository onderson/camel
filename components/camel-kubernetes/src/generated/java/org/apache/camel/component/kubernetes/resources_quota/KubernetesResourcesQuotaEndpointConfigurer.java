/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.kubernetes.resources_quota;

import java.util.HashMap;
import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class KubernetesResourcesQuotaEndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer {

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
        case "apiVersion": ((KubernetesResourcesQuotaEndpoint) target).getConfiguration().setApiVersion(property(camelContext, java.lang.String.class, value)); return true;
        case "dnsDomain": ((KubernetesResourcesQuotaEndpoint) target).getConfiguration().setDnsDomain(property(camelContext, java.lang.String.class, value)); return true;
        case "kubernetesClient": ((KubernetesResourcesQuotaEndpoint) target).getConfiguration().setKubernetesClient(property(camelContext, io.fabric8.kubernetes.client.KubernetesClient.class, value)); return true;
        case "lazyStartProducer": ((KubernetesResourcesQuotaEndpoint) target).setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "operation": ((KubernetesResourcesQuotaEndpoint) target).getConfiguration().setOperation(property(camelContext, java.lang.String.class, value)); return true;
        case "portName": ((KubernetesResourcesQuotaEndpoint) target).getConfiguration().setPortName(property(camelContext, java.lang.String.class, value)); return true;
        case "portProtocol": ((KubernetesResourcesQuotaEndpoint) target).getConfiguration().setPortProtocol(property(camelContext, java.lang.String.class, value)); return true;
        case "basicPropertyBinding": ((KubernetesResourcesQuotaEndpoint) target).setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "connectionTimeout": ((KubernetesResourcesQuotaEndpoint) target).getConfiguration().setConnectionTimeout(property(camelContext, java.lang.Integer.class, value)); return true;
        case "synchronous": ((KubernetesResourcesQuotaEndpoint) target).setSynchronous(property(camelContext, boolean.class, value)); return true;
        case "caCertData": ((KubernetesResourcesQuotaEndpoint) target).getConfiguration().setCaCertData(property(camelContext, java.lang.String.class, value)); return true;
        case "caCertFile": ((KubernetesResourcesQuotaEndpoint) target).getConfiguration().setCaCertFile(property(camelContext, java.lang.String.class, value)); return true;
        case "clientCertData": ((KubernetesResourcesQuotaEndpoint) target).getConfiguration().setClientCertData(property(camelContext, java.lang.String.class, value)); return true;
        case "clientCertFile": ((KubernetesResourcesQuotaEndpoint) target).getConfiguration().setClientCertFile(property(camelContext, java.lang.String.class, value)); return true;
        case "clientKeyAlgo": ((KubernetesResourcesQuotaEndpoint) target).getConfiguration().setClientKeyAlgo(property(camelContext, java.lang.String.class, value)); return true;
        case "clientKeyData": ((KubernetesResourcesQuotaEndpoint) target).getConfiguration().setClientKeyData(property(camelContext, java.lang.String.class, value)); return true;
        case "clientKeyFile": ((KubernetesResourcesQuotaEndpoint) target).getConfiguration().setClientKeyFile(property(camelContext, java.lang.String.class, value)); return true;
        case "clientKeyPassphrase": ((KubernetesResourcesQuotaEndpoint) target).getConfiguration().setClientKeyPassphrase(property(camelContext, java.lang.String.class, value)); return true;
        case "oauthToken": ((KubernetesResourcesQuotaEndpoint) target).getConfiguration().setOauthToken(property(camelContext, java.lang.String.class, value)); return true;
        case "password": ((KubernetesResourcesQuotaEndpoint) target).getConfiguration().setPassword(property(camelContext, java.lang.String.class, value)); return true;
        case "trustCerts": ((KubernetesResourcesQuotaEndpoint) target).getConfiguration().setTrustCerts(property(camelContext, java.lang.Boolean.class, value)); return true;
        case "username": ((KubernetesResourcesQuotaEndpoint) target).getConfiguration().setUsername(property(camelContext, java.lang.String.class, value)); return true;
            default: return false;
        }
    }

    private static boolean doConfigureIgnoreCase(CamelContext camelContext, Object target, String name, Object value) {
        switch (name.toLowerCase()) {
        case "apiversion": ((KubernetesResourcesQuotaEndpoint) target).getConfiguration().setApiVersion(property(camelContext, java.lang.String.class, value)); return true;
        case "dnsdomain": ((KubernetesResourcesQuotaEndpoint) target).getConfiguration().setDnsDomain(property(camelContext, java.lang.String.class, value)); return true;
        case "kubernetesclient": ((KubernetesResourcesQuotaEndpoint) target).getConfiguration().setKubernetesClient(property(camelContext, io.fabric8.kubernetes.client.KubernetesClient.class, value)); return true;
        case "lazystartproducer": ((KubernetesResourcesQuotaEndpoint) target).setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "operation": ((KubernetesResourcesQuotaEndpoint) target).getConfiguration().setOperation(property(camelContext, java.lang.String.class, value)); return true;
        case "portname": ((KubernetesResourcesQuotaEndpoint) target).getConfiguration().setPortName(property(camelContext, java.lang.String.class, value)); return true;
        case "portprotocol": ((KubernetesResourcesQuotaEndpoint) target).getConfiguration().setPortProtocol(property(camelContext, java.lang.String.class, value)); return true;
        case "basicpropertybinding": ((KubernetesResourcesQuotaEndpoint) target).setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "connectiontimeout": ((KubernetesResourcesQuotaEndpoint) target).getConfiguration().setConnectionTimeout(property(camelContext, java.lang.Integer.class, value)); return true;
        case "synchronous": ((KubernetesResourcesQuotaEndpoint) target).setSynchronous(property(camelContext, boolean.class, value)); return true;
        case "cacertdata": ((KubernetesResourcesQuotaEndpoint) target).getConfiguration().setCaCertData(property(camelContext, java.lang.String.class, value)); return true;
        case "cacertfile": ((KubernetesResourcesQuotaEndpoint) target).getConfiguration().setCaCertFile(property(camelContext, java.lang.String.class, value)); return true;
        case "clientcertdata": ((KubernetesResourcesQuotaEndpoint) target).getConfiguration().setClientCertData(property(camelContext, java.lang.String.class, value)); return true;
        case "clientcertfile": ((KubernetesResourcesQuotaEndpoint) target).getConfiguration().setClientCertFile(property(camelContext, java.lang.String.class, value)); return true;
        case "clientkeyalgo": ((KubernetesResourcesQuotaEndpoint) target).getConfiguration().setClientKeyAlgo(property(camelContext, java.lang.String.class, value)); return true;
        case "clientkeydata": ((KubernetesResourcesQuotaEndpoint) target).getConfiguration().setClientKeyData(property(camelContext, java.lang.String.class, value)); return true;
        case "clientkeyfile": ((KubernetesResourcesQuotaEndpoint) target).getConfiguration().setClientKeyFile(property(camelContext, java.lang.String.class, value)); return true;
        case "clientkeypassphrase": ((KubernetesResourcesQuotaEndpoint) target).getConfiguration().setClientKeyPassphrase(property(camelContext, java.lang.String.class, value)); return true;
        case "oauthtoken": ((KubernetesResourcesQuotaEndpoint) target).getConfiguration().setOauthToken(property(camelContext, java.lang.String.class, value)); return true;
        case "password": ((KubernetesResourcesQuotaEndpoint) target).getConfiguration().setPassword(property(camelContext, java.lang.String.class, value)); return true;
        case "trustcerts": ((KubernetesResourcesQuotaEndpoint) target).getConfiguration().setTrustCerts(property(camelContext, java.lang.Boolean.class, value)); return true;
        case "username": ((KubernetesResourcesQuotaEndpoint) target).getConfiguration().setUsername(property(camelContext, java.lang.String.class, value)); return true;
            default: return false;
        }
    }

}

