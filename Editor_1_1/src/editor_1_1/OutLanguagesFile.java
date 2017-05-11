package editor_1_1;

import java.io.*;
import java.util.*;

/**
 *
 * @author Samuele Pozzebon
 */

public class OutLanguagesFile {
    
    public OutLanguagesFile(List<ClassLanguages> languages) {
        try {
            FileOutputStream file = new FileOutputStream("languages.dat");
            ObjectOutputStream fileOUT = new ObjectOutputStream(file);
            
            fileOUT.writeObject(languages);
            fileOUT.flush();
            file.close();
        }
        catch (Exception e) {
            System.out.println("Eccezione: " + e.getMessage());
        }
    }
    
    
}
