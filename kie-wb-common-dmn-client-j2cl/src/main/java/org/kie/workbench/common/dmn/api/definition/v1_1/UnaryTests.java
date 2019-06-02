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
package org.kie.workbench.common.dmn.api.definition.v1_1;

import java.util.HashSet;
import java.util.Set;

import org.kie.workbench.common.dmn.api.property.dmn.Description;
import org.kie.workbench.common.dmn.api.property.dmn.ExpressionLanguage;
import org.kie.workbench.common.dmn.api.property.dmn.Id;
import org.kie.workbench.common.dmn.api.property.dmn.Text;
import org.kie.workbench.common.dmn.api.resource.i18n.DMNAPIConstants;
import org.kie.workbench.common.stunner.core.domainobject.DomainObject;
import org.kie.workbench.common.stunner.core.util.HashUtil;

import static org.kie.workbench.common.dmn.api.definition.v1_1.ConstraintType.NONE;

public class UnaryTests extends DMNElement implements IsUnaryTests,
                                                      DomainObject {

    private static final String stunnerCategory = Categories.DOMAIN_OBJECTS;

    private static final Set<String> stunnerLabels = new HashSet<>();

    private Text text;

    private ConstraintType constraintType;

    protected ExpressionLanguage expressionLanguage;

    public UnaryTests() {
        this(new Id(),
             new Description(),
             new Text(),
             new ExpressionLanguage(),
             NONE);
    }

    public UnaryTests(final Id id,
                      final Description description,
                      final Text text,
                      final ExpressionLanguage expressionLanguage,
                      final ConstraintType constraintType) {
        super(id,
              description);
        this.text = text;
        this.expressionLanguage = expressionLanguage;
        this.constraintType = constraintType;
    }

    // -----------------------
    // Stunner core properties
    // -----------------------

    public String getStunnerCategory() {
        return stunnerCategory;
    }

    public Set<String> getStunnerLabels() {
        return stunnerLabels;
    }

    // -----------------------
    // DMN properties
    // -----------------------

    public Text getText() {
        return text;
    }

    public void setText(final Text value) {
        this.text = value;
    }

    public ExpressionLanguage getExpressionLanguage() {
        return expressionLanguage;
    }

    public void setExpressionLanguage(final ExpressionLanguage value) {
        this.expressionLanguage = value;
    }

    public ConstraintType getConstraintType() {
        return constraintType;
    }

    public void setConstraintType(final ConstraintType constraintType) {
        this.constraintType = constraintType;
    }

    // ------------------------------------------------------
    // DomainObject requirements - to use in Properties Panel
    // ------------------------------------------------------

    @Override
    public String getDomainObjectUUID() {
        return getId().getValue();
    }

    @Override
    public String getDomainObjectNameTranslationKey() {
        return DMNAPIConstants.UnaryTests_DomainObjectName;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UnaryTests)) {
            return false;
        }

        final UnaryTests that = (UnaryTests) o;

        if (id != null ? !id.equals(that.id) : that.id != null) {
            return false;
        }
        if (description != null ? !description.equals(that.description) : that.description != null) {
            return false;
        }
        if (text != null ? !text.equals(that.text) : that.text != null) {
            return false;
        }
        return expressionLanguage != null ? expressionLanguage.equals(that.expressionLanguage) : that.expressionLanguage == null;
    }

    @Override
    public int hashCode() {
        return HashUtil.combineHashCodes(id != null ? id.hashCode() : 0,
                                         description != null ? description.hashCode() : 0,
                                         text != null ? text.hashCode() : 0,
                                         expressionLanguage != null ? expressionLanguage.hashCode() : 0);
    }
}
