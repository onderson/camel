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
 * The camel-xchange component provide access to many bitcoin and altcoin
 * exchanges for trading and accessing market data.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface XChangeEndpointBuilderFactory {


    /**
     * Builder for endpoint for the XChange component.
     */
    public interface XChangeEndpointBuilder extends EndpointProducerBuilder {
        default AdvancedXChangeEndpointBuilder advanced() {
            return (AdvancedXChangeEndpointBuilder) this;
        }
        /**
         * The currency.
         * 
         * The option is a: <code>org.knowm.xchange.currency.Currency</code>
         * type.
         * 
         * Group: producer
         */
        default XChangeEndpointBuilder currency(Object currency) {
            doSetProperty("currency", currency);
            return this;
        }
        /**
         * The currency.
         * 
         * The option will be converted to a
         * <code>org.knowm.xchange.currency.Currency</code> type.
         * 
         * Group: producer
         */
        default XChangeEndpointBuilder currency(String currency) {
            doSetProperty("currency", currency);
            return this;
        }
        /**
         * The currency pair.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: producer
         */
        default XChangeEndpointBuilder currencyPair(String currencyPair) {
            doSetProperty("currencyPair", currencyPair);
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
         * Default: false
         * Group: producer
         */
        default XChangeEndpointBuilder lazyStartProducer(
                boolean lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
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
         * Default: false
         * Group: producer
         */
        default XChangeEndpointBuilder lazyStartProducer(
                String lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * The method to execute.
         * 
         * The option is a:
         * <code>org.apache.camel.component.xchange.XChangeConfiguration$XChangeMethod</code> type.
         * 
         * Required: true
         * Group: producer
         */
        default XChangeEndpointBuilder method(XChangeMethod method) {
            doSetProperty("method", method);
            return this;
        }
        /**
         * The method to execute.
         * 
         * The option will be converted to a
         * <code>org.apache.camel.component.xchange.XChangeConfiguration$XChangeMethod</code> type.
         * 
         * Required: true
         * Group: producer
         */
        default XChangeEndpointBuilder method(String method) {
            doSetProperty("method", method);
            return this;
        }
        /**
         * The service to call.
         * 
         * The option is a:
         * <code>org.apache.camel.component.xchange.XChangeConfiguration$XChangeService</code> type.
         * 
         * Required: true
         * Group: producer
         */
        default XChangeEndpointBuilder service(XChangeService service) {
            doSetProperty("service", service);
            return this;
        }
        /**
         * The service to call.
         * 
         * The option will be converted to a
         * <code>org.apache.camel.component.xchange.XChangeConfiguration$XChangeService</code> type.
         * 
         * Required: true
         * Group: producer
         */
        default XChangeEndpointBuilder service(String service) {
            doSetProperty("service", service);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint for the XChange component.
     */
    public interface AdvancedXChangeEndpointBuilder
            extends
                EndpointProducerBuilder {
        default XChangeEndpointBuilder basic() {
            return (XChangeEndpointBuilder) this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: advanced
         */
        default AdvancedXChangeEndpointBuilder basicPropertyBinding(
                boolean basicPropertyBinding) {
            doSetProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Default: false
         * Group: advanced
         */
        default AdvancedXChangeEndpointBuilder basicPropertyBinding(
                String basicPropertyBinding) {
            doSetProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: advanced
         */
        default AdvancedXChangeEndpointBuilder synchronous(boolean synchronous) {
            doSetProperty("synchronous", synchronous);
            return this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Default: false
         * Group: advanced
         */
        default AdvancedXChangeEndpointBuilder synchronous(String synchronous) {
            doSetProperty("synchronous", synchronous);
            return this;
        }
    }

    /**
     * Proxy enum for
     * <code>org.apache.camel.component.xchange.XChangeConfiguration$XChangeMethod</code> enum.
     */
    enum XChangeMethod {
        balances,
        fundingHistory,
        wallets,
        currencies,
        currencyMetaData,
        currencyPairs,
        currencyPairMetaData,
        ticker;
    }

    /**
     * Proxy enum for
     * <code>org.apache.camel.component.xchange.XChangeConfiguration$XChangeService</code> enum.
     */
    enum XChangeService {
        marketdata,
        metadata,
        account;
    }

    public interface XChangeBuilders {
        /**
         * XChange (camel-xchange)
         * The camel-xchange component provide access to many bitcoin and
         * altcoin exchanges for trading and accessing market data.
         * 
         * Category: bitcoin,blockchain
         * Since: 2.21
         * Maven coordinates: org.apache.camel:camel-xchange
         * 
         * Syntax: <code>xchange:name</code>
         * 
         * Path parameter: name (required)
         * The exchange to connect to
         */
        default XChangeEndpointBuilder xchange(String path) {
            return XChangeEndpointBuilderFactory.xchange(path);
        }
    }
    /**
     * XChange (camel-xchange)
     * The camel-xchange component provide access to many bitcoin and altcoin
     * exchanges for trading and accessing market data.
     * 
     * Category: bitcoin,blockchain
     * Since: 2.21
     * Maven coordinates: org.apache.camel:camel-xchange
     * 
     * Syntax: <code>xchange:name</code>
     * 
     * Path parameter: name (required)
     * The exchange to connect to
     */
    static XChangeEndpointBuilder xchange(String path) {
        class XChangeEndpointBuilderImpl extends AbstractEndpointBuilder implements XChangeEndpointBuilder, AdvancedXChangeEndpointBuilder {
            public XChangeEndpointBuilderImpl(String path) {
                super("xchange", path);
            }
        }
        return new XChangeEndpointBuilderImpl(path);
    }
}