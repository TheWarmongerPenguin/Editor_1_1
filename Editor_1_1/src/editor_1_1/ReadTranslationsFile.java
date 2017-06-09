package editor_1_1;


import java.io.*;
import java.util.*;
import java.util.logging.*;

/**
 *
 * @author samuele.pozzebon
 */
public class ReadTranslationsFile {
    
    private List<ClassTranslations> readFile = new ArrayList<>();

    
    public List<ClassTranslations> getList() {
        return readFile;
    }  
    
    public ReadTranslationsFile() {
        try {
            ObjectInputStream fileIN = new ObjectInputStream(new FileInputStream("translations.dat"));
            readFile = (List<ClassTranslations>) fileIN.readObject();
        }
        catch (IOException e) {} catch (ClassNotFoundException ex) {
            Logger.getLogger(ReadTranslationsFile.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
  
}
