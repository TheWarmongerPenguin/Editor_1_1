package editor_1_1;


import java.awt.Component;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.Serializable;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.table.TableColumnModel;

/**
 *
 * @author Samuele Pozzebon
 */
public class CheckBoxGenerator extends JTable implements Serializable{
    
    String[] columnNames = {"Visible", "Flag", "Language"};
    DefaultTableModel model;
    String src;
    ImageIcon imageIcon;
      
    public CheckBoxGenerator(List<ClassLanguages> list) {
        modelSetting();
        setModel(model);
        setAutoResizeMode(AUTO_RESIZE_SUBSEQUENT_COLUMNS);
        setRowHeight(36);
        setTableHeader(null);
        setShowGrid(false);
        int contatore = 0;
        ClassLanguages lang;
        while(true) {
            lang = new ClassLanguages();
            try {
                lang = list.get(contatore);
                src = lang.getIcon();
                imgResize(src);
                Object[] obj = {lang.isSelected(), imageIcon, lang.getLanguage()};
                model.addRow(obj);
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
    }
    
    private void imgResize(String src){
        BufferedImage img = null;
        try {
            img = ImageIO.read(getClass().getResource("/editor_1_1/"+src));
        } catch (IOException ex) {
            Logger.getLogger(CheckBoxGenerator.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        Image dimg = img.getScaledInstance(50, 30, Image.SCALE_SMOOTH);
        
        imageIcon = new ImageIcon(dimg);
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
    
    public String[] getLanguages(List<ClassLanguages> list) {
        String[] languages = new String[list.size()-1];
        ClassLanguages lang;
        int contatore = 0;
        while (true) { 
            lang = new ClassLanguages();
            try {
                lang = list.get(contatore);
                languages[contatore] = lang.getLanguage();
            } catch (Exception e) { break; }
            contatore ++;
        }
        return languages;
    }
    
    
}
