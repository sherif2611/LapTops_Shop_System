/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package computer_shop;
import java.awt.Color;
import java.util.ArrayList;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author ahmed hany
 */
public class Mac2 extends javax.swing.JFrame {

    /**
     * Creates new form Mac2
     */
    static Connection con;
    static String hostuser = "root";
    static String hostpass = "root";  
    static String add = "jdbc:mysql://localhost:3306/lapshop";
    user_Login ob = new user_Login();
    boolean is_avalap1 = false;
    boolean is_avalap2 = false;
    int macprice1 , macprice2;
    
    int counterlaps1 = 0,numberoflapsishere1 = 0;
    int counterlaps2 = 0,numberoflapsishere2 = 0;
    int totalprice = 0,totallaps = 0;
    public Mac2() {
        initComponents();
            this.setLocationRelativeTo(null);
        String text="<html>";
        text+="Apple MacBook Pro<br>" +
        "MD101LL/A - 13.3-inch Laptop -<br>" +
        "Intel Core i5 2.5GHz, 4GB RAM,<br>" +
        "128GB HDD<br>";
        lab1.setText(text); 
        String text2="<html>";
        text2+="2020 Apple MacBook Air<br>" +
        "Laptop: Apple M1 Chip, 13” Retina<br>" +
        "Display, 8GB RAM,<br>" +
        "256GB SSD Storage, Backlit<br>" +
        "Keyboard, FaceTime HD Camera,<br>" +
        "Touch ID. Works with iPhone/iPad; Space<br>" +
        "Gray<br>";
        lab2.setText(text2);
        try {
            con = DriverManager.getConnection(add,hostuser, hostpass);
            PreparedStatement stmt_for_check_user = con.prepareStatement("select *from laptops");
            ResultSet res = stmt_for_check_user.executeQuery();
            while(res.next()){
                if(res.getInt(1) == 11){
                    is_avalap1 = res.getInt(4) > 0;
                    macprice1 = res.getInt(3);
                    numberoflapsishere1 = res.getInt(4);
                    counterlaps1 = res.getInt(5);
                }
                if(res.getInt(1) == 12){
                    is_avalap2 = res.getInt(4) > 0;
                    macprice2 = res.getInt(3);
                    numberoflapsishere2 = res.getInt(4);
                    counterlaps2 = res.getInt(5);
                }
            }
            stmt_for_check_user = con.prepareStatement("select *from operation_table");
            res = stmt_for_check_user.executeQuery();
            while(res.next()){
                if(res.getInt(3) == 11 && res.getBoolean(5) == true && res.getString(2).equals(ob.username)){
                    save1.setSelected(true);  
                }
                if(res.getInt(3) == 12 && res.getBoolean(5) == true && res.getString(2).equals(ob.username)){
                    save2.setSelected(true);  
                }
            }
            stmt_for_check_user = con.prepareStatement("select *from usertable");
            res = stmt_for_check_user.executeQuery();
            while(res.next()){
                if(ob.username .equals(res.getString(1))){
                    totalprice = res.getInt(6);
                    totallaps = res.getInt(7);
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(User_account.class.getName()).log(Level.SEVERE, null, ex);
        }
        if(is_avalap1 == true)avalab1.setText("Available");
        else{
             avalab1.setText("Not Available");
             avalab1.setForeground(Color.red);
        }
        if(is_avalap2 == true)avalab2.setText("Available");
        else {
            avalab2.setText("Not Available");
            avalab2.setForeground(Color.red);
        }
        Price1.setText("Price " + macprice1 + " $");
        Price2.setText("Price " + macprice2 + " $");
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
        jPanel1 = new javax.swing.JPanel();
        lab = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lab2 = new javax.swing.JLabel();
        lab1 = new javax.swing.JLabel();
        save1 = new javax.swing.JCheckBox();
        Buy1 = new javax.swing.JButton();
        Buy2 = new javax.swing.JButton();
        save2 = new javax.swing.JCheckBox();
        Back1 = new javax.swing.JButton();
        avalab1 = new javax.swing.JLabel();
        Price1 = new javax.swing.JLabel();
        avalab2 = new javax.swing.JLabel();
        Price2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(101, 153, 255));

        lab.setFont(new java.awt.Font("Segoe UI", 1, 40)); // NOI18N
        lab.setForeground(new java.awt.Color(255, 255, 255));
        lab.setText("MAC");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(563, 563, 563)
                .addComponent(lab, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(564, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lab)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/mac3.png"))); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/mac4.png"))); // NOI18N

        lab2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lab2.setForeground(new java.awt.Color(101, 153, 255));

        lab1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lab1.setForeground(new java.awt.Color(101, 153, 255));

        save1.setBackground(new java.awt.Color(255, 255, 255));
        save1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        save1.setForeground(new java.awt.Color(101, 153, 255));
        save1.setText("Save");
        save1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                save1ActionPerformed(evt);
            }
        });

        Buy1.setBackground(new java.awt.Color(101, 153, 255));
        Buy1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Buy1.setForeground(new java.awt.Color(255, 255, 255));
        Buy1.setText("Buy");
        Buy1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Buy1ActionPerformed(evt);
            }
        });

        Buy2.setBackground(new java.awt.Color(101, 153, 255));
        Buy2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Buy2.setForeground(new java.awt.Color(255, 255, 255));
        Buy2.setText("Buy");
        Buy2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Buy2ActionPerformed(evt);
            }
        });

        save2.setBackground(new java.awt.Color(255, 255, 255));
        save2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        save2.setForeground(new java.awt.Color(101, 153, 255));
        save2.setText("Save");
        save2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                save2ActionPerformed(evt);
            }
        });

        Back1.setBackground(new java.awt.Color(101, 153, 255));
        Back1.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        Back1.setText("Back");
        Back1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Back1ActionPerformed(evt);
            }
        });

        avalab1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        avalab1.setForeground(new java.awt.Color(0, 204, 0));
        avalab1.setText("Available");

        Price1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Price1.setText("Price : ");

        avalab2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        avalab2.setForeground(new java.awt.Color(0, 204, 0));
        avalab2.setText("Available");

        Price2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Price2.setText("Price : ");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(Buy1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(55, 55, 55)
                            .addComponent(save1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(avalab1, javax.swing.GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE)
                                .addComponent(Price1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(lab1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(Back1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(379, 379, 379)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(Price2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                            .addComponent(Buy2, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(55, 55, 55)
                            .addComponent(save2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(avalab2, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lab2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(53, 53, 53))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Price1)
                    .addComponent(Price2))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(avalab1)
                    .addComponent(avalab2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lab1, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)
                    .addComponent(lab2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(49, 49, 49)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Buy1)
                    .addComponent(save1)
                    .addComponent(Buy2)
                    .addComponent(save2))
                .addGap(69, 69, 69)
                .addComponent(Back1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Back1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Back1ActionPerformed
        this.setVisible(false);
        new Mac1().setVisible(true);
    }//GEN-LAST:event_Back1ActionPerformed

    private void save1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_save1ActionPerformed
        boolean statu = save1.isSelected(); 
        try {
            con = DriverManager.getConnection(add,hostuser, hostpass);
            PreparedStatement stmt_for_check_user = con.prepareStatement("select *from operation_table");
            ResultSet res = stmt_for_check_user.executeQuery();
            int theopraion = 0 ;
            while(res.next()){
                 if(res.getInt(3) == 11 && res.getString(2).equals(ob.username)){
                    theopraion = res.getInt(1);
                    break;
                }
            }
            if(theopraion == 0){ // insert
                stmt_for_check_user = con.prepareStatement("insert into operation_table (user_name,lap_id,price,bought,saved) values(?,?,?,?,?)");
                stmt_for_check_user.setString(1, ob.username);
                stmt_for_check_user.setInt(2, 11);
                stmt_for_check_user.setInt(3, macprice1);
                stmt_for_check_user.setBoolean(4, false);
                stmt_for_check_user.setBoolean(5, true);
                stmt_for_check_user.executeUpdate();
                save1.setSelected(true);
            }
            else { // update
                    String Quere = "update operation_table set saved = ? where operation = ?" ;
                    stmt_for_check_user = con.prepareStatement(Quere);
                    stmt_for_check_user.setBoolean(1, statu);
                    stmt_for_check_user.setInt(2, theopraion);
                    stmt_for_check_user.executeUpdate();
                    save1.setSelected(statu);
            }
        } catch (SQLException ex) {
            Logger.getLogger(User_account.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_save1ActionPerformed

    private void save2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_save2ActionPerformed
        boolean statu = save2.isSelected(); 
        try {
            con = DriverManager.getConnection(add,hostuser, hostpass);
            PreparedStatement stmt_for_check_user = con.prepareStatement("select *from operation_table");
            ResultSet res = stmt_for_check_user.executeQuery();
            int theopraion = 0 ;
            while(res.next()){
                 if(res.getInt(3) == 10 && res.getString(2).equals(ob.username)){
                    theopraion = res.getInt(1);
                    break;
                }
            }
            if(theopraion == 0){ // insert
                stmt_for_check_user = con.prepareStatement("insert into operation_table (user_name,lap_id,price,bought,saved) values(?,?,?,?,?)");
                stmt_for_check_user.setString(1, ob.username);
                stmt_for_check_user.setInt(2, 12);
                stmt_for_check_user.setInt(3, macprice2);
                stmt_for_check_user.setBoolean(4, false);
                stmt_for_check_user.setBoolean(5, true);
                stmt_for_check_user.executeUpdate();
                save2.setSelected(true);
            }
            else { // update
                    String Quere = "update operation_table set saved = ? where operation = ?" ;
                    stmt_for_check_user = con.prepareStatement(Quere);
                    stmt_for_check_user.setBoolean(1, statu);
                    stmt_for_check_user.setInt(2, theopraion);
                    stmt_for_check_user.executeUpdate();
                    save2.setSelected(statu);
            }
        } catch (SQLException ex) {
            Logger.getLogger(User_account.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_save2ActionPerformed

    private void Buy1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Buy1ActionPerformed
        if(is_avalap1){
            try {
                con = DriverManager.getConnection(add,hostuser, hostpass);
                PreparedStatement stmt_for_check_user =
                    con.prepareStatement("insert into operation_table (user_name , lap_id , price , bought , saved) values(?,?,?,?,?)");
                stmt_for_check_user.setString(1, ob.username);
                stmt_for_check_user.setInt(2, 11);
                stmt_for_check_user.setInt(3, macprice1);
                stmt_for_check_user.setInt(4, 1);
                stmt_for_check_user.setInt(5, 0);
                stmt_for_check_user.executeUpdate();
                JOptionPane.showMessageDialog(this, "Success , the cost is " + macprice1);
                String Quere = "update laptops set lap_counter = ? , saledcnt = ?  where lap_id = ?";
                stmt_for_check_user = con.prepareStatement(Quere);
                stmt_for_check_user.setInt(1,numberoflapsishere1 - 1);
                stmt_for_check_user.setInt(2,counterlaps1 + 1);
                stmt_for_check_user.setInt(3, 11);
                stmt_for_check_user.executeUpdate();
                Quere = "update usertable set total = ? , lapcnt = ?  where username = ?";
                stmt_for_check_user = con.prepareStatement(Quere);
                stmt_for_check_user.setInt(1,totalprice + macprice1);
                stmt_for_check_user.setInt(2,counterlaps1 + 1);
                stmt_for_check_user.setString(3, ob.username);
                stmt_for_check_user.executeUpdate();
                this.setVisible(false);
                new Products().setVisible(true);
            }
            catch (SQLException ex) {
                Logger.getLogger(User_account.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else {
            JOptionPane.showMessageDialog(this,"Sorry this laptop is Not avalible");
        }
    }//GEN-LAST:event_Buy1ActionPerformed

    private void Buy2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Buy2ActionPerformed
        if(is_avalap2){
        try {
                con = DriverManager.getConnection(add,hostuser, hostpass);
                PreparedStatement stmt_for_check_user =
                    con.prepareStatement("insert into operation_table (user_name , lap_id , price , bought , saved) values(?,?,?,?,?)");
                stmt_for_check_user.setString(1, ob.username);
                stmt_for_check_user.setInt(2, 12);
                stmt_for_check_user.setInt(3, macprice2);
                stmt_for_check_user.setInt(4, 1);
                stmt_for_check_user.setInt(5, 0);
                stmt_for_check_user.executeUpdate();
                JOptionPane.showMessageDialog(this, "Success , the cost is " + macprice2);
                String Quere = "update laptops set lap_counter = ? , saledcnt = ?  where lap_id = ?";
                stmt_for_check_user = con.prepareStatement(Quere);
                stmt_for_check_user.setInt(1,numberoflapsishere2 - 1);
                stmt_for_check_user.setInt(2,counterlaps2 + 1);
                stmt_for_check_user.setInt(3, 12);
                stmt_for_check_user.executeUpdate();
                Quere = "update usertable set total = ? , lapcnt = ?  where username = ?";
                stmt_for_check_user = con.prepareStatement(Quere);
                stmt_for_check_user.setInt(1,totalprice + macprice2);
                stmt_for_check_user.setInt(2,counterlaps1 + 1);
                stmt_for_check_user.setString(3, ob.username);
                stmt_for_check_user.executeUpdate();
                this.setVisible(false);
                new Products().setVisible(true);
            }
            catch (SQLException ex) {
                Logger.getLogger(User_account.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_Buy2ActionPerformed

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
            java.util.logging.Logger.getLogger(Mac2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Mac2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Mac2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Mac2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Mac2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back1;
    private javax.swing.JButton Buy1;
    private javax.swing.JButton Buy2;
    private javax.swing.JLabel Price1;
    private javax.swing.JLabel Price2;
    private javax.swing.JLabel avalab1;
    private javax.swing.JLabel avalab2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lab;
    private javax.swing.JLabel lab1;
    private javax.swing.JLabel lab2;
    private javax.swing.JCheckBox save1;
    private javax.swing.JCheckBox save2;
    // End of variables declaration//GEN-END:variables
}
