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
package org.apache.camel.component.disruptor.vm;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.mock.MockEndpoint;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotSame;
import static org.junit.jupiter.api.Assertions.assertNull;

/**
 * Unit test to verify continuing using NOT same thread on the consumer side.
 */
public class DisruptorVmShouldNotUseSameThreadTest extends AbstractVmTestSupport {

    private static long id;
    private final ThreadLocal<String> local = new ThreadLocal<>();

    @Test
    void testNotUseSameThread() throws Exception {
        MockEndpoint mock = getMockEndpoint("mock:result");
        mock.expectedBodiesReceived("Hello World");

        template2.sendBody("direct:start", "Hello World");

        assertMockEndpointsSatisfied();
    }

    @Override
    protected RouteBuilder createRouteBuilder() {
        return new RouteBuilder() {
            public void configure() {
                from("disruptor-vm:foo").process(new Processor() {
                    public void process(Exchange exchange) {
                        assertNull(local.get());
                        assertNotSame(id, Thread.currentThread().getId(), "Thread is should not be same");
                    }
                }).to("mock:result");
            }
        };
    }

    @Override
    protected RouteBuilder createRouteBuilderForSecondContext() {
        return new RouteBuilder() {
            @Override
            public void configure() {
                from("direct:start").process(new Processor() {
                    public void process(Exchange exchange) {
                        local.set("Hello");
                        id = Thread.currentThread().getId();
                    }
                }).to("disruptor-vm:foo");
            }
        };
    }
}