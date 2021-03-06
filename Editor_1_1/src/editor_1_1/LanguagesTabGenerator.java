package editor_1_1;


import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Samuele Pozzebon
 */
public class LanguagesTabGenerator extends JTable{
    
    String[] columnNames = {"Visible", "Flag", "Language"};
    DefaultTableModel model;
    String src;
    ImageIcon imageIcon;
    String[] languages;
      
    public LanguagesTabGenerator(List<ClassLanguages> list) {
        modelSetting();
        setModel(model);
        setAutoResizeMode(AUTO_RESIZE_SUBSEQUENT_COLUMNS);
        setRowHeight(36);
        setTableHeader(null);
        setShowGrid(false);
        
        languages = new String[list.size()];
        int contatore = 0;
        ClassLanguages lang;
        while(true) {
            lang = new ClassLanguages();
            try {
                System.out.println("creazione");
                lang = list.get(contatore);
                languages[contatore] = lang.getLanguage();
                src = lang.getIcon();
                imgResize(src);
                Object[] obj = {lang.isSelected(), imageIcon, lang.getLanguage()};
                model.addRow(obj);
                System.out.println("creato");
            } catch (Exception e) { break; }
            contatore ++;
        }
        getColumnModel().getColumn(0).setPreferredWidth(36);
        getColumnModel().getColumn(1).setPreferredWidth(100);
        getColumnModel().getColumn(2).setPreferredWidth(107);
    }
    
    public void addRowManually(String imagine, String title) {
        src = imagine;
        imgResize(src);
        model.addRow(new Object[] {true, imageIcon, title});
        
        String[] lang = languages;
        languages = new String[lang.length+1];
        int cont = 0;
        while(true) {
            try {
                languages[cont] = lang [cont];
            } catch (ArrayIndexOutOfBoundsException e) {break;}
            cont ++;
        }
        cont ++;
        languages[cont] = title;
    }
    
    private void imgResize(String src){
        System.out.println("resizing");
        BufferedImage img;
        System.out.println("1");
        Image dimg = null;
        System.out.println("2"); 
        try {
            img = ImageIO.read(getClass().getResource("/editor_1_1/"+src));
            System.out.println("3");
            dimg = img.getScaledInstance(50, 30, Image.SCALE_DEFAULT);
            System.out.println("4");
        } catch (IOException ex) {
            System.out.println("catched");
            Logger.getLogger(LanguagesTabGenerator.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        System.out.println("5");
         
        
        imageIcon = new ImageIcon(dimg);
        System.out.println("resized");
    }

    private void modelSetting() {
        model = new DefaultTableModel(null,columnNames){
            @Override
            public Class<?> getColumnClass(int column) {
                switch (column) {
                    case 0:
                        return Boolean.class;
                    case 1:
                        return ImageIcon.class;
                    default:
                        return String.class;
                }
            }
            @Override
            public boolean isCellEditable(int row, int col) {
                switch (col) {
                    case 0: return true;
                    default: return false;
                }
            }
        };
        setColumnModel(columnModel);
        
    }
    
    public String[] getLanguages() {
        return languages;
    }
    
}
