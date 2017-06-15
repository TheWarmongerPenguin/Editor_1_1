package editor_1_1;

import java.io.Serializable;

/**
 *
 * @author Samuele Pozzebon
 */
class ClassTranslations implements Serializable{
    private String language;
    private String[] translations, fieldsStable, fieldsVariable;
    
    public ClassTranslations() {}
    
    public ClassTranslations(String la, String[] tran, String[] stable, String[] variable) {        //costruttore in caso sia inserito stringa del campi (in italiano) e array di stringhe delle traduzioni
        language = la;
        translations = tran;
        fieldsStable = stable;
        fieldsVariable = variable;
    }
    
    public ClassTranslations(ClassTranslations copy) {          //costruttore in caso sia utilizzato diterramente un ClassTranslations
        language = copy.getLanguage();
        translations = copy.getTranslations();
    }
    
    public String getLanguage() {
        return language;
    }
    
    public String[] getTranslations() {
        return translations;
    }
    
    public int getTranslationsLenght() {
        return translations.length;
    }
    
    public String[] getFieldsStables() {
        return fieldsStable;
    }
    
    public int getFieldsStableLenght() {
        return fieldsStable.length;
    }
    
    public String[] getFieldsVariable() {
        return fieldsVariable;
    }
    
    public int getFieldsVariableLenght() {
        return fieldsVariable.length;
    }
    
    public void setLanguage(String lang) {
        language = lang;
    }
    
    public void setTranslations(String[] tran) {
        translations = tran;
    }
    
    public void setFieldsStables(String[] stable) {
        fieldsStable = stable;
    }
    
    public void setFieldsVariable(String[] variable) {
        fieldsVariable = variable;
    }
    
    public void addField(String string) {
        String[] f = fieldsVariable;
        fieldsVariable = new String[f.length+1];
        int cont = 0;
        while(true) {
            try {
                fieldsVariable[cont] = f [cont];
            } catch (ArrayIndexOutOfBoundsException e) {break;}
            cont ++;
            fieldsVariable[cont] = string;
        }
    }
    
    public void removeField(int n) {
        String[] f = fieldsVariable;
        fieldsVariable = new String[f.length-1];
        int cont = 0;
        int con = 0;
        while(true) {
            try {
                if(cont != n){
                    fieldsVariable[con] = f[cont];
                    con++;
                }
            } catch (Exception e) {
            }
            cont++;
        }
    }
    
    public void removeFields(int[] n) {
        String[] f = fieldsVariable;
        fieldsVariable = new String[f.length-n.length];
        int cont = 0;
        int con = 0;
        while(true) {
            try {
                if(control(n, cont)){
                    fieldsVariable[con] = f[cont];
                    con++;
                }
            } catch (Exception e) {break;}
            cont++;
        }
    }

    private boolean control(int[] n, int cont) {
        int con = 0;
        while(true) {
            try {
                if(cont == n[con]) {return false;}
            } catch (Exception e) {break;}
            con++;
        }
        return true;
    }
}
