package editor_1_1;


import java.io.*;
import java.util.logging.*;

/**
 *
 * @author Samuele Pozzebon
 */
public class ReadGeneralFile {
    
    private ClassGeneralSettings readFile = new ClassGeneralSettings();

    
    public ClassGeneralSettings getSet() {
        return this.readFile;
    }  
    
    public ReadGeneralFile() {
        try {
            ObjectInputStream fileIN = new ObjectInputStream(new FileInputStream("settings.dat"));
            readFile = (ClassGeneralSettings) fileIN.readObject();
        }
        catch (IOException e) {} catch (ClassNotFoundException ex) {
            Logger.getLogger(ReadGeneralFile.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
  
}
