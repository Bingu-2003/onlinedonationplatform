/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;
import java.sql.*;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

public class DonationProcess extends javax.swing.JFrame {

    public DonationProcess() {
        initComponents();
        loadCampaigns();
    }

    private void loadCampaigns() {
    try {
        // Establish database connection
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:/Donation", "root", "");

        // Prepare SQL query to fetch project names
        String query = "SELECT project_name FROM Project";
        PreparedStatement stmt = conn.prepareStatement(query);

        // Execute the query
        ResultSet rs = stmt.executeQuery();

        // Clear existing items in cmbCampaignName
        cmbCampaignName.removeAllItems();

        // Populate combo box with project names
        while (rs.next()) {
            cmbCampaignName.addItem(rs.getString("project_name"));
        }

        // Close resources
        rs.close();
        stmt.close();
        conn.close();

    } catch (SQLException ex) {
        
        JOptionPane.showMessageDialog(this, "Error loading campaigns: " + ex.getMessage());
    }
}
    
    private void fetchDonorName() {
    String donor_id = txtDonorId.getText().trim(); // Get the entered donor ID

    // Ensure donor ID is not empty
    if (donor_id.isEmpty()) {
        txtDonorName.setText(""); // Clear the name field if ID is empty
        return;
    }

    try {
        // Establish database connection
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Donation", "root", "");

        // Query to fetch donor name based on donor ID
        String sql = "SELECT donor_name FROM Donor WHERE donor_id = ?";
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setInt(1, Integer.parseInt(donor_id)); // Set donor ID parameter

        // Execute query
        ResultSet rs = stmt.executeQuery();

        if (rs.next()) {
            // Populate txtDonorName with the retrieved donor name
            txtDonorName.setText(rs.getString("donor_name"));
        } else {
            // If no donor is found, clear the name field and show a message
            txtDonorName.setText("");
            JOptionPane.showMessageDialog(this, "No donor found with ID: " + donor_id, "Donor Not Found", JOptionPane.WARNING_MESSAGE);
        }

        // Close resources
        rs.close();
        stmt.close();
        conn.close();

    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Invalid Donor ID format. Please enter a numeric value.", "Error", JOptionPane.ERROR_MESSAGE);
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Database Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        
    }
}


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblDonation = new javax.swing.JLabel();
        txtDonationAmount = new javax.swing.JTextField();
        txtDonorId = new javax.swing.JTextField();
        lblDonorIdId = new javax.swing.JLabel();
        lblDonationAmount = new javax.swing.JLabel();
        lblDate = new javax.swing.JLabel();
        txtDonorName = new javax.swing.JTextField();
        lblCampaignName = new javax.swing.JLabel();
        cmbPaymentMethod = new javax.swing.JComboBox<>();
        cmbCampaignName = new javax.swing.JComboBox<>();
        lblPaymentMethod = new javax.swing.JLabel();
        txtDate = new com.toedter.calendar.JDateChooser();
        btnReset = new javax.swing.JButton();
        btnDone = new javax.swing.JButton();
        lblCharityCeylon = new javax.swing.JLabel();
        btnback = new javax.swing.JButton();
        backfroundPhoto = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(800, 600));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblDonation.setFont(new java.awt.Font("Perpetua Titling MT", 1, 36)); // NOI18N
        lblDonation.setForeground(new java.awt.Color(0, 51, 102));
        lblDonation.setText("DONATION");
        getContentPane().add(lblDonation, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 30, 220, 80));
        getContentPane().add(txtDonationAmount, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, 270, 30));

        txtDonorId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtDonorIdKeyReleased(evt);
            }
        });
        getContentPane().add(txtDonorId, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 110, 30));

        lblDonorIdId.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblDonorIdId.setText("Donor Id");
        getContentPane().add(lblDonorIdId, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 80, 30));

        lblDonationAmount.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblDonationAmount.setText("Donation Amount");
        getContentPane().add(lblDonationAmount, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 150, 30));

        lblDate.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblDate.setText("Date");
        getContentPane().add(lblDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 460, 50, 30));
        getContentPane().add(txtDonorName, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 150, 130, 30));

        lblCampaignName.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblCampaignName.setText("Campaign Name");
        getContentPane().add(lblCampaignName, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 130, 30));

        cmbPaymentMethod.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cash", "Credit/Debit Card", "Cheque", "Babk Tranfer" }));
        getContentPane().add(cmbPaymentMethod, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 400, 270, 30));

        getContentPane().add(cmbCampaignName, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 270, 30));

        lblPaymentMethod.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblPaymentMethod.setText("Payment Method");
        getContentPane().add(lblPaymentMethod, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, 130, 30));
        getContentPane().add(txtDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 490, 270, 30));

        btnReset.setBackground(new java.awt.Color(0, 0, 0));
        btnReset.setFont(new java.awt.Font("Sitka Text", 1, 15)); // NOI18N
        btnReset.setForeground(new java.awt.Color(255, 255, 255));
        btnReset.setText("Reset");
        btnReset.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(51, 51, 51), null));
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });
        getContentPane().add(btnReset, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 560, 100, 30));

        btnDone.setBackground(new java.awt.Color(0, 0, 0));
        btnDone.setFont(new java.awt.Font("Sitka Text", 1, 15)); // NOI18N
        btnDone.setForeground(new java.awt.Color(255, 255, 255));
        btnDone.setText("Done ");
        btnDone.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(51, 51, 51), null));
        btnDone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDoneActionPerformed(evt);
            }
        });
        getContentPane().add(btnDone, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 560, 100, 30));

        lblCharityCeylon.setBackground(new java.awt.Color(0, 51, 102));
        lblCharityCeylon.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblCharityCeylon.setForeground(new java.awt.Color(0, 51, 102));
        lblCharityCeylon.setText("CharityCeylon");
        getContentPane().add(lblCharityCeylon, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 20, -1, -1));

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
        getContentPane().add(btnback, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 560, 70, 30));

        backfroundPhoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/2148568055.jpg"))); // NOI18N
        backfroundPhoto.setText("jLabel1");
        getContentPane().add(backfroundPhoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -70, 800, 790));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbackActionPerformed
        home home= new home();
        home.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_btnbackActionPerformed

    private void btnDoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDoneActionPerformed
         
    try {
        // Input Validation
        if (txtDonorId.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Donor ID is required.", "Validation Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (txtDonorName.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Donor Name is required.", "Validation Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (cmbCampaignName.getSelectedItem() == null || cmbCampaignName.getSelectedItem().toString().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Campaign Name is required.", "Validation Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (txtDonationAmount.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Donation Amount is required.", "Validation Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (!txtDonationAmount.getText().matches("\\d+(\\.\\d{1,2})?")) {
            JOptionPane.showMessageDialog(this, "Invalid Donation Amount. Please enter a valid number.", "Validation Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (cmbPaymentMethod.getSelectedItem() == null || cmbPaymentMethod.getSelectedItem().toString().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Payment Method is required.", "Validation Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (txtDate.getDate() == null) {
            JOptionPane.showMessageDialog(this, "Date is required.", "Validation Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Database Insertion
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Donation", "root", "")) {
            String sql = "INSERT INTO Donate(donor_id, donor_name, campaign_name, donation_amount, payment_method,date) VALUES (?, ?, ?, ?, ?, ?)";
            PreparedStatement stmt = conn.prepareStatement(sql);

            // Set values for the query
            stmt.setInt(1, Integer.parseInt(txtDonorId.getText().trim()));
            stmt.setString(2, txtDonorName.getText().trim());
            stmt.setString(3, cmbCampaignName.getSelectedItem().toString().trim());
            stmt.setDouble(4, Double.parseDouble(txtDonationAmount.getText().trim()));
            stmt.setString(5, cmbPaymentMethod.getSelectedItem().toString().trim());
            stmt.setString(6, new SimpleDateFormat("yyyy-MM-dd").format(txtDate.getDate()));

            // Execute the insertion
            int rowsInserted = stmt.executeUpdate();

            if (rowsInserted > 0) {
                JOptionPane.showMessageDialog(this, "Donation Success!", "Success", JOptionPane.INFORMATION_MESSAGE);
               
               txtDonorId.setText("");
               txtDonorName.setText("");
               cmbCampaignName.setSelectedIndex(-1); // Clear combo box selection
               txtDonationAmount.setText("");
               cmbPaymentMethod.setSelectedIndex(-1); // Clear payment method combo box
               txtDate.setDate(null);  
                
                txtDonorId.requestFocus();
                
                
            } else {
                JOptionPane.showMessageDialog(this, "Failed to insert the donation record.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }

    } catch (NumberFormatException ex) {
        JOptionPane.showMessageDialog(this, "Invalid number format. Please check your input.", "Validation Error", JOptionPane.ERROR_MESSAGE);
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(this, "Database Error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
       
    } catch (Exception ex) {
        JOptionPane.showMessageDialog(this, "Unexpected Error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
      
    }


         

         
    }//GEN-LAST:event_btnDoneActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        txtDonorId.setText("");
               txtDonorName.setText("");
               cmbCampaignName.setSelectedIndex(-1); // Clear combo box selection
               txtDonationAmount.setText("");
               cmbPaymentMethod.setSelectedIndex(-1); // Clear payment method combo box
               txtDate.setDate(null);  
                
                txtDonorId.requestFocus();
    }//GEN-LAST:event_btnResetActionPerformed

    private void txtDonorIdKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDonorIdKeyReleased
        fetchDonorName();
    }//GEN-LAST:event_txtDonorIdKeyReleased

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
            java.util.logging.Logger.getLogger(DonationProcess.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DonationProcess.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DonationProcess.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DonationProcess.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DonationProcess().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backfroundPhoto;
    private javax.swing.JButton btnDone;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnback;
    private javax.swing.JComboBox<String> cmbCampaignName;
    private javax.swing.JComboBox<String> cmbPaymentMethod;
    private javax.swing.JLabel lblCampaignName;
    private javax.swing.JLabel lblCharityCeylon;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblDonation;
    private javax.swing.JLabel lblDonationAmount;
    private javax.swing.JLabel lblDonorIdId;
    private javax.swing.JLabel lblPaymentMethod;
    private com.toedter.calendar.JDateChooser txtDate;
    private javax.swing.JTextField txtDonationAmount;
    private javax.swing.JTextField txtDonorId;
    private javax.swing.JTextField txtDonorName;
    // End of variables declaration//GEN-END:variables
}
