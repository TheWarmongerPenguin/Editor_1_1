package editor_1_1;

import java.awt.Font;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.lang.String;

/**
 *
 * @author Samuele Pozzebon
 */
public class TranslationTabGenerator extends JTable{
    private String[] columnNames;
    private DefaultTableModel model;
    
    public TranslationTabGenerator(List<ClassTranslations> list) {
        columnNames = new String[list.size()];
        int contatore1 = 0;
        while(true) {
            try {
                columnNames[contatore1] = list.get(contatore1).getLanguage();
            } catch (Exception e) { break; }
            contatore1 ++;
        }
        modelSetting();
        setModel(model);
        setRowHeight(25);
        setShowVerticalLines(false);
        setFont(new Font("Sans Serif",Font.PLAIN, 11));
        
        
        int contatore2 = 0;
        Object[] obj = new Object[list.size()];
        while(contatore2 < list.get(0).getTranslationsLenght()) {
            try {
                int cont = 0;
                while(true) {
                    try {
                        obj[cont] = list.get(cont).getTranslations()[contatore2];
                    } catch (Exception a) {break;}
                    cont++;
                }
                model.addRow(obj);
            } catch (Exception e) {break;}
            contatore2 ++;
        }
        
        int contatore3 = 0;
        obj = new Object[list.size()];
        while(contatore3<list.get(0).getFieldsStableLenght()) {
            try {
                int cont = 0;
                while(true) {
                    try {
                        obj[cont] = list.get(cont).getFieldsStables()[contatore3];
                    } catch (Exception a) {break;}
                    cont++;
                }
                model.addRow(obj);
            } catch (Exception e) {break;}
            contatore3 ++;
        }
        
        int contatore4 = 0;
        obj = new Object[list.size()];
        while(contatore4<list.get(0).getFieldsVariableLenght()) {
            try {
                int cont = 0;
                while(true) {
                    try {
                        obj[cont] = list.get(cont).getFieldsVariable()[contatore4];
                    } catch (Exception a) {break;}
                    cont++;
                }
                model.addRow(obj);
            } catch (Exception e) {break;}
            contatore4 ++;
        }
    }
    
    public void addColumnManually(String language, String[] tran) {
        model.addRow((Object[]) tran);
    }

    private void modelSetting() {
        model = new DefaultTableModel(null,columnNames){
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
