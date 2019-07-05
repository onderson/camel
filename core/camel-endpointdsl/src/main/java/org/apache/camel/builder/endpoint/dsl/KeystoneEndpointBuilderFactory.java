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
 * The openstack-keystone component allows messages to be sent to an OpenStack
 * identity services.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface KeystoneEndpointBuilderFactory {


    /**
     * Builder for endpoint for the OpenStack Keystone component.
     */
    public interface KeystoneEndpointBuilder extends EndpointProducerBuilder {
        default AdvancedKeystoneEndpointBuilder advanced() {
            return (AdvancedKeystoneEndpointBuilder) this;
        }
        /**
         * OpenStack host url.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: producer
         */
        default KeystoneEndpointBuilder host(String host) {
            setProperty("host", host);
            return this;
        }
        /**
         * OpenStack configuration.
         * 
         * The option is a: <code>org.openstack4j.core.transport.Config</code>
         * type.
         * 
         * Group: producer
         */
        default KeystoneEndpointBuilder config(Object config) {
            setProperty("config", config);
            return this;
        }
        /**
         * OpenStack configuration.
         * 
         * The option will be converted to a
         * <code>org.openstack4j.core.transport.Config</code> type.
         * 
         * Group: producer
         */
        default KeystoneEndpointBuilder config(String config) {
            setProperty("config", config);
            return this;
        }
        /**
         * Authentication domain.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: producer
         */
        default KeystoneEndpointBuilder domain(String domain) {
            setProperty("domain", domain);
            return this;
        }
        /**
         * The operation to do.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: producer
         */
        default KeystoneEndpointBuilder operation(String operation) {
            setProperty("operation", operation);
            return this;
        }
        /**
         * OpenStack password.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Required: true
         * Group: producer
         */
        default KeystoneEndpointBuilder password(String password) {
            setProperty("password", password);
            return this;
        }
        /**
         * The project ID.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Required: true
         * Group: producer
         */
        default KeystoneEndpointBuilder project(String project) {
            setProperty("project", project);
            return this;
        }
        /**
         * OpenStack Keystone subsystem.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Required: true
         * Group: producer
         */
        default KeystoneEndpointBuilder subsystem(String subsystem) {
            setProperty("subsystem", subsystem);
            return this;
        }
        /**
         * OpenStack username.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Required: true
         * Group: producer
         */
        default KeystoneEndpointBuilder username(String username) {
            setProperty("username", username);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint for the OpenStack Keystone component.
     */
    public interface AdvancedKeystoneEndpointBuilder
            extends
                EndpointProducerBuilder {
        default KeystoneEndpointBuilder basic() {
            return (KeystoneEndpointBuilder) this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: advanced
         */
        default AdvancedKeystoneEndpointBuilder basicPropertyBinding(
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
        default AdvancedKeystoneEndpointBuilder basicPropertyBinding(
                String basicPropertyBinding) {
            setProperty("basicPropertyBinding", basicPropertyBinding);
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
        default AdvancedKeystoneEndpointBuilder synchronous(boolean synchronous) {
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
        default AdvancedKeystoneEndpointBuilder synchronous(String synchronous) {
            setProperty("synchronous", synchronous);
            return this;
        }
    }
    /**
     * OpenStack Keystone (camel-openstack)
     * The openstack-keystone component allows messages to be sent to an
     * OpenStack identity services.
     * 
     * Syntax: <code>openstack-keystone:host</code>
     * Category: cloud,paas
     * Available as of version: 2.19
     * Maven coordinates: org.apache.camel:camel-openstack
     */
    default KeystoneEndpointBuilder keystone(String path) {
        class KeystoneEndpointBuilderImpl extends AbstractEndpointBuilder implements KeystoneEndpointBuilder, AdvancedKeystoneEndpointBuilder {
            public KeystoneEndpointBuilderImpl(String path) {
                super("openstack-keystone", path);
            }
        }
        return new KeystoneEndpointBuilderImpl(path);
    }
}