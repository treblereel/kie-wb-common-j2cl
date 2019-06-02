/*
 * Copyright 2017 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.kie.workbench.common.dmn.api.definition;

import org.kie.workbench.common.dmn.api.definition.v1_1.Expression;

public interface HasExpression {

    Expression getExpression();

    void setExpression(final Expression expression);

    DMNModelInstrumentedBase asDMNModelInstrumentedBase();

    /**
     * Can the Expression be cleared on the HasExpression instance.
     * @return true if the Expression can be cleared.
     */
    default boolean isClearSupported() {
        return true;
    }

    HasExpression NOP = new HasExpression() {
        @Override
        public Expression getExpression() {
            return null;
        }

        @Override
        public void setExpression(final Expression expression) {

        }

        @Override
        public DMNModelInstrumentedBase asDMNModelInstrumentedBase() {
            return null;
        }
    };
}
