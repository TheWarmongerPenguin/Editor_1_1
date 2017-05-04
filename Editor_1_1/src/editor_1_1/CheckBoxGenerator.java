package editor_1_1;


import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;

// <editor-fold defaultstate="collapsed" desc="License">
/*
 * I told you that copy was not the way to do it
 */
// </editor-fold>

/**
 *
 * @author Samuele Pozzebon
 */
public class CheckBoxGenerator extends JCheckBox implements Serializable{
    
    String src;
    ImageIcon imageIcon;
    
    public CheckBoxGenerator(String imagine, String title) {
        src = new String(imagine);
        setSize(200, 70);
        imgResize();
        setIcon(imageIcon);
        setText(title);
    }
    
    
    private void imgResize(){
        BufferedImage img = null;
        try {
            img = ImageIO.read(getClass().getResource("/editor_1_1/"+src));
        } catch (IOException ex) {
            Logger.getLogger(CheckBoxGenerator.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        Image dimg = img.getScaledInstance(100, 60, Image.SCALE_SMOOTH);
        
        imageIcon = new ImageIcon(dimg);
    }
    
    
}
