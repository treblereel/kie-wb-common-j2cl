//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package org.kie.dmn.model.api.dmndi;

public enum AlignmentKind {
    START("start"),
    END("end"),
    CENTER("center");

    private final String value;

    private AlignmentKind(String v) {
        this.value = v;
    }

    public String value() {
        return this.value;
    }

    public static AlignmentKind fromValue(String v) {
        AlignmentKind[] var1 = values();
        int var2 = var1.length;

        for(int var3 = 0; var3 < var2; ++var3) {
            AlignmentKind c = var1[var3];
            if (c.value.equals(v)) {
                return c;
            }
        }

        throw new IllegalArgumentException(v);
    }
}
