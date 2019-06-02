//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package org.kie.dmn.model.v1_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.function.Predicate;
import javax.xml.namespace.QName;
import javax.xml.stream.Location;
import org.kie.dmn.model.api.DMNModelInstrumentedBase;
import org.kie.dmn.model.api.RowLocation;

public abstract class KieDMNModelInstrumentedBase implements DMNModelInstrumentedBase {
    public static final String URI_DMN = "http://www.omg.org/spec/DMN/20180521/MODEL/";
    public static final String URI_FEEL = "http://www.omg.org/spec/DMN/20180521/FEEL/";
    public static final String URI_KIE = "http://www.drools.org/kie/dmn/1.2";
    public static final String URI_DMNDI = "http://www.omg.org/spec/DMN/20180521/DMNDI/";
    public static final String URI_DI = "http://www.omg.org/spec/DMN/20180521/DI/";
    public static final String URI_DC = "http://www.omg.org/spec/DMN/20180521/DC/";
    private Map<String, String> nsContext;
    private DMNModelInstrumentedBase parent;
    private final List<DMNModelInstrumentedBase> children = new ArrayList();
    private Location location;
    private Map<QName, String> additionalAttributes = new HashMap();

    public KieDMNModelInstrumentedBase() {
    }

    public String getIdentifierString() {
        if (this instanceof TNamedElement && ((TNamedElement)this).getName() != null) {
            return ((TNamedElement)this).getName();
        } else {
            return this instanceof TDMNElement && ((TDMNElement)this).getId() != null ? ((TDMNElement)this).getId() : "[unnamed " + this.getClass().getSimpleName() + "]";
        }
    }

    public DMNModelInstrumentedBase getParentDRDElement() {
        if (!(this instanceof TDRGElement) && !(this instanceof TArtifact) && (!(this instanceof TItemDefinition) || this.parent == null || !(this.parent instanceof TDefinitions))) {
            return this.parent != null ? this.parent.getParentDRDElement() : null;
        } else {
            return this;
        }
    }

    public Map<String, String> getNsContext() {
        if (this.nsContext == null) {
            this.nsContext = new HashMap();
        }

        return this.nsContext;
    }

    public String getNamespaceURI(String prefix) {
        if (this.nsContext != null && this.nsContext.containsKey(prefix)) {
            return (String)this.nsContext.get(prefix);
        } else {
            return this.parent != null ? this.parent.getNamespaceURI(prefix) : null;
        }
    }

    public Optional<String> getPrefixForNamespaceURI(String namespaceURI) {
        if (this.nsContext != null && this.nsContext.containsValue(namespaceURI)) {
            return this.nsContext.entrySet().stream().filter((kv) -> {
                return ((String)kv.getValue()).equals(namespaceURI);
            }).findFirst().map(Entry::getKey);
        } else {
            return this.parent != null ? this.parent.getPrefixForNamespaceURI(namespaceURI) : Optional.empty();
        }
    }

    public void setAdditionalAttributes(Map<QName, String> additionalAttributes) {
        this.additionalAttributes = additionalAttributes;
    }

    public Map<QName, String> getAdditionalAttributes() {
        return this.additionalAttributes;
    }

    public DMNModelInstrumentedBase getParent() {
        return this.parent;
    }

    public void setParent(DMNModelInstrumentedBase parent) {
        this.parent = parent;
    }

    public List<DMNModelInstrumentedBase> getChildren() {
        return Collections.unmodifiableList(this.children);
    }

    public void addChildren(DMNModelInstrumentedBase child) {
        this.children.add(child);
    }

    public void setLocation(Location location) {
        this.location = new RowLocation(location);
    }

    public Location getLocation() {
        return this.location;
    }

    public String getURIFEEL() {
        return "http://www.omg.org/spec/DMN/20180521/FEEL/";
    }

    public <T extends DMNModelInstrumentedBase> List<? extends T> findAllChildren(Class<T> clazz) {
        if (clazz.isInstance(this)) {
            return Collections.singletonList(this);
        } else {
            List<T> results = new ArrayList();
            Iterator var3 = this.getChildren().iterator();

            while(var3.hasNext()) {
                DMNModelInstrumentedBase c = (DMNModelInstrumentedBase)var3.next();
                results.addAll(c.findAllChildren(clazz));
            }

            return results;
        }
    }
}
