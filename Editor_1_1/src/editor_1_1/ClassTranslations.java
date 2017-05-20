package editor_1_1;

import java.io.Serializable;

/**
 *
 * @author Samuele Pozzebon
 */
class ClassTranslations implements Serializable{
    String language;
    String[] translations;
    
    public ClassTranslations(String lang, String[] tran) {
        
    }
    
    public ClassTranslations(String[] langTran) {
        String lang;
        String[] tran = new String[langTran.length-1];
        lang = langTran[0];
        
        int cont = 0;
        while(true) {
            try {
                tran[cont] = langTran[cont+1];
            } catch (NullPointerException e) {break;}
            cont++;
        }
    }
    
    public ClassTranslations(ClassTranslations copy) {
        language = copy.getLanguage();
        translations = copy.getTranslations();
    }
    
    public String getLanguage() {
        return language;
    }
    
    public String[] getTranslations() {
        return translations;
    }
    
    public void setLanguage(String lang) {
        language = lang;
    }
    
    public void setTranslations(String[] tran) {
        translations = tran;
    }
}
