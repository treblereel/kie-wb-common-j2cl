//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package org.kie.dmn.model.v1_1;

import java.util.ArrayList;
import java.util.List;
import org.kie.dmn.model.api.DMNElement;
import org.kie.dmn.model.api.DMNElement.ExtensionElements;

public abstract class TDMNElement extends KieDMNModelInstrumentedBase implements DMNElement {
    private String description;
    private ExtensionElements extensionElements;
    private String id;
    private String label;

    public TDMNElement() {
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String value) {
        this.description = value;
    }

    public ExtensionElements getExtensionElements() {
        return this.extensionElements;
    }

    public void setExtensionElements(ExtensionElements value) {
        this.extensionElements = value;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String value) {
        this.id = value;
    }

    public String getLabel() {
        return this.label;
    }

    public void setLabel(String value) {
        this.label = value;
    }

    public static class TExtensionElements extends KieDMNModelInstrumentedBase implements ExtensionElements {
        private List<Object> any;

        public TExtensionElements() {
        }

        public List<Object> getAny() {
            if (this.any == null) {
                this.any = new ArrayList();
            }

            return this.any;
        }
    }
}
