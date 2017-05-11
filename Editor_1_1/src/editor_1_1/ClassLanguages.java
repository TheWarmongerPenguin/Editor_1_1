package editor_1_1;

import java.io.Serializable;

/**
 *
 * @author Samuele Pozzebon
 */
public class ClassLanguages implements Serializable {
    
    private String imgSource, language;
    private boolean selected;
    
    public ClassLanguages(boolean sel, String imagine, String title) {
        imgSource = imagine;
        language = title;
        selected = sel;
    }

    public ClassLanguages() {
        imgSource = new String();
        language = new String();
    }
    
    public void select() {
        selected = true;
    }
    
    public void deSelect() {
        selected = false;
    }
    
    public boolean isSelected() {
        return selected;
    }
    
    public void setIcon(String imagine) {
        imgSource = imagine;
    }
    
    public void setLanguage(String title) {
        language = title;
    }
    
    public String getIcon() {
        return imgSource;
    }
    
    public String getLanguage() {
        return language;
    }
    
}
