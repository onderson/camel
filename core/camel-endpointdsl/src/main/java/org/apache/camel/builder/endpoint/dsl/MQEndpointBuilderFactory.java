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
 * The aws-mq is used for managing Amazon MQ instances.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface MQEndpointBuilderFactory {


    /**
     * Builder for endpoint for the AWS MQ component.
     */
    public interface MQEndpointBuilder extends EndpointProducerBuilder {
        default AdvancedMQEndpointBuilder advanced() {
            return (AdvancedMQEndpointBuilder) this;
        }
        /**
         * Logical name.
         * The option is a <code>java.lang.String</code> type.
         * @group producer
         */
        default MQEndpointBuilder label(String label) {
            setProperty("label", label);
            return this;
        }
        /**
         * The region in which MQ client needs to work.
         * The option is a <code>java.lang.String</code> type.
         * @group producer
         */
        default MQEndpointBuilder region(String region) {
            setProperty("region", region);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint for the AWS MQ component.
     */
    public interface AdvancedMQEndpointBuilder
            extends
                EndpointProducerBuilder {
        default MQEndpointBuilder basic() {
            return (MQEndpointBuilder) this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * The option is a <code>boolean</code> type.
         * @group advanced
         */
        default AdvancedMQEndpointBuilder basicPropertyBinding(
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
        default AdvancedMQEndpointBuilder basicPropertyBinding(
                String basicPropertyBinding) {
            setProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * The option is a <code>boolean</code> type.
         * @group advanced
         */
        default AdvancedMQEndpointBuilder synchronous(boolean synchronous) {
            setProperty("synchronous", synchronous);
            return this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * The option will be converted to a <code>boolean</code> type.
         * @group advanced
         */
        default AdvancedMQEndpointBuilder synchronous(String synchronous) {
            setProperty("synchronous", synchronous);
            return this;
        }
    }

    /**
     * Proxy enum for
     * <code>org.apache.camel.component.aws.mq.MQOperations</code> enum.
     */
    static enum MQOperations {
        listBrokers, createBroker, deleteBroker, rebootBroker, updateBroker, describeBroker;
    }
    /**
     * The aws-mq is used for managing Amazon MQ instances. Creates a builder to
     * build endpoints for the AWS MQ component.
     */
    default MQEndpointBuilder mQ(String path) {
        class MQEndpointBuilderImpl extends AbstractEndpointBuilder implements MQEndpointBuilder, AdvancedMQEndpointBuilder {
            public MQEndpointBuilderImpl(String path) {
                super("aws-mq", path);
            }
        }
        return new MQEndpointBuilderImpl(path);
    }
}