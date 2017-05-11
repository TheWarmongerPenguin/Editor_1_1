package editor_1_1;

import java.io.*;

/**
 *
 * @author Samuele Pozzebon
 */

public class OutGeneralFile {
    
    public OutGeneralFile(ClassGeneralSettings settings) {
        try {
            FileOutputStream file = new FileOutputStream("settings.dat");
            ObjectOutputStream fileOUT = new ObjectOutputStream(file);
            
            fileOUT.writeObject(settings);
            fileOUT.flush();
            file.close();
        }
        catch (Exception e) {
            System.out.println("Eccezione: " + e.getMessage());
        }
    }
    
    
}
