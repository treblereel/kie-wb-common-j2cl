/*
 * Copyright 2018 Red Hat, Inc. and/or its affiliates.
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

package org.kie.workbench.common.dmn.api.property.dmn;

import org.kie.workbench.common.stunner.core.definition.property.PropertyType;

public class QNamePropertyType implements PropertyType {

    public final String name = "org.kie.workbench.common.dmn.api.property.dmn.QName";

    @Override
    public String getName() {
        return name;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof QNamePropertyType)) {
            return false;
        }
        QNamePropertyType that = (QNamePropertyType) o;
        if (!name.equals(that.name)) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        return ~~name.hashCode();
    }

    @Override
    public String toString() {
        return "QNamePropertyType{" +
                "name='" + name + '\'' +
                '}';
    }
}
