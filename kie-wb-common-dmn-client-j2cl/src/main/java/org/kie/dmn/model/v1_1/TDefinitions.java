//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package org.kie.dmn.model.v1_1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.xml.namespace.QName;
import org.kie.dmn.model.api.Artifact;
import org.kie.dmn.model.api.BusinessContextElement;
import org.kie.dmn.model.api.DRGElement;
import org.kie.dmn.model.api.DecisionService;
import org.kie.dmn.model.api.Definitions;
import org.kie.dmn.model.api.ElementCollection;
import org.kie.dmn.model.api.Import;
import org.kie.dmn.model.api.ItemDefinition;
import org.kie.dmn.model.api.dmndi.DMNDI;
import org.kie.workbench.common.dmn.api.definition.v1_1.extensions.DecisionServices;

public class TDefinitions extends TNamedElement implements Definitions {
    public static final String DEFAULT_EXPRESSION_LANGUAGE = "http://www.omg.org/spec/FEEL/20140401";
    public static final String DEFAULT_TYPE_LANGUAGE = "http://www.omg.org/spec/FEEL/20140401";
    private List<Import> _import;
    private List<ItemDefinition> itemDefinition;
    private List<DRGElement> drgElement;
    private List<Artifact> artifact;
    private List<ElementCollection> elementCollection;
    private List<BusinessContextElement> businessContextElement;
    private List<DecisionService> decisionService;
    private String expressionLanguage;
    private String typeLanguage;
    private String namespace;
    private String exporter;
    private String exporterVersion;

    public TDefinitions() {
    }

    public List<Import> getImport() {
        if (this._import == null) {
            this._import = new ArrayList();
        }

        return this._import;
    }

    public List<ItemDefinition> getItemDefinition() {
        if (this.itemDefinition == null) {
            this.itemDefinition = new ArrayList();
        }

        return this.itemDefinition;
    }

    public List<DRGElement> getDrgElement() {
        if (this.drgElement == null) {
            this.drgElement = new ArrayList();
        }

        return this.drgElement;
    }

    public List<Artifact> getArtifact() {
        if (this.artifact == null) {
            this.artifact = new ArrayList();
        }

        return this.artifact;
    }

    public List<ElementCollection> getElementCollection() {
        if (this.elementCollection == null) {
            this.elementCollection = new ArrayList();
        }

        return this.elementCollection;
    }

    public List<BusinessContextElement> getBusinessContextElement() {
        if (this.businessContextElement == null) {
            this.businessContextElement = new ArrayList();
        }

        return this.businessContextElement;
    }

    public List<DecisionService> getDecisionService() {
        throw new NullPointerException();

    }

    public String getExpressionLanguage() {
        return this.expressionLanguage == null ? "http://www.omg.org/spec/FEEL/20140401" : this.expressionLanguage;
    }

    public void setExpressionLanguage(String value) {
        this.expressionLanguage = value;
    }

    public String getTypeLanguage() {
        return this.typeLanguage == null ? "http://www.omg.org/spec/FEEL/20140401" : this.typeLanguage;
    }

    public void setTypeLanguage(String value) {
        this.typeLanguage = value;
    }

    public String getNamespace() {
        return this.namespace;
    }

    public void setNamespace(String value) {
        this.namespace = value;
    }

    public String getExporter() {
        return this.exporter;
    }

    public void setExporter(String value) {
        this.exporter = value;
    }

    public String getExporterVersion() {
        return this.exporterVersion;
    }

    public void setExporterVersion(String value) {
        this.exporterVersion = value;
    }

    public String toString() {
        return "Definitions{name=" + this.getName() + ", _import=" + this._import + ", itemDefinition=" + this.itemDefinition + ", drgElement=" + this.drgElement + ", decisionService=" + this.decisionService + ", artifact=" + this.artifact + ", elementCollection=" + this.elementCollection + ", businessContextElement=" + this.businessContextElement + ", expressionLanguage='" + this.expressionLanguage + '\'' + ", typeLanguage='" + this.typeLanguage + '\'' + ", namespace='" + this.namespace + '\'' + ", exporter='" + this.exporter + '\'' + ", exporterVersion='" + this.exporterVersion + '\'' + '}';
    }

    public void normalize() {
        Iterator var1 = this.getItemDefinition().iterator();

        while(var1.hasNext()) {
            ItemDefinition itemDefinition = (ItemDefinition)var1.next();
            processQNameURIs(itemDefinition);
        }

    }

    private static void processQNameURIs(ItemDefinition iDef) {
        QName typeRef = iDef.getTypeRef();
        if (typeRef != null && "".equals(typeRef.getNamespaceURI())) {
            String namespace = iDef.getNamespaceURI(typeRef.getPrefix());
            iDef.setTypeRef(new QName(namespace, typeRef.getLocalPart(), typeRef.getPrefix()));
        }

        Iterator var4 = iDef.getItemComponent().iterator();

        while(var4.hasNext()) {
            ItemDefinition comp = (ItemDefinition)var4.next();
            processQNameURIs(comp);
        }

    }

    public DMNDI getDMNDI() {
        throw new UnsupportedOperationException("not on 1.1");
    }

    public void setDMNDI(DMNDI value) {
        throw new UnsupportedOperationException("not on 1.1");
    }
}
