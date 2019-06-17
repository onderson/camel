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
 * The DigitalOcean component allows you to manage Droplets and resources within
 * the DigitalOcean cloud.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface DigitalOceanEndpointBuilderFactory {


    /**
     * Builder for endpoint for the DigitalOcean component.
     */
    public interface DigitalOceanEndpointBuilder
            extends
                EndpointProducerBuilder {
        default AdvancedDigitalOceanEndpointBuilder advanced() {
            return (AdvancedDigitalOceanEndpointBuilder) this;
        }
        /**
         * The operation to perform to the given resource.
         * The option is a
         * <code>org.apache.camel.component.digitalocean.constants.DigitalOceanOperations</code> type.
         * @group producer
         */
        default DigitalOceanEndpointBuilder operation(
                DigitalOceanOperations operation) {
            setProperty("operation", operation);
            return this;
        }
        /**
         * The operation to perform to the given resource.
         * The option will be converted to a
         * <code>org.apache.camel.component.digitalocean.constants.DigitalOceanOperations</code> type.
         * @group producer
         */
        default DigitalOceanEndpointBuilder operation(String operation) {
            setProperty("operation", operation);
            return this;
        }
        /**
         * Use for pagination. Force the page number.
         * The option is a <code>java.lang.Integer</code> type.
         * @group producer
         */
        default DigitalOceanEndpointBuilder page(Integer page) {
            setProperty("page", page);
            return this;
        }
        /**
         * Use for pagination. Force the page number.
         * The option will be converted to a <code>java.lang.Integer</code>
         * type.
         * @group producer
         */
        default DigitalOceanEndpointBuilder page(String page) {
            setProperty("page", page);
            return this;
        }
        /**
         * Use for pagination. Set the number of item per request. The maximum
         * number of results per page is 200.
         * The option is a <code>java.lang.Integer</code> type.
         * @group producer
         */
        default DigitalOceanEndpointBuilder perPage(Integer perPage) {
            setProperty("perPage", perPage);
            return this;
        }
        /**
         * Use for pagination. Set the number of item per request. The maximum
         * number of results per page is 200.
         * The option will be converted to a <code>java.lang.Integer</code>
         * type.
         * @group producer
         */
        default DigitalOceanEndpointBuilder perPage(String perPage) {
            setProperty("perPage", perPage);
            return this;
        }
        /**
         * The DigitalOcean resource type on which perform the operation.
         * The option is a
         * <code>org.apache.camel.component.digitalocean.constants.DigitalOceanResources</code> type.
         * @group producer
         */
        default DigitalOceanEndpointBuilder resource(
                DigitalOceanResources resource) {
            setProperty("resource", resource);
            return this;
        }
        /**
         * The DigitalOcean resource type on which perform the operation.
         * The option will be converted to a
         * <code>org.apache.camel.component.digitalocean.constants.DigitalOceanResources</code> type.
         * @group producer
         */
        default DigitalOceanEndpointBuilder resource(String resource) {
            setProperty("resource", resource);
            return this;
        }
        /**
         * Set a proxy host if needed.
         * The option is a <code>java.lang.String</code> type.
         * @group proxy
         */
        default DigitalOceanEndpointBuilder httpProxyHost(String httpProxyHost) {
            setProperty("httpProxyHost", httpProxyHost);
            return this;
        }
        /**
         * Set a proxy password if needed.
         * The option is a <code>java.lang.String</code> type.
         * @group proxy
         */
        default DigitalOceanEndpointBuilder httpProxyPassword(
                String httpProxyPassword) {
            setProperty("httpProxyPassword", httpProxyPassword);
            return this;
        }
        /**
         * Set a proxy port if needed.
         * The option is a <code>java.lang.Integer</code> type.
         * @group proxy
         */
        default DigitalOceanEndpointBuilder httpProxyPort(Integer httpProxyPort) {
            setProperty("httpProxyPort", httpProxyPort);
            return this;
        }
        /**
         * Set a proxy port if needed.
         * The option will be converted to a <code>java.lang.Integer</code>
         * type.
         * @group proxy
         */
        default DigitalOceanEndpointBuilder httpProxyPort(String httpProxyPort) {
            setProperty("httpProxyPort", httpProxyPort);
            return this;
        }
        /**
         * Set a proxy host if needed.
         * The option is a <code>java.lang.String</code> type.
         * @group proxy
         */
        default DigitalOceanEndpointBuilder httpProxyUser(String httpProxyUser) {
            setProperty("httpProxyUser", httpProxyUser);
            return this;
        }
        /**
         * DigitalOcean OAuth Token.
         * The option is a <code>java.lang.String</code> type.
         * @group security
         */
        default DigitalOceanEndpointBuilder oAuthToken(String oAuthToken) {
            setProperty("oAuthToken", oAuthToken);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint for the DigitalOcean component.
     */
    public interface AdvancedDigitalOceanEndpointBuilder
            extends
                EndpointProducerBuilder {
        default DigitalOceanEndpointBuilder basic() {
            return (DigitalOceanEndpointBuilder) this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * The option is a <code>boolean</code> type.
         * @group advanced
         */
        default AdvancedDigitalOceanEndpointBuilder basicPropertyBinding(
                boolean basicPropertyBinding) {
            setProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * The option will be converted to a <code>boolean</code> type.
         * @group advanced
         */
        default AdvancedDigitalOceanEndpointBuilder basicPropertyBinding(
                String basicPropertyBinding) {
            setProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * To use a existing configured DigitalOceanClient as client.
         * The option is a
         * <code>com.myjeeva.digitalocean.impl.DigitalOceanClient</code> type.
         * @group advanced
         */
        default AdvancedDigitalOceanEndpointBuilder digitalOceanClient(
                Object digitalOceanClient) {
            setProperty("digitalOceanClient", digitalOceanClient);
            return this;
        }
        /**
         * To use a existing configured DigitalOceanClient as client.
         * The option will be converted to a
         * <code>com.myjeeva.digitalocean.impl.DigitalOceanClient</code> type.
         * @group advanced
         */
        default AdvancedDigitalOceanEndpointBuilder digitalOceanClient(
                String digitalOceanClient) {
            setProperty("digitalOceanClient", digitalOceanClient);
            return this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * The option is a <code>boolean</code> type.
         * @group advanced
         */
        default AdvancedDigitalOceanEndpointBuilder synchronous(
                boolean synchronous) {
            setProperty("synchronous", synchronous);
            return this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * The option will be converted to a <code>boolean</code> type.
         * @group advanced
         */
        default AdvancedDigitalOceanEndpointBuilder synchronous(
                String synchronous) {
            setProperty("synchronous", synchronous);
            return this;
        }
    }

    /**
     * Proxy enum for
     * <code>org.apache.camel.component.digitalocean.constants.DigitalOceanOperations</code> enum.
     */
    static enum DigitalOceanOperations {
        create, update, delete, list, ownList, get, listBackups, listActions, listNeighbors, listSnapshots, listKernels, listAllNeighbors, enableBackups, disableBackups, reboot, powerCycle, shutdown, powerOn, powerOff, restore, resetPassword, resize, rebuild, rename, changeKernel, enableIpv6, enablePrivateNetworking, takeSnapshot, transfer, convert, attach, detach, assign, unassign, tag, untag;
    }

    /**
     * Proxy enum for
     * <code>org.apache.camel.component.digitalocean.constants.DigitalOceanResources</code> enum.
     */
    static enum DigitalOceanResources {
        account, actions, blockStorages, droplets, images, snapshots, keys, regions, sizes, floatingIPs, tags;
    }
    /**
     * The DigitalOcean component allows you to manage Droplets and resources
     * within the DigitalOcean cloud. Creates a builder to build endpoints for
     * the DigitalOcean component.
     */
    default DigitalOceanEndpointBuilder digitalOcean(String path) {
        class DigitalOceanEndpointBuilderImpl extends AbstractEndpointBuilder implements DigitalOceanEndpointBuilder, AdvancedDigitalOceanEndpointBuilder {
            public DigitalOceanEndpointBuilderImpl(String path) {
                super("digitalocean", path);
            }
        }
        return new DigitalOceanEndpointBuilderImpl(path);
    }
}