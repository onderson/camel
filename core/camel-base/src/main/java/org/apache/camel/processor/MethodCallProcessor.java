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
package org.apache.camel.processor;

import org.apache.camel.AsyncCallback;
import org.apache.camel.Exchange;
import org.apache.camel.Expression;
import org.apache.camel.Message;
import org.apache.camel.Traceable;
import org.apache.camel.spi.IdAware;
import org.apache.camel.spi.RouteIdAware;
import org.apache.camel.support.AsyncProcessorSupport;
import org.apache.camel.support.DefaultMessage;
import org.apache.camel.support.ExchangeHelper;
import org.apache.camel.util.ObjectHelper;

// TODO: delete me

/**
 * A processor which are used when calling a method and setting the response as the message body
 */
@Deprecated
public class MethodCallProcessor extends AsyncProcessorSupport implements Traceable, IdAware, RouteIdAware {
    private String id;
    private String routeId;
    private final Expression expression;

    public MethodCallProcessor(Expression expression) {
        ObjectHelper.notNull(expression, "expression", this);
        this.expression = expression;
    }

    @Override
    public boolean process(Exchange exchange, AsyncCallback callback) {
        try {
            Object newBody = expression.evaluate(exchange, Object.class);

            if (exchange.getException() != null) {
                // the expression threw an exception so we should break-out
                callback.done(true);
                return true;
            }

            // if null/empty response its due to void / no-response, then dont change the body
            if (newBody != null) {

                Message old = exchange.getMessage();

                // create a new message container so we do not drag specialized message objects along
                // but that is only needed if the old message is a specialized message
                boolean copyNeeded = !(old.getClass().equals(DefaultMessage.class));

                if (copyNeeded) {
                    Message msg = new DefaultMessage(exchange.getContext());
                    msg.copyFromWithNewBody(old, newBody);

                    // replace message on exchange (must set as OUT)
                    ExchangeHelper.replaceMessage(exchange, msg, true);
                } else {
                    // no copy needed so set replace value directly
                    old.setBody(newBody);

                    // but the message must be on OUT
                    if (!exchange.hasOut()) {
                        exchange.setOut(exchange.getIn());
                    }
                }
            }

        } catch (Throwable e) {
            exchange.setException(e);
        }

        callback.done(true);
        return true;
    }

    @Override
    public String toString() {
        return "MethodCall(" + expression + ")";
    }

    @Override
    public String getTraceLabel() {
        return "methodCall[" + expression + "]";
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String getRouteId() {
        return routeId;
    }

    @Override
    public void setRouteId(String routeId) {
        this.routeId = routeId;
    }

    public Expression getExpression() {
        return expression;
    }

    @Override
    protected void doStart() throws Exception {
        // noop
    }

    @Override
    protected void doStop() throws Exception {
        // noop
    }
}
