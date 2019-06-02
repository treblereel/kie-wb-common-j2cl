//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package org.kie.dmn.model.v1_1;

import java.util.ArrayList;
import java.util.List;
import org.kie.dmn.model.api.DMNElementReference;
import org.kie.dmn.model.api.DecisionService;
import org.kie.dmn.model.api.InformationItem;

public class TDecisionService extends TNamedElement implements DecisionService {
    private InformationItem variable;
    private List<DMNElementReference> outputDecision;
    private List<DMNElementReference> encapsulatedDecision;
    private List<DMNElementReference> inputDecision;
    private List<DMNElementReference> inputData;

    public TDecisionService() {
    }

    public InformationItem getVariable() {
        return this.variable;
    }

    public void setVariable(InformationItem variable) {
        this.variable = variable;
    }

    public List<DMNElementReference> getOutputDecision() {
        if (this.outputDecision == null) {
            this.outputDecision = new ArrayList();
        }

        return this.outputDecision;
    }

    public List<DMNElementReference> getEncapsulatedDecision() {
        if (this.encapsulatedDecision == null) {
            this.encapsulatedDecision = new ArrayList();
        }

        return this.encapsulatedDecision;
    }

    public List<DMNElementReference> getInputDecision() {
        if (this.inputDecision == null) {
            this.inputDecision = new ArrayList();
        }

        return this.inputDecision;
    }

    public List<DMNElementReference> getInputData() {
        if (this.inputData == null) {
            this.inputData = new ArrayList();
        }

        return this.inputData;
    }

    public String toString() {
        return this.getName();
    }
}
