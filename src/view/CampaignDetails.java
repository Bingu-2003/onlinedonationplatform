/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;
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
       
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:/Donation", "root", "");
        
       
        String sql = "SELECT MAX(campaign_id) FROM Campaign";
        Statement stmt = conn.createStatement();
          ResultSet rs = stmt.executeQuery(sql);
        
      
        if (rs.next()) {
            int nextProjectId = rs.getInt(1) + 1; 
            txtCampaignId.setText(String.valueOf(nextProjectId)); 
        } else {
           
            txtCampaignId.setText("1");
        }
        
       
        rs.close();
        stmt.close();
        conn.close();
        
    } catch (SQLException ex) {
        
        JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());
    }}
    
    public void loadTable()
    {
    try{
         Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:/Donation", "root", "");
    String sql= "SELECT * FROM Campaign";
  PreparedStatement pst = conn.prepareStatement(sql);
     ResultSet rs= pst.executeQuery();
   tableCampaign.setModel(DbUtils.resultSetToTableModel(rs));
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
        // Convert String to Date for JDateChooser
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
             Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:/Donation", "root", "");
            String sql= "SELECT * FROM Campaign WHERE campaign_name LIKE '%"+search+"%' OR campaign_id LIKE '%"+search+"%'";
            PreparedStatement pst = conn.prepareStatement(sql);
           ResultSet rs= pst.executeQuery();
            tableCampaign.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        }
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
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableCampaign = new javax.swing.JTable();
        btnDelete = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        lblcampaigndetails = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Campaigns");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setForeground(new java.awt.Color(153, 153, 153));

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(""), "Search", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Serif", 1, 16), new java.awt.Color(51, 51, 51))); // NOI18N

        txtSearch.setBackground(new java.awt.Color(102, 102, 102));
        txtSearch.setForeground(new java.awt.Color(255, 255, 255));
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
                .addGap(15, 15, 15)
                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        lblid.setBackground(new java.awt.Color(51, 51, 51));
        lblid.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        lblid.setForeground(new java.awt.Color(51, 51, 51));
        lblid.setText("Campaign Id");

        lblcategory.setBackground(new java.awt.Color(51, 51, 51));
        lblcategory.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        lblcategory.setForeground(new java.awt.Color(51, 51, 51));
        lblcategory.setText("Category");

        lblname.setBackground(new java.awt.Color(51, 51, 51));
        lblname.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        lblname.setForeground(new java.awt.Color(51, 51, 51));
        lblname.setText("Campaign Name");

        cmbCategory.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Education", "Disaster", "HealthCare", "Other" }));

        endDate.setBackground(new java.awt.Color(51, 51, 51));
        endDate.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        endDate.setForeground(new java.awt.Color(51, 51, 51));
        endDate.setText("End Date");

        startDate.setBackground(new java.awt.Color(51, 51, 51));
        startDate.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        startDate.setForeground(new java.awt.Color(51, 51, 51));
        startDate.setText("Start Date");

        lbldescription.setBackground(new java.awt.Color(51, 51, 51));
        lbldescription.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        lbldescription.setForeground(new java.awt.Color(51, 51, 51));
        lbldescription.setText("Description");

        lbltargetamount.setBackground(new java.awt.Color(51, 51, 51));
        lbltargetamount.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        lbltargetamount.setForeground(new java.awt.Color(51, 51, 51));
        lbltargetamount.setText("Target Amount");

        txtdescription.setColumns(20);
        txtdescription.setRows(5);
        jScrollPane1.setViewportView(txtdescription);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbltargetamount)
                    .addComponent(lbldescription)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(lblname)
                                .addComponent(lblcategory)
                                .addComponent(lblid)
                                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtCampaignName)
                                .addComponent(txtCampaignId)
                                .addComponent(cmbCategory, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(txtStartDate, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(52, 52, 52)
                                    .addComponent(txtEndDate, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(29, 29, 29))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(startDate)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(endDate)
                            .addGap(68, 68, 68)))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE)
                        .addComponent(txtTargetAmount, javax.swing.GroupLayout.Alignment.LEADING))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(lblid)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCampaignId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(lblname)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCampaignName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblcategory)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmbCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(startDate)
                    .addComponent(endDate))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtStartDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEndDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(lbltargetamount)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTargetAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(lbldescription)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 310, 600));

        jPanel3.setBackground(new java.awt.Color(153, 153, 153));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/360_F_500945815_xyDKv3bidsGim09jcO7llyKnokhe4XkD.jpg"))); // NOI18N
        jLabel8.setText("jLabel8");

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

        btnDelete.setBackground(new java.awt.Color(204, 204, 204));
        btnDelete.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(0, 0, 102));
        btnDelete.setText("DELETE");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnAdd.setBackground(new java.awt.Color(204, 204, 204));
        btnAdd.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        btnAdd.setForeground(new java.awt.Color(0, 0, 102));
        btnAdd.setText("ADD");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnUpdate.setBackground(new java.awt.Color(204, 204, 204));
        btnUpdate.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        btnUpdate.setForeground(new java.awt.Color(0, 0, 102));
        btnUpdate.setText("UPDATE");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnReset.setBackground(new java.awt.Color(204, 204, 204));
        btnReset.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        btnReset.setForeground(new java.awt.Color(0, 0, 102));
        btnReset.setText("RESET");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        lblcampaigndetails.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lblcampaigndetails.setForeground(new java.awt.Color(0, 0, 102));
        lblcampaigndetails.setText("Campaign Details");

        jLabel1.setBackground(new java.awt.Color(0, 0, 153));
        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 102));
        jLabel1.setText("CharityCeylon");

        btnBack.setBackground(new java.awt.Color(204, 204, 204));
        btnBack.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        btnBack.setForeground(new java.awt.Color(0, 0, 102));
        btnBack.setText("Back");
        btnBack.setBorder(null);
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 490, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(215, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(186, 186, 186))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(170, 170, 170)
                .addComponent(lblcampaigndetails)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(btnAdd)
                .addGap(18, 18, 18)
                .addComponent(btnUpdate)
                .addGap(18, 18, 18)
                .addComponent(btnDelete)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnReset)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblcampaigndetails)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd)
                    .addComponent(btnUpdate)
                    .addComponent(btnDelete)
                    .addComponent(btnReset))
                .addGap(22, 22, 22))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 0, 490, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        int check = JOptionPane.showConfirmDialog(null, "Are you sure do you want to delete? ");

        if(check== 0){

            String campaign_id= txtCampaignId.getText();
            try {
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:/Donation", "root", "");
                String sql = "DELETE  FROM Campaign WHERE campaign_id = '"+campaign_id+"'";
                PreparedStatement pstmt = conn.prepareStatement(sql);
                pstmt.execute();
                JOptionPane.showMessageDialog(null, "Campaign delete successfully!");

                txtCampaignName.setText("");
                cmbCategory.setSelectedIndex(0);
                txtStartDate.setDate(null);
                txtEndDate.setDate(null);
                txtTargetAmount.setText("");
                txtdescription.setText("");

                txtCampaignName.requestFocus();

            } catch (SQLException ex) {

                JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());
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

            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/Donation", "root", "");

            String sql = "UPDATE Campaign SET campaign_name = ?, category = ?, start_date = ?, end_date = ?, target_amount = ?, description = ? WHERE campaign_id = ?";
            PreparedStatement pst = conn.prepareStatement(sql);

            pst.setString(1, campaign_name);
            pst.setString(2, category);
            pst.setString(3, start_date);
            pst.setString(4, end_date);
            pst.setString(5, target_amount);
            pst.setString(6, description);
            pst.setString(7, campaign_id);

            int rowsUpdated = pst.executeUpdate();
            if (rowsUpdated > 0) {
                JOptionPane.showMessageDialog(null, "Record updated successfully!");
            }
            loadTable();

            pst.close();
            conn.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());

        }

    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
       txtSearch.setText("");
        txtCampaignName.setText("");
        cmbCategory.setSelectedIndex(0);
        txtStartDate.setDate(null);
        txtEndDate.setDate(null);
        txtTargetAmount.setText("");
        txtdescription.setText("");

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
        if (category.equals("Select Category")) { // Assuming "Select Category" is a placeholder
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

            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:/Donation", "root", "");

            String sql = "INSERT INTO Campaign (campaign_id, campaign_name, category, start_date, end_date, target_amount, description) VALUES (?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement pstmt = conn.prepareStatement(sql);

            pstmt.setInt(1, campaign_id);
            pstmt.setString(2, campaign_name);
            pstmt.setString(3, category);
            pstmt.setString(4, start_date);
            pstmt.setString(5, end_date);
            pstmt.setDouble(6, target_amount);
            pstmt.setString(7, description);

            int rowsInserted = pstmt.executeUpdate();
            if (rowsInserted > 0) {
                JOptionPane.showMessageDialog(null, "Campaign added successfully!");

                txtCampaignName.setText("");
                cmbCategory.setSelectedIndex(0);
                txtStartDate.setDate(null);
                txtEndDate.setDate(null);
                txtTargetAmount.setText("");
                txtdescription.setText("");

                loadNextCampaignId();
                 loadTable();

                txtCampaignName.requestFocus();
            }

            pstmt.close();
            conn.close();

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());
        }
       


    }//GEN-LAST:event_btnAddActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
       home home= new home();
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
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> cmbCategory;
    private javax.swing.JLabel endDate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblcampaigndetails;
    private javax.swing.JLabel lblcategory;
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
