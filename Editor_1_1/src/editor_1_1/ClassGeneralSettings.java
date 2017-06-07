package editor_1_1;

import java.awt.Color;

/**
 *
 * @author Samuele Pozzebon
 */
public class ClassGeneralSettings {
    
    private int fields;
    private String logoSrc;
    private Color backgroundLanguages, backgroundFields, backgroundQR, textDefaultLanguages, textDefaultFields, textImmittedFields, textDefaultQR, underlineFields;
    
    public ClassGeneralSettings() {}
    
    public ClassGeneralSettings (int n, String logo, Color bLang, Color bFields, Color bQR, Color tDefLanguages, Color tDefFields, Color tImmFields, Color tDefQR, Color undFields) {
        fields = n;
        logoSrc = logo;
        backgroundLanguages = bLang;
        backgroundFields = bFields;
        backgroundQR = bQR;
        textDefaultLanguages = tDefLanguages;
        textDefaultFields = tDefFields;
        textImmittedFields = tImmFields;
        textDefaultQR = tDefQR;
        underlineFields = undFields;
    }
    
    public ClassGeneralSettings (ClassGeneralSettings copy) {
        fields = copy.getFields();
        logoSrc = copy.getLogo();
    }
    
    public void setFields(int n) {
        fields = n;
    }
    
    public void setLogo(String logo) {
        logoSrc = logo;
    }
    
    public void setBackgroundLanguages(Color bLang) {
        backgroundLanguages = bLang;
    }
    
    public void setBackgroundFields(Color bFields) {
        backgroundFields = bFields;
    }
    
    public void setBackgroundQR(Color bQR) {
        backgroundQR = bQR;
    }
    
    public void setTextDefaultLanguages(Color tDefLanguages) {
        textDefaultLanguages = tDefLanguages;
    }
    
    public void setTextDefaultFields(Color tDefFields) {
        textDefaultFields = tDefFields;
    }
    
    public void setTextImmittedFields(Color tImmFields) {
        textImmittedFields = tImmFields;
    }
    
    public void setTextDefaultQR(Color tDefQR) {
        textDefaultQR = tDefQR;
    }
    
    public void setUnderlineFields(Color undFields) {
        underlineFields = undFields;
    }
    
    public int getFields () {
        return fields;
    }
    
    public String getLogo() {
        return logoSrc;
    }
    
    public Color getBackgroundLanguages() {
        return backgroundLanguages;
    }
    
    public Color getBackgroundFields() {
        return backgroundFields;
    }
    
    public Color getBackgroundQR() {
        return backgroundQR;
    }
    
    public Color getTextDefaultLanguages() {
        return textDefaultLanguages;
    }
    
    public Color getTextDefaultFields() {
        return textDefaultFields;
    }
    
    public Color getTextImmittedFields() {
        return textImmittedFields;
    }
    
    public Color getTextDefaultQR() {
        return textDefaultQR;
    }
    
    public Color getUnderlineFields() {
        return underlineFields;
    }
}
