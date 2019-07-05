/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.builder.endpoint.dsl;

import javax.annotation.Generated;
import org.apache.camel.builder.EndpointConsumerBuilder;
import org.apache.camel.builder.EndpointProducerBuilder;
import org.apache.camel.builder.endpoint.AbstractEndpointBuilder;

/**
 * The Kubernetes Resources Quota component provides a producer to execute
 * kubernetes resources quota operations.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface KubernetesResourcesQuotaEndpointBuilderFactory {


    /**
     * Builder for endpoint for the Kubernetes Resources Quota component.
     */
    public interface KubernetesResourcesQuotaEndpointBuilder
            extends
                EndpointProducerBuilder {
        default AdvancedKubernetesResourcesQuotaEndpointBuilder advanced() {
            return (AdvancedKubernetesResourcesQuotaEndpointBuilder) this;
        }
        /**
         * Kubernetes Master url.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: producer
         */
        default KubernetesResourcesQuotaEndpointBuilder masterUrl(
                String masterUrl) {
            setProperty("masterUrl", masterUrl);
            return this;
        }
        /**
         * The Kubernetes API Version to use.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: producer
         */
        default KubernetesResourcesQuotaEndpointBuilder apiVersion(
                String apiVersion) {
            setProperty("apiVersion", apiVersion);
            return this;
        }
        /**
         * The dns domain, used for ServiceCall EIP.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: producer
         */
        default KubernetesResourcesQuotaEndpointBuilder dnsDomain(
                String dnsDomain) {
            setProperty("dnsDomain", dnsDomain);
            return this;
        }
        /**
         * Default KubernetesClient to use if provided.
         * 
         * The option is a:
         * <code>io.fabric8.kubernetes.client.KubernetesClient</code> type.
         * 
         * Group: producer
         */
        default KubernetesResourcesQuotaEndpointBuilder kubernetesClient(
                Object kubernetesClient) {
            setProperty("kubernetesClient", kubernetesClient);
            return this;
        }
        /**
         * Default KubernetesClient to use if provided.
         * 
         * The option will be converted to a
         * <code>io.fabric8.kubernetes.client.KubernetesClient</code> type.
         * 
         * Group: producer
         */
        default KubernetesResourcesQuotaEndpointBuilder kubernetesClient(
                String kubernetesClient) {
            setProperty("kubernetesClient", kubernetesClient);
            return this;
        }
        /**
         * The port name, used for ServiceCall EIP.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: producer
         */
        default KubernetesResourcesQuotaEndpointBuilder portName(String portName) {
            setProperty("portName", portName);
            return this;
        }
        /**
         * The port protocol, used for ServiceCall EIP.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: producer
         */
        default KubernetesResourcesQuotaEndpointBuilder portProtocol(
                String portProtocol) {
            setProperty("portProtocol", portProtocol);
            return this;
        }
        /**
         * The CA Cert Data.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: security
         */
        default KubernetesResourcesQuotaEndpointBuilder caCertData(
                String caCertData) {
            setProperty("caCertData", caCertData);
            return this;
        }
        /**
         * The CA Cert File.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: security
         */
        default KubernetesResourcesQuotaEndpointBuilder caCertFile(
                String caCertFile) {
            setProperty("caCertFile", caCertFile);
            return this;
        }
        /**
         * The Client Cert Data.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: security
         */
        default KubernetesResourcesQuotaEndpointBuilder clientCertData(
                String clientCertData) {
            setProperty("clientCertData", clientCertData);
            return this;
        }
        /**
         * The Client Cert File.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: security
         */
        default KubernetesResourcesQuotaEndpointBuilder clientCertFile(
                String clientCertFile) {
            setProperty("clientCertFile", clientCertFile);
            return this;
        }
        /**
         * The Key Algorithm used by the client.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: security
         */
        default KubernetesResourcesQuotaEndpointBuilder clientKeyAlgo(
                String clientKeyAlgo) {
            setProperty("clientKeyAlgo", clientKeyAlgo);
            return this;
        }
        /**
         * The Client Key data.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: security
         */
        default KubernetesResourcesQuotaEndpointBuilder clientKeyData(
                String clientKeyData) {
            setProperty("clientKeyData", clientKeyData);
            return this;
        }
        /**
         * The Client Key file.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: security
         */
        default KubernetesResourcesQuotaEndpointBuilder clientKeyFile(
                String clientKeyFile) {
            setProperty("clientKeyFile", clientKeyFile);
            return this;
        }
        /**
         * The Client Key Passphrase.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: security
         */
        default KubernetesResourcesQuotaEndpointBuilder clientKeyPassphrase(
                String clientKeyPassphrase) {
            setProperty("clientKeyPassphrase", clientKeyPassphrase);
            return this;
        }
        /**
         * The Auth Token.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: security
         */
        default KubernetesResourcesQuotaEndpointBuilder oauthToken(
                String oauthToken) {
            setProperty("oauthToken", oauthToken);
            return this;
        }
        /**
         * Password to connect to Kubernetes.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: security
         */
        default KubernetesResourcesQuotaEndpointBuilder password(String password) {
            setProperty("password", password);
            return this;
        }
        /**
         * Define if the certs we used are trusted anyway or not.
         * 
         * The option is a: <code>java.lang.Boolean</code> type.
         * 
         * Group: security
         */
        default KubernetesResourcesQuotaEndpointBuilder trustCerts(
                Boolean trustCerts) {
            setProperty("trustCerts", trustCerts);
            return this;
        }
        /**
         * Define if the certs we used are trusted anyway or not.
         * 
         * The option will be converted to a <code>java.lang.Boolean</code>
         * type.
         * 
         * Group: security
         */
        default KubernetesResourcesQuotaEndpointBuilder trustCerts(
                String trustCerts) {
            setProperty("trustCerts", trustCerts);
            return this;
        }
        /**
         * Username to connect to Kubernetes.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: security
         */
        default KubernetesResourcesQuotaEndpointBuilder username(String username) {
            setProperty("username", username);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint for the Kubernetes Resources Quota
     * component.
     */
    public interface AdvancedKubernetesResourcesQuotaEndpointBuilder
            extends
                EndpointProducerBuilder {
        default KubernetesResourcesQuotaEndpointBuilder basic() {
            return (KubernetesResourcesQuotaEndpointBuilder) this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: advanced
         */
        default AdvancedKubernetesResourcesQuotaEndpointBuilder basicPropertyBinding(
                boolean basicPropertyBinding) {
            setProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Group: advanced
         */
        default AdvancedKubernetesResourcesQuotaEndpointBuilder basicPropertyBinding(
                String basicPropertyBinding) {
            setProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * Connection timeout in milliseconds to use when making requests to the
         * Kubernetes API server.
         * 
         * The option is a: <code>java.lang.Integer</code> type.
         * 
         * Group: advanced
         */
        default AdvancedKubernetesResourcesQuotaEndpointBuilder connectionTimeout(
                Integer connectionTimeout) {
            setProperty("connectionTimeout", connectionTimeout);
            return this;
        }
        /**
         * Connection timeout in milliseconds to use when making requests to the
         * Kubernetes API server.
         * 
         * The option will be converted to a <code>java.lang.Integer</code>
         * type.
         * 
         * Group: advanced
         */
        default AdvancedKubernetesResourcesQuotaEndpointBuilder connectionTimeout(
                String connectionTimeout) {
            setProperty("connectionTimeout", connectionTimeout);
            return this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: advanced
         */
        default AdvancedKubernetesResourcesQuotaEndpointBuilder synchronous(
                boolean synchronous) {
            setProperty("synchronous", synchronous);
            return this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Group: advanced
         */
        default AdvancedKubernetesResourcesQuotaEndpointBuilder synchronous(
                String synchronous) {
            setProperty("synchronous", synchronous);
            return this;
        }
    }
    /**
     * Kubernetes Resources Quota (camel-kubernetes)
     * The Kubernetes Resources Quota component provides a producer to execute
     * kubernetes resources quota operations.
     * 
     * Syntax: <code>kubernetes-resources-quota:masterUrl</code>
     * Category: container,cloud,paas
     * Available as of version: 2.17
     * Maven coordinates: org.apache.camel:camel-kubernetes
     */
    default KubernetesResourcesQuotaEndpointBuilder kubernetesResourcesQuota(
            String path) {
        class KubernetesResourcesQuotaEndpointBuilderImpl extends AbstractEndpointBuilder implements KubernetesResourcesQuotaEndpointBuilder, AdvancedKubernetesResourcesQuotaEndpointBuilder {
            public KubernetesResourcesQuotaEndpointBuilderImpl(String path) {
                super("kubernetes-resources-quota", path);
            }
        }
        return new KubernetesResourcesQuotaEndpointBuilderImpl(path);
    }
}