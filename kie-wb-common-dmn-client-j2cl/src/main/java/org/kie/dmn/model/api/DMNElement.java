//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package org.kie.dmn.model.api;

import java.util.List;

public interface DMNElement extends DMNModelInstrumentedBase {
    String getDescription();

    void setDescription(String var1);

    DMNElement.ExtensionElements getExtensionElements();

    void setExtensionElements(DMNElement.ExtensionElements var1);

    String getId();

    void setId(String var1);

    String getLabel();

    void setLabel(String var1);

    public interface ExtensionElements {
        List<Object> getAny();
    }
}
