//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package org.kie.dmn.model.api;

import java.util.List;

public interface DecisionService extends Invocable {
    List<DMNElementReference> getOutputDecision();

    List<DMNElementReference> getEncapsulatedDecision();

    List<DMNElementReference> getInputDecision();

    List<DMNElementReference> getInputData();
}
