package editor_1_1;

/**
 *
 * @author Samuele Pozzebon
 */
public class ClassGeneralSettings {
    
    private int fields;
    private String logoSrc;
    
    public ClassGeneralSettings() {}
    
    public ClassGeneralSettings (int n, String logo) {
        fields = n;
        logoSrc = logo;
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
    
    public int getFields () {
        return fields;
    }
    
    public String getLogo() {
        return logoSrc;
    }
}
