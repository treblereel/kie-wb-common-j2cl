//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package org.kie.dmn.model.api.dmndi;

import java.util.List;
import org.kie.dmn.model.api.DMNModelInstrumentedBase;

public interface DiagramElement extends DMNModelInstrumentedBase {
    DiagramElement.Extension getExtension();

    void setExtension(DiagramElement.Extension var1);

    Style getStyle();

    void setStyle(Style var1);

    Style getSharedStyle();

    void setSharedStyle(Style var1);

    String getId();

    void setId(String var1);

    public interface Extension {
        List<Object> getAny();
    }
}
