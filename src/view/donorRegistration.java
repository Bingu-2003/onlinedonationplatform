/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;
import controller.*;
import javax.swing.JOptionPane;
import java.sql.*;


public class donorRegistration extends javax.swing.JFrame {

    
    public donorRegistration() {
        initComponents();
        loadNextDonorId();
    }
    private void loadNextDonorId() {
    try {
        // Establish a connection to the database
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Donation", "root", "");

        // Query to find the highest DonorID
        String sql = "SELECT MAX(Donor_id) AS MaxID FROM Donor";
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(sql);

        // Default to 1 if no donor records exist
        int nextId = 1;
        if (rs.next()) {
            int maxId = rs.getInt("MaxID"); // Get the maximum DonorID
            nextId = maxId + 1; // Increment it to get the next available ID
        }

        // Set the next available DonorID in the txtDonorId text field
        txtDonorId.setText(String.valueOf(nextId));

        // Close the database resources
        rs.close();
        stmt.close();
        conn.close();
    } catch (SQLException ex) {
        ex.printStackTrace();
        JOptionPane.showMessageDialog(null, "Error fetching next Donor ID: " + ex.getMessage());
    }
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
        lblname = new javax.swing.JLabel();
        lblcountry = new javax.swing.JLabel();
        lblemail = new javax.swing.JLabel();
        lblphoneno = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtDonorId = new javax.swing.JTextField();
        btnReset = new javax.swing.JButton();
        picdonation = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblcountry1 = new javax.swing.JLabel();
        rbtnFemale = new javax.swing.JRadioButton();
        rbtnMale = new javax.swing.JRadioButton();
        btnback = new javax.swing.JButton();
        txtPhoneNo = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        lblname1 = new javax.swing.JLabel();
        btnRegister = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(java.awt.SystemColor.activeCaption);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        llblcharityceylon.setBackground(new java.awt.Color(0, 51, 102));
        llblcharityceylon.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        llblcharityceylon.setForeground(new java.awt.Color(0, 51, 102));
        llblcharityceylon.setText("CharityCeylon");
        jPanel1.add(llblcharityceylon, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 60, 150, 40));

        lblname.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        lblname.setText("Donor  Id");
        jPanel1.add(lblname, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 90, 20));

        lblcountry.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        lblcountry.setText("Gender");
        jPanel1.add(lblcountry, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 100, 30));

        lblemail.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        lblemail.setText("Email");
        jPanel1.add(lblemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 460, 70, 20));

        lblphoneno.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        lblphoneno.setText("Phone Number");
        jPanel1.add(lblphoneno, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 540, 130, 20));

        txtAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAddressActionPerformed(evt);
            }
        });
        jPanel1.add(txtAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, 270, 60));

        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });
        jPanel1.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 480, 270, 30));

        txtDonorId.setEditable(false);
        txtDonorId.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtDonorId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDonorIdActionPerformed(evt);
            }
        });
        jPanel1.add(txtDonorId, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 130, 30));

        btnReset.setBackground(new java.awt.Color(0, 51, 102));
        btnReset.setFont(new java.awt.Font("Verdana Pro Semibold", 1, 12)); // NOI18N
        btnReset.setForeground(new java.awt.Color(255, 255, 255));
        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });
        jPanel1.add(btnReset, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 560, 90, 30));

        picdonation.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/images (1).jpg"))); // NOI18N
        jPanel1.add(picdonation, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 0, 230, 180));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setText("Donor Registration Form");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 90, 270, 40));

        lblcountry1.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        lblcountry1.setText("Address");
        jPanel1.add(lblcountry1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, 70, 20));

        buttonGroup1.add(rbtnFemale);
        rbtnFemale.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        rbtnFemale.setText("Female");
        rbtnFemale.setActionCommand("");
        jPanel1.add(rbtnFemale, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 306, 100, 30));

        buttonGroup1.add(rbtnMale);
        rbtnMale.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        rbtnMale.setText("Male");
        rbtnMale.setActionCommand("");
        jPanel1.add(rbtnMale, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 80, -1));

        btnback.setBackground(new java.awt.Color(204, 204, 204));
        btnback.setFont(new java.awt.Font("Yu Gothic Medium", 0, 12)); // NOI18N
        btnback.setForeground(new java.awt.Color(0, 51, 102));
        btnback.setText("Back");
        btnback.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        btnback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbackActionPerformed(evt);
            }
        });
        jPanel1.add(btnback, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 560, 70, 30));

        txtPhoneNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPhoneNoActionPerformed(evt);
            }
        });
        jPanel1.add(txtPhoneNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 560, 270, 30));
        jPanel1.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 270, 30));

        lblname1.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        lblname1.setText("Name");
        jPanel1.add(lblname1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 70, 20));

        btnRegister.setBackground(new java.awt.Color(0, 51, 102));
        btnRegister.setFont(new java.awt.Font("Verdana Pro Semibold", 1, 12)); // NOI18N
        btnRegister.setForeground(new java.awt.Color(255, 255, 255));
        btnRegister.setText("Register");
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 560, 90, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void txtAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAddressActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
    txtDonorId.setText("");
    txtName.setText("");
    txtAddress.setText("");
    txtEmail.setText("");
    txtPhoneNo.setText("");
    rbtnMale.setSelected(false);
    rbtnFemale.setSelected(false);
    txtDonorId.requestFocus();
   
    
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbackActionPerformed
         home home= new home();
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
   

    String donor_name = txtName.getText();
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
    if (!phone.matches("\\d{10}")) { // Assuming 10 digits for phone number
        JOptionPane.showMessageDialog(null, "Please enter a valid 10-digit phone number.");
        return;
    }

    // Step 2: Insert the data into the database
    try {
        // Establish a connection
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:/Donation", "root", "");

        // Prepare the SQL query
        String sql = "INSERT INTO Donor (Donor_id, Donor_name, gender, address, email, Phone) VALUES (?, ?, ?, ?, ?, ?)";
        PreparedStatement pstmt = conn.prepareStatement(sql);

        // Set the parameters
        pstmt.setInt(1, donor_id);
        pstmt.setString(2, donor_name);
        pstmt.setString(3, gender);
        pstmt.setString(4, address);
        pstmt.setString(5, email);
        pstmt.setString(6, phone);

        // Execute the query
        int rowsInserted = pstmt.executeUpdate();
        if (rowsInserted > 0) {
            JOptionPane.showMessageDialog(null, "Donor registered successfully!");
            
            loadNextDonorId();
        }

        // Close resources
        pstmt.close();
        conn.close();

    } catch (SQLException ex) {
        ex.printStackTrace();
        JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());
    }
     txtDonorId.setText("");
    txtName.setText("");
    txtAddress.setText("");
    txtEmail.setText("");
    txtPhoneNo.setText("");
    rbtnMale.setSelected(false);
    rbtnFemale.setSelected(false);
    
    loadNextDonorId();
    
    txtName.requestFocus();
   
                 
                
           
        
    }//GEN-LAST:event_btnRegisterActionPerformed

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
    private javax.swing.JButton btnRegister;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnback;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.ButtonGroup buttonGroup6;
    private javax.swing.ButtonGroup buttonGroup7;
    private javax.swing.ButtonGroup buttonGroup8;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblcountry;
    private javax.swing.JLabel lblcountry1;
    private javax.swing.JLabel lblemail;
    private javax.swing.JLabel lblname;
    private javax.swing.JLabel lblname1;
    private javax.swing.JLabel lblphoneno;
    private javax.swing.JLabel llblcharityceylon;
    private javax.swing.JLabel picdonation;
    private javax.swing.JRadioButton rbtnFemale;
    private javax.swing.JRadioButton rbtnMale;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtDonorId;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPhoneNo;
    // End of variables declaration//GEN-END:variables
}
