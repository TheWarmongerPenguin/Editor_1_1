package editor_1_1;

import java.io.Serializable;

/**
 *
 * @author Samuele Pozzebon
 */
class ClassTranslations implements Serializable{
    String field;
    String[] translations;
    
    public ClassTranslations() {}
    
    public ClassTranslations(String fi, String[] tran) {        //costruttore in caso sia inserito stringa del campi (in italiano) e array di stringhe delle traduzioni
        field = fi;
        translations = new String[tran.length];
        
        int cont = 0;
        while(true) {
            try {
                translations[cont] = tran[cont];
            } catch (NullPointerException e) {break;}
            cont++;
        }
    }
    
    public ClassTranslations(String[] tran) {                   //costruttore in caso sia utilizzato un array di stringhe unico
        field = tran[0];
        translations = new String[tran.length-1];
        
        int cont = 0;
        while(true) {
            try {
                translations[cont] = tran[cont+1];
            } catch (NullPointerException e) {break;}
            cont++;
        }
    }
    
    public ClassTranslations(ClassTranslations copy) {          //costruttore in caso sia utilizzato diterramente un ClassTranslations
        field = copy.getField();
        translations = copy.getTranslations();
    }
    
    public String getField() {
        return field;
    }
    
    public String[] getTranslations() {
        return translations;
    }
    
    public void setField(String lang) {
        field = lang;
    }
    
    public void setTranslations(String[] tran) {
        translations = tran;
    }
}
