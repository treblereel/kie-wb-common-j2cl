//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package org.kie.dmn.model.v1_2;

import org.kie.dmn.model.api.NamedElement;

public class TNamedElement extends TDMNElement implements NamedElement {
    protected String name;

    public TNamedElement() {
    }

    public String getName() {
        return this.name;
    }

    public void setName(String value) {
        this.name = value;
    }
}
