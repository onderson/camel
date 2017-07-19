/**
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
package org.apache.camel.jsonpath;

import java.io.File;
import java.util.Map;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.test.junit4.CamelTestSupport;
import org.junit.Test;

public class JsonPathSplitTest extends CamelTestSupport {

    @Override
    protected RouteBuilder createRouteBuilder() throws Exception {
        return new RouteBuilder() {
            @Override
            public void configure() throws Exception {
                from("direct:start")
                    .split().jsonpath("$.store.book[*]")
                    .to("mock:authors")
                    .convertBodyTo(String.class);
            }
        };
    }

    @Test
    public void testSplit() throws Exception {
        getMockEndpoint("mock:authors").expectedMessageCount(2);

        String out = template.requestBody("direct:start", new File("src/test/resources/books.json"), String.class);
        assertNotNull(out);

        assertMockEndpointsSatisfied();

        Map row = getMockEndpoint("mock:authors").getReceivedExchanges().get(0).getIn().getBody(Map.class);
        assertEquals("Nigel Rees", row.get("author"));
        assertEquals(Double.valueOf("8.95"), row.get("price"));

        row = getMockEndpoint("mock:authors").getReceivedExchanges().get(1).getIn().getBody(Map.class);
        assertEquals("Evelyn Waugh", row.get("author"));
        assertEquals(Double.valueOf("12.99"), row.get("price"));

        // should preserve quotes etc
        assertTrue(out.contains("\"author\": \"Nigel Rees\""));
        assertTrue(out.contains("\"price\": 8.95"));
        assertTrue(out.contains("\"title\": \"Sword of Honour\""));
        assertTrue(out.contains("\"price\": 12.99,"));
    }

}
