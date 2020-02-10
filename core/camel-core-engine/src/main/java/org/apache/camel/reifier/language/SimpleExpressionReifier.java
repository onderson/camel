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
package org.apache.camel.reifier.language;

import org.apache.camel.CamelContext;
import org.apache.camel.Expression;
import org.apache.camel.Predicate;
import org.apache.camel.builder.SimpleBuilder;
import org.apache.camel.model.language.ExpressionDefinition;
import org.apache.camel.model.language.SimpleExpression;
import org.apache.camel.support.CamelContextHelper;

public class SimpleExpressionReifier extends ExpressionReifier<SimpleExpression> {

    public SimpleExpressionReifier(CamelContext camelContext, ExpressionDefinition definition) {
        super(camelContext, (SimpleExpression) definition);
    }

    @Override
    public Expression createExpression() {
        String exp = parseString(definition.getExpression());
        // should be true by default
        boolean isTrim = definition.getTrim() == null || parseBoolean(definition.getTrim());
        if (exp != null && isTrim) {
            exp = exp.trim();
        }

        SimpleBuilder answer = new SimpleBuilder(exp);
        answer.setResultType(CamelContextHelper.convertTo(camelContext, Class.class,
                or(definition.getResultType(), definition.getResultTypeName())));
        return answer;
    }

    @Override
    public Predicate createPredicate() {
        // SimpleBuilder is also a Predicate
        return (Predicate) createExpression();
    }

}
