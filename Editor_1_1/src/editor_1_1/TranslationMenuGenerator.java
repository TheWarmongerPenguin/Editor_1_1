/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package editor_1_1;

import java.io.Serializable;
import java.util.List;
import javax.swing.JTable;
import static javax.swing.JTable.AUTO_RESIZE_SUBSEQUENT_COLUMNS;
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
                Object[] obj = new Object[tran.getTranslationsLenght()];
                obj[0] = tran.getField();
                int cont = 0;
                while(true) {
                    try {
                        
                    } catch (ArrayIndexOutOfBoundsException e) {
                    }
                }
                model.addRow(obj);
            } catch (Exception e) { break; }
            contatore ++;
        }
        //getColumnModel().getColumn(0).setPreferredWidth(36);
        //getColumnModel().getColumn(1).setPreferredWidth(100);
        //getColumnModel().getColumn(2).setPreferredWidth(107);
        
        columnNames = new String[languages.length-1];
        int cont = 0;
        while (true) {
            try {
                columnNames[cont] = languages[cont];
            } catch (Exception e) { break; }
            cont++;
        }
    }
    
    public void addRowManually(String field, String[] tran) {
        model.addRow(new Object[] {field, tran});
    }

    private void modelSetting() {
        model = new DefaultTableModel(null,columnNames){
            @Override
            public Class<?> getColumnClass(int column) {
                switch (column) {
                    default:
                        return String.class;
                }
            }
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
