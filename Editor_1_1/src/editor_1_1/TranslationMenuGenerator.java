/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package editor_1_1;

import java.io.Serializable;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.lang.String;

/**
 *
 * @author samuele.pozzebon
 */
public class TranslationMenuGenerator extends JTable implements Serializable{
    String[] columnNames;
    DefaultTableModel model;
    String campo;
    
    public TranslationMenuGenerator(List<ClassTranslations> list, String[] languages) {
        columnNames = languages;
        modelSetting();
        setModel(model);
        setAutoResizeMode(AUTO_RESIZE_ALL_COLUMNS);
        setRowHeight(36);
        //setTableHeader(new JTableHeader(columnModel));
        setShowVerticalLines(false);
        int contatore = 0;
        ClassTranslations tran;
        while(true) {
            tran = new ClassTranslations();
            try {
                tran = list.get(contatore);
                campo = tran.getField();
                Object[] obj = new Object[tran.getTranslationsLenght()+1];
                obj[0] = tran.getField();
                String[] t = tran.getTranslations();
                int cont = 0;
                while(true) {
                    try {
                        obj[cont+1] = t[cont];
                    } catch (ArrayIndexOutOfBoundsException e) {break;}
                    cont++;
                }
                model.addRow(obj);
            } catch (Exception e) { break; }
            contatore ++;
        }
    }
    
    public void addRowManually(String field, String[] tran) {
        model.addRow(new Object[] {field, tran});
    }

    private void modelSetting() {
        model = new DefaultTableModel(null,columnNames){
            /*@Override
            public Class<?> getColumnClass(int column) {
                switch (column) {
                    default:
                        return String.class;
                }
            }*/
            @Override
            public boolean isCellEditable(int row, int col) {
                switch (col) {
                    default: return true;
                }
            }
        };
        setColumnModel(columnModel);
        
    }
    
}
