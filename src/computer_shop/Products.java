/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package computer_shop;

/**
 *
 * @author ahmed hany
 */
public class Products extends javax.swing.JFrame {

    /**
     * Creates new form Products
     */
    public Products() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Hp = new javax.swing.JButton();
        Lenovo = new javax.swing.JButton();
        Mac = new javax.swing.JButton();
        Lg = new javax.swing.JButton();
        Dell = new javax.swing.JButton();
        Samsung = new javax.swing.JButton();
        Back_button = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/computer_shop/imgs/LapShopImg.jpeg"))); // NOI18N
        jLabel1.setText("jLabel1");

        Hp.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Hp.setText("HP");
        Hp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HpActionPerformed(evt);
            }
        });

        Lenovo.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Lenovo.setText("Lenovo");
        Lenovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LenovoActionPerformed(evt);
            }
        });

        Mac.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Mac.setText("Mac");
        Mac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MacActionPerformed(evt);
            }
        });

        Lg.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Lg.setText("LG");
        Lg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LgActionPerformed(evt);
            }
        });

        Dell.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Dell.setText("Dell");
        Dell.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DellActionPerformed(evt);
            }
        });

        Samsung.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Samsung.setText("Samsung");
        Samsung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SamsungActionPerformed(evt);
            }
        });

        Back_button.setBackground(new java.awt.Color(101, 153, 255));
        Back_button.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Back_button.setForeground(new java.awt.Color(255, 255, 255));
        Back_button.setText("Back");
        Back_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Back_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(240, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 548, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(240, 240, 240))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(Back_button, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(Hp, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 132, Short.MAX_VALUE)
                                .addComponent(Dell, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(Lenovo, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Samsung, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(120, 120, 120)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Mac, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Lg, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(44, 44, 44))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Hp, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Mac, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Dell, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(71, 71, 71)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Lg, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Samsung, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Lenovo, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addComponent(Back_button)
                .addGap(16, 16, 16))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void Back_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Back_buttonActionPerformed
        this.setVisible(false);
        new User_account().setVisible(true);
    }//GEN-LAST:event_Back_buttonActionPerformed

    private void HpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HpActionPerformed
        this.setVisible(false);
        new HP_fram().setVisible(true);        
    }//GEN-LAST:event_HpActionPerformed

    private void LenovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LenovoActionPerformed
        this.setVisible(false);
        new Leno1().setVisible(true);        
    }//GEN-LAST:event_LenovoActionPerformed

    private void DellActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DellActionPerformed
        this.setVisible(false);
        new DEll1().setVisible(true);        
    }//GEN-LAST:event_DellActionPerformed

    private void MacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MacActionPerformed
        this.setVisible(false);
        new Mac1().setVisible(true);
    }//GEN-LAST:event_MacActionPerformed

    private void SamsungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SamsungActionPerformed
        this.setVisible(false);
        new Sam1().setVisible(true);

    }//GEN-LAST:event_SamsungActionPerformed

    private void LgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LgActionPerformed
        this.setVisible(false);
        new Lg1().setVisible(true);
    }//GEN-LAST:event_LgActionPerformed
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
            java.util.logging.Logger.getLogger(Products.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Products.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Products.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Products.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Products().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back_button;
    private javax.swing.JButton Dell;
    private javax.swing.JButton Hp;
    private javax.swing.JButton Lenovo;
    private javax.swing.JButton Lg;
    private javax.swing.JButton Mac;
    private javax.swing.JButton Samsung;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
