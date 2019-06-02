//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package org.kie.dmn.model.v1_1;

import org.kie.dmn.model.api.NamedElement;

public abstract class TNamedElement extends TDMNElement implements NamedElement {
    private String name;

    public TNamedElement() {
    }

    public String getName() {
        return this.name;
    }

    public void setName(String value) {
        this.name = value;
    }
}
