package editor_1_1;


import java.io.*;
import java.util.*;
import java.util.logging.*;

/**
 *
 * @author Samuele Pozzebon
 */
public class ReadLanguagesFile {
    
    private List<ClassLanguages> readFile = new ArrayList<>();

    
    public List<ClassLanguages> getList() {
        return this.readFile;
    }  
    
    public ReadLanguagesFile() {
        try {
            ObjectInputStream fileIN = new ObjectInputStream(new FileInputStream("languages.dat"));
            readFile = (List<ClassLanguages>) fileIN.readObject();
        }
        catch (IOException e) {} catch (ClassNotFoundException ex) {
            Logger.getLogger(ReadLanguagesFile.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
  
}
