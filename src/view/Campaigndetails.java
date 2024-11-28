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
import net.proteanit.sql.DbUtils;





public class Campaigndetails extends javax.swing.JFrame {

    
   
    public Campaigndetails() {
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

        jDayChooser1 = new com.toedter.calendar.JDayChooser();
        jSpinner1 = new javax.swing.JSpinner();
        jPanel1 = new javax.swing.JPanel();
        jPanelproject = new javax.swing.JPanel();
        panelsearch = new javax.swing.JPanel();
        txtSearch = new javax.swing.JTextField();
        lbldescription = new javax.swing.JLabel();
        txtCampaignId = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtdescription = new javax.swing.JTextArea();
        btninsert = new javax.swing.JButton();
        btndelete = new javax.swing.JButton();
        btnupdate = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        txtTargetAmount = new javax.swing.JTextField();
        lbltargetamount = new javax.swing.JLabel();
        txtStartDate = new com.toedter.calendar.JDateChooser();
        txtEndDate = new com.toedter.calendar.JDateChooser();
        lblenddate = new javax.swing.JLabel();
        lblStartDate = new javax.swing.JLabel();
        cmbCategory = new javax.swing.JComboBox<>();
        lblcategory = new javax.swing.JLabel();
        lblCampaignId = new javax.swing.JLabel();
        txtCampaignName = new javax.swing.JTextField();
        lblCampaignName = new javax.swing.JLabel();
        bakgroundpic1 = new javax.swing.JLabel();
        backgroundpic2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableCampaign = new javax.swing.JTable();
        lblCampaignDetails = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        lblChairtyCeylon = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Campaigns");
        setBackground(new java.awt.Color(0, 0, 102));

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

        jPanelproject.setBackground(javax.swing.UIManager.getDefaults().getColor("CheckBox.icon[filled].focusedSelectedBorderColor"));
        jPanelproject.setForeground(new java.awt.Color(204, 204, 204));
        jPanelproject.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelsearch.setBackground(new java.awt.Color(153, 153, 153));
        panelsearch.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Search", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14), new java.awt.Color(51, 51, 51))); // NOI18N
        panelsearch.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        panelsearch.add(txtSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 190, -1));

        jPanelproject.add(panelsearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 250, 70));

        lbldescription.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        lbldescription.setText("Description");
        jPanelproject.add(lbldescription, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, -1, -1));
        jPanelproject.add(txtCampaignId, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 100, -1));

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

        btnReset.setBackground(new java.awt.Color(153, 153, 153));
        btnReset.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N
        btnReset.setForeground(new java.awt.Color(0, 51, 153));
        btnReset.setText("RESET");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });
        jPanelproject.add(btnReset, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 560, 110, -1));
        jPanelproject.add(txtTargetAmount, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, 260, -1));

        lbltargetamount.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        lbltargetamount.setText("Target Amount");
        jPanelproject.add(lbltargetamount, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, -1, -1));
        jPanelproject.add(txtStartDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 120, -1));
        jPanelproject.add(txtEndDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 320, 120, -1));

        lblenddate.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        lblenddate.setText("End Date");
        jPanelproject.add(lblenddate, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 300, 90, -1));

        lblStartDate.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        lblStartDate.setText("Start Date");
        jPanelproject.add(lblStartDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, -1, -1));

        cmbCategory.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        cmbCategory.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Educational", "HealthCare", "Disaster", "Other" }));
        cmbCategory.setToolTipText("select type of the project");
        jPanelproject.add(cmbCategory, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 260, -1));

        lblcategory.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        lblcategory.setText("Category");
        jPanelproject.add(lblcategory, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 70, -1));

        lblCampaignId.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        lblCampaignId.setText("Campaign Id");
        jPanelproject.add(lblCampaignId, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 90, -1));
        jPanelproject.add(txtCampaignName, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 260, -1));

        lblCampaignName.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        lblCampaignName.setText("Campaign Name");
        jPanelproject.add(lblCampaignName, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, -1));

        bakgroundpic1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/2149155296.jpg"))); // NOI18N
        bakgroundpic1.setText("jLabel1");
        jPanelproject.add(bakgroundpic1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -160, 340, 650));

        backgroundpic2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/360_F_500945815_xyDKv3bidsGim09jcO7llyKnokhe4XkD_1.jpg"))); // NOI18N
        backgroundpic2.setText("jLabel2");
        jPanelproject.add(backgroundpic2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-90, 330, 430, 360));

        tableCampaign.setBackground(new java.awt.Color(102, 102, 102));
        tableCampaign.setForeground(new java.awt.Color(255, 255, 255));
        tableCampaign.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
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
        jScrollPane1.setViewportView(tableCampaign);

        lblCampaignDetails.setBackground(new java.awt.Color(204, 204, 204));
        lblCampaignDetails.setFont(new java.awt.Font("Times New Roman", 1, 26)); // NOI18N
        lblCampaignDetails.setText("Campaign Details");

        btnBack.setBackground(new java.awt.Color(204, 204, 204));
        btnBack.setFont(new java.awt.Font("Yu Gothic Medium", 0, 12)); // NOI18N
        btnBack.setForeground(new java.awt.Color(0, 51, 102));
        btnBack.setText("Back");
        btnBack.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        lblChairtyCeylon.setBackground(new java.awt.Color(0, 51, 102));
        lblChairtyCeylon.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblChairtyCeylon.setForeground(new java.awt.Color(0, 51, 102));
        lblChairtyCeylon.setText("CharityCeylon");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelproject, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(226, 226, 226)
                                .addComponent(lblCampaignDetails)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(148, 148, 148))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(96, 96, 96))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lblChairtyCeylon)
                                .addGap(240, 240, 240))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelproject, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblChairtyCeylon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblCampaignDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 474, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchActionPerformed
       
    }//GEN-LAST:event_txtSearchActionPerformed

    private void btninsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btninsertActionPerformed
                
        
        
        
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

               
                txtCampaignName.requestFocus();
            }

          
            pstmt.close();
            conn.close();

        } catch (SQLException ex) {
            
            JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());
        }
        loadTable();
                    

                        
    }//GEN-LAST:event_btninsertActionPerformed

    private void btndeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeleteActionPerformed
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
       
       
    }//GEN-LAST:event_btndeleteActionPerformed

    private void btnupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdateActionPerformed
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


    }//GEN-LAST:event_btnupdateActionPerformed

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

    private void tableCampaignMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableCampaignMouseClicked
      tableData();
    }//GEN-LAST:event_tableCampaignMouseClicked

    private void tableCampaignKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tableCampaignKeyReleased
        tableData();
    }//GEN-LAST:event_tableCampaignKeyReleased

    private void txtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyReleased
       searchCampaign();
    }//GEN-LAST:event_txtSearchKeyReleased

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
         home home= new home();
        home.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed

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
            java.util.logging.Logger.getLogger(Campaigndetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Campaigndetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Campaigndetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Campaigndetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Campaigndetails().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backgroundpic2;
    private javax.swing.JLabel bakgroundpic1;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btndelete;
    private javax.swing.JButton btninsert;
    private javax.swing.JButton btnupdate;
    private javax.swing.JComboBox<String> cmbCategory;
    private com.toedter.calendar.JDayChooser jDayChooser1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelproject;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JLabel lblCampaignDetails;
    private javax.swing.JLabel lblCampaignId;
    private javax.swing.JLabel lblCampaignName;
    private javax.swing.JLabel lblChairtyCeylon;
    private javax.swing.JLabel lblStartDate;
    private javax.swing.JLabel lblcategory;
    private javax.swing.JLabel lbldescription;
    private javax.swing.JLabel lblenddate;
    private javax.swing.JLabel lbltargetamount;
    private javax.swing.JPanel panelsearch;
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
