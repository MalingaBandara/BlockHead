/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blockhead.java;

import javax.swing.JPanel;

/**
 *
 * @author user
 */
public class Home extends javax.swing.JFrame {

    /**
     * Creates new form Home
     */
    public Home() {
        initComponents();
       
    }

     public void switchPanels(JPanel panel){
         MiddlePanel.removeAll();
         MiddlePanel.add(panel);
          MiddlePanel.repaint();
          MiddlePanel.revalidate();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Fullpanel = new javax.swing.JPanel();
        ButtonPanel = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        BillPanel = new javax.swing.JPanel();
        MiddlePanel = new javax.swing.JPanel();
        M1 = new javax.swing.JPanel();
        M1B2 = new javax.swing.JButton();
        M1B3 = new javax.swing.JButton();
        M1B4 = new javax.swing.JButton();
        M1B5 = new javax.swing.JButton();
        M1B6 = new javax.swing.JButton();
        M1B7 = new javax.swing.JButton();
        M1B8 = new javax.swing.JButton();
        M1B9 = new javax.swing.JButton();
        M1B1 = new javax.swing.JButton();
        M2 = new javax.swing.JPanel();
        M1B10 = new javax.swing.JButton();
        M1B11 = new javax.swing.JButton();
        M1B12 = new javax.swing.JButton();
        M1B13 = new javax.swing.JButton();
        M1B14 = new javax.swing.JButton();
        M1B15 = new javax.swing.JButton();
        M1B16 = new javax.swing.JButton();
        M1B17 = new javax.swing.JButton();
        M1B18 = new javax.swing.JButton();
        M3 = new javax.swing.JPanel();
        M1B28 = new javax.swing.JButton();
        M1B29 = new javax.swing.JButton();
        M1B30 = new javax.swing.JButton();
        M1B31 = new javax.swing.JButton();
        M1B32 = new javax.swing.JButton();
        M1B33 = new javax.swing.JButton();
        M1B34 = new javax.swing.JButton();
        M1B35 = new javax.swing.JButton();
        M1B36 = new javax.swing.JButton();
        M4 = new javax.swing.JPanel();
        M1B19 = new javax.swing.JButton();
        M1B20 = new javax.swing.JButton();
        M1B21 = new javax.swing.JButton();
        M1B22 = new javax.swing.JButton();
        M1B23 = new javax.swing.JButton();
        M1B24 = new javax.swing.JButton();
        M1B25 = new javax.swing.JButton();
        M1B26 = new javax.swing.JButton();
        M1B27 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("jButton1");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("jButton1");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("jButton1");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ButtonPanelLayout = new javax.swing.GroupLayout(ButtonPanel);
        ButtonPanel.setLayout(ButtonPanelLayout);
        ButtonPanelLayout.setHorizontalGroup(
            ButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ButtonPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        ButtonPanelLayout.setVerticalGroup(
            ButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ButtonPanelLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
        );

        javax.swing.GroupLayout BillPanelLayout = new javax.swing.GroupLayout(BillPanel);
        BillPanel.setLayout(BillPanelLayout);
        BillPanelLayout.setHorizontalGroup(
            BillPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 233, Short.MAX_VALUE)
        );
        BillPanelLayout.setVerticalGroup(
            BillPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        MiddlePanel.setLayout(new java.awt.CardLayout());

        M1.setBackground(new java.awt.Color(102, 102, 102));

        M1B2.setBackground(new java.awt.Color(51, 51, 51));
        M1B2.setText("jButton6");
        M1B2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                M1B2ActionPerformed(evt);
            }
        });

        M1B3.setBackground(new java.awt.Color(51, 51, 51));
        M1B3.setText("jButton6");

        M1B4.setBackground(new java.awt.Color(51, 51, 51));
        M1B4.setText("jButton6");

        M1B5.setBackground(new java.awt.Color(51, 51, 51));
        M1B5.setText("jButton6");

        M1B6.setBackground(new java.awt.Color(51, 51, 51));
        M1B6.setText("jButton6");

        M1B7.setBackground(new java.awt.Color(51, 51, 51));
        M1B7.setText("jButton6");

        M1B8.setBackground(new java.awt.Color(51, 51, 51));
        M1B8.setText("jButton6");

        M1B9.setBackground(new java.awt.Color(51, 51, 51));
        M1B9.setText("jButton6");

        M1B1.setBackground(new java.awt.Color(51, 51, 51));
        M1B1.setText("jButton6");
        M1B1.setToolTipText("Beear");

        javax.swing.GroupLayout M1Layout = new javax.swing.GroupLayout(M1);
        M1.setLayout(M1Layout);
        M1Layout.setHorizontalGroup(
            M1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(M1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(M1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(M1B4, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(M1B7, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(M1B1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 151, Short.MAX_VALUE)
                .addGroup(M1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(M1B2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(M1B8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(M1B5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(129, 129, 129)
                .addGroup(M1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(M1B6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(M1B3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(M1B9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(118, 118, 118))
        );

        M1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {M1B1, M1B2, M1B3, M1B4, M1B5, M1B6, M1B7, M1B8, M1B9});

        M1Layout.setVerticalGroup(
            M1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(M1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(M1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(M1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(M1B3, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(M1B2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(M1B1, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(M1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(M1B6, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(M1B5, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(M1B4, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addGroup(M1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(M1B7, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(M1B8, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(M1B9, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );

        M1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {M1B1, M1B2, M1B3, M1B4, M1B5, M1B6, M1B7, M1B8, M1B9});

        MiddlePanel.add(M1, "card2");

        M1B10.setText("jButton6");

        M1B11.setText("jButton6");

        M1B12.setText("jButton6");

        M1B13.setText("jButton6");

        M1B14.setText("jButton6");

        M1B15.setText("jButton6");

        M1B16.setText("jButton6");

        M1B17.setText("jButton6");

        M1B18.setText("jButton6");

        javax.swing.GroupLayout M2Layout = new javax.swing.GroupLayout(M2);
        M2.setLayout(M2Layout);
        M2Layout.setHorizontalGroup(
            M2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(M2Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(M2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(M1B12, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(M1B15, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(M1B18, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(113, 113, 113)
                .addGroup(M2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, M2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                        .addComponent(M1B10, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, M2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(M2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(M1B16, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(M1B13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(129, 129, 129)
                .addGroup(M2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(M1B14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(M1B11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(M1B17, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(118, 118, 118))
        );

        M2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {M1B10, M1B11, M1B12, M1B13, M1B14, M1B15, M1B16, M1B17, M1B18});

        M2Layout.setVerticalGroup(
            M2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(M2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(M2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(M1B11, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(M1B10, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(M1B18, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 198, Short.MAX_VALUE)
                .addGroup(M2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(M1B14, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(M1B13, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(M1B12, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(81, 81, 81)
                .addGroup(M2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(M1B15, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(M1B16, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(M1B17, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );

        M2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {M1B10, M1B11, M1B12, M1B13, M1B14, M1B15, M1B16, M1B17, M1B18});

        MiddlePanel.add(M2, "card3");

        M1B28.setText("jButton6");

        M1B29.setText("jButton6");

        M1B30.setText("jButton6");

        M1B31.setText("jButton6");

        M1B32.setText("jButton6");

        M1B33.setText("jButton6");

        M1B34.setText("jButton6");

        M1B35.setText("jButton6");

        M1B36.setText("jButton6");

        javax.swing.GroupLayout M3Layout = new javax.swing.GroupLayout(M3);
        M3.setLayout(M3Layout);
        M3Layout.setHorizontalGroup(
            M3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(M3Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(M3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(M1B30, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(M1B33, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(M1B36, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(113, 113, 113)
                .addGroup(M3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, M3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                        .addComponent(M1B28, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, M3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(M3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(M1B34, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(M1B31, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(129, 129, 129)
                .addGroup(M3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(M1B32, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(M1B29, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(M1B35, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(118, 118, 118))
        );

        M3Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {M1B28, M1B29, M1B30, M1B31, M1B32, M1B33, M1B34, M1B35, M1B36});

        M3Layout.setVerticalGroup(
            M3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(M3Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(M3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(M1B29, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(M1B28, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(M1B36, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 198, Short.MAX_VALUE)
                .addGroup(M3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(M1B32, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(M1B31, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(M1B30, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(81, 81, 81)
                .addGroup(M3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(M1B33, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(M1B34, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(M1B35, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );

        M3Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {M1B28, M1B29, M1B30, M1B31, M1B32, M1B33, M1B34, M1B35, M1B36});

        MiddlePanel.add(M3, "card2");

        M1B19.setText("jButton6");

        M1B20.setText("jButton6");

        M1B21.setText("jButton6");

        M1B22.setText("jButton6");

        M1B23.setText("jButton6");

        M1B24.setText("jButton6");

        M1B25.setText("jButton6");

        M1B26.setText("jButton6");

        M1B27.setText("jButton6");
        M1B27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                M1B27ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout M4Layout = new javax.swing.GroupLayout(M4);
        M4.setLayout(M4Layout);
        M4Layout.setHorizontalGroup(
            M4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(M4Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(M4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(M1B21, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(M1B24, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(M1B27, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(113, 113, 113)
                .addGroup(M4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, M4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                        .addComponent(M1B19, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, M4Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(M4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(M1B25, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(M1B22, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(129, 129, 129)
                .addGroup(M4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(M1B23, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(M1B20, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(M1B26, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(118, 118, 118))
        );

        M4Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {M1B19, M1B20, M1B21, M1B22, M1B23, M1B24, M1B25, M1B26, M1B27});

        M4Layout.setVerticalGroup(
            M4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(M4Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(M4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(M1B20, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(M1B19, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(M1B27, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 198, Short.MAX_VALUE)
                .addGroup(M4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(M1B23, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(M1B22, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(M1B21, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(81, 81, 81)
                .addGroup(M4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(M1B24, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(M1B25, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(M1B26, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );

        M4Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {M1B19, M1B20, M1B21, M1B22, M1B23, M1B24, M1B25, M1B26, M1B27});

        MiddlePanel.add(M4, "card2");

        javax.swing.GroupLayout FullpanelLayout = new javax.swing.GroupLayout(Fullpanel);
        Fullpanel.setLayout(FullpanelLayout);
        FullpanelLayout.setHorizontalGroup(
            FullpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FullpanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BillPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(MiddlePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(ButtonPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        FullpanelLayout.setVerticalGroup(
            FullpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FullpanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ButtonPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(BillPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(MiddlePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fullpanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fullpanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        switchPanels(M2);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        switchPanels(M3);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        switchPanels(M4);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void M1B27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_M1B27ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_M1B27ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        switchPanels(M1);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void M1B2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_M1B2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_M1B2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BillPanel;
    private javax.swing.JPanel ButtonPanel;
    private javax.swing.JPanel Fullpanel;
    private javax.swing.JPanel M1;
    private javax.swing.JButton M1B1;
    private javax.swing.JButton M1B10;
    private javax.swing.JButton M1B11;
    private javax.swing.JButton M1B12;
    private javax.swing.JButton M1B13;
    private javax.swing.JButton M1B14;
    private javax.swing.JButton M1B15;
    private javax.swing.JButton M1B16;
    private javax.swing.JButton M1B17;
    private javax.swing.JButton M1B18;
    private javax.swing.JButton M1B19;
    private javax.swing.JButton M1B2;
    private javax.swing.JButton M1B20;
    private javax.swing.JButton M1B21;
    private javax.swing.JButton M1B22;
    private javax.swing.JButton M1B23;
    private javax.swing.JButton M1B24;
    private javax.swing.JButton M1B25;
    private javax.swing.JButton M1B26;
    private javax.swing.JButton M1B27;
    private javax.swing.JButton M1B28;
    private javax.swing.JButton M1B29;
    private javax.swing.JButton M1B3;
    private javax.swing.JButton M1B30;
    private javax.swing.JButton M1B31;
    private javax.swing.JButton M1B32;
    private javax.swing.JButton M1B33;
    private javax.swing.JButton M1B34;
    private javax.swing.JButton M1B35;
    private javax.swing.JButton M1B36;
    private javax.swing.JButton M1B4;
    private javax.swing.JButton M1B5;
    private javax.swing.JButton M1B6;
    private javax.swing.JButton M1B7;
    private javax.swing.JButton M1B8;
    private javax.swing.JButton M1B9;
    private javax.swing.JPanel M2;
    private javax.swing.JPanel M3;
    private javax.swing.JPanel M4;
    private javax.swing.JPanel MiddlePanel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    // End of variables declaration//GEN-END:variables
}
