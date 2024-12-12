/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;
import controller.*;
import model.*;
import java.util.Date;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import java.sql.*;
import net.proteanit.sql.DbUtils;
import com.toedter.calendar.JDateChooser;


public class CampaignDetails extends javax.swing.JFrame {

   
    public CampaignDetails() {
        initComponents();
          loadNextCampaignId(); 
         loadTable();

    }

     private void loadNextCampaignId() {
     
        
        try {
            CCampaignDetails loadId = new CCampaignDetails ();
         int nextId = loadId.getNextCampaignId();
        txtCampaignId.setText(String.valueOf(nextId));
        
        } catch (Exception e) {
          JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());  
        }
        
        
   }
    
    public void loadTable()
    {
    try{
          Connection conn = DBConnection.createDBConnection();
    String sql= "SELECT * FROM Campaign";
  PreparedStatement pst = conn.prepareStatement(sql);
     ResultSet rs= pst.executeQuery();
   tableCampaign.setModel(DbUtils.resultSetToTableModel(rs));
   
   tableCampaign.getColumnModel().getColumn(0).setHeaderValue("Campaign ID");
        tableCampaign.getColumnModel().getColumn(1).setHeaderValue("Campaign Name");
        tableCampaign.getColumnModel().getColumn(2).setHeaderValue("Category");
        tableCampaign.getColumnModel().getColumn(3).setHeaderValue("Start Date");
        tableCampaign.getColumnModel().getColumn(4).setHeaderValue("End Date");
        tableCampaign.getColumnModel().getColumn(5).setHeaderValue("Target Amount");
        tableCampaign.getColumnModel().getColumn(6).setHeaderValue("Description");

        
        tableCampaign.getTableHeader().repaint();
    }
    catch(Exception e)
    {
    JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());}
   
    
    }
    public void tableData()
             {
        int r=tableCampaign.getSelectedRow();
        
        String campaign_id =tableCampaign.getValueAt(r, 0).toString();
        String campaign_name =tableCampaign.getValueAt(r, 1).toString();
        String category=tableCampaign.getValueAt(r, 2).toString();
        String start_date =tableCampaign.getValueAt(r, 3).toString();
        String end_date =tableCampaign.getValueAt(r, 4).toString();
        String target_amount =tableCampaign.getValueAt(r, 5).toString();
        String description =tableCampaign.getValueAt(r, 6).toString();
        
        txtCampaignId.setText(campaign_id);
        txtCampaignName.setText(campaign_name);
         cmbCategory.setSelectedItem(category);
      try {
       
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");    
        txtStartDate.setDate(sdf.parse(start_date));                
        txtEndDate.setDate(sdf.parse(end_date));                     
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Error parsing date: " + e.getMessage());
    }
        txtTargetAmount.setText(target_amount);
        txtdescription.setText(description);
    }
    public void searchCampaign()
    {
    String search=txtSearch.getText();
        try {
            
              Connection conn = DBConnection.createDBConnection();
            String sql= "SELECT * FROM Campaign WHERE campaign_name LIKE '%"+search+"%' OR campaign_id LIKE '%"+search+"%'";
            PreparedStatement pst = conn.prepareStatement(sql);
           ResultSet rs= pst.executeQuery();
            tableCampaign.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        }
}
    public void clearForm()
    {
         txtSearch.setText("");
        txtCampaignName.setText("");
        cmbCategory.setSelectedIndex(0);
        txtStartDate.setDate(null);
        txtEndDate.setDate(null);
        txtTargetAmount.setText("");
        txtdescription.setText("");

    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        txtSearch = new javax.swing.JTextField();
        lblid = new javax.swing.JLabel();
        txtCampaignName = new javax.swing.JTextField();
        lblcategory = new javax.swing.JLabel();
        txtCampaignId = new javax.swing.JTextField();
        lblname = new javax.swing.JLabel();
        cmbCategory = new javax.swing.JComboBox<>();
        endDate = new javax.swing.JLabel();
        startDate = new javax.swing.JLabel();
        txtStartDate = new com.toedter.calendar.JDateChooser();
        txtEndDate = new com.toedter.calendar.JDateChooser();
        lbldescription = new javax.swing.JLabel();
        txtTargetAmount = new javax.swing.JTextField();
        lbltargetamount = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtdescription = new javax.swing.JTextArea();
        btnAdd = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableCampaign = new javax.swing.JTable();
        lblcharityceylon = new javax.swing.JLabel();
        lblcampaigndetails = new javax.swing.JLabel();
        bckground = new javax.swing.JLabel();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Campaigns");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(java.awt.SystemColor.activeCaption);
        jPanel1.setForeground(new java.awt.Color(153, 153, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(""), "Search", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Serif", 1, 16), new java.awt.Color(51, 51, 51))); // NOI18N

        txtSearch.setBackground(java.awt.SystemColor.activeCaption);
        txtSearch.setForeground(new java.awt.Color(255, 255, 255));
        txtSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchActionPerformed(evt);
            }
        });
        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 290, -1));

        lblid.setBackground(new java.awt.Color(51, 51, 51));
        lblid.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblid.setForeground(new java.awt.Color(51, 51, 51));
        lblid.setText("Campaign Id");
        jPanel1.add(lblid, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));
        jPanel1.add(txtCampaignName, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 232, 292, 30));

        lblcategory.setBackground(new java.awt.Color(51, 51, 51));
        lblcategory.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblcategory.setForeground(new java.awt.Color(51, 51, 51));
        lblcategory.setText("Category");
        jPanel1.add(lblcategory, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, -1, -1));

        txtCampaignId.setEditable(false);
        txtCampaignId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCampaignIdActionPerformed(evt);
            }
        });
        jPanel1.add(txtCampaignId, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 142, 292, 30));

        lblname.setBackground(new java.awt.Color(51, 51, 51));
        lblname.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblname.setForeground(new java.awt.Color(51, 51, 51));
        lblname.setText("Campaign Name");
        jPanel1.add(lblname, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, -1));

        cmbCategory.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Education", "Disaster", "HealthCare", "Other" }));
        jPanel1.add(cmbCategory, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 322, 292, 30));

        endDate.setBackground(new java.awt.Color(51, 51, 51));
        endDate.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        endDate.setForeground(new java.awt.Color(51, 51, 51));
        endDate.setText("End Date");
        jPanel1.add(endDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 120, -1, -1));

        startDate.setBackground(new java.awt.Color(51, 51, 51));
        startDate.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        startDate.setForeground(new java.awt.Color(51, 51, 51));
        startDate.setText("Start Date");
        jPanel1.add(startDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 120, -1, -1));
        jPanel1.add(txtStartDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 142, 137, 30));
        jPanel1.add(txtEndDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 142, 130, 30));

        lbldescription.setBackground(new java.awt.Color(51, 51, 51));
        lbldescription.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lbldescription.setForeground(new java.awt.Color(51, 51, 51));
        lbldescription.setText("Description");
        jPanel1.add(lbldescription, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 300, -1, -1));
        jPanel1.add(txtTargetAmount, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 232, 350, 30));

        lbltargetamount.setBackground(new java.awt.Color(51, 51, 51));
        lbltargetamount.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lbltargetamount.setForeground(new java.awt.Color(51, 51, 51));
        lbltargetamount.setText("Target Amount");
        jPanel1.add(lbltargetamount, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 210, -1, -1));

        txtdescription.setColumns(20);
        txtdescription.setRows(5);
        jScrollPane1.setViewportView(txtdescription);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 320, 350, 50));

        btnAdd.setBackground(new java.awt.Color(0, 0, 102));
        btnAdd.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        btnAdd.setForeground(new java.awt.Color(255, 255, 255));
        btnAdd.setText("ADD");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        jPanel1.add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 380, -1, -1));

        btnUpdate.setBackground(new java.awt.Color(0, 0, 102));
        btnUpdate.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        btnUpdate.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdate.setText("UPDATE");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        jPanel1.add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 380, -1, -1));

        btnDelete.setBackground(new java.awt.Color(0, 0, 102));
        btnDelete.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(255, 255, 255));
        btnDelete.setText("DELETE");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        jPanel1.add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 380, -1, -1));

        btnBack.setBackground(new java.awt.Color(204, 204, 204));
        btnBack.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        btnBack.setForeground(new java.awt.Color(0, 0, 102));
        btnBack.setText("Back");
        btnBack.setBorder(null);
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        jPanel1.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 550, 60, 40));

        btnReset.setBackground(new java.awt.Color(0, 0, 102));
        btnReset.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        btnReset.setForeground(new java.awt.Color(255, 255, 255));
        btnReset.setText("RESET");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });
        jPanel1.add(btnReset, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 380, -1, -1));

        tableCampaign.setBackground(java.awt.SystemColor.activeCaption);
        tableCampaign.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7"
            }
        ));
        tableCampaign.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableCampaignMouseClicked(evt);
            }
        });
        tableCampaign.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tableCampaignKeyReleased(evt);
            }
        });
        jScrollPane2.setViewportView(tableCampaign);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 420, 810, 120));

        lblcharityceylon.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblcharityceylon.setForeground(new java.awt.Color(0, 0, 153));
        lblcharityceylon.setText("ChairtyCeylon");
        jPanel1.add(lblcharityceylon, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 30, -1, -1));

        lblcampaigndetails.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        lblcampaigndetails.setForeground(new java.awt.Color(0, 51, 102));
        lblcampaigndetails.setText("Campaign Details");
        jPanel1.add(lblcampaigndetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 50, -1, -1));

        bckground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/1000033490.jpg"))); // NOI18N
        jPanel1.add(bckground, new org.netbeans.lib.awtextra.AbsoluteConstraints(-50, -20, -1, 640));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 630));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
       int check = JOptionPane.showConfirmDialog(null, "Are you sure do you want to delete? ");
       
       if(check== 0){
           
           
           String campaign_id= txtCampaignId.getText();
           try {
               
              CCampaignDetails deleteC = new CCampaignDetails();
              deleteC.deleteCampaign(campaign_id);
              
            JOptionPane.showMessageDialog(this, "Campaign details deleted successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);

                 clearForm();
        }
        catch (Exception e) 
        {
            JOptionPane.showMessageDialog(this, "An error occurred: " + e.getMessage(), "Delete Error", JOptionPane.ERROR_MESSAGE);
        }

               
         
       
       }loadTable();
       
       


    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
         String campaign_id = txtCampaignId.getText();
        String campaign_name = txtCampaignName.getText();
        String category = cmbCategory.getSelectedItem().toString();
        String start_date = null;
        String end_date = null;

        try {
            start_date = new SimpleDateFormat("yyyy-MM-dd").format(txtStartDate.getDate());
            end_date = new SimpleDateFormat("yyyy-MM-dd").format(txtEndDate.getDate());
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, "Start Date and End Date cannot be empty.");
            return;
        }

        String target_amount = txtTargetAmount.getText();
        String description = txtdescription.getText();

      

             try {
                 
           CCampaignDetails updateC = new  CCampaignDetails();
            updateC.updateCampaign(campaign_id,campaign_name,category,start_date,end_date,target_amount,description);
            JOptionPane.showMessageDialog(this, "Campaign details updated successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
            loadTable(); 
            clearForm();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "An error occurred: " + e.getMessage(), "Update Error", JOptionPane.ERROR_MESSAGE);
        }


       
     

        
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
      
        clearForm();
        txtCampaignName.requestFocus();

    }//GEN-LAST:event_btnResetActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        int campaign_id;
        try {
            campaign_id = Integer.parseInt(txtCampaignId.getText());
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Please enter a valid numeric Campaign ID.");
            return;
        }

        String campaign_name = txtCampaignName.getText();
        if (campaign_name.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Campaign name cannot be empty.");
            return;
        }

        String category = cmbCategory.getSelectedItem().toString();
        if (category.equals("Select Category")) {
            JOptionPane.showMessageDialog(null, "Please select a category.");
            return;
        }

        String start_date = "";
        if (txtStartDate.getDate() != null) {
            start_date = new SimpleDateFormat("yyyy-MM-dd").format(txtStartDate.getDate());
        } else {
            JOptionPane.showMessageDialog(null, "Please select a valid start date.");
            return;
        }

        String end_date = "";
        if (txtEndDate.getDate() != null) {
            end_date = new SimpleDateFormat("yyyy-MM-dd").format(txtEndDate.getDate());
        } else {
            JOptionPane.showMessageDialog(null, "Please select a valid end date.");
            return;
        }

        double target_amount;
        try {
            target_amount = Double.parseDouble(txtTargetAmount.getText());
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Please enter a valid numeric target amount.");
            return;
        }

        String description = txtdescription.getText();
        if (description.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Description cannot be empty.");
            return;
        }

         try {
               
             CCampaignDetails addC = new CCampaignDetails ();
              addC.addCampaign(campaign_id,campaign_name,category,start_date,end_date,target_amount,description);
            JOptionPane.showMessageDialog(this, " New Campaign added successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);


        }
        catch (Exception e) 
        {
            JOptionPane.showMessageDialog(this, "An error occurred: " + e.getMessage(), "Insert Error", JOptionPane.ERROR_MESSAGE);
        }
             
    clearForm();
    loadNextCampaignId();
    
   
    txtCampaignName.requestFocus();
   loadTable();

    }//GEN-LAST:event_btnAddActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
       Dashboard home= new Dashboard();
        home.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_btnBackActionPerformed

    private void txtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyReleased
        searchCampaign();
    }//GEN-LAST:event_txtSearchKeyReleased

    private void tableCampaignKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tableCampaignKeyReleased
           tableData();
    }//GEN-LAST:event_tableCampaignKeyReleased

    private void tableCampaignMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableCampaignMouseClicked
           tableData();
    }//GEN-LAST:event_tableCampaignMouseClicked

    private void txtCampaignIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCampaignIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCampaignIdActionPerformed

    private void txtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchActionPerformed

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
            java.util.logging.Logger.getLogger(CampaignDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CampaignDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CampaignDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CampaignDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CampaignDetails().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bckground;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> cmbCategory;
    private javax.swing.JLabel endDate;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblcampaigndetails;
    private javax.swing.JLabel lblcategory;
    private javax.swing.JLabel lblcharityceylon;
    private javax.swing.JLabel lbldescription;
    private javax.swing.JLabel lblid;
    private javax.swing.JLabel lblname;
    private javax.swing.JLabel lbltargetamount;
    private javax.swing.JLabel startDate;
    private javax.swing.JTable tableCampaign;
    private javax.swing.JTextField txtCampaignId;
    private javax.swing.JTextField txtCampaignName;
    private com.toedter.calendar.JDateChooser txtEndDate;
    private javax.swing.JTextField txtSearch;
    private com.toedter.calendar.JDateChooser txtStartDate;
    private javax.swing.JTextField txtTargetAmount;
    private javax.swing.JTextArea txtdescription;
    // End of variables declaration//GEN-END:variables
}
