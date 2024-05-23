
package main;

import javax.swing.JOptionPane;
import modell.Auto;

public class GuiAutosProgram extends javax.swing.JFrame {
    private int szamlalo;
    private Auto[] autok;
    
    public GuiAutosProgram() {
        initComponents();
        autok = new Auto[3];
        szamlalo = 0;
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        pnlUjAuto = new javax.swing.JPanel();
        rdbUzema = new javax.swing.JRadioButton();
        rdbDefekt = new javax.swing.JRadioButton();
        chbBeinditva = new javax.swing.JCheckBox();
        btnResetUezemaDefekt = new javax.swing.JButton();
        btnGarazsba = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        mumPotkerek = new javax.swing.JSpinner();
        jSeparator1 = new javax.swing.JSeparator();
        pnlGarazs = new javax.swing.JPanel();
        cmbAutok = new javax.swing.JComboBox<>();
        sldEsely = new javax.swing.JSlider();
        jLabel4 = new javax.swing.JLabel();
        chbDefekt = new javax.swing.JCheckBox();
        btnMegy = new javax.swing.JButton();
        btnTankol1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txaAllapot = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Autó GUI");
        setResizable(false);

        pnlUjAuto.setBorder(javax.swing.BorderFactory.createTitledBorder("Új autó"));

        buttonGroup1.add(rdbUzema);
        rdbUzema.setText("üzemanyag");

        buttonGroup1.add(rdbDefekt);
        rdbDefekt.setText("defekt");

        chbBeinditva.setText("beindítva");

        btnResetUezemaDefekt.setText("reset");
        btnResetUezemaDefekt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetUezemaDefektActionPerformed(evt);
            }
        });

        btnGarazsba.setText("garázsba");
        btnGarazsba.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGarazsbaActionPerformed(evt);
            }
        });

        jLabel2.setText("pótkerék:");

        mumPotkerek.setModel(new javax.swing.SpinnerNumberModel(0, 0, 4, 1));

        javax.swing.GroupLayout pnlUjAutoLayout = new javax.swing.GroupLayout(pnlUjAuto);
        pnlUjAuto.setLayout(pnlUjAutoLayout);
        pnlUjAutoLayout.setHorizontalGroup(
            pnlUjAutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlUjAutoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlUjAutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlUjAutoLayout.createSequentialGroup()
                        .addGroup(pnlUjAutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlUjAutoLayout.createSequentialGroup()
                                .addComponent(rdbUzema)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnResetUezemaDefekt))
                            .addGroup(pnlUjAutoLayout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(mumPotkerek, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlUjAutoLayout.createSequentialGroup()
                                .addGroup(pnlUjAutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rdbDefekt)
                                    .addGroup(pnlUjAutoLayout.createSequentialGroup()
                                        .addComponent(chbBeinditva)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnGarazsba)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        pnlUjAutoLayout.setVerticalGroup(
            pnlUjAutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlUjAutoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlUjAutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdbUzema)
                    .addComponent(btnResetUezemaDefekt))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rdbDefekt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlUjAutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(mumPotkerek, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlUjAutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chbBeinditva)
                    .addComponent(btnGarazsba))
                .addContainerGap())
        );

        pnlGarazs.setBorder(javax.swing.BorderFactory.createTitledBorder("Garázs"));

        cmbAutok.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--- Autók ---" }));

        sldEsely.setValue(0);
        sldEsely.setEnabled(false);
        sldEsely.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                sldEselyMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                sldEselyMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                sldEselyMouseReleased(evt);
            }
        });

        jLabel4.setText("esély defektre:");

        chbDefekt.setText("lehet defekt");
        chbDefekt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chbDefektActionPerformed(evt);
            }
        });

        btnMegy.setText("megy");
        btnMegy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMegyActionPerformed(evt);
            }
        });

        btnTankol1.setText("tankol");
        btnTankol1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTankol1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlGarazsLayout = new javax.swing.GroupLayout(pnlGarazs);
        pnlGarazs.setLayout(pnlGarazsLayout);
        pnlGarazsLayout.setHorizontalGroup(
            pnlGarazsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlGarazsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlGarazsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chbDefekt)
                    .addComponent(jLabel4)
                    .addComponent(cmbAutok, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlGarazsLayout.createSequentialGroup()
                        .addComponent(btnMegy, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addComponent(btnTankol1))
                    .addComponent(sldEsely, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pnlGarazsLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnMegy, btnTankol1});

        pnlGarazsLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {cmbAutok, sldEsely});

        pnlGarazsLayout.setVerticalGroup(
            pnlGarazsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlGarazsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cmbAutok, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sldEsely, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chbDefekt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlGarazsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMegy)
                    .addComponent(btnTankol1))
                .addContainerGap(9, Short.MAX_VALUE))
        );

        jLabel1.setText("Kiválasztott autó állapota:");

        txaAllapot.setColumns(20);
        txaAllapot.setRows(5);
        jScrollPane1.setViewportView(txaAllapot);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(pnlUjAuto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(pnlGarazs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel1))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnlGarazs, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlUjAuto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(11, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void sldEselyMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sldEselyMouseEntered

    }//GEN-LAST:event_sldEselyMouseEntered

    private void btnResetUezemaDefektActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetUezemaDefektActionPerformed
        buttonGroup1.clearSelection();
    }//GEN-LAST:event_btnResetUezemaDefektActionPerformed

    private void btnGarazsbaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGarazsbaActionPerformed
        if (chbBeinditva.isSelected()) {
            JOptionPane.showMessageDialog(rootPane, "Az autót nem lehet a garázsba helyezni, mert be van indítva!");
        } else {
            szamlalo++ ;
            cmbAutok.addItem(szamlalo + ". Autó");
            cmbAutok.setSelectedIndex(1);
            JOptionPane.showMessageDialog(rootPane, "Autó hozzáadva!");
        }
        
        
        
    }//GEN-LAST:event_btnGarazsbaActionPerformed

    private void chbDefektActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chbDefektActionPerformed
        sldEsely.setEnabled(chbDefekt.isSelected());
        sldEsely.setValue(20);
    }//GEN-LAST:event_chbDefektActionPerformed

    private void sldEselyMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sldEselyMouseExited
        
    }//GEN-LAST:event_sldEselyMouseExited

    private void sldEselyMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sldEselyMouseReleased
       String s = "esély defektre:";
        s += sldEsely.getValue() + "%";
        jLabel4.setText(s);
    }//GEN-LAST:event_sldEselyMouseReleased

    private void btnMegyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMegyActionPerformed
        if (rdbUzema.isSelected()) {
            txaAllapot.setText("Van benne üzemanyag, és rendelkezik pótkerékkel!");
        }else if (rdbDefekt.isSelected()){
            txaAllapot.setText("A kocsi defektes, nem tud elindulni!");
        }
        
    }//GEN-LAST:event_btnMegyActionPerformed

    private void btnTankol1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTankol1ActionPerformed
        
        txaAllapot.setText("Az autót sikeresen megtankolta.");
    }//GEN-LAST:event_btnTankol1ActionPerformed

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
            java.util.logging.Logger.getLogger(GuiAutosProgram.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GuiAutosProgram.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GuiAutosProgram.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GuiAutosProgram.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GuiAutosProgram().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGarazsba;
    private javax.swing.JButton btnMegy;
    private javax.swing.JButton btnResetUezemaDefekt;
    private javax.swing.JButton btnTankol1;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JCheckBox chbBeinditva;
    private javax.swing.JCheckBox chbDefekt;
    private javax.swing.JComboBox<String> cmbAutok;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSpinner mumPotkerek;
    private javax.swing.JPanel pnlGarazs;
    private javax.swing.JPanel pnlUjAuto;
    private javax.swing.JRadioButton rdbDefekt;
    private javax.swing.JRadioButton rdbUzema;
    private javax.swing.JSlider sldEsely;
    private javax.swing.JTextArea txaAllapot;
    // End of variables declaration//GEN-END:variables
}
