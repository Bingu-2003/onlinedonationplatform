/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package inf;

/**
 *
 * @author Binguni
 */
public class campaigndetails extends javax.swing.JFrame {

    /**
     * Creates new form campaigndetails
     */
    public campaigndetails() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        panelsearch = new javax.swing.JPanel();
        txtsearch = new javax.swing.JTextField();
        lblcampaigname = new javax.swing.JLabel();
        lbldescription = new javax.swing.JLabel();
        lblstartdate = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        panelsearch1 = new javax.swing.JPanel();
        txtsearch1 = new javax.swing.JTextField();
        lblcampaigname1 = new javax.swing.JLabel();
        lbldescription1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lbltargetamount = new javax.swing.JLabel();
        txtcampaignname1 = new javax.swing.JTextField();
        startdate = new com.toedter.calendar.JDateChooser();
        enddate = new com.toedter.calendar.JDateChooser();
        lblenddate = new javax.swing.JLabel();
        txttargetamount = new javax.swing.JTextField();
        txtcampaignname2 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtdescription = new javax.swing.JTextArea();
        btnclear = new javax.swing.JButton();
        btninsert = new javax.swing.JButton();
        btndelete = new javax.swing.JButton();
        btnupdate = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 493, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 102, Short.MAX_VALUE)
        );

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));
        jPanel2.setForeground(new java.awt.Color(204, 204, 204));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelsearch.setBackground(new java.awt.Color(204, 204, 204));
        panelsearch.setBorder(javax.swing.BorderFactory.createTitledBorder("Search"));
        panelsearch.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsearchActionPerformed(evt);
            }
        });
        panelsearch.add(txtsearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 240, -1));

        jPanel2.add(panelsearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 53, 260, 60));

        lblcampaigname.setText("Campaign Name");
        jPanel2.add(lblcampaigname, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, -1));

        lbldescription.setText("Description");
        jPanel2.add(lbldescription, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, -1, -1));

        lblstartdate.setText("Start Date");
        jPanel2.add(lblstartdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, -1, -1));

        jPanel3.setBackground(new java.awt.Color(153, 153, 153));
        jPanel3.setForeground(new java.awt.Color(204, 204, 204));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelsearch1.setBackground(new java.awt.Color(204, 204, 204));
        panelsearch1.setBorder(javax.swing.BorderFactory.createTitledBorder("Search"));
        panelsearch1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtsearch1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsearch1ActionPerformed(evt);
            }
        });
        panelsearch1.add(txtsearch1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 240, -1));

        jPanel3.add(panelsearch1, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 53, 260, 60));

        lblcampaigname1.setText("Campaign Name");
        jPanel3.add(lblcampaigname1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, -1));

        lbldescription1.setText("Description");
        jPanel3.add(lbldescription1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, -1, -1));

        jLabel5.setText("Start Date");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, -1, -1));

        lbltargetamount.setText("Target Amount");
        jPanel3.add(lbltargetamount, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, -1, -1));
        jPanel3.add(txtcampaignname1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 260, -1));
        jPanel3.add(startdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 120, -1));
        jPanel3.add(enddate, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 270, 120, -1));

        lblenddate.setText("End Date");
        jPanel3.add(lblenddate, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 250, -1, -1));
        jPanel3.add(txttargetamount, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 260, -1));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, -1));
        jPanel2.add(txtcampaignname2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 260, -1));

        txtdescription.setColumns(20);
        txtdescription.setRows(5);
        jScrollPane2.setViewportView(txtdescription);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, 260, 70));

        btnclear.setBackground(new java.awt.Color(204, 204, 204));
        btnclear.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N
        btnclear.setForeground(new java.awt.Color(0, 51, 153));
        btnclear.setText("CLEAR");
        btnclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnclearActionPerformed(evt);
            }
        });
        jPanel2.add(btnclear, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 550, 110, -1));

        btninsert.setBackground(new java.awt.Color(204, 204, 204));
        btninsert.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N
        btninsert.setForeground(new java.awt.Color(0, 51, 153));
        btninsert.setText("INSERT");
        btninsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btninsertActionPerformed(evt);
            }
        });
        jPanel2.add(btninsert, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 520, 120, -1));

        btndelete.setBackground(new java.awt.Color(204, 204, 204));
        btndelete.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N
        btndelete.setForeground(new java.awt.Color(0, 51, 153));
        btndelete.setText("DELETE");
        btndelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeleteActionPerformed(evt);
            }
        });
        jPanel2.add(btndelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 550, 120, -1));

        btnupdate.setBackground(new java.awt.Color(204, 204, 204));
        btnupdate.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N
        btnupdate.setForeground(new java.awt.Color(0, 51, 153));
        btnupdate.setText("UPDATE");
        btnupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdateActionPerformed(evt);
            }
        });
        jPanel2.add(btnupdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 520, 110, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setBackground(new java.awt.Color(204, 204, 204));
        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 153));
        jLabel1.setText("Campaign Details");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 461, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(22, 22, 22))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtsearchActionPerformed

    private void txtsearch1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsearch1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtsearch1ActionPerformed

    private void btnclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnclearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnclearActionPerformed

    private void btninsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btninsertActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btninsertActionPerformed

    private void btndeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeleteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btndeleteActionPerformed

    private void btnupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnupdateActionPerformed

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
            java.util.logging.Logger.getLogger(campaigndetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(campaigndetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(campaigndetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(campaigndetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new campaigndetails().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnclear;
    private javax.swing.JButton btndelete;
    private javax.swing.JButton btninsert;
    private javax.swing.JButton btnupdate;
    private com.toedter.calendar.JDateChooser enddate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblcampaigname;
    private javax.swing.JLabel lblcampaigname1;
    private javax.swing.JLabel lbldescription;
    private javax.swing.JLabel lbldescription1;
    private javax.swing.JLabel lblenddate;
    private javax.swing.JLabel lblstartdate;
    private javax.swing.JLabel lbltargetamount;
    private javax.swing.JPanel panelsearch;
    private javax.swing.JPanel panelsearch1;
    private com.toedter.calendar.JDateChooser startdate;
    private javax.swing.JTextField txtcampaignname1;
    private javax.swing.JTextField txtcampaignname2;
    private javax.swing.JTextArea txtdescription;
    private javax.swing.JTextField txtsearch;
    private javax.swing.JTextField txtsearch1;
    private javax.swing.JTextField txttargetamount;
    // End of variables declaration//GEN-END:variables
}
