//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package org.kie.dmn.model.api;

import java.util.List;
import org.kie.dmn.model.api.dmndi.DMNDI;

public interface Definitions extends NamedElement {
    List<Import> getImport();

    List<ItemDefinition> getItemDefinition();

    List<DRGElement> getDrgElement();

    List<Artifact> getArtifact();

    List<ElementCollection> getElementCollection();

    List<BusinessContextElement> getBusinessContextElement();

    List<DecisionService> getDecisionService();

    void normalize();

    String getExpressionLanguage();

    void setExpressionLanguage(String var1);

    String getTypeLanguage();

    void setTypeLanguage(String var1);

    String getNamespace();

    void setNamespace(String var1);

    String getExporter();

    void setExporter(String var1);

    String getExporterVersion();

    void setExporterVersion(String var1);

    DMNDI getDMNDI();

    void setDMNDI(DMNDI var1);
}
