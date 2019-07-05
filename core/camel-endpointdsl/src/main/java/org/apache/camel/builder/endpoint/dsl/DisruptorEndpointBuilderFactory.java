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
import org.apache.camel.ExchangePattern;
import org.apache.camel.WaitForTaskToComplete;
import org.apache.camel.builder.EndpointConsumerBuilder;
import org.apache.camel.builder.EndpointProducerBuilder;
import org.apache.camel.builder.endpoint.AbstractEndpointBuilder;
import org.apache.camel.spi.ExceptionHandler;

/**
 * The disruptor component provides asynchronous SEDA behavior using LMAX
 * Disruptor.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface DisruptorEndpointBuilderFactory {


    /**
     * Builder for endpoint consumers for the Disruptor component.
     */
    public interface DisruptorEndpointConsumerBuilder
            extends
                EndpointConsumerBuilder {
        default AdvancedDisruptorEndpointConsumerBuilder advanced() {
            return (AdvancedDisruptorEndpointConsumerBuilder) this;
        }
        /**
         * Name of queue.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: common
         */
        default DisruptorEndpointConsumerBuilder name(String name) {
            setProperty("name", name);
            return this;
        }
        /**
         * The maximum capacity of the Disruptors ringbuffer Will be effectively
         * increased to the nearest power of two. Notice: Mind if you use this
         * option, then its the first endpoint being created with the queue
         * name, that determines the size. To make sure all endpoints use same
         * size, then configure the size option on all of them, or the first
         * endpoint being created.
         * 
         * The option is a: <code>int</code> type.
         * 
         * Group: common
         */
        default DisruptorEndpointConsumerBuilder size(int size) {
            setProperty("size", size);
            return this;
        }
        /**
         * The maximum capacity of the Disruptors ringbuffer Will be effectively
         * increased to the nearest power of two. Notice: Mind if you use this
         * option, then its the first endpoint being created with the queue
         * name, that determines the size. To make sure all endpoints use same
         * size, then configure the size option on all of them, or the first
         * endpoint being created.
         * 
         * The option will be converted to a <code>int</code> type.
         * 
         * Group: common
         */
        default DisruptorEndpointConsumerBuilder size(String size) {
            setProperty("size", size);
            return this;
        }
        /**
         * Allows for bridging the consumer to the Camel routing Error Handler,
         * which mean any exceptions occurred while the consumer is trying to
         * pickup incoming messages, or the likes, will now be processed as a
         * message and handled by the routing Error Handler. By default the
         * consumer will use the org.apache.camel.spi.ExceptionHandler to deal
         * with exceptions, that will be logged at WARN or ERROR level and
         * ignored.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: consumer
         */
        default DisruptorEndpointConsumerBuilder bridgeErrorHandler(
                boolean bridgeErrorHandler) {
            setProperty("bridgeErrorHandler", bridgeErrorHandler);
            return this;
        }
        /**
         * Allows for bridging the consumer to the Camel routing Error Handler,
         * which mean any exceptions occurred while the consumer is trying to
         * pickup incoming messages, or the likes, will now be processed as a
         * message and handled by the routing Error Handler. By default the
         * consumer will use the org.apache.camel.spi.ExceptionHandler to deal
         * with exceptions, that will be logged at WARN or ERROR level and
         * ignored.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Group: consumer
         */
        default DisruptorEndpointConsumerBuilder bridgeErrorHandler(
                String bridgeErrorHandler) {
            setProperty("bridgeErrorHandler", bridgeErrorHandler);
            return this;
        }
        /**
         * Number of concurrent threads processing exchanges.
         * 
         * The option is a: <code>int</code> type.
         * 
         * Group: consumer
         */
        default DisruptorEndpointConsumerBuilder concurrentConsumers(
                int concurrentConsumers) {
            setProperty("concurrentConsumers", concurrentConsumers);
            return this;
        }
        /**
         * Number of concurrent threads processing exchanges.
         * 
         * The option will be converted to a <code>int</code> type.
         * 
         * Group: consumer
         */
        default DisruptorEndpointConsumerBuilder concurrentConsumers(
                String concurrentConsumers) {
            setProperty("concurrentConsumers", concurrentConsumers);
            return this;
        }
        /**
         * Specifies whether multiple consumers are allowed. If enabled, you can
         * use Disruptor for Publish-Subscribe messaging. That is, you can send
         * a message to the queue and have each consumer receive a copy of the
         * message. When enabled, this option should be specified on every
         * consumer endpoint.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: consumer
         */
        default DisruptorEndpointConsumerBuilder multipleConsumers(
                boolean multipleConsumers) {
            setProperty("multipleConsumers", multipleConsumers);
            return this;
        }
        /**
         * Specifies whether multiple consumers are allowed. If enabled, you can
         * use Disruptor for Publish-Subscribe messaging. That is, you can send
         * a message to the queue and have each consumer receive a copy of the
         * message. When enabled, this option should be specified on every
         * consumer endpoint.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Group: consumer
         */
        default DisruptorEndpointConsumerBuilder multipleConsumers(
                String multipleConsumers) {
            setProperty("multipleConsumers", multipleConsumers);
            return this;
        }
        /**
         * Defines the strategy used by consumer threads to wait on new
         * exchanges to be published. The options allowed are:Blocking,
         * Sleeping, BusySpin and Yielding.
         * 
         * The option is a:
         * <code>org.apache.camel.component.disruptor.DisruptorWaitStrategy</code> type.
         * 
         * Group: consumer
         */
        default DisruptorEndpointConsumerBuilder waitStrategy(
                DisruptorWaitStrategy waitStrategy) {
            setProperty("waitStrategy", waitStrategy);
            return this;
        }
        /**
         * Defines the strategy used by consumer threads to wait on new
         * exchanges to be published. The options allowed are:Blocking,
         * Sleeping, BusySpin and Yielding.
         * 
         * The option will be converted to a
         * <code>org.apache.camel.component.disruptor.DisruptorWaitStrategy</code> type.
         * 
         * Group: consumer
         */
        default DisruptorEndpointConsumerBuilder waitStrategy(
                String waitStrategy) {
            setProperty("waitStrategy", waitStrategy);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint consumers for the Disruptor component.
     */
    public interface AdvancedDisruptorEndpointConsumerBuilder
            extends
                EndpointConsumerBuilder {
        default DisruptorEndpointConsumerBuilder basic() {
            return (DisruptorEndpointConsumerBuilder) this;
        }
        /**
         * To let the consumer use a custom ExceptionHandler. Notice if the
         * option bridgeErrorHandler is enabled then this option is not in use.
         * By default the consumer will deal with exceptions, that will be
         * logged at WARN or ERROR level and ignored.
         * 
         * The option is a: <code>org.apache.camel.spi.ExceptionHandler</code>
         * type.
         * 
         * Group: consumer (advanced)
         */
        default AdvancedDisruptorEndpointConsumerBuilder exceptionHandler(
                ExceptionHandler exceptionHandler) {
            setProperty("exceptionHandler", exceptionHandler);
            return this;
        }
        /**
         * To let the consumer use a custom ExceptionHandler. Notice if the
         * option bridgeErrorHandler is enabled then this option is not in use.
         * By default the consumer will deal with exceptions, that will be
         * logged at WARN or ERROR level and ignored.
         * 
         * The option will be converted to a
         * <code>org.apache.camel.spi.ExceptionHandler</code> type.
         * 
         * Group: consumer (advanced)
         */
        default AdvancedDisruptorEndpointConsumerBuilder exceptionHandler(
                String exceptionHandler) {
            setProperty("exceptionHandler", exceptionHandler);
            return this;
        }
        /**
         * Sets the exchange pattern when the consumer creates an exchange.
         * 
         * The option is a: <code>org.apache.camel.ExchangePattern</code> type.
         * 
         * Group: consumer (advanced)
         */
        default AdvancedDisruptorEndpointConsumerBuilder exchangePattern(
                ExchangePattern exchangePattern) {
            setProperty("exchangePattern", exchangePattern);
            return this;
        }
        /**
         * Sets the exchange pattern when the consumer creates an exchange.
         * 
         * The option will be converted to a
         * <code>org.apache.camel.ExchangePattern</code> type.
         * 
         * Group: consumer (advanced)
         */
        default AdvancedDisruptorEndpointConsumerBuilder exchangePattern(
                String exchangePattern) {
            setProperty("exchangePattern", exchangePattern);
            return this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: advanced
         */
        default AdvancedDisruptorEndpointConsumerBuilder basicPropertyBinding(
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
        default AdvancedDisruptorEndpointConsumerBuilder basicPropertyBinding(
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
        default AdvancedDisruptorEndpointConsumerBuilder synchronous(
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
        default AdvancedDisruptorEndpointConsumerBuilder synchronous(
                String synchronous) {
            setProperty("synchronous", synchronous);
            return this;
        }
    }

    /**
     * Builder for endpoint producers for the Disruptor component.
     */
    public interface DisruptorEndpointProducerBuilder
            extends
                EndpointProducerBuilder {
        default AdvancedDisruptorEndpointProducerBuilder advanced() {
            return (AdvancedDisruptorEndpointProducerBuilder) this;
        }
        /**
         * Name of queue.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: common
         */
        default DisruptorEndpointProducerBuilder name(String name) {
            setProperty("name", name);
            return this;
        }
        /**
         * The maximum capacity of the Disruptors ringbuffer Will be effectively
         * increased to the nearest power of two. Notice: Mind if you use this
         * option, then its the first endpoint being created with the queue
         * name, that determines the size. To make sure all endpoints use same
         * size, then configure the size option on all of them, or the first
         * endpoint being created.
         * 
         * The option is a: <code>int</code> type.
         * 
         * Group: common
         */
        default DisruptorEndpointProducerBuilder size(int size) {
            setProperty("size", size);
            return this;
        }
        /**
         * The maximum capacity of the Disruptors ringbuffer Will be effectively
         * increased to the nearest power of two. Notice: Mind if you use this
         * option, then its the first endpoint being created with the queue
         * name, that determines the size. To make sure all endpoints use same
         * size, then configure the size option on all of them, or the first
         * endpoint being created.
         * 
         * The option will be converted to a <code>int</code> type.
         * 
         * Group: common
         */
        default DisruptorEndpointProducerBuilder size(String size) {
            setProperty("size", size);
            return this;
        }
        /**
         * Whether a thread that sends messages to a full Disruptor will block
         * until the ringbuffer's capacity is no longer exhausted. By default,
         * the calling thread will block and wait until the message can be
         * accepted. By disabling this option, an exception will be thrown
         * stating that the queue is full.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: producer
         */
        default DisruptorEndpointProducerBuilder blockWhenFull(
                boolean blockWhenFull) {
            setProperty("blockWhenFull", blockWhenFull);
            return this;
        }
        /**
         * Whether a thread that sends messages to a full Disruptor will block
         * until the ringbuffer's capacity is no longer exhausted. By default,
         * the calling thread will block and wait until the message can be
         * accepted. By disabling this option, an exception will be thrown
         * stating that the queue is full.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Group: producer
         */
        default DisruptorEndpointProducerBuilder blockWhenFull(
                String blockWhenFull) {
            setProperty("blockWhenFull", blockWhenFull);
            return this;
        }
        /**
         * Whether the producer should be started lazy (on the first message).
         * By starting lazy you can use this to allow CamelContext and routes to
         * startup in situations where a producer may otherwise fail during
         * starting and cause the route to fail being started. By deferring this
         * startup to be lazy then the startup failure can be handled during
         * routing messages via Camel's routing error handlers. Beware that when
         * the first message is processed then creating and starting the
         * producer may take a little time and prolong the total processing time
         * of the processing.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: producer
         */
        default DisruptorEndpointProducerBuilder lazyStartProducer(
                boolean lazyStartProducer) {
            setProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * Whether the producer should be started lazy (on the first message).
         * By starting lazy you can use this to allow CamelContext and routes to
         * startup in situations where a producer may otherwise fail during
         * starting and cause the route to fail being started. By deferring this
         * startup to be lazy then the startup failure can be handled during
         * routing messages via Camel's routing error handlers. Beware that when
         * the first message is processed then creating and starting the
         * producer may take a little time and prolong the total processing time
         * of the processing.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Group: producer
         */
        default DisruptorEndpointProducerBuilder lazyStartProducer(
                String lazyStartProducer) {
            setProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * Defines the producers allowed on the Disruptor. The options allowed
         * are: Multi to allow multiple producers and Single to enable certain
         * optimizations only allowed when one concurrent producer (on one
         * thread or otherwise synchronized) is active.
         * 
         * The option is a:
         * <code>org.apache.camel.component.disruptor.DisruptorProducerType</code> type.
         * 
         * Group: producer
         */
        default DisruptorEndpointProducerBuilder producerType(
                DisruptorProducerType producerType) {
            setProperty("producerType", producerType);
            return this;
        }
        /**
         * Defines the producers allowed on the Disruptor. The options allowed
         * are: Multi to allow multiple producers and Single to enable certain
         * optimizations only allowed when one concurrent producer (on one
         * thread or otherwise synchronized) is active.
         * 
         * The option will be converted to a
         * <code>org.apache.camel.component.disruptor.DisruptorProducerType</code> type.
         * 
         * Group: producer
         */
        default DisruptorEndpointProducerBuilder producerType(
                String producerType) {
            setProperty("producerType", producerType);
            return this;
        }
        /**
         * Timeout (in milliseconds) before a producer will stop waiting for an
         * asynchronous task to complete. You can disable timeout by using 0 or
         * a negative value.
         * 
         * The option is a: <code>long</code> type.
         * 
         * Group: producer
         */
        default DisruptorEndpointProducerBuilder timeout(long timeout) {
            setProperty("timeout", timeout);
            return this;
        }
        /**
         * Timeout (in milliseconds) before a producer will stop waiting for an
         * asynchronous task to complete. You can disable timeout by using 0 or
         * a negative value.
         * 
         * The option will be converted to a <code>long</code> type.
         * 
         * Group: producer
         */
        default DisruptorEndpointProducerBuilder timeout(String timeout) {
            setProperty("timeout", timeout);
            return this;
        }
        /**
         * Option to specify whether the caller should wait for the async task
         * to complete or not before continuing. The following three options are
         * supported: Always, Never or IfReplyExpected. The first two values are
         * self-explanatory. The last value, IfReplyExpected, will only wait if
         * the message is Request Reply based.
         * 
         * The option is a: <code>org.apache.camel.WaitForTaskToComplete</code>
         * type.
         * 
         * Group: producer
         */
        default DisruptorEndpointProducerBuilder waitForTaskToComplete(
                WaitForTaskToComplete waitForTaskToComplete) {
            setProperty("waitForTaskToComplete", waitForTaskToComplete);
            return this;
        }
        /**
         * Option to specify whether the caller should wait for the async task
         * to complete or not before continuing. The following three options are
         * supported: Always, Never or IfReplyExpected. The first two values are
         * self-explanatory. The last value, IfReplyExpected, will only wait if
         * the message is Request Reply based.
         * 
         * The option will be converted to a
         * <code>org.apache.camel.WaitForTaskToComplete</code> type.
         * 
         * Group: producer
         */
        default DisruptorEndpointProducerBuilder waitForTaskToComplete(
                String waitForTaskToComplete) {
            setProperty("waitForTaskToComplete", waitForTaskToComplete);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint producers for the Disruptor component.
     */
    public interface AdvancedDisruptorEndpointProducerBuilder
            extends
                EndpointProducerBuilder {
        default DisruptorEndpointProducerBuilder basic() {
            return (DisruptorEndpointProducerBuilder) this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: advanced
         */
        default AdvancedDisruptorEndpointProducerBuilder basicPropertyBinding(
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
        default AdvancedDisruptorEndpointProducerBuilder basicPropertyBinding(
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
        default AdvancedDisruptorEndpointProducerBuilder synchronous(
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
        default AdvancedDisruptorEndpointProducerBuilder synchronous(
                String synchronous) {
            setProperty("synchronous", synchronous);
            return this;
        }
    }

    /**
     * Builder for endpoint for the Disruptor component.
     */
    public interface DisruptorEndpointBuilder
            extends
                DisruptorEndpointConsumerBuilder, DisruptorEndpointProducerBuilder {
        default AdvancedDisruptorEndpointBuilder advanced() {
            return (AdvancedDisruptorEndpointBuilder) this;
        }
        /**
         * Name of queue.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: common
         */
        default DisruptorEndpointBuilder name(String name) {
            setProperty("name", name);
            return this;
        }
        /**
         * The maximum capacity of the Disruptors ringbuffer Will be effectively
         * increased to the nearest power of two. Notice: Mind if you use this
         * option, then its the first endpoint being created with the queue
         * name, that determines the size. To make sure all endpoints use same
         * size, then configure the size option on all of them, or the first
         * endpoint being created.
         * 
         * The option is a: <code>int</code> type.
         * 
         * Group: common
         */
        default DisruptorEndpointBuilder size(int size) {
            setProperty("size", size);
            return this;
        }
        /**
         * The maximum capacity of the Disruptors ringbuffer Will be effectively
         * increased to the nearest power of two. Notice: Mind if you use this
         * option, then its the first endpoint being created with the queue
         * name, that determines the size. To make sure all endpoints use same
         * size, then configure the size option on all of them, or the first
         * endpoint being created.
         * 
         * The option will be converted to a <code>int</code> type.
         * 
         * Group: common
         */
        default DisruptorEndpointBuilder size(String size) {
            setProperty("size", size);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint for the Disruptor component.
     */
    public interface AdvancedDisruptorEndpointBuilder
            extends
                AdvancedDisruptorEndpointConsumerBuilder, AdvancedDisruptorEndpointProducerBuilder {
        default DisruptorEndpointBuilder basic() {
            return (DisruptorEndpointBuilder) this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: advanced
         */
        default AdvancedDisruptorEndpointBuilder basicPropertyBinding(
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
        default AdvancedDisruptorEndpointBuilder basicPropertyBinding(
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
        default AdvancedDisruptorEndpointBuilder synchronous(boolean synchronous) {
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
        default AdvancedDisruptorEndpointBuilder synchronous(String synchronous) {
            setProperty("synchronous", synchronous);
            return this;
        }
    }

    /**
     * Proxy enum for
     * <code>org.apache.camel.component.disruptor.DisruptorWaitStrategy</code>
     * enum.
     */
    enum DisruptorWaitStrategy {
        Blocking,
        Sleeping,
        BusySpin,
        Yielding;
    }

    /**
     * Proxy enum for
     * <code>org.apache.camel.component.disruptor.DisruptorProducerType</code>
     * enum.
     */
    enum DisruptorProducerType {
        Single,
        Multi;
    }
    /**
     * Disruptor (camel-disruptor)
     * The disruptor component provides asynchronous SEDA behavior using LMAX
     * Disruptor.
     * 
     * Syntax: <code>disruptor:name</code>
     * Category: endpoint
     * Available as of version: 2.12
     * Maven coordinates: org.apache.camel:camel-disruptor
     */
    default DisruptorEndpointBuilder disruptor(String path) {
        class DisruptorEndpointBuilderImpl extends AbstractEndpointBuilder implements DisruptorEndpointBuilder, AdvancedDisruptorEndpointBuilder {
            public DisruptorEndpointBuilderImpl(String path) {
                super("disruptor", path);
            }
        }
        return new DisruptorEndpointBuilderImpl(path);
    }
}