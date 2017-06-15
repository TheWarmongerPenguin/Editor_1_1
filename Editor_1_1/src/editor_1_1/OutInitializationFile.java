package editor_1_1;

import java.io.*;

/**
 *
 * @author Samuele Pozzebon
 */

public class OutInitializationFile {
    
    public OutInitializationFile(ClassInitialization init) {
        try {
            FileOutputStream file = new FileOutputStream("initialization.dat");
            ObjectOutputStream fileOUT = new ObjectOutputStream(file);
            
            fileOUT.writeObject(init);
            fileOUT.flush();
            file.close();
        }
        catch (Exception e) {
            System.out.println("Eccezione: " + e.getMessage());
        }
    }
    
    
}
