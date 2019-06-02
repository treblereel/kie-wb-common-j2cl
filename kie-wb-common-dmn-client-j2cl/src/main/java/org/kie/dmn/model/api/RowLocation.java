//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package org.kie.dmn.model.api;

import javax.xml.stream.Location;

public class RowLocation implements Location {
    private int lineNumber;
    private String publicId;
    private String systemId;

    public RowLocation(Location from) {
        this.lineNumber = from.getLineNumber();
        this.publicId = from.getPublicId();
        this.systemId = from.getSystemId();
    }

    public int getLineNumber() {
        return this.lineNumber;
    }

    public int getColumnNumber() {
        return -1;
    }

    public int getCharacterOffset() {
        return -1;
    }

    public String getPublicId() {
        return this.publicId;
    }

    public String getSystemId() {
        return this.systemId;
    }

    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("RowLocation [getLineNumber()=").append(this.getLineNumber()).append(", getColumnNumber()=").append(this.getColumnNumber()).append(", getCharacterOffset()=").append(this.getCharacterOffset()).append(", getPublicId()=").append(this.getPublicId()).append(", getSystemId()=").append(this.getSystemId()).append("]");
        return builder.toString();
    }
}
