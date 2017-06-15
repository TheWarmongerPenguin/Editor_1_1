package editor_1_1;

import java.awt.Color;
import java.io.Serializable;

/**
 *
 * @author Samuele Pozzebon
 */
public class ClassGeneralSettings implements Serializable{
    
    private String logoSrc, iconPack, iconInfo, iconStats, iconSet;
    private Color background, textMain, textAdv, box, headEx, headIn;
    private int persistance;
    
    
    public ClassGeneralSettings() {}
    
    public ClassGeneralSettings (String logo, String iPack, String iInfo, String iStats, String iSets, Color back, Color txtM, Color txtA, Color bx, Color hEx, Color hIn, int per) {
        logoSrc = logo;
        iconPack = iPack;
        iconInfo = iInfo;
        iconStats = iStats;
        iconSet = iSets;
        background = back;
        textMain = txtM;
        textAdv = txtA;
        box = bx;
        headEx = hEx;
        headIn = hIn;
        persistance = per;
    }
    
    public ClassGeneralSettings (ClassGeneralSettings copy) {
        logoSrc = copy.getLogo();
        iconPack = copy.getIconPack();
        iconInfo = copy.getIconInfo();
        iconStats = copy.getIconStats();
        iconSet = copy.getIconSet();
        background = copy.getBackgroundColor();
        textMain = copy.getTextMain();
        textAdv = copy.getTextAdv();
        box = copy.getBox();
        headEx = copy.getHeadEx();
        headIn = copy.getHeadIn();
        persistance = copy.getPersitance();
        
    }
    
    public void setLogo(String txt) {
        logoSrc = txt;
    }
    
    public void setIconPack(String txt) {
        iconPack = txt;
    }
    
    public void setIconInfo(String txt) {
        iconInfo = txt;
    }
    
    public void setIconStats(String txt) {
        iconStats = txt;
    }
    
    public void setIconSet(String txt) {
        iconSet = txt;
    }
    
    public void setBackground(Color color) {
        background = color;
    }
    
    public void setTextMain(Color color) {
        textMain = color;
    }
    
    public void setTextAdv(Color color) {
        textAdv = color;
    }
    
    public void setBox(Color color) {
        box = color;
    }
    
    public void setHeadEx(Color color) {
        headEx = color;
    }
    
    public void setHeadIn(Color color) {
        headIn = color;
    }
    
    public void setPersitance(int num) {
        persistance = num;
    }
    
    public String getLogo() {
        return logoSrc;
    }
    
    public String getIconPack() {
        return iconPack;
    }
    
    public String getIconInfo() {
        return iconInfo;
    }
    
    public String getIconStats() {
        return iconStats;
    }
    
    public String getIconSet() {
        return iconSet;
    }
    
    public Color getBackgroundColor() {
        return background;
    }
    
    public Color getTextMain() {
        return textMain;
    }
    
    public Color getTextAdv() {
        return textAdv;
    }
    
    public Color getBox() {
        return box;
    }
    
    public Color getHeadEx() {
        return headEx;
    }
    
    public Color getHeadIn() {
        return headIn;
    }
    
    public int getPersitance() {
        return persistance;
    }
    
}
