//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package org.kie.dmn.model.api.dmndi;

public interface DMNStyle extends Style {
    Color getFillColor();

    void setFillColor(Color var1);

    Color getStrokeColor();

    void setStrokeColor(Color var1);

    Color getFontColor();

    void setFontColor(Color var1);

    String getFontFamily();

    void setFontFamily(String var1);

    Double getFontSize();

    void setFontSize(Double var1);

    Boolean isFontItalic();

    void setFontItalic(Boolean var1);

    Boolean isFontBold();

    void setFontBold(Boolean var1);

    Boolean isFontUnderline();

    void setFontUnderline(Boolean var1);

    Boolean isFontStrikeThrough();

    void setFontStrikeThrough(Boolean var1);

    AlignmentKind getLabelHorizontalAlignement();

    void setLabelHorizontalAlignement(AlignmentKind var1);

    AlignmentKind getLabelVerticalAlignment();

    void setLabelVerticalAlignment(AlignmentKind var1);
}
