//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package org.kie.dmn.model.api;

import java.util.List;
import javax.xml.namespace.QName;

public interface ItemDefinition extends NamedElement {
    QName getTypeRef();

    void setTypeRef(QName var1);

    UnaryTests getAllowedValues();

    void setAllowedValues(UnaryTests var1);

    List<ItemDefinition> getItemComponent();

    String getTypeLanguage();

    void setTypeLanguage(String var1);

    boolean isIsCollection();

    void setIsCollection(Boolean var1);

    String toString();
}
