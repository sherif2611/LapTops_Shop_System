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
 * @author Sherif Ibrahim
 */
public class HP_fram extends javax.swing.JFrame {
    /**
     * Creates new form HP_fram
     */
    static Connection con;
    static String hostuser = "root";
    static String hostpass = "root";  
    static String add = "jdbc:mysql://localhost:3306/lapshop";
    user_Login ob = new user_Login();
    boolean is_avalap1 = false;
    boolean is_avalap2 = false;
    int hpprice1 , hpprice2;
    
    int counterlaps1 = 0,numberoflapsishere1 = 0;
    int counterlaps2 = 0,numberoflapsishere2 = 0;
    int totalprice = 0,totallaps = 0;
    public HP_fram() {
        initComponents();
         //boolean statu = save1.isSelected(); 
         //JOptionPane.showMessageDialog(this, statu);
        //save1.setSelected(true);  
        this.setLocationRelativeTo(null);
        String text="<html>";
        text+="2021 Newest HP 17.3 inch FHD Laptop,<br>";
        text+="AMD Ryzen 5 5500U 6- core(Beat i7-1160G7,<br>";
        text+="up to 4.0GHz),16GB RAM, 1TB PCIe SSD,<br>";
        text+=", Bluetooth 4.2, WiFi,HDMI, USB-A&C, Windows 10 S<br>";
        text+="w/Ghost Manta Accessories<br>";
        lab1.setText(text);
        String text2="<html>";
        text2+="HP Pavilion 15 Laptop, 12th Generation<br>";
        text2+="Intel Core i7-1255U Processor,<br>";
        text2+="16 GB RAM, 512 GB SSD, 15.6<br>";
        text2+="Full HD Display, Windows 11 Pro,<br>";
        text2+="Fingerprint Reader,<br>";
        text2+="Wi-Fi & Bluetooth, HD Webcam (15-eg2025nr 2022)<br>";
        lab2.setText(text2); 
       
        try {
            con = DriverManager.getConnection(add,hostuser, hostpass);
            PreparedStatement stmt_for_check_user = con.prepareStatement("select *from laptops");
            ResultSet res = stmt_for_check_user.executeQuery();
            while(res.next()){
                if(res.getInt(1) == 1){
                    is_avalap1 = res.getInt(4) > 0;
                    hpprice1 = res.getInt(3);
                    numberoflapsishere1 = res.getInt(4);
                    counterlaps1 = res.getInt(5);
                }
                if(res.getInt(1) == 2){
                    is_avalap2 = res.getInt(4) > 0;
                    hpprice2 = res.getInt(3);
                    numberoflapsishere2 = res.getInt(4);
                    counterlaps2 = res.getInt(5);
                }
            }
            
            stmt_for_check_user = con.prepareStatement("select *from operation_table");
            res = stmt_for_check_user.executeQuery();
            while(res.next()){
                if(res.getInt(3) == 1 && res.getBoolean(5) == true && res.getString(2).equals(ob.username)){
                    save1.setSelected(true);
                }
                if(res.getInt(3) == 2 && res.getBoolean(5) == true && res.getString(2).equals(ob.username)){
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
        if(is_avalap1 == true)avalap1.setText("Available");
        else{
             avalap1.setText("Not Available");
             avalap1.setForeground(Color.red);
        }
        if(is_avalap2 == true)avalap2.setText("Available");
        else {
            avalap2.setText("Not Available");
            avalap2.setForeground(Color.red);
        }
        Price1.setText("Price : " + hpprice1 + " $");
        Price2.setText("Price : " + hpprice2 + " $");
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
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
        Next = new javax.swing.JButton();
        Back1 = new javax.swing.JButton();
        avalap1 = new javax.swing.JLabel();
        avalap2 = new javax.swing.JLabel();
        Price1 = new javax.swing.JLabel();
        Price2 = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(101, 153, 255));

        lab.setFont(new java.awt.Font("Segoe UI", 1, 40)); // NOI18N
        lab.setForeground(new java.awt.Color(255, 255, 255));
        lab.setText("HP");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(575, 575, 575)
                .addComponent(lab, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lab)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/computer_shop/imgs/hp1.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/computer_shop/imgs/hp2.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");

        lab2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lab2.setForeground(new java.awt.Color(101, 153, 255));

        lab1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lab1.setForeground(new java.awt.Color(101, 153, 255));

        save1.setBackground(new java.awt.Color(255, 255, 255));
        save1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        save1.setForeground(new java.awt.Color(101, 153, 255));
        save1.setText("Save");
        save1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                save1MouseClicked(evt);
            }
        });
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

        Next.setBackground(new java.awt.Color(101, 153, 255));
        Next.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Next.setText("Next");
        Next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NextActionPerformed(evt);
            }
        });

        Back1.setBackground(new java.awt.Color(101, 153, 255));
        Back1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Back1.setText("Back");
        Back1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Back1ActionPerformed(evt);
            }
        });

        avalap1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        avalap1.setForeground(new java.awt.Color(0, 204, 0));
        avalap1.setText("Available");

        avalap2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        avalap2.setForeground(new java.awt.Color(51, 204, 0));
        avalap2.setText("Available");

        Price1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Price1.setText("Price :");

        Price2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Price2.setText("Price :");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Price1, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(avalap1, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(Buy1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(55, 55, 55)
                                .addComponent(save1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lab1, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(Back1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 372, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(Next, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(avalap2, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lab2, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(Buy2, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(55, 55, 55)
                                .addComponent(save2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(Price2, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Price1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Price2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(avalap1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(avalap2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lab1, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)
                    .addComponent(lab2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(49, 49, 49)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Buy1)
                    .addComponent(save1)
                    .addComponent(Buy2)
                    .addComponent(save2))
                .addGap(70, 70, 70)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Back1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Next, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Back1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Back1ActionPerformed
        this.setVisible(false);
        new Products().setVisible(true);
    }//GEN-LAST:event_Back1ActionPerformed

    private void NextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NextActionPerformed
        this.setVisible(false);
        new HP_frame2().setVisible(true);
    }//GEN-LAST:event_NextActionPerformed

    private void Buy1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Buy1ActionPerformed
        if(is_avalap1){
            try {
                con = DriverManager.getConnection(add,hostuser, hostpass);
                PreparedStatement stmt_for_check_user =
                 con.prepareStatement("insert into operation_table (user_name , lap_id , price , bought , saved) values(?,?,?,?,?)");
                stmt_for_check_user.setString(1, ob.username);
                stmt_for_check_user.setInt(2, 1);
                stmt_for_check_user.setInt(3, hpprice1);
                stmt_for_check_user.setInt(4, 1);
                stmt_for_check_user.setInt(5, 0);
                stmt_for_check_user.executeUpdate();
                JOptionPane.showMessageDialog(this, "Success , the cost is " + hpprice1);
                String Quere = "update laptops set lap_counter = ? , saledcnt = ?  where lap_id = ?";
                stmt_for_check_user = con.prepareStatement(Quere);
                stmt_for_check_user.setInt(1,numberoflapsishere1 - 1);
                stmt_for_check_user.setInt(2,counterlaps1 + 1);
                stmt_for_check_user.setInt(3, 1);
                stmt_for_check_user.executeUpdate();
                Quere = "update usertable set total = ? , lapcnt = ?  where username = ?";
                stmt_for_check_user = con.prepareStatement(Quere);
                stmt_for_check_user.setInt(1,totalprice + hpprice1);
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
    private void save1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_save1ActionPerformed
        boolean statu = save1.isSelected(); 
        try {
            con = DriverManager.getConnection(add,hostuser, hostpass);
            PreparedStatement stmt_for_check_user = con.prepareStatement("select *from operation_table");
            ResultSet res = stmt_for_check_user.executeQuery();
            int theopraion = 0 ;
            while(res.next()){
                 if(res.getInt(3) == 1 && res.getString(2).equals(ob.username)){
                    theopraion = res.getInt(1);
                    break;
                }
            }
            if(theopraion == 0){ // insert
                stmt_for_check_user = con.prepareStatement("insert into operation_table (user_name,lap_id,price,bought,saved) values(?,?,?,?,?)");
                stmt_for_check_user.setString(1, ob.username);
                stmt_for_check_user.setInt(2, 1);
                stmt_for_check_user.setInt(3, hpprice1);
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

    private void save1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_save1MouseClicked
    }//GEN-LAST:event_save1MouseClicked

    private void save2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_save2ActionPerformed
        boolean statu = save2.isSelected(); 
        try {
            con = DriverManager.getConnection(add,hostuser, hostpass);
            PreparedStatement stmt_for_check_user = con.prepareStatement("select *from operation_table");
            ResultSet res = stmt_for_check_user.executeQuery();
            int theopraion = 0 ;
            while(res.next()){
                 if(res.getInt(3) == 2 && res.getString(2).equals(ob.username)){
                    theopraion = res.getInt(1);
                    break;
                }
            }
            if(theopraion == 0){ // insert
                stmt_for_check_user = con.prepareStatement("insert into operation_table (user_name,lap_id,price,bought,saved) values(?,?,?,?,?)");
                stmt_for_check_user.setString(1, ob.username);
                stmt_for_check_user.setInt(2, 2);
                stmt_for_check_user.setInt(3, hpprice2);
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
    private void Buy2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Buy2ActionPerformed
        if(is_avalap2){
            try {
                con = DriverManager.getConnection(add,hostuser, hostpass);
                PreparedStatement stmt_for_check_user =
                    con.prepareStatement("insert into operation_table (user_name , lap_id , price , bought , saved) values(?,?,?,?,?)");
                stmt_for_check_user.setString(1, ob.username);
                stmt_for_check_user.setInt(2, 2);
                stmt_for_check_user.setInt(3, hpprice2);
                stmt_for_check_user.setInt(4, 1);
                stmt_for_check_user.setInt(5, 0);
                stmt_for_check_user.executeUpdate();
                JOptionPane.showMessageDialog(this, "Success , the cost is " + hpprice2);
                String Quere = "update laptops set lap_counter = ? , saledcnt = ?  where lap_id = ?";
                stmt_for_check_user = con.prepareStatement(Quere);
                stmt_for_check_user.setInt(1,numberoflapsishere2 - 1);
                stmt_for_check_user.setInt(2,counterlaps2 + 1);
                stmt_for_check_user.setInt(3, 2);
                stmt_for_check_user.executeUpdate();
                Quere = "update usertable set total = ? , lapcnt = ?  where username = ?";
                stmt_for_check_user = con.prepareStatement(Quere);
                stmt_for_check_user.setInt(1,totalprice + hpprice2);
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
            java.util.logging.Logger.getLogger(HP_fram.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HP_fram.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HP_fram.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HP_fram.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HP_fram().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back1;
    private javax.swing.JButton Buy1;
    private javax.swing.JButton Buy2;
    private javax.swing.JButton Next;
    private javax.swing.JLabel Price1;
    private javax.swing.JLabel Price2;
    private javax.swing.JLabel avalap1;
    private javax.swing.JLabel avalap2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lab;
    private javax.swing.JLabel lab1;
    private javax.swing.JLabel lab2;
    private javax.swing.JCheckBox save1;
    private javax.swing.JCheckBox save2;
    // End of variables declaration//GEN-END:variables
}
