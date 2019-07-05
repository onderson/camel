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

import java.util.concurrent.BlockingQueue;
import javax.annotation.Generated;
import org.apache.camel.ExchangePattern;
import org.apache.camel.WaitForTaskToComplete;
import org.apache.camel.builder.EndpointConsumerBuilder;
import org.apache.camel.builder.EndpointProducerBuilder;
import org.apache.camel.builder.endpoint.AbstractEndpointBuilder;
import org.apache.camel.spi.ExceptionHandler;

/**
 * The seda component provides asynchronous call to another endpoint from any
 * CamelContext in the same JVM.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface SedaEndpointBuilderFactory {


    /**
     * Builder for endpoint consumers for the SEDA component.
     */
    public interface SedaEndpointConsumerBuilder
            extends
                EndpointConsumerBuilder {
        default AdvancedSedaEndpointConsumerBuilder advanced() {
            return (AdvancedSedaEndpointConsumerBuilder) this;
        }
        /**
         * Name of queue.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: common
         */
        default SedaEndpointConsumerBuilder name(String name) {
            setProperty("name", name);
            return this;
        }
        /**
         * The maximum capacity of the SEDA queue (i.e., the number of messages
         * it can hold). Will by default use the defaultSize set on the SEDA
         * component.
         * 
         * The option is a: <code>int</code> type.
         * 
         * Group: common
         */
        default SedaEndpointConsumerBuilder size(int size) {
            setProperty("size", size);
            return this;
        }
        /**
         * The maximum capacity of the SEDA queue (i.e., the number of messages
         * it can hold). Will by default use the defaultSize set on the SEDA
         * component.
         * 
         * The option will be converted to a <code>int</code> type.
         * 
         * Group: common
         */
        default SedaEndpointConsumerBuilder size(String size) {
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
        default SedaEndpointConsumerBuilder bridgeErrorHandler(
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
        default SedaEndpointConsumerBuilder bridgeErrorHandler(
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
        default SedaEndpointConsumerBuilder concurrentConsumers(
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
        default SedaEndpointConsumerBuilder concurrentConsumers(
                String concurrentConsumers) {
            setProperty("concurrentConsumers", concurrentConsumers);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint consumers for the SEDA component.
     */
    public interface AdvancedSedaEndpointConsumerBuilder
            extends
                EndpointConsumerBuilder {
        default SedaEndpointConsumerBuilder basic() {
            return (SedaEndpointConsumerBuilder) this;
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
        default AdvancedSedaEndpointConsumerBuilder exceptionHandler(
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
        default AdvancedSedaEndpointConsumerBuilder exceptionHandler(
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
        default AdvancedSedaEndpointConsumerBuilder exchangePattern(
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
        default AdvancedSedaEndpointConsumerBuilder exchangePattern(
                String exchangePattern) {
            setProperty("exchangePattern", exchangePattern);
            return this;
        }
        /**
         * Whether to limit the number of concurrentConsumers to the maximum of
         * 500. By default, an exception will be thrown if an endpoint is
         * configured with a greater number. You can disable that check by
         * turning this option off.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: consumer (advanced)
         */
        default AdvancedSedaEndpointConsumerBuilder limitConcurrentConsumers(
                boolean limitConcurrentConsumers) {
            setProperty("limitConcurrentConsumers", limitConcurrentConsumers);
            return this;
        }
        /**
         * Whether to limit the number of concurrentConsumers to the maximum of
         * 500. By default, an exception will be thrown if an endpoint is
         * configured with a greater number. You can disable that check by
         * turning this option off.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Group: consumer (advanced)
         */
        default AdvancedSedaEndpointConsumerBuilder limitConcurrentConsumers(
                String limitConcurrentConsumers) {
            setProperty("limitConcurrentConsumers", limitConcurrentConsumers);
            return this;
        }
        /**
         * Specifies whether multiple consumers are allowed. If enabled, you can
         * use SEDA for Publish-Subscribe messaging. That is, you can send a
         * message to the SEDA queue and have each consumer receive a copy of
         * the message. When enabled, this option should be specified on every
         * consumer endpoint.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: consumer (advanced)
         */
        default AdvancedSedaEndpointConsumerBuilder multipleConsumers(
                boolean multipleConsumers) {
            setProperty("multipleConsumers", multipleConsumers);
            return this;
        }
        /**
         * Specifies whether multiple consumers are allowed. If enabled, you can
         * use SEDA for Publish-Subscribe messaging. That is, you can send a
         * message to the SEDA queue and have each consumer receive a copy of
         * the message. When enabled, this option should be specified on every
         * consumer endpoint.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Group: consumer (advanced)
         */
        default AdvancedSedaEndpointConsumerBuilder multipleConsumers(
                String multipleConsumers) {
            setProperty("multipleConsumers", multipleConsumers);
            return this;
        }
        /**
         * The timeout used when polling. When a timeout occurs, the consumer
         * can check whether it is allowed to continue running. Setting a lower
         * value allows the consumer to react more quickly upon shutdown.
         * 
         * The option is a: <code>int</code> type.
         * 
         * Group: consumer (advanced)
         */
        default AdvancedSedaEndpointConsumerBuilder pollTimeout(int pollTimeout) {
            setProperty("pollTimeout", pollTimeout);
            return this;
        }
        /**
         * The timeout used when polling. When a timeout occurs, the consumer
         * can check whether it is allowed to continue running. Setting a lower
         * value allows the consumer to react more quickly upon shutdown.
         * 
         * The option will be converted to a <code>int</code> type.
         * 
         * Group: consumer (advanced)
         */
        default AdvancedSedaEndpointConsumerBuilder pollTimeout(
                String pollTimeout) {
            setProperty("pollTimeout", pollTimeout);
            return this;
        }
        /**
         * Whether to purge the task queue when stopping the consumer/route.
         * This allows to stop faster, as any pending messages on the queue is
         * discarded.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: consumer (advanced)
         */
        default AdvancedSedaEndpointConsumerBuilder purgeWhenStopping(
                boolean purgeWhenStopping) {
            setProperty("purgeWhenStopping", purgeWhenStopping);
            return this;
        }
        /**
         * Whether to purge the task queue when stopping the consumer/route.
         * This allows to stop faster, as any pending messages on the queue is
         * discarded.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Group: consumer (advanced)
         */
        default AdvancedSedaEndpointConsumerBuilder purgeWhenStopping(
                String purgeWhenStopping) {
            setProperty("purgeWhenStopping", purgeWhenStopping);
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
        default AdvancedSedaEndpointConsumerBuilder basicPropertyBinding(
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
        default AdvancedSedaEndpointConsumerBuilder basicPropertyBinding(
                String basicPropertyBinding) {
            setProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * Define the queue instance which will be used by the endpoint. This
         * option is only for rare use-cases where you want to use a custom
         * queue instance.
         * 
         * The option is a: <code>java.util.concurrent.BlockingQueue</code>
         * type.
         * 
         * Group: advanced
         */
        default AdvancedSedaEndpointConsumerBuilder queue(BlockingQueue queue) {
            setProperty("queue", queue);
            return this;
        }
        /**
         * Define the queue instance which will be used by the endpoint. This
         * option is only for rare use-cases where you want to use a custom
         * queue instance.
         * 
         * The option will be converted to a
         * <code>java.util.concurrent.BlockingQueue</code> type.
         * 
         * Group: advanced
         */
        default AdvancedSedaEndpointConsumerBuilder queue(String queue) {
            setProperty("queue", queue);
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
        default AdvancedSedaEndpointConsumerBuilder synchronous(
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
        default AdvancedSedaEndpointConsumerBuilder synchronous(
                String synchronous) {
            setProperty("synchronous", synchronous);
            return this;
        }
    }

    /**
     * Builder for endpoint producers for the SEDA component.
     */
    public interface SedaEndpointProducerBuilder
            extends
                EndpointProducerBuilder {
        default AdvancedSedaEndpointProducerBuilder advanced() {
            return (AdvancedSedaEndpointProducerBuilder) this;
        }
        /**
         * Name of queue.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: common
         */
        default SedaEndpointProducerBuilder name(String name) {
            setProperty("name", name);
            return this;
        }
        /**
         * The maximum capacity of the SEDA queue (i.e., the number of messages
         * it can hold). Will by default use the defaultSize set on the SEDA
         * component.
         * 
         * The option is a: <code>int</code> type.
         * 
         * Group: common
         */
        default SedaEndpointProducerBuilder size(int size) {
            setProperty("size", size);
            return this;
        }
        /**
         * The maximum capacity of the SEDA queue (i.e., the number of messages
         * it can hold). Will by default use the defaultSize set on the SEDA
         * component.
         * 
         * The option will be converted to a <code>int</code> type.
         * 
         * Group: common
         */
        default SedaEndpointProducerBuilder size(String size) {
            setProperty("size", size);
            return this;
        }
        /**
         * Whether a thread that sends messages to a full SEDA queue will block
         * until the queue's capacity is no longer exhausted. By default, an
         * exception will be thrown stating that the queue is full. By enabling
         * this option, the calling thread will instead block and wait until the
         * message can be accepted.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: producer
         */
        default SedaEndpointProducerBuilder blockWhenFull(boolean blockWhenFull) {
            setProperty("blockWhenFull", blockWhenFull);
            return this;
        }
        /**
         * Whether a thread that sends messages to a full SEDA queue will block
         * until the queue's capacity is no longer exhausted. By default, an
         * exception will be thrown stating that the queue is full. By enabling
         * this option, the calling thread will instead block and wait until the
         * message can be accepted.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Group: producer
         */
        default SedaEndpointProducerBuilder blockWhenFull(String blockWhenFull) {
            setProperty("blockWhenFull", blockWhenFull);
            return this;
        }
        /**
         * Whether the producer should discard the message (do not add the
         * message to the queue), when sending to a queue with no active
         * consumers. Only one of the options discardIfNoConsumers and
         * failIfNoConsumers can be enabled at the same time.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: producer
         */
        default SedaEndpointProducerBuilder discardIfNoConsumers(
                boolean discardIfNoConsumers) {
            setProperty("discardIfNoConsumers", discardIfNoConsumers);
            return this;
        }
        /**
         * Whether the producer should discard the message (do not add the
         * message to the queue), when sending to a queue with no active
         * consumers. Only one of the options discardIfNoConsumers and
         * failIfNoConsumers can be enabled at the same time.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Group: producer
         */
        default SedaEndpointProducerBuilder discardIfNoConsumers(
                String discardIfNoConsumers) {
            setProperty("discardIfNoConsumers", discardIfNoConsumers);
            return this;
        }
        /**
         * Whether the producer should fail by throwing an exception, when
         * sending to a queue with no active consumers. Only one of the options
         * discardIfNoConsumers and failIfNoConsumers can be enabled at the same
         * time.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: producer
         */
        default SedaEndpointProducerBuilder failIfNoConsumers(
                boolean failIfNoConsumers) {
            setProperty("failIfNoConsumers", failIfNoConsumers);
            return this;
        }
        /**
         * Whether the producer should fail by throwing an exception, when
         * sending to a queue with no active consumers. Only one of the options
         * discardIfNoConsumers and failIfNoConsumers can be enabled at the same
         * time.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Group: producer
         */
        default SedaEndpointProducerBuilder failIfNoConsumers(
                String failIfNoConsumers) {
            setProperty("failIfNoConsumers", failIfNoConsumers);
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
        default SedaEndpointProducerBuilder lazyStartProducer(
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
        default SedaEndpointProducerBuilder lazyStartProducer(
                String lazyStartProducer) {
            setProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * offerTimeout (in milliseconds) can be added to the block case when
         * queue is full. You can disable timeout by using 0 or a negative
         * value.
         * 
         * The option is a: <code>long</code> type.
         * 
         * Group: producer
         */
        default SedaEndpointProducerBuilder offerTimeout(long offerTimeout) {
            setProperty("offerTimeout", offerTimeout);
            return this;
        }
        /**
         * offerTimeout (in milliseconds) can be added to the block case when
         * queue is full. You can disable timeout by using 0 or a negative
         * value.
         * 
         * The option will be converted to a <code>long</code> type.
         * 
         * Group: producer
         */
        default SedaEndpointProducerBuilder offerTimeout(String offerTimeout) {
            setProperty("offerTimeout", offerTimeout);
            return this;
        }
        /**
         * Timeout (in milliseconds) before a SEDA producer will stop waiting
         * for an asynchronous task to complete. You can disable timeout by
         * using 0 or a negative value.
         * 
         * The option is a: <code>long</code> type.
         * 
         * Group: producer
         */
        default SedaEndpointProducerBuilder timeout(long timeout) {
            setProperty("timeout", timeout);
            return this;
        }
        /**
         * Timeout (in milliseconds) before a SEDA producer will stop waiting
         * for an asynchronous task to complete. You can disable timeout by
         * using 0 or a negative value.
         * 
         * The option will be converted to a <code>long</code> type.
         * 
         * Group: producer
         */
        default SedaEndpointProducerBuilder timeout(String timeout) {
            setProperty("timeout", timeout);
            return this;
        }
        /**
         * Option to specify whether the caller should wait for the async task
         * to complete or not before continuing. The following three options are
         * supported: Always, Never or IfReplyExpected. The first two values are
         * self-explanatory. The last value, IfReplyExpected, will only wait if
         * the message is Request Reply based. The default option is
         * IfReplyExpected.
         * 
         * The option is a: <code>org.apache.camel.WaitForTaskToComplete</code>
         * type.
         * 
         * Group: producer
         */
        default SedaEndpointProducerBuilder waitForTaskToComplete(
                WaitForTaskToComplete waitForTaskToComplete) {
            setProperty("waitForTaskToComplete", waitForTaskToComplete);
            return this;
        }
        /**
         * Option to specify whether the caller should wait for the async task
         * to complete or not before continuing. The following three options are
         * supported: Always, Never or IfReplyExpected. The first two values are
         * self-explanatory. The last value, IfReplyExpected, will only wait if
         * the message is Request Reply based. The default option is
         * IfReplyExpected.
         * 
         * The option will be converted to a
         * <code>org.apache.camel.WaitForTaskToComplete</code> type.
         * 
         * Group: producer
         */
        default SedaEndpointProducerBuilder waitForTaskToComplete(
                String waitForTaskToComplete) {
            setProperty("waitForTaskToComplete", waitForTaskToComplete);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint producers for the SEDA component.
     */
    public interface AdvancedSedaEndpointProducerBuilder
            extends
                EndpointProducerBuilder {
        default SedaEndpointProducerBuilder basic() {
            return (SedaEndpointProducerBuilder) this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: advanced
         */
        default AdvancedSedaEndpointProducerBuilder basicPropertyBinding(
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
        default AdvancedSedaEndpointProducerBuilder basicPropertyBinding(
                String basicPropertyBinding) {
            setProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * Define the queue instance which will be used by the endpoint. This
         * option is only for rare use-cases where you want to use a custom
         * queue instance.
         * 
         * The option is a: <code>java.util.concurrent.BlockingQueue</code>
         * type.
         * 
         * Group: advanced
         */
        default AdvancedSedaEndpointProducerBuilder queue(BlockingQueue queue) {
            setProperty("queue", queue);
            return this;
        }
        /**
         * Define the queue instance which will be used by the endpoint. This
         * option is only for rare use-cases where you want to use a custom
         * queue instance.
         * 
         * The option will be converted to a
         * <code>java.util.concurrent.BlockingQueue</code> type.
         * 
         * Group: advanced
         */
        default AdvancedSedaEndpointProducerBuilder queue(String queue) {
            setProperty("queue", queue);
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
        default AdvancedSedaEndpointProducerBuilder synchronous(
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
        default AdvancedSedaEndpointProducerBuilder synchronous(
                String synchronous) {
            setProperty("synchronous", synchronous);
            return this;
        }
    }

    /**
     * Builder for endpoint for the SEDA component.
     */
    public interface SedaEndpointBuilder
            extends
                SedaEndpointConsumerBuilder, SedaEndpointProducerBuilder {
        default AdvancedSedaEndpointBuilder advanced() {
            return (AdvancedSedaEndpointBuilder) this;
        }
        /**
         * Name of queue.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: common
         */
        default SedaEndpointBuilder name(String name) {
            setProperty("name", name);
            return this;
        }
        /**
         * The maximum capacity of the SEDA queue (i.e., the number of messages
         * it can hold). Will by default use the defaultSize set on the SEDA
         * component.
         * 
         * The option is a: <code>int</code> type.
         * 
         * Group: common
         */
        default SedaEndpointBuilder size(int size) {
            setProperty("size", size);
            return this;
        }
        /**
         * The maximum capacity of the SEDA queue (i.e., the number of messages
         * it can hold). Will by default use the defaultSize set on the SEDA
         * component.
         * 
         * The option will be converted to a <code>int</code> type.
         * 
         * Group: common
         */
        default SedaEndpointBuilder size(String size) {
            setProperty("size", size);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint for the SEDA component.
     */
    public interface AdvancedSedaEndpointBuilder
            extends
                AdvancedSedaEndpointConsumerBuilder, AdvancedSedaEndpointProducerBuilder {
        default SedaEndpointBuilder basic() {
            return (SedaEndpointBuilder) this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: advanced
         */
        default AdvancedSedaEndpointBuilder basicPropertyBinding(
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
        default AdvancedSedaEndpointBuilder basicPropertyBinding(
                String basicPropertyBinding) {
            setProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * Define the queue instance which will be used by the endpoint. This
         * option is only for rare use-cases where you want to use a custom
         * queue instance.
         * 
         * The option is a: <code>java.util.concurrent.BlockingQueue</code>
         * type.
         * 
         * Group: advanced
         */
        default AdvancedSedaEndpointBuilder queue(BlockingQueue queue) {
            setProperty("queue", queue);
            return this;
        }
        /**
         * Define the queue instance which will be used by the endpoint. This
         * option is only for rare use-cases where you want to use a custom
         * queue instance.
         * 
         * The option will be converted to a
         * <code>java.util.concurrent.BlockingQueue</code> type.
         * 
         * Group: advanced
         */
        default AdvancedSedaEndpointBuilder queue(String queue) {
            setProperty("queue", queue);
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
        default AdvancedSedaEndpointBuilder synchronous(boolean synchronous) {
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
        default AdvancedSedaEndpointBuilder synchronous(String synchronous) {
            setProperty("synchronous", synchronous);
            return this;
        }
    }
    /**
     * SEDA (camel-seda)
     * The seda component provides asynchronous call to another endpoint from
     * any CamelContext in the same JVM.
     * 
     * Syntax: <code>seda:name</code>
     * Category: core,endpoint
     * Available as of version: 1.1
     * Maven coordinates: org.apache.camel:camel-seda
     */
    default SedaEndpointBuilder seda(String path) {
        class SedaEndpointBuilderImpl extends AbstractEndpointBuilder implements SedaEndpointBuilder, AdvancedSedaEndpointBuilder {
            public SedaEndpointBuilderImpl(String path) {
                super("seda", path);
            }
        }
        return new SedaEndpointBuilderImpl(path);
    }
}