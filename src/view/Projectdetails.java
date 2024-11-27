/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;
import controller.*;
import java.util.Date;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import java.sql.*;



public class Projectdetails extends javax.swing.JFrame {

   
    public Projectdetails() {
        initComponents();
         loadNextProjectId(); 
    }

    private void loadNextProjectId() {
    try {
        // Establish a connection to the database
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:/Donation", "root", "");
        
        // SQL query to get the maximum ProjectID
        String sql = "SELECT MAX(Project_id) FROM Project";
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(sql);
        
        // If there's at least one project in the database, get the next ID
        if (rs.next()) {
            int nextProjectId = rs.getInt(1) + 1; // Increment the maximum ProjectID by 1
            txtProjectId.setText(String.valueOf(nextProjectId)); // Set the next ProjectID in the text field
        } else {
            // If no project exists, start from 1
            txtProjectId.setText("1");
        }
        
        // Close the resources
        rs.close();
        stmt.close();
        conn.close();
        
    } catch (SQLException ex) {
        ex.printStackTrace();
        JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());
    }}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDayChooser1 = new com.toedter.calendar.JDayChooser();
        jSpinner1 = new javax.swing.JSpinner();
        jPanel1 = new javax.swing.JPanel();
        jPanelproject = new javax.swing.JPanel();
        panelsearch = new javax.swing.JPanel();
        txtsearch = new javax.swing.JTextField();
        lbldescription = new javax.swing.JLabel();
        txtProjectId = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtdescription = new javax.swing.JTextArea();
        btninsert = new javax.swing.JButton();
        btndelete = new javax.swing.JButton();
        btnupdate = new javax.swing.JButton();
        btnclear1 = new javax.swing.JButton();
        txtTargetAmount = new javax.swing.JTextField();
        lbltargetamount = new javax.swing.JLabel();
        txtStartDate = new com.toedter.calendar.JDateChooser();
        txtEndDate = new com.toedter.calendar.JDateChooser();
        lblenddate = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cmbCategory = new javax.swing.JComboBox<>();
        lblcategory = new javax.swing.JLabel();
        lblprojectId = new javax.swing.JLabel();
        txtProjectName = new javax.swing.JTextField();
        lblprojectName1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btnexit = new javax.swing.JButton();
        lblworldvision = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 473, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanelproject.setBackground(javax.swing.UIManager.getDefaults().getColor("ComboBox.buttonSeparatorColor"));
        jPanelproject.setForeground(new java.awt.Color(204, 204, 204));
        jPanelproject.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelsearch.setBackground(new java.awt.Color(0, 0, 51));
        panelsearch.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Search", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        panelsearch.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsearchActionPerformed(evt);
            }
        });
        panelsearch.add(txtsearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 190, -1));

        jPanelproject.add(panelsearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 250, 70));

        lbldescription.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        lbldescription.setText("Description");
        jPanelproject.add(lbldescription, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, -1, -1));
        jPanelproject.add(txtProjectId, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 100, -1));

        txtdescription.setColumns(20);
        txtdescription.setRows(5);
        jScrollPane2.setViewportView(txtdescription);

        jPanelproject.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 440, 260, 70));

        btninsert.setBackground(new java.awt.Color(153, 153, 153));
        btninsert.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N
        btninsert.setForeground(new java.awt.Color(0, 51, 153));
        btninsert.setText("ADD");
        btninsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btninsertActionPerformed(evt);
            }
        });
        jPanelproject.add(btninsert, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 530, 120, -1));

        btndelete.setBackground(new java.awt.Color(153, 153, 153));
        btndelete.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N
        btndelete.setForeground(new java.awt.Color(0, 51, 153));
        btndelete.setText("DELETE");
        btndelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeleteActionPerformed(evt);
            }
        });
        jPanelproject.add(btndelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 560, 120, -1));

        btnupdate.setBackground(new java.awt.Color(153, 153, 153));
        btnupdate.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N
        btnupdate.setForeground(new java.awt.Color(0, 51, 153));
        btnupdate.setText("UPDATE");
        btnupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdateActionPerformed(evt);
            }
        });
        jPanelproject.add(btnupdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 530, 110, -1));

        btnclear1.setBackground(new java.awt.Color(153, 153, 153));
        btnclear1.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N
        btnclear1.setForeground(new java.awt.Color(0, 51, 153));
        btnclear1.setText("CLEAR");
        btnclear1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnclear1ActionPerformed(evt);
            }
        });
        jPanelproject.add(btnclear1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 560, 110, -1));
        jPanelproject.add(txtTargetAmount, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, 260, -1));

        lbltargetamount.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        lbltargetamount.setText("Target Amount");
        jPanelproject.add(lbltargetamount, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, -1, -1));
        jPanelproject.add(txtStartDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 120, -1));
        jPanelproject.add(txtEndDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 320, 120, -1));

        lblenddate.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        lblenddate.setText("End Date");
        jPanelproject.add(lblenddate, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 300, -1, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel5.setText("Start Date");
        jPanelproject.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, -1, -1));

        cmbCategory.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        cmbCategory.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Educational", "HealthCare", "Disaster", "Other" }));
        cmbCategory.setToolTipText("select type of the project");
        jPanelproject.add(cmbCategory, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 260, -1));

        lblcategory.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        lblcategory.setText("Category");
        jPanelproject.add(lblcategory, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 70, -1));

        lblprojectId.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        lblprojectId.setText("Project Id");
        jPanelproject.add(lblprojectId, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 70, -1));
        jPanelproject.add(txtProjectName, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 260, -1));

        lblprojectName1.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        lblprojectName1.setText("Project Name");
        jPanelproject.add(lblprojectName1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, -1));

        tbl1.setBackground(new java.awt.Color(204, 204, 204));
        tbl1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6"
            }
        ));
        jScrollPane1.setViewportView(tbl1);

        jLabel1.setBackground(new java.awt.Color(204, 204, 204));
        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 25)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 153));
        jLabel1.setText("Project Details");

        btnexit.setBackground(new java.awt.Color(204, 204, 204));
        btnexit.setFont(new java.awt.Font("Yu Gothic Medium", 0, 12)); // NOI18N
        btnexit.setForeground(new java.awt.Color(0, 51, 102));
        btnexit.setText("Exit");
        btnexit.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        lblworldvision.setBackground(new java.awt.Color(0, 51, 102));
        lblworldvision.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblworldvision.setForeground(new java.awt.Color(0, 51, 102));
        lblworldvision.setText("CharityCeylon");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelproject, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnexit, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 495, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(209, 209, 209)
                        .addComponent(lblworldvision)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(180, 180, 180)
                        .addComponent(jLabel1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelproject, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblworldvision)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnexit, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtsearchActionPerformed

    private void btninsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btninsertActionPerformed
                
        
        
        // Validate Project ID
        int project_id;
        try {
            project_id = Integer.parseInt(txtProjectId.getText());
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Please enter a valid numeric Project ID.");
            return; // Exit if the input is invalid.
        }

        // Validate Project Name
        String project_name = txtProjectName.getText();
        if (project_name.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Project name cannot be empty.");
            return;
        }

        // Validate Category
        String category = cmbCategory.getSelectedItem().toString();
        if (category.equals("Select Category")) { // Assuming "Select Category" is a placeholder
            JOptionPane.showMessageDialog(null, "Please select a category.");
            return;
        }

        // Validate Start Date
        String start_date = "";
        if (txtStartDate.getDate() != null) {
            start_date = new SimpleDateFormat("yyyy-MM-dd").format(txtStartDate.getDate());
        } else {
            JOptionPane.showMessageDialog(null, "Please select a valid start date.");
            return;
        }

        // Validate End Date
        String end_date = "";
        if (txtEndDate.getDate() != null) {
            end_date = new SimpleDateFormat("yyyy-MM-dd").format(txtEndDate.getDate());
        } else {
            JOptionPane.showMessageDialog(null, "Please select a valid end date.");
            return;
        }

        // Validate Target Amount
        double target_amount;
        try {
            target_amount = Double.parseDouble(txtTargetAmount.getText());
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Please enter a valid numeric target amount.");
            return;
        }

        // Validate Description
        String description = txtdescription.getText();
        if (description.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Description cannot be empty.");
            return;
        }

        
        try {
            // Establish a connection
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:/Donation", "root", "");

            // Prepare the SQL query for insertion
            String sql = "INSERT INTO Project (Project_id, Project_name, category, start_date, end_date, target_amount, description) VALUES (?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement pstmt = conn.prepareStatement(sql);

            // Set the parameters for the prepared statement
            pstmt.setInt(1, project_id);
            pstmt.setString(2, project_name);
            pstmt.setString(3, category);
            pstmt.setString(4, start_date);
            pstmt.setString(5, end_date);
            pstmt.setDouble(6, target_amount);
            pstmt.setString(7, description);

            // Execute the query
            int rowsInserted = pstmt.executeUpdate();
            if (rowsInserted > 0) {
                JOptionPane.showMessageDialog(null, "Project added successfully!");
                
                
                txtProjectName.setText("");
                cmbCategory.setSelectedIndex(0); // Assuming the first option is a placeholder like "Select Category"
                txtStartDate.setDate(null);
                txtEndDate.setDate(null);
                txtTargetAmount.setText("");
                txtdescription.setText("");

                // Load the next ProjectID
                loadNextProjectId(); // Automatically load the next ProjectID

                // Focus back to the Project Name field
                txtProjectName.requestFocus();
            }

            // Close resources
            pstmt.close();
            conn.close();

        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());
        }

                    

                        
    }//GEN-LAST:event_btninsertActionPerformed

    private void btndeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeleteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btndeleteActionPerformed

    private void btnupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnupdateActionPerformed

    private void btnclear1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnclear1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnclear1ActionPerformed

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
            java.util.logging.Logger.getLogger(Projectdetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Projectdetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Projectdetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Projectdetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Projectdetails().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnclear1;
    private javax.swing.JButton btndelete;
    private javax.swing.JButton btnexit;
    private javax.swing.JButton btninsert;
    private javax.swing.JButton btnupdate;
    private javax.swing.JComboBox<String> cmbCategory;
    private com.toedter.calendar.JDayChooser jDayChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelproject;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JLabel lblcategory;
    private javax.swing.JLabel lbldescription;
    private javax.swing.JLabel lblenddate;
    private javax.swing.JLabel lblprojectId;
    private javax.swing.JLabel lblprojectName1;
    private javax.swing.JLabel lbltargetamount;
    private javax.swing.JLabel lblworldvision;
    private javax.swing.JPanel panelsearch;
    private javax.swing.JTable tbl1;
    private com.toedter.calendar.JDateChooser txtEndDate;
    private javax.swing.JTextField txtProjectId;
    private javax.swing.JTextField txtProjectName;
    private com.toedter.calendar.JDateChooser txtStartDate;
    private javax.swing.JTextField txtTargetAmount;
    private javax.swing.JTextArea txtdescription;
    private javax.swing.JTextField txtsearch;
    // End of variables declaration//GEN-END:variables
}
