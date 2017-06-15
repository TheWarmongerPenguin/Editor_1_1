package editor_1_1;

import java.io.Serializable;

/**
 *
 * @author Samuele Pozzebon
 */
public class ClassInitialization implements Serializable{
    private boolean firstTime;
    
    public ClassInitialization(){}
    
    public ClassInitialization(ClassInitialization copy){
        firstTime = copy.firstTime;
    }
    
    public void firstTimeUse() {
        firstTime = true;
    }
    
    public boolean isFirstTime() {
        if(firstTime) {
            return false;
        } else {return true;}
    }
}
