//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package org.kie.dmn.model.v1_1;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;
import javax.xml.namespace.QName;
import org.kie.dmn.model.api.ItemDefinition;
import org.kie.dmn.model.api.UnaryTests;

public class TItemDefinition extends TNamedElement implements ItemDefinition {
    private QName typeRef;
    private UnaryTests allowedValues;
    private List<ItemDefinition> itemComponent = new ArrayList();
    private String typeLanguage;
    private Boolean isCollection;

    public TItemDefinition() {
    }

    public QName getTypeRef() {
        return this.typeRef;
    }

    public void setTypeRef(QName value) {
        this.typeRef = value;
    }

    public UnaryTests getAllowedValues() {
        return this.allowedValues;
    }

    public void setAllowedValues(UnaryTests value) {
        this.allowedValues = value;
    }

    public List<ItemDefinition> getItemComponent() {
        return this.itemComponent;
    }

    public String getTypeLanguage() {
        return this.typeLanguage;
    }

    public void setTypeLanguage(String value) {
        this.typeLanguage = value;
    }

    public boolean isIsCollection() {
        return this.isCollection == null ? false : this.isCollection;
    }

    public void setIsCollection(Boolean value) {
        this.isCollection = value;
    }

    public String toString() {
        return (new StringJoiner(", ")).add("name: " + this.getName()).add("typeRef: " + this.typeRef).add("allowedValues: " + this.allowedValues).add("itemComponent: " + this.itemComponent).add("typeLanguage: " + this.typeLanguage).add("isCollection: " + this.isCollection).toString();
    }
}
