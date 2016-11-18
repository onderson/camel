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
package org.apache.camel.component.firebase;

import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import org.apache.camel.AsyncCallback;
import org.apache.camel.Exchange;
import org.apache.camel.Message;
import org.apache.camel.Processor;
import org.apache.camel.component.firebase.exception.DatabaseErrorException;
import org.apache.camel.impl.DefaultAsyncProducer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The producer, which can be used to set a value for a specific key in Firebase.
 */
public class FirebaseProducer extends DefaultAsyncProducer {

    private static final Logger LOG = LoggerFactory.getLogger(FirebaseProducer.class);
    private final String rootReference;
    private final FirebaseEndpoint endpoint;

    public FirebaseProducer(FirebaseEndpoint endpoint) {
        super(endpoint);
        this.endpoint = endpoint;
        rootReference = endpoint.getRootReference();
    }

    /**
     * Processes the message exchange.
     * Similar to {@link Processor#process}, but the caller supports having the exchange asynchronously processed.
     * <p/>
     * If there was a failure processing then the caused {@link Exception} would be set on the {@link Exchange}.
     *
     * @param exchange the message exchange
     * @param callback the {@link AsyncCallback} will be invoked when the processing of the exchange is completed.
     *                 If the exchange is completed synchronously, then the callback is also invoked synchronously.
     *                 The callback should therefore be careful of starting recursive loop.
     * @return (doneSync) <tt>true</tt> to continue execute synchronously, <tt>false</tt> to continue being executed asynchronously
     */
    @Override
    public boolean process(Exchange exchange, AsyncCallback callback) {
        final Message in = exchange.getIn();
        String firebaseKey = (String) in.getHeader(endpoint.getKeyName());
        Object value = in.getBody();
        DatabaseReference ref = FirebaseDatabase
                .getInstance(endpoint.getFirebaseApp())
                .getReference(rootReference).child(firebaseKey);
        ref.setValue(value, (DatabaseError databaseError, DatabaseReference databaseReference) -> {
            if (databaseError != null) {
                exchange.setException(new DatabaseErrorException(databaseError));
                exchange.getOut().setFault(true);
            } else {
                exchange.getOut().setBody(databaseReference);
            }
            callback.done(endpoint.isAsync());
        });
        return endpoint.isAsync();
    }
}
