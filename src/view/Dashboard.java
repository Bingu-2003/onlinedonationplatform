/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;


public class Dashboard extends javax.swing.JFrame {

   
    public Dashboard() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        userpic = new javax.swing.JLabel();
        lblWelcome = new javax.swing.JLabel();
        lbladmin = new javax.swing.JLabel();
        btnDonors = new javax.swing.JButton();
        btnReports = new javax.swing.JButton();
        btnCampaigns = new javax.swing.JButton();
        btnDonations = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();
        lblcharityceylon = new javax.swing.JLabel();
        backgrounpic = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("DashBoard");
        setMinimumSize(new java.awt.Dimension(800, 600));
        setPreferredSize(new java.awt.Dimension(800, 600));
        setResizable(false);
        setSize(new java.awt.Dimension(800, 600));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(java.awt.SystemColor.activeCaption);

        jPanel3.setBackground(new java.awt.Color(0, 51, 102));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        userpic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/user_8742495.png"))); // NOI18N
        jPanel3.add(userpic, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 150, 142));

        lblWelcome.setFont(new java.awt.Font("Stencil", 0, 36)); // NOI18N
        lblWelcome.setForeground(new java.awt.Color(255, 255, 255));
        lblWelcome.setText("WELCOME");
        jPanel3.add(lblWelcome, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, -1, -1));

        lbladmin.setFont(new java.awt.Font("Myanmar Text", 1, 24)); // NOI18N
        lbladmin.setForeground(new java.awt.Color(255, 255, 255));
        lbladmin.setText("Admin");
        jPanel3.add(lbladmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 100, 40));

        btnDonors.setBackground(java.awt.SystemColor.activeCaption);
        btnDonors.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        btnDonors.setForeground(new java.awt.Color(102, 102, 102));
        btnDonors.setText("Donors ");
        btnDonors.setBorder(null);
        btnDonors.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDonorsActionPerformed(evt);
            }
        });
        jPanel3.add(btnDonors, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 280, 380, 70));

        btnReports.setBackground(java.awt.SystemColor.activeCaption);
        btnReports.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        btnReports.setForeground(new java.awt.Color(102, 102, 102));
        btnReports.setText("Reports");
        btnReports.setBorder(null);
        btnReports.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReportsActionPerformed(evt);
            }
        });
        jPanel3.add(btnReports, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 460, 380, 68));

        btnCampaigns.setBackground(java.awt.SystemColor.activeCaption);
        btnCampaigns.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        btnCampaigns.setForeground(new java.awt.Color(102, 102, 102));
        btnCampaigns.setText("Campaigns");
        btnCampaigns.setBorder(null);
        btnCampaigns.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCampaignsActionPerformed(evt);
            }
        });
        jPanel3.add(btnCampaigns, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 190, 380, 70));

        btnDonations.setBackground(java.awt.SystemColor.activeCaption);
        btnDonations.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        btnDonations.setForeground(new java.awt.Color(102, 102, 102));
        btnDonations.setText("Donations");
        btnDonations.setBorder(null);
        btnDonations.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDonationsActionPerformed(evt);
            }
        });
        jPanel3.add(btnDonations, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 370, 380, 70));

        btnLogout.setBackground(new java.awt.Color(204, 204, 204));
        btnLogout.setFont(new java.awt.Font("Yu Gothic Medium", 1, 14)); // NOI18N
        btnLogout.setForeground(new java.awt.Color(0, 51, 102));
        btnLogout.setText("Logout ");
        btnLogout.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });
        jPanel3.add(btnLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 520, 80, 40));

        lblcharityceylon.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblcharityceylon.setForeground(new java.awt.Color(0, 0, 153));
        lblcharityceylon.setText("CharityCeylon");
        jPanel3.add(lblcharityceylon, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 50, -1, -1));

        backgrounpic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/WhatsApp Image 2024-12-06 at 21.35.53_1fb5e01e.jpg"))); // NOI18N
        backgrounpic.setText("jLabel1");
        jPanel3.add(backgrounpic, new org.netbeans.lib.awtextra.AbsoluteConstraints(-210, 0, -1, -1));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 580));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        login login= new login();
        login.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void btnDonationsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDonationsActionPerformed
        DonationProcess donation= new DonationProcess();
        donation.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnDonationsActionPerformed

    private void btnCampaignsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCampaignsActionPerformed
        CampaignDetails campaigns= new CampaignDetails();
        campaigns.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnCampaignsActionPerformed

    private void btnReportsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReportsActionPerformed
        Report report= new Report();
        report.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnReportsActionPerformed

    private void btnDonorsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDonorsActionPerformed
        donorRegistration register= new donorRegistration();
        register .setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnDonorsActionPerformed

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
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backgrounpic;
    private javax.swing.JButton btnCampaigns;
    private javax.swing.JButton btnDonations;
    private javax.swing.JButton btnDonors;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnReports;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblWelcome;
    private javax.swing.JLabel lbladmin;
    private javax.swing.JLabel lblcharityceylon;
    private javax.swing.JLabel userpic;
    // End of variables declaration//GEN-END:variables
}
