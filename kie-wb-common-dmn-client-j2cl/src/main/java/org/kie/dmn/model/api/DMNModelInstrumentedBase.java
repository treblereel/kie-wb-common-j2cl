//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package org.kie.dmn.model.api;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.xml.namespace.QName;
import javax.xml.stream.Location;

public interface DMNModelInstrumentedBase {
    String getNamespaceURI(String var1);

    DMNModelInstrumentedBase getParentDRDElement();

    Optional<String> getPrefixForNamespaceURI(String var1);

    void setAdditionalAttributes(Map<QName, String> var1);

    Map<QName, String> getAdditionalAttributes();

    DMNModelInstrumentedBase getParent();

    void setParent(DMNModelInstrumentedBase var1);

    List<DMNModelInstrumentedBase> getChildren();

    void addChildren(DMNModelInstrumentedBase var1);

    <T extends DMNModelInstrumentedBase> List<? extends T> findAllChildren(Class<T> var1);

    String getIdentifierString();

    String getURIFEEL();

    void setLocation(Location var1);

    Location getLocation();

    Map<String, String> getNsContext();
}
