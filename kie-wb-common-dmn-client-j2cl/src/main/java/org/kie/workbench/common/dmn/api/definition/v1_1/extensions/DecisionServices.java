//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package org.kie.workbench.common.dmn.api.definition.v1_1.extensions;

import java.util.ArrayList;
import java.util.List;
import org.kie.dmn.model.api.DecisionService;
import org.kie.dmn.model.v1_1.KieDMNModelInstrumentedBase;

public class DecisionServices extends KieDMNModelInstrumentedBase {
    private List<DecisionService> decisionService;

    public DecisionServices() {
    }

    public List<DecisionService> getDecisionService() {
        if (this.decisionService == null) {
            this.decisionService = new ArrayList();
        }

        return this.decisionService;
    }

    public String toString() {
        return this.decisionService.toString();
    }
}
