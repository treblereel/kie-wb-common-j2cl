//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package org.kie.dmn.model.api.dmndi;

import java.util.List;
import org.kie.dmn.model.api.DMNModelInstrumentedBase;

public interface DMNDI extends DMNModelInstrumentedBase {
    List<DMNDiagram> getDMNDiagram();

    List<DMNStyle> getDMNStyle();

    void normalize();
}
