package editor_1_1;

import java.io.Serializable;

/**
 *
 * @author Samuele Pozzebon
 */
class ClassTranslations implements Serializable{
    private String field;
    private String[] translations;
    
    public ClassTranslations() {}
    
    public ClassTranslations(String fi, String[] tran) {        //costruttore in caso sia inserito stringa del campi (in italiano) e array di stringhe delle traduzioni
        field = fi;
        translations = new String[tran.length];
        translations = tran;
        /*int cont = 0;
        while(true) {
            try {
                translations[cont] = tran[cont];
            } catch (NullPointerException e) {break;}
            cont++;
        }*/
    }
    
    public ClassTranslations(String[] tran) {                   //costruttore in caso sia utilizzato un array di stringhe unico
        field = tran[0];
        translations = new String[tran.length-1];
        for(int cont = 0; cont < tran.length-1; cont ++) {
            translations[cont] = tran[cont+1];
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
    
    public int getTranslationsLenght() {
        return translations.length;
    }
    
    public void setField(String lang) {
        field = lang;
    }
    
    public void setTranslations(String[] tran) {
        translations = tran;
    }
}
