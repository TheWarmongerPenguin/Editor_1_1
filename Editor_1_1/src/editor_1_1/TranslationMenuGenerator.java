/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package editor_1_1;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.Serializable;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JTable;
import static javax.swing.JTable.AUTO_RESIZE_SUBSEQUENT_COLUMNS;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author samuele.pozzebon
 */
public class TranslationMenuGenerator extends JTable implements Serializable{
    
    String[] columnNames;
    DefaultTableModel model;
    String campo;
    ImageIcon imageIcon;
      
    public TranslationMenuGenerator(List<ClassTranslations> list, String[] languages) {
        modelSetting();
        setModel(model);
        setAutoResizeMode(AUTO_RESIZE_SUBSEQUENT_COLUMNS);
        setRowHeight(36);
        setTableHeader(null);
        setShowVerticalLines(false);
        int contatore = 0;
        ClassTranslations tran;
        while(true) {
            tran = new ClassTranslations();
            try {
                tran = list.get(contatore);
                campo = tran.getField();
                Object[] obj = {tran.isSelected(), imageIcon, tran.getLanguage()};
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
    
}
