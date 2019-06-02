//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package org.kie.dmn.model.api.dmndi;

import java.util.List;

public interface DMNDiagram extends Diagram {
    Dimension getSize();

    void setSize(Dimension var1);

    List<DiagramElement> getDMNDiagramElement();
}
