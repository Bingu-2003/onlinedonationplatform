/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;
import controller.*;
import javax.swing.JOptionPane;
import java.sql.*;
import java.text.SimpleDateFormat;
import net.proteanit.sql.DbUtils;
import com.toedter.calendar.JDateChooser;
import model.*;



public class donorRegistration extends javax.swing.JFrame {

    
    public donorRegistration() {
        initComponents();
        loadNextDonorId();
        loadTable();
    }
    private void loadNextDonorId() {
        
        try {
            CdonorRegistration loadId = new CdonorRegistration ();
         int nextId = loadId.getNextDonorId();
        txtDonorId.setText(String.valueOf(nextId));
        
        } catch (Exception e) {
          JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());  
        }
        
}
     public void loadTable()
    {
    try{
         Connection conn = DBConnection.createDBConnection();
         String sql= "SELECT * FROM Donor";
          PreparedStatement pst = conn.prepareStatement(sql);
          ResultSet rs= pst.executeQuery();
   tableDonor.setModel(DbUtils.resultSetToTableModel(rs));
   
   tableDonor.getColumnModel().getColumn(0).setHeaderValue("Donor ID");
        tableDonor.getColumnModel().getColumn(1).setHeaderValue("Donor Name");
        tableDonor.getColumnModel().getColumn(2).setHeaderValue("Gender");
        tableDonor.getColumnModel().getColumn(3).setHeaderValue("Address");
        tableDonor.getColumnModel().getColumn(4).setHeaderValue("Email");
        tableDonor.getColumnModel().getColumn(5).setHeaderValue("Phone Number");

        
        tableDonor.getTableHeader().repaint();
    }
    catch(Exception e)
    {
    JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());}
   
    
    
    }
    public void tableData()
    {
        int r=tableDonor.getSelectedRow();
        
        String donor_id =tableDonor.getValueAt(r, 0).toString();
        String donor_name =tableDonor.getValueAt(r, 1).toString();
        String gender=tableDonor.getValueAt(r, 2).toString();
        String address =tableDonor.getValueAt(r, 3).toString();
        String email =tableDonor.getValueAt(r, 4).toString();
        String phone =tableDonor.getValueAt(r, 5).toString();
        
        
        txtDonorId.setText(donor_id);
        txtDonorName.setText(donor_name);
        txtAddress.setText(address);
        txtEmail.setText(email);
         txtPhoneNo.setText(phone);
         
         if (gender.equalsIgnoreCase("Male")) {
        rbtnMale.setSelected(true);
    } else if(gender.equalsIgnoreCase("Female")) {
        rbtnFemale.setSelected(true);
    }

    }
    public void clearForm()
    {
         txtDonorId.setText("");
    txtDonorName.setText("");
    txtAddress.setText("");
    txtEmail.setText("");
    txtPhoneNo.setText("");
    rbtnMale.setSelected(false);
    rbtnFemale.setSelected(false);
    
    }


  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
        buttonGroup6 = new javax.swing.ButtonGroup();
        buttonGroup7 = new javax.swing.ButtonGroup();
        buttonGroup8 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        llblcharityceylon = new javax.swing.JLabel();
        lblDonorId = new javax.swing.JLabel();
        lblGender = new javax.swing.JLabel();
        lblemail = new javax.swing.JLabel();
        lblphoneno = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtDonorId = new javax.swing.JTextField();
        btnUpdate = new javax.swing.JButton();
        DonorRegistration = new javax.swing.JLabel();
        lblAddress = new javax.swing.JLabel();
        rbtnFemale = new javax.swing.JRadioButton();
        rbtnMale = new javax.swing.JRadioButton();
        btnback = new javax.swing.JButton();
        txtPhoneNo = new javax.swing.JTextField();
        txtDonorName = new javax.swing.JTextField();
        lblDonorName = new javax.swing.JLabel();
        btnRegister = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableDonor = new javax.swing.JTable();
        btnDelete = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("DONOR REGISTRATION");
        setSize(new java.awt.Dimension(800, 600));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(java.awt.SystemColor.activeCaption);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        llblcharityceylon.setBackground(new java.awt.Color(0, 51, 102));
        llblcharityceylon.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        llblcharityceylon.setForeground(new java.awt.Color(0, 51, 102));
        llblcharityceylon.setText("CharityCeylon");
        jPanel1.add(llblcharityceylon, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 10, 150, 40));

        lblDonorId.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        lblDonorId.setText("Donor  Id");
        jPanel1.add(lblDonorId, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 90, 20));

        lblGender.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        lblGender.setText("Gender");
        jPanel1.add(lblGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 100, 30));

        lblemail.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        lblemail.setText("Email");
        jPanel1.add(lblemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 200, 70, 20));

        lblphoneno.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        lblphoneno.setText("Phone Number");
        jPanel1.add(lblphoneno, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 280, 130, -1));

        txtAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAddressActionPerformed(evt);
            }
        });
        jPanel1.add(txtAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 140, 270, 40));

        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });
        jPanel1.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 220, 270, 30));

        txtDonorId.setEditable(false);
        txtDonorId.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtDonorId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDonorIdActionPerformed(evt);
            }
        });
        jPanel1.add(txtDonorId, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 130, 30));

        btnUpdate.setBackground(new java.awt.Color(0, 51, 102));
        btnUpdate.setFont(new java.awt.Font("Verdana Pro Semibold", 1, 12)); // NOI18N
        btnUpdate.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        jPanel1.add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 350, 90, 30));

        DonorRegistration.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        DonorRegistration.setText("Donor Registration Form");
        jPanel1.add(DonorRegistration, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 40, 270, 40));

        lblAddress.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        lblAddress.setText("Address");
        jPanel1.add(lblAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 120, 70, 20));

        buttonGroup1.add(rbtnFemale);
        rbtnFemale.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        rbtnFemale.setText("Female");
        rbtnFemale.setActionCommand("");
        jPanel1.add(rbtnFemale, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 300, 100, 40));

        buttonGroup1.add(rbtnMale);
        rbtnMale.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        rbtnMale.setText("Male");
        rbtnMale.setActionCommand("");
        jPanel1.add(rbtnMale, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 80, -1));

        btnback.setBackground(new java.awt.Color(204, 204, 204));
        btnback.setFont(new java.awt.Font("Yu Gothic Medium", 1, 12)); // NOI18N
        btnback.setForeground(new java.awt.Color(0, 51, 102));
        btnback.setText("Back");
        btnback.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        btnback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbackActionPerformed(evt);
            }
        });
        jPanel1.add(btnback, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 550, 70, 30));

        txtPhoneNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPhoneNoActionPerformed(evt);
            }
        });
        jPanel1.add(txtPhoneNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 300, 270, 30));
        jPanel1.add(txtDonorName, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 270, 30));

        lblDonorName.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        lblDonorName.setText("Name");
        jPanel1.add(lblDonorName, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 70, 20));

        btnRegister.setBackground(new java.awt.Color(0, 51, 102));
        btnRegister.setFont(new java.awt.Font("Verdana Pro Semibold", 1, 12)); // NOI18N
        btnRegister.setForeground(new java.awt.Color(255, 255, 255));
        btnRegister.setText("Register");
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 350, 90, 30));

        btnReset.setBackground(new java.awt.Color(0, 51, 102));
        btnReset.setFont(new java.awt.Font("Verdana Pro Semibold", 1, 12)); // NOI18N
        btnReset.setForeground(new java.awt.Color(255, 255, 255));
        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });
        jPanel1.add(btnReset, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 350, 90, 30));

        tableDonor.setBackground(java.awt.SystemColor.activeCaption);
        tableDonor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6"
            }
        ));
        tableDonor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableDonorMouseClicked(evt);
            }
        });
        tableDonor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tableDonorKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tableDonor);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 390, 800, 150));

        btnDelete.setBackground(new java.awt.Color(0, 51, 102));
        btnDelete.setFont(new java.awt.Font("Verdana Pro Semibold", 1, 12)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(255, 255, 255));
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        jPanel1.add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 350, 90, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/1000033490.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 0, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void txtAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAddressActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
    
   String donor_id = txtDonorId.getText(); 
    String donor_name = txtDonorName.getText();
  
    String gender = ""; 
         if (rbtnMale.isSelected()) {
             gender = "Male";
         } else if (rbtnFemale.isSelected()) {
            gender = "Female";
         } 
   
    String address = txtAddress.getText();
    String email= txtEmail.getText();
    String phone= txtPhoneNo.getText();

        try {
            CdonorRegistration update = new CdonorRegistration ();
            update.updateDonor(donor_id, donor_name,gender,address,email,phone);
            JOptionPane.showMessageDialog(this, "Donor details updated successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "An error occurred: " + e.getMessage(), "Update Error", JOptionPane.ERROR_MESSAGE);
        }


      loadTable();  
     


   
    
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbackActionPerformed
         Dashboard home= new Dashboard();
        home.setVisible(true);
        this.dispose();
         
    }//GEN-LAST:event_btnbackActionPerformed

    private void txtPhoneNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPhoneNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPhoneNoActionPerformed

    private void txtDonorIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDonorIdActionPerformed
     

    }//GEN-LAST:event_txtDonorIdActionPerformed

    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
        int donor_id;
    
        donor_id = Integer.parseInt(txtDonorId.getText());
   

    String donor_name = txtDonorName.getText();
    if (donor_name.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Donor name cannot be empty.");
        return;
    }

    String gender = rbtnMale.isSelected() ? "Male" : (rbtnFemale.isSelected() ? "Female" : "");
    if (gender.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Please select a gender.");
        return;
    }

    String address = txtAddress.getText();
    if (address.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Address cannot be empty.");
        return;
    }

    String email = txtEmail.getText();
    if (!email.matches("^[\\w.%+-]+@[\\w.-]+\\.[a-zA-Z]{2,}$")) {
        JOptionPane.showMessageDialog(null, "Please enter a valid email address.");
        return;
    }

    String phone = txtPhoneNo.getText();
    if (!phone.matches("\\d{10}")) { 
        JOptionPane.showMessageDialog(null, "Please enter a valid 10-digit phone number.");
        return;
    }

      try {
               
              CdonorRegistration regD = new CdonorRegistration (); 
            regD.registerDonor(donor_id,donor_name,gender,address,email,phone);  
            JOptionPane.showMessageDialog(this, "Donor Registered successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);

                 clearForm();
        }
        catch (Exception e) 
        {
            JOptionPane.showMessageDialog(this, "An error occurred: " + e.getMessage(), "Register Error", JOptionPane.ERROR_MESSAGE);
        }
             
    clearForm();
    loadNextDonorId();
    
   
    txtDonorName.requestFocus();
   loadTable();
                   
                 
                
           
        
    }//GEN-LAST:event_btnRegisterActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
     clearForm();  
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
      int check = JOptionPane.showConfirmDialog(null, "Are you sure do you want to delete? ");
       
       if(check== 0){
           
           
           String donor_id= txtDonorId.getText();
           try {
               
               CdonorRegistration deleteD = new CdonorRegistration();
            deleteD.deleteDonor(donor_id);  
            JOptionPane.showMessageDialog(this, "Donor deleted successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);

                 clearForm();
        }
        catch (Exception e) 
        {
            JOptionPane.showMessageDialog(this, "An error occurred: " + e.getMessage(), "Delete Error", JOptionPane.ERROR_MESSAGE);
        }

               
         
       
       }loadTable();
       
       
                                           
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void tableDonorKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tableDonorKeyReleased
     tableData();
    }//GEN-LAST:event_tableDonorKeyReleased

    private void tableDonorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableDonorMouseClicked
       tableData();
    }//GEN-LAST:event_tableDonorMouseClicked

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
            java.util.logging.Logger.getLogger(donorRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(donorRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(donorRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(donorRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new donorRegistration().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel DonorRegistration;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnRegister;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btnback;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.ButtonGroup buttonGroup6;
    private javax.swing.ButtonGroup buttonGroup7;
    private javax.swing.ButtonGroup buttonGroup8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblDonorId;
    private javax.swing.JLabel lblDonorName;
    private javax.swing.JLabel lblGender;
    private javax.swing.JLabel lblemail;
    private javax.swing.JLabel lblphoneno;
    private javax.swing.JLabel llblcharityceylon;
    private javax.swing.JRadioButton rbtnFemale;
    private javax.swing.JRadioButton rbtnMale;
    private javax.swing.JTable tableDonor;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtDonorId;
    private javax.swing.JTextField txtDonorName;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtPhoneNo;
    // End of variables declaration//GEN-END:variables
}
