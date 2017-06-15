package editor_1_1;

import java.io.PrintWriter;
import java.util.List;

/**
 *
 * @author Samuele Pozzebon
 */
public class CSSAutoCompilator {
    private List<ClassLanguages> langList;
    private List<ClassTranslations> tranList;
    private ClassGeneralSettings genSet;
    private String compiled;
    private String[] fieldsNoSpace;
    
    public CSSAutoCompilator(List<ClassLanguages> lList, List<ClassTranslations> tList, ClassGeneralSettings gSet, String[] fields) {
        langList = lList;
        tranList = tList;
        genSet = gSet;
        fieldsNoSpace = fields;
        compiler();
    }

    private void compiler() {
        compiled = "var colors = [];\n" +
        "colors.push('#" + Integer.toHexString(genSet.getBackgroundColor().getRGB()).substring(2) + "');//background\n" +
        "colors.push('#" + Integer.toHexString(genSet.getTextMain().getRGB()).substring(2) + "');//testo normale\n" +
        "colors.push('#" + Integer.toHexString(genSet.getTextAdv().getRGB()).substring(2) + "');//avvisi\n" +
        "\n" +
        "var fields = [];\n";
        
        int cont = 0;
        while(cont < fieldsNoSpace.length){
            compiled = compiled + "fields.push('" + fieldsNoSpace[cont] + "');\n";
            cont++;
        }
        
        compiled = compiled + "\n" + "var languages = [];\n";
        cont = 0;
        while(cont < tranList.size()) {
            compiled = compiled + "languages.push('" + tranList.get(cont).getLanguage() + "');\n";
            cont++;
        }
        
        compiled = compiled + "\n";
        cont = 0;
        while(cont < tranList.size()) {
            int c = 0;
            compiled = compiled + "var " + tranList.get(cont).getLanguage() + " = [];\n";
            while (c < tranList.get(cont).getTranslationsLenght()) {                
                compiled = compiled + tranList.get(cont).getLanguage() + ".push('" + tranList.get(cont).getTranslations()[c] + "');\n";
                c++;
            }
            c = 0;
            while (c < tranList.get(cont).getFieldsStableLenght()) {                
                compiled = compiled + tranList.get(cont).getLanguage() + ".push('" + tranList.get(cont).getFieldsStables()[c] + "');\n";
                c++;
            }
            while (c < tranList.get(cont).getFieldsVariableLenght()) {                
                compiled = compiled + tranList.get(cont).getLanguage() + ".push('" + tranList.get(cont).getFieldsVariable()[c] + "');\n";
                c++;
            }
            cont++;
            compiled = compiled + "\n";
        }
        
        print();
    }
    
    private void print() {
        try {
            PrintWriter file = new PrintWriter("lang.js");
            file.println(compiled);
            file.close();
        }
        catch (Exception e) {
            System.out.println("Eccezione: " + e.getMessage());
        }
    }
}
