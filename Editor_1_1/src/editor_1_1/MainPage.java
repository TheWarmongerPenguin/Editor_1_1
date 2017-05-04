// <editor-fold defaultstate="collapsed" desc="License">
/*
 * I told you that copy was not the way to do it
 */
// </editor-fold>
package editor_1_1;

import java.awt.Color;
import java.awt.Font;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ButtonGroup;
import org.jdesktop.swingx.border.DropShadowBorder;

/**
 *
 * @author Samuele Pozzebon
 */
public class MainPage extends javax.swing.JFrame {
    /**
     * Creates new form MainPage
     */
    
    DropShadowBorder shadow; //ombra
        
    byte indx;
    
    Color primaryColor;     //colore di sfondo/primario
    Color secondaryColor;   //colore di sfondo/secondario
    Color textColor;        //colore dei testi
    
    Font mainF;
    Font subTitleFont;
    
    ButtonGroup checkLang;
    List<CheckBoxGenerator> checkBoxLang;
    
    SlidingAnimation s1;
    SlidingAnimation s2;
    SlidingAnimation s3;
    SlidingAnimation s4;
    
    public MainPage() {
        initPersonalComponent();
        initComponents();
        preset();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        leftPane = new javax.swing.JPanel();
        previewLayPane = new javax.swing.JLayeredPane();
        mobileFrame = new javax.swing.JLabel();
        mobileBack = new javax.swing.JLabel();
        pnlMenu = new javax.swing.JPanel();
        headerLayPane = new javax.swing.JLayeredPane();
        langP = new javax.swing.JPanel();
        langL = new javax.swing.JLabel();
        fieldP = new javax.swing.JPanel();
        fieldL = new javax.swing.JLabel();
        collogP = new javax.swing.JPanel();
        collogL = new javax.swing.JLabel();
        lang = new javax.swing.JPanel();
        lblLang1 = new javax.swing.JLabel();
        pnlScrPnEX = new javax.swing.JPanel();
        scrollPaneLang = new javax.swing.JScrollPane();
        pnlScrPnIN = new javax.swing.JPanel();
        pnlBtnAdd = new javax.swing.JPanel();
        fiel = new javax.swing.JPanel();
        collog = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Site editor");
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocation(new java.awt.Point(0, 0));
        setMaximumSize(new java.awt.Dimension(804, 598));
        setMinimumSize(new java.awt.Dimension(804, 598));
        setName("Site editor"); // NOI18N
        setPreferredSize(new java.awt.Dimension(804, 598));
        setResizable(false);
        setSize(new java.awt.Dimension(804, 598));
        getContentPane().setLayout(new java.awt.GridLayout(1, 2));

        jLayeredPane1.setAlignmentX(0.0F);
        jLayeredPane1.setAlignmentY(0.0F);
        jLayeredPane1.setMaximumSize(new java.awt.Dimension(402, 598));
        jLayeredPane1.setMinimumSize(new java.awt.Dimension(402, 598));
        jLayeredPane1.setPreferredSize(new java.awt.Dimension(402, 598));
        jLayeredPane1.setLayout(new java.awt.BorderLayout());

        leftPane.setMaximumSize(new java.awt.Dimension(400, 542));
        leftPane.setMinimumSize(new java.awt.Dimension(400, 542));
        leftPane.setRequestFocusEnabled(false);
        leftPane.setLayout(null);

        previewLayPane.setBorder(shadow);
        previewLayPane.setMaximumSize(new java.awt.Dimension(400, 598));
        previewLayPane.setMinimumSize(new java.awt.Dimension(400, 598));
        previewLayPane.setPreferredSize(new java.awt.Dimension(400, 598));

        mobileFrame.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mobileFrame.setIcon(new javax.swing.ImageIcon(getClass().getResource("/editor_1_1/mobileFrame.png"))); // NOI18N
        previewLayPane.setLayer(mobileFrame, javax.swing.JLayeredPane.PALETTE_LAYER);
        previewLayPane.add(mobileFrame);
        mobileFrame.setBounds(0, 0, 400, 542);

        mobileBack.setBackground(new java.awt.Color(0, 0, 0));
        mobileBack.setOpaque(true);
        previewLayPane.add(mobileBack);
        mobileBack.setBounds(114, 114, 170, 310);

        leftPane.add(previewLayPane);
        previewLayPane.setBounds(0, 0, 400, 598);

        jLayeredPane1.add(leftPane, java.awt.BorderLayout.CENTER);

        getContentPane().add(jLayeredPane1);

        pnlMenu.setMaximumSize(new java.awt.Dimension(402, 542));
        pnlMenu.setMinimumSize(new java.awt.Dimension(402, 542));
        pnlMenu.setPreferredSize(new java.awt.Dimension(402, 542));
        pnlMenu.setLayout(null);

        headerLayPane.setBorder(shadow);
        headerLayPane.setForeground(textColor);
        headerLayPane.setFont(subTitleFont);
        headerLayPane.setMaximumSize(new java.awt.Dimension(402, 56));
        headerLayPane.setMinimumSize(new java.awt.Dimension(402, 56));
        headerLayPane.setPreferredSize(new java.awt.Dimension(402, 56));

        langP.setBackground(primaryColor);
        langP.setMaximumSize(new java.awt.Dimension(134, 46));
        langP.setMinimumSize(new java.awt.Dimension(134, 46));
        langP.setPreferredSize(new java.awt.Dimension(134, 46));
        langP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                langPMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                langPMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                langPMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                langPMouseReleased(evt);
            }
        });

        langL.setFont(subTitleFont);
        langL.setForeground(textColor);
        langL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        langL.setLabelFor(langP);
        langL.setText("Lingue");
        langL.setPreferredSize(new java.awt.Dimension(134, 46));

        javax.swing.GroupLayout langPLayout = new javax.swing.GroupLayout(langP);
        langP.setLayout(langPLayout);
        langPLayout.setHorizontalGroup(
            langPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, langPLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(langL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        langPLayout.setVerticalGroup(
            langPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(langPLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(langL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        headerLayPane.add(langP);
        langP.setBounds(0, 0, 134, 46);
        langP.getAccessibleContext().setAccessibleName("Lingue");

        fieldP.setBackground(secondaryColor);
        fieldP.setMaximumSize(new java.awt.Dimension(134, 46));
        fieldP.setMinimumSize(new java.awt.Dimension(134, 46));
        fieldP.setPreferredSize(new java.awt.Dimension(134, 46));
        fieldP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fieldPMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                fieldPMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                fieldPMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                fieldPMouseReleased(evt);
            }
        });

        fieldL.setFont(subTitleFont);
        fieldL.setForeground(textColor);
        fieldL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fieldL.setLabelFor(langP);
        fieldL.setText("Campi");
        fieldL.setMaximumSize(new java.awt.Dimension(134, 46));
        fieldL.setMinimumSize(new java.awt.Dimension(134, 46));
        fieldL.setPreferredSize(new java.awt.Dimension(134, 46));

        javax.swing.GroupLayout fieldPLayout = new javax.swing.GroupLayout(fieldP);
        fieldP.setLayout(fieldPLayout);
        fieldPLayout.setHorizontalGroup(
            fieldPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 134, Short.MAX_VALUE)
            .addGroup(fieldPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(fieldPLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(fieldL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        fieldPLayout.setVerticalGroup(
            fieldPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 46, Short.MAX_VALUE)
            .addGroup(fieldPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(fieldPLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(fieldL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        fieldL.getAccessibleContext().setAccessibleName("Campi");

        headerLayPane.add(fieldP);
        fieldP.setBounds(134, 0, 134, 46);
        fieldP.getAccessibleContext().setAccessibleName("Campi");

        collogP.setBackground(secondaryColor);
        collogP.setMaximumSize(new java.awt.Dimension(134, 46));
        collogP.setMinimumSize(new java.awt.Dimension(134, 46));
        collogP.setPreferredSize(new java.awt.Dimension(134, 46));
        collogP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                collogPMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                collogPMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                collogPMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                collogPMouseReleased(evt);
            }
        });

        collogL.setFont(subTitleFont);
        collogL.setForeground(textColor);
        collogL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        collogL.setLabelFor(langP);
        collogL.setText("Colori e logo");
        collogL.setMaximumSize(new java.awt.Dimension(134, 46));
        collogL.setMinimumSize(new java.awt.Dimension(134, 46));
        collogL.setPreferredSize(new java.awt.Dimension(134, 46));
        collogL.setVerifyInputWhenFocusTarget(false);

        javax.swing.GroupLayout collogPLayout = new javax.swing.GroupLayout(collogP);
        collogP.setLayout(collogPLayout);
        collogPLayout.setHorizontalGroup(
            collogPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(collogL, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        collogPLayout.setVerticalGroup(
            collogPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(collogL, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        headerLayPane.add(collogP);
        collogP.setBounds(268, 0, 134, 46);
        collogP.getAccessibleContext().setAccessibleName("Colori e logo");

        pnlMenu.add(headerLayPane);
        headerLayPane.setBounds(0, 0, 402, 56);

        lang.setMaximumSize(new java.awt.Dimension(402, 542));
        lang.setMinimumSize(new java.awt.Dimension(402, 542));
        lang.setPreferredSize(new java.awt.Dimension(402, 542));

        lblLang1.setFont(subTitleFont);
        lblLang1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLang1.setText("Seleziona le lingue da visualizzare");

        pnlScrPnEX.setPreferredSize(new java.awt.Dimension(402, 360));
        pnlScrPnEX.setLayout(null);

        scrollPaneLang.setMaximumSize(new java.awt.Dimension(350, 300));
        scrollPaneLang.setMinimumSize(new java.awt.Dimension(350, 300));
        scrollPaneLang.setPreferredSize(new java.awt.Dimension(350, 300));

        pnlScrPnIN.setLayout(new java.awt.GridLayout(2, 0));
        scrollPaneLang.setViewportView(pnlScrPnIN);

        pnlScrPnEX.add(scrollPaneLang);
        scrollPaneLang.setBounds(26, 30, 350, 300);

        pnlBtnAdd.setLayout(new javax.swing.BoxLayout(pnlBtnAdd, javax.swing.BoxLayout.PAGE_AXIS));

        javax.swing.GroupLayout langLayout = new javax.swing.GroupLayout(lang);
        lang.setLayout(langLayout);
        langLayout.setHorizontalGroup(
            langLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblLang1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnlScrPnEX, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnlBtnAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        langLayout.setVerticalGroup(
            langLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(langLayout.createSequentialGroup()
                .addComponent(lblLang1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(pnlScrPnEX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(pnlBtnAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlMenu.add(lang);
        lang.setBounds(0, 56, 402, 542);

        fiel.setMaximumSize(new java.awt.Dimension(402, 542));
        fiel.setMinimumSize(new java.awt.Dimension(402, 542));
        fiel.setPreferredSize(new java.awt.Dimension(402, 542));

        javax.swing.GroupLayout fielLayout = new javax.swing.GroupLayout(fiel);
        fiel.setLayout(fielLayout);
        fielLayout.setHorizontalGroup(
            fielLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 402, Short.MAX_VALUE)
        );
        fielLayout.setVerticalGroup(
            fielLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 542, Short.MAX_VALUE)
        );

        pnlMenu.add(fiel);
        fiel.setBounds(801, 56, 402, 542);

        collog.setMaximumSize(new java.awt.Dimension(402, 542));
        collog.setPreferredSize(new java.awt.Dimension(402, 542));

        javax.swing.GroupLayout collogLayout = new javax.swing.GroupLayout(collog);
        collog.setLayout(collogLayout);
        collogLayout.setHorizontalGroup(
            collogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 402, Short.MAX_VALUE)
        );
        collogLayout.setVerticalGroup(
            collogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 542, Short.MAX_VALUE)
        );

        pnlMenu.add(collog);
        collog.setBounds(801, 56, 402, 542);

        getContentPane().add(pnlMenu);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void langPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_langPMouseClicked
        if (indx != 0) {
            selection((byte) 0);
        }
    }//GEN-LAST:event_langPMouseClicked

    private void langPMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_langPMouseEntered
        if (indx != 0) {
            langP.setBackground(secondaryColor);
            langL.setForeground(Color.LIGHT_GRAY);
        }
    }//GEN-LAST:event_langPMouseEntered

    private void langPMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_langPMouseExited
        if (indx != 0) {
            langP.setBackground(primaryColor);
            langL.setForeground(textColor);
        }
    }//GEN-LAST:event_langPMouseExited

    private void langPMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_langPMouseReleased
        langP.setBackground(primaryColor);
        langL.setForeground(textColor);
    }//GEN-LAST:event_langPMouseReleased

    private void fieldPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fieldPMouseClicked
        if (indx != 1) {
            selection((byte) 1);
        }
    }//GEN-LAST:event_fieldPMouseClicked

    private void fieldPMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fieldPMouseEntered
        if (indx != 1) {
            fieldP.setBackground(secondaryColor);
            fieldL.setForeground(Color.LIGHT_GRAY);
        }
    }//GEN-LAST:event_fieldPMouseEntered

    private void fieldPMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fieldPMouseExited
        if (indx != 1) {
            fieldP.setBackground(primaryColor);
            fieldL.setForeground(textColor);
        }
    }//GEN-LAST:event_fieldPMouseExited

    private void fieldPMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fieldPMouseReleased
        fieldP.setBackground(primaryColor);
        fieldL.setForeground(textColor);
    }//GEN-LAST:event_fieldPMouseReleased

    private void collogPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_collogPMouseClicked
        if (indx != 2) {
            selection((byte) 2);
        }
    }//GEN-LAST:event_collogPMouseClicked

    private void collogPMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_collogPMouseEntered
        if (indx != 2) {
            collogP.setBackground(secondaryColor);
            collogL.setForeground(Color.LIGHT_GRAY);
        }
    }//GEN-LAST:event_collogPMouseEntered

    private void collogPMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_collogPMouseExited
        if (indx != 2) {
            collogP.setBackground(primaryColor);
            collogL.setForeground(textColor);
        }
    }//GEN-LAST:event_collogPMouseExited

    private void collogPMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_collogPMouseReleased
        collogP.setBackground(primaryColor);
        collogL.setForeground(textColor);
    }//GEN-LAST:event_collogPMouseReleased
    
    private void initPersonalComponent() {
        mainF = new Font("Sans Serif",Font.BOLD, 17);
        subTitleFont = new Font("Sans Serif",Font.PLAIN, 19);
        checkBoxLang = new ArrayList<>();
        
        primaryColor = Color.decode("#607D8B"); //sclego il colore primario
        secondaryColor = Color.decode("#5E7A88");
        textColor = Color.decode("#ECEFF1"); //sclego il colore dei testi
        
        shadow = new DropShadowBorder();
        //creazione e impostazione dell'ombra
        shadow.setShadowColor(Color.BLACK);
        shadow.setShowLeftShadow(true);
        shadow.setShowRightShadow(true);
        shadow.setShowTopShadow(false);
        shadow.setShowBottomShadow(true);
        shadow.setShadowSize(10);
        shadow.setCornerSize(25);
        
        checkLang = new ButtonGroup();
        
        checkBoxLang.add(new CheckBoxGenerator("itFlag.png", "Italiano"));
        checkBoxLang.add(new CheckBoxGenerator("enFlag.png", "English"));
        checkLang.add(checkBoxLang.get(0));
        checkLang.add(checkBoxLang.get(1));
    }
    
    
    private void preset() {
        lang.setVisible(true);
        fiel.setVisible(false);
        collog.setVisible(false);
        
        pnlScrPnIN.add(checkBoxLang.get(0));
        pnlScrPnIN.add(checkBoxLang.get(1));
    }
    
    private void selection(byte finalIndx) {
        switch (finalIndx) {
            case 0: {
                langP.setBackground(primaryColor);
                langL.setForeground(textColor);
                lang.setVisible(true);
                fiel.setVisible(false);
                collog.setVisible(false);
            }; break;
            case 1: {
                fieldP.setBackground(primaryColor);
                fieldL.setForeground(textColor);
                lang.setVisible(false);
                fiel.setVisible(true);
                collog.setVisible(false);
            }; break;
            case 2: {
                collogP.setBackground(primaryColor);
                collogL.setForeground(textColor);
                lang.setVisible(false);
                fiel.setVisible(false);
                collog.setVisible(true);
            }; break;
        }
        
        indx = finalIndx;
    }
    
    /*private void sliding(byte finalIndx) {
        switch (indx) {
            case 0: {
                langP.setBackground(primaryColor);
                langL.setForeground(textColor);
                switch (finalIndx) {
                case 1: slideOnceRight(-super.getWidth(), 0, super.getWidth(), fieldP.getX()); break;
                case 2: slideTwiceRight(-super.getWidth(), -super.getWidth(), 0, collogP.getX()); break;
                }
            }; break;
            case 1: {
                fieldP.setBackground(primaryColor);
                fieldL.setForeground(textColor);
                switch (finalIndx) {
                case 0: slideOnceLeft(0, super.getWidth(), super.getWidth(), langP.getX()); break;
                case 2: slideOnceRight(-super.getWidth(), -super.getWidth(), 0, collogP.getX()); break;
                }
            }; break;
            case 2: {
                collogP.setBackground(primaryColor);
                collogL.setForeground(textColor);
                switch (finalIndx) {
                case 0: slideTwiceLeft(0, super.getWidth(), super.getWidth(), langP.getX()); break;
                case 1: slideOnceLeft(-super.getWidth(), 0, super.getWidth(), fieldP.getX()); break;
                }
            }; break;
        }
        
        indx = finalIndx;
    }
    
    private void slideOnceLeft(int posX1, int posX2, int posX3, int posXBar) {
        try {
            try {
                s1.join();
            } catch (InterruptedException ex) {}
        } catch (Exception e) {};
        try {
            try {
                s2.join();
            } catch (InterruptedException ex) {}
        } catch (Exception e) {};
        try {
            try {
                s3.join();
            } catch (InterruptedException ex) {}
        } catch (Exception e) {};
        try {
            try {
                s4.join();
            } catch (InterruptedException ex) {}
        } catch (Exception e) {};
        
        
        s1 = new SlidingAnimation(lang, posX1, 3);
        s2 = new SlidingAnimation(fiel, posX2, 3);
        s3 = new SlidingAnimation(collog, posX3, 3);
        s4 = new SlidingAnimation(currentSec, posXBar, 1);
        
        s1.start();
        s2.start();
        s3.start();
        s4.start();
    }
    
    private void slideOnceRight(int posX1, int posX2, int posX3, int posXBar) {
        try {
            try {
                s1.join();
            } catch (InterruptedException ex) {}
        } catch (Exception e) {};
        try {
            try {
                s2.join();
            } catch (InterruptedException ex) {}
        } catch (Exception e) {};
        try {
            try {
                s3.join();
            } catch (InterruptedException ex) {}
        } catch (Exception e) {};
        try {
            try {
                s4.join();
            } catch (InterruptedException ex) {}
        } catch (Exception e) {};
       
        s1 = new SlidingAnimation(lang, posX1, 3);
        s2 = new SlidingAnimation(fiel, posX2, 3);
        s3 = new SlidingAnimation(collog, posX3, 3);
        s4 = new SlidingAnimation(currentSec, posXBar, 1);
        
        s1.start();
        s2.start();
        s3.start();
        s4.start();
    }
    
    private void slideTwiceLeft(int posX1, int posX2, int posX3, int posXBar) {
        try {
            try {
                s1.join();
            } catch (InterruptedException ex) {}
        } catch (Exception e) {};
        try {
            try {
                s2.join();
            } catch (InterruptedException ex) {}
        } catch (Exception e) {};
        try {
            try {
                s3.join();
            } catch (InterruptedException ex) {}
        } catch (Exception e) {};
        try {
            try {
                s4.join();
            } catch (InterruptedException ex) {}
        } catch (Exception e) {};
        
        s1 = new SlidingAnimation(lang, posX1, 3);
        fiel.setLocation(posX2, fiel.getY());
        s3 = new SlidingAnimation(collog, posX3, 3);
        s4 = new SlidingAnimation(currentSec, posXBar, 2);
        
        s1.start();
        s3.start();
        s4.start();
    }
    
    private void slideTwiceRight(int posX1, int posX2, int posX3, int posXBar) {
        try {
            try {
                s1.join();
            } catch (InterruptedException ex) {}
        } catch (Exception e) {};
        try {
            try {
                s2.join();
            } catch (InterruptedException ex) {}
        } catch (Exception e) {};
        try {
            try {
                s3.join();
            } catch (InterruptedException ex) {}
        } catch (Exception e) {};
        try {
            try {
                s4.join();
            } catch (InterruptedException ex) {}
        } catch (Exception e) {};
        
        
        
        s1 = new SlidingAnimation(lang, posX1, 3);
        fiel.setLocation(posX2, fiel.getY());
        s3 = new SlidingAnimation(collog, posX3, 3);
        s4 = new SlidingAnimation(currentSec, posXBar, 2);
        
        s1.start();
        s3.start();
        s4.start();
    }*/

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel collog;
    private javax.swing.JLabel collogL;
    private javax.swing.JPanel collogP;
    private javax.swing.JPanel fiel;
    private javax.swing.JLabel fieldL;
    private javax.swing.JPanel fieldP;
    private javax.swing.JLayeredPane headerLayPane;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel lang;
    private javax.swing.JLabel langL;
    private javax.swing.JPanel langP;
    private javax.swing.JLabel lblLang1;
    private javax.swing.JPanel leftPane;
    private javax.swing.JLabel mobileBack;
    private javax.swing.JLabel mobileFrame;
    private javax.swing.JPanel pnlBtnAdd;
    private javax.swing.JPanel pnlMenu;
    private javax.swing.JPanel pnlScrPnEX;
    private javax.swing.JPanel pnlScrPnIN;
    private javax.swing.JLayeredPane previewLayPane;
    private javax.swing.JScrollPane scrollPaneLang;
    // End of variables declaration//GEN-END:variables
}
