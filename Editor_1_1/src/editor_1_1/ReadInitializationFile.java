package editor_1_1;


import java.io.*;
import java.util.logging.*;

/**
 *
 * @author samuele.pozzebon
 */
public class ReadInitializationFile {
    
    private ClassInitialization readFile = new ClassInitialization();

    
    public ClassInitialization getInit() {
        return this.readFile;
    }  
    
    public ReadInitializationFile() {
        try {
            ObjectInputStream fileIN = new ObjectInputStream(new FileInputStream("initialization.dat"));
            readFile = (ClassInitialization) fileIN.readObject();
        }
        catch (IOException e) {} catch (ClassNotFoundException ex) {
            Logger.getLogger(ReadInitializationFile.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
  
}
