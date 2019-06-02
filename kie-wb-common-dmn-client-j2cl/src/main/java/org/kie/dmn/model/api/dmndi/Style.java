//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package org.kie.dmn.model.api.dmndi;

import java.util.List;
import org.kie.dmn.model.api.DMNModelInstrumentedBase;

public interface Style extends DMNModelInstrumentedBase {
    Style.Extension getExtension();

    void setExtension(Style.Extension var1);

    String getId();

    void setId(String var1);

    public interface Extension {
        List<Object> getAny();
    }
}
