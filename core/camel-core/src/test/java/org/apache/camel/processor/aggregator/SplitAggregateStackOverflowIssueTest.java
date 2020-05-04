package org.apache.camel.processor.aggregator;

import java.util.concurrent.atomic.AtomicInteger;

import org.apache.camel.ContextTestSupport;
import org.apache.camel.Exchange;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.mock.MockEndpoint;
import org.apache.camel.processor.aggregate.GroupedBodyAggregationStrategy;
import org.junit.Ignore;
import org.junit.Test;


import static java.util.concurrent.TimeUnit.SECONDS;
import static org.apache.camel.Exchange.SPLIT_COMPLETE;

@Ignore("TODO: Fix this bug")
public class SplitAggregateStackOverflowIssueTest extends ContextTestSupport {

    private final AtomicInteger count = new AtomicInteger();

    @Test
    public void testStackoverflow() throws Exception {
        int size = 50000;

        MockEndpoint result = getMockEndpoint("mock:result");
        result.expectedMessageCount(size / 10);

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < size; i++ ) {
            sb.append("Line #" + i);
            sb.append("\n");
        }

        template.sendBody("direct:start", sb);

        MockEndpoint.assertIsSatisfied(60, SECONDS, result);

        assertTrue("Stackframe must not be too high, was " + count.get(), count.get() < 50);
    }

    @Override
    protected RouteBuilder createRouteBuilder() throws Exception {
        return new RouteBuilder() {
            @Override
            public void configure() throws Exception {

                from("direct:start")
                    .split().tokenize("\n").streaming()
                        .process(e -> {
                            if (e.getProperty(Exchange.SPLIT_INDEX, 0, int.class) % 100 == 0) {
                                int frames = Thread.currentThread().getStackTrace().length;
                                count.set(frames);
                                log.info("Stackframe: {}", frames);
                            }
                        })
                        .aggregate(constant("foo"), new GroupedBodyAggregationStrategy())
                        .completeAllOnStop()
                        .eagerCheckCompletion()
                        .completionSize(10)
                        .completionTimeout(SECONDS.toMillis(5))
                        .completionPredicate(exchangeProperty(SPLIT_COMPLETE))
                            .to("log:result?groupSize=100", "mock:result");
            }
        };
    }
}
