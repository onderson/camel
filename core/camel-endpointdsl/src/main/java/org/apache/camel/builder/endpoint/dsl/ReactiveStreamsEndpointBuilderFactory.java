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
import org.apache.camel.builder.EndpointConsumerBuilder;
import org.apache.camel.builder.EndpointProducerBuilder;
import org.apache.camel.builder.endpoint.AbstractEndpointBuilder;
import org.apache.camel.spi.ExceptionHandler;

/**
 * Reactive Camel using reactive streams
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface ReactiveStreamsEndpointBuilderFactory {


    /**
     * Builder for endpoint consumers for the Reactive Streams component.
     */
    public interface ReactiveStreamsEndpointConsumerBuilder
            extends
                EndpointConsumerBuilder {
        default AdvancedReactiveStreamsEndpointConsumerBuilder advanced() {
            return (AdvancedReactiveStreamsEndpointConsumerBuilder) this;
        }
        /**
         * Name of the stream channel used by the endpoint to exchange messages.
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        default ReactiveStreamsEndpointConsumerBuilder stream(String stream) {
            setProperty("stream", stream);
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
         * The option is a <code>boolean</code> type.
         * @group consumer
         */
        default ReactiveStreamsEndpointConsumerBuilder bridgeErrorHandler(
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
         * The option will be converted to a <code>boolean</code> type.
         * @group consumer
         */
        default ReactiveStreamsEndpointConsumerBuilder bridgeErrorHandler(
                String bridgeErrorHandler) {
            setProperty("bridgeErrorHandler", bridgeErrorHandler);
            return this;
        }
        /**
         * Number of threads used to process exchanges in the Camel route.
         * The option is a <code>int</code> type.
         * @group consumer
         */
        default ReactiveStreamsEndpointConsumerBuilder concurrentConsumers(
                int concurrentConsumers) {
            setProperty("concurrentConsumers", concurrentConsumers);
            return this;
        }
        /**
         * Number of threads used to process exchanges in the Camel route.
         * The option will be converted to a <code>int</code> type.
         * @group consumer
         */
        default ReactiveStreamsEndpointConsumerBuilder concurrentConsumers(
                String concurrentConsumers) {
            setProperty("concurrentConsumers", concurrentConsumers);
            return this;
        }
        /**
         * Set the low watermark of requested exchanges to the active
         * subscription as percentage of the maxInflightExchanges. When the
         * number of pending items from the upstream source is lower than the
         * watermark, new items can be requested to the subscription. If set to
         * 0, the subscriber will request items in batches of
         * maxInflightExchanges, only after all items of the previous batch have
         * been processed. If set to 1, the subscriber can request a new item
         * each time an exchange is processed (chatty). Any intermediate value
         * can be used.
         * The option is a <code>double</code> type.
         * @group consumer
         */
        default ReactiveStreamsEndpointConsumerBuilder exchangesRefillLowWatermark(
                double exchangesRefillLowWatermark) {
            setProperty("exchangesRefillLowWatermark", exchangesRefillLowWatermark);
            return this;
        }
        /**
         * Set the low watermark of requested exchanges to the active
         * subscription as percentage of the maxInflightExchanges. When the
         * number of pending items from the upstream source is lower than the
         * watermark, new items can be requested to the subscription. If set to
         * 0, the subscriber will request items in batches of
         * maxInflightExchanges, only after all items of the previous batch have
         * been processed. If set to 1, the subscriber can request a new item
         * each time an exchange is processed (chatty). Any intermediate value
         * can be used.
         * The option will be converted to a <code>double</code> type.
         * @group consumer
         */
        default ReactiveStreamsEndpointConsumerBuilder exchangesRefillLowWatermark(
                String exchangesRefillLowWatermark) {
            setProperty("exchangesRefillLowWatermark", exchangesRefillLowWatermark);
            return this;
        }
        /**
         * Determines if onComplete events should be pushed to the Camel route.
         * The option is a <code>boolean</code> type.
         * @group consumer
         */
        default ReactiveStreamsEndpointConsumerBuilder forwardOnComplete(
                boolean forwardOnComplete) {
            setProperty("forwardOnComplete", forwardOnComplete);
            return this;
        }
        /**
         * Determines if onComplete events should be pushed to the Camel route.
         * The option will be converted to a <code>boolean</code> type.
         * @group consumer
         */
        default ReactiveStreamsEndpointConsumerBuilder forwardOnComplete(
                String forwardOnComplete) {
            setProperty("forwardOnComplete", forwardOnComplete);
            return this;
        }
        /**
         * Determines if onError events should be pushed to the Camel route.
         * Exceptions will be set as message body.
         * The option is a <code>boolean</code> type.
         * @group consumer
         */
        default ReactiveStreamsEndpointConsumerBuilder forwardOnError(
                boolean forwardOnError) {
            setProperty("forwardOnError", forwardOnError);
            return this;
        }
        /**
         * Determines if onError events should be pushed to the Camel route.
         * Exceptions will be set as message body.
         * The option will be converted to a <code>boolean</code> type.
         * @group consumer
         */
        default ReactiveStreamsEndpointConsumerBuilder forwardOnError(
                String forwardOnError) {
            setProperty("forwardOnError", forwardOnError);
            return this;
        }
        /**
         * Maximum number of exchanges concurrently being processed by Camel.
         * This parameter controls backpressure on the stream. Setting a
         * non-positive value will disable backpressure.
         * The option is a <code>java.lang.Integer</code> type.
         * @group consumer
         */
        default ReactiveStreamsEndpointConsumerBuilder maxInflightExchanges(
                Integer maxInflightExchanges) {
            setProperty("maxInflightExchanges", maxInflightExchanges);
            return this;
        }
        /**
         * Maximum number of exchanges concurrently being processed by Camel.
         * This parameter controls backpressure on the stream. Setting a
         * non-positive value will disable backpressure.
         * The option will be converted to a <code>java.lang.Integer</code>
         * type.
         * @group consumer
         */
        default ReactiveStreamsEndpointConsumerBuilder maxInflightExchanges(
                String maxInflightExchanges) {
            setProperty("maxInflightExchanges", maxInflightExchanges);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint consumers for the Reactive Streams
     * component.
     */
    public interface AdvancedReactiveStreamsEndpointConsumerBuilder
            extends
                EndpointConsumerBuilder {
        default ReactiveStreamsEndpointConsumerBuilder basic() {
            return (ReactiveStreamsEndpointConsumerBuilder) this;
        }
        /**
         * To let the consumer use a custom ExceptionHandler. Notice if the
         * option bridgeErrorHandler is enabled then this option is not in use.
         * By default the consumer will deal with exceptions, that will be
         * logged at WARN or ERROR level and ignored.
         * The option is a <code>org.apache.camel.spi.ExceptionHandler</code>
         * type.
         * @group consumer (advanced)
         */
        default AdvancedReactiveStreamsEndpointConsumerBuilder exceptionHandler(
                ExceptionHandler exceptionHandler) {
            setProperty("exceptionHandler", exceptionHandler);
            return this;
        }
        /**
         * To let the consumer use a custom ExceptionHandler. Notice if the
         * option bridgeErrorHandler is enabled then this option is not in use.
         * By default the consumer will deal with exceptions, that will be
         * logged at WARN or ERROR level and ignored.
         * The option will be converted to a
         * <code>org.apache.camel.spi.ExceptionHandler</code> type.
         * @group consumer (advanced)
         */
        default AdvancedReactiveStreamsEndpointConsumerBuilder exceptionHandler(
                String exceptionHandler) {
            setProperty("exceptionHandler", exceptionHandler);
            return this;
        }
        /**
         * Sets the exchange pattern when the consumer creates an exchange.
         * The option is a <code>org.apache.camel.ExchangePattern</code> type.
         * @group consumer (advanced)
         */
        default AdvancedReactiveStreamsEndpointConsumerBuilder exchangePattern(
                ExchangePattern exchangePattern) {
            setProperty("exchangePattern", exchangePattern);
            return this;
        }
        /**
         * Sets the exchange pattern when the consumer creates an exchange.
         * The option will be converted to a
         * <code>org.apache.camel.ExchangePattern</code> type.
         * @group consumer (advanced)
         */
        default AdvancedReactiveStreamsEndpointConsumerBuilder exchangePattern(
                String exchangePattern) {
            setProperty("exchangePattern", exchangePattern);
            return this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * The option is a <code>boolean</code> type.
         * @group advanced
         */
        default AdvancedReactiveStreamsEndpointConsumerBuilder basicPropertyBinding(
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
        default AdvancedReactiveStreamsEndpointConsumerBuilder basicPropertyBinding(
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
        default AdvancedReactiveStreamsEndpointConsumerBuilder synchronous(
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
        default AdvancedReactiveStreamsEndpointConsumerBuilder synchronous(
                String synchronous) {
            setProperty("synchronous", synchronous);
            return this;
        }
    }

    /**
     * Builder for endpoint producers for the Reactive Streams component.
     */
    public interface ReactiveStreamsEndpointProducerBuilder
            extends
                EndpointProducerBuilder {
        default AdvancedReactiveStreamsEndpointProducerBuilder advanced() {
            return (AdvancedReactiveStreamsEndpointProducerBuilder) this;
        }
        /**
         * Name of the stream channel used by the endpoint to exchange messages.
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        default ReactiveStreamsEndpointProducerBuilder stream(String stream) {
            setProperty("stream", stream);
            return this;
        }
        /**
         * The backpressure strategy to use when pushing events to a slow
         * subscriber.
         * The option is a
         * <code>org.apache.camel.component.reactive.streams.ReactiveStreamsBackpressureStrategy</code> type.
         * @group producer
         */
        default ReactiveStreamsEndpointProducerBuilder backpressureStrategy(
                ReactiveStreamsBackpressureStrategy backpressureStrategy) {
            setProperty("backpressureStrategy", backpressureStrategy);
            return this;
        }
        /**
         * The backpressure strategy to use when pushing events to a slow
         * subscriber.
         * The option will be converted to a
         * <code>org.apache.camel.component.reactive.streams.ReactiveStreamsBackpressureStrategy</code> type.
         * @group producer
         */
        default ReactiveStreamsEndpointProducerBuilder backpressureStrategy(
                String backpressureStrategy) {
            setProperty("backpressureStrategy", backpressureStrategy);
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
         * The option is a <code>boolean</code> type.
         * @group producer
         */
        default ReactiveStreamsEndpointProducerBuilder lazyStartProducer(
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
         * The option will be converted to a <code>boolean</code> type.
         * @group producer
         */
        default ReactiveStreamsEndpointProducerBuilder lazyStartProducer(
                String lazyStartProducer) {
            setProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint producers for the Reactive Streams
     * component.
     */
    public interface AdvancedReactiveStreamsEndpointProducerBuilder
            extends
                EndpointProducerBuilder {
        default ReactiveStreamsEndpointProducerBuilder basic() {
            return (ReactiveStreamsEndpointProducerBuilder) this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * The option is a <code>boolean</code> type.
         * @group advanced
         */
        default AdvancedReactiveStreamsEndpointProducerBuilder basicPropertyBinding(
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
        default AdvancedReactiveStreamsEndpointProducerBuilder basicPropertyBinding(
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
        default AdvancedReactiveStreamsEndpointProducerBuilder synchronous(
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
        default AdvancedReactiveStreamsEndpointProducerBuilder synchronous(
                String synchronous) {
            setProperty("synchronous", synchronous);
            return this;
        }
    }

    /**
     * Builder for endpoint for the Reactive Streams component.
     */
    public interface ReactiveStreamsEndpointBuilder
            extends
                ReactiveStreamsEndpointConsumerBuilder, ReactiveStreamsEndpointProducerBuilder {
        default AdvancedReactiveStreamsEndpointBuilder advanced() {
            return (AdvancedReactiveStreamsEndpointBuilder) this;
        }
        /**
         * Name of the stream channel used by the endpoint to exchange messages.
         * The option is a <code>java.lang.String</code> type.
         * @group common
         */
        default ReactiveStreamsEndpointBuilder stream(String stream) {
            setProperty("stream", stream);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint for the Reactive Streams component.
     */
    public interface AdvancedReactiveStreamsEndpointBuilder
            extends
                AdvancedReactiveStreamsEndpointConsumerBuilder, AdvancedReactiveStreamsEndpointProducerBuilder {
        default ReactiveStreamsEndpointBuilder basic() {
            return (ReactiveStreamsEndpointBuilder) this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * The option is a <code>boolean</code> type.
         * @group advanced
         */
        default AdvancedReactiveStreamsEndpointBuilder basicPropertyBinding(
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
        default AdvancedReactiveStreamsEndpointBuilder basicPropertyBinding(
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
        default AdvancedReactiveStreamsEndpointBuilder synchronous(
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
        default AdvancedReactiveStreamsEndpointBuilder synchronous(
                String synchronous) {
            setProperty("synchronous", synchronous);
            return this;
        }
    }

    /**
     * Proxy enum for
     * <code>org.apache.camel.component.reactive.streams.ReactiveStreamsBackpressureStrategy</code> enum.
     */
    static enum ReactiveStreamsBackpressureStrategy {
        BUFFER, OLDEST, LATEST;
    }
    /**
     * Reactive Camel using reactive streams Creates a builder to build
     * endpoints for the Reactive Streams component.
     */
    default ReactiveStreamsEndpointBuilder reactiveStreams(String path) {
        class ReactiveStreamsEndpointBuilderImpl extends AbstractEndpointBuilder implements ReactiveStreamsEndpointBuilder, AdvancedReactiveStreamsEndpointBuilder {
            public ReactiveStreamsEndpointBuilderImpl(String path) {
                super("reactive-streams", path);
            }
        }
        return new ReactiveStreamsEndpointBuilderImpl(path);
    }
}