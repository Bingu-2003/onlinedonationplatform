/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package inf;

/**
 *
 * @author Binguni
 */
public class donorRegistration extends javax.swing.JFrame {

    /**
     * Creates new form donorRegistration
     */
    public donorRegistration() {
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
        lblworldvision = new javax.swing.JLabel();
        lbllastname = new javax.swing.JLabel();
        lblname = new javax.swing.JLabel();
        lblpaymentpreferences = new javax.swing.JLabel();
        lblfirstname = new javax.swing.JLabel();
        lblcountry = new javax.swing.JLabel();
        lblemail = new javax.swing.JLabel();
        lblphoneno = new javax.swing.JLabel();
        txtflastname = new javax.swing.JTextField();
        txtcountry = new javax.swing.JTextField();
        txtemail = new javax.swing.JTextField();
        txtphoneno = new javax.swing.JTextField();
        txtfirstname1 = new javax.swing.JTextField();
        checkboxcash = new javax.swing.JCheckBox();
        checkboxewallet = new javax.swing.JCheckBox();
        checkboxbank = new javax.swing.JCheckBox();
        checkboxcard = new javax.swing.JCheckBox();
        btncancel = new javax.swing.JButton();
        btnregister = new javax.swing.JButton();
        picdonation = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblcountry1 = new javax.swing.JLabel();
        rbtnfemale = new javax.swing.JRadioButton();
        rbtnmale1 = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(java.awt.SystemColor.activeCaption);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblworldvision.setBackground(new java.awt.Color(0, 51, 102));
        lblworldvision.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblworldvision.setForeground(new java.awt.Color(0, 51, 102));
        lblworldvision.setText(" WorldVision SriLanka");
        jPanel1.add(lblworldvision, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 80, 150, 40));

        lbllastname.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lbllastname.setText("Last Name");
        jPanel1.add(lbllastname, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 170, 70, 30));

        lblname.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblname.setText("Name");
        jPanel1.add(lblname, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 70, 30));

        lblpaymentpreferences.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblpaymentpreferences.setText("Payment Preferences");
        jPanel1.add(lblpaymentpreferences, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 460, 130, 30));

        lblfirstname.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblfirstname.setText("First Name");
        jPanel1.add(lblfirstname, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 70, 30));

        lblcountry.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblcountry.setText("Gender");
        jPanel1.add(lblcountry, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 70, 30));

        lblemail.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblemail.setText("Email");
        jPanel1.add(lblemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, 70, 30));

        lblphoneno.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblphoneno.setText("Phone Number");
        jPanel1.add(lblphoneno, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, 130, 30));

        txtflastname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtflastnameActionPerformed(evt);
            }
        });
        jPanel1.add(txtflastname, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 200, 260, -1));

        txtcountry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcountryActionPerformed(evt);
            }
        });
        jPanel1.add(txtcountry, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 230, -1));

        txtemail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtemailActionPerformed(evt);
            }
        });
        jPanel1.add(txtemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, 230, -1));

        txtphoneno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtphonenoActionPerformed(evt);
            }
        });
        jPanel1.add(txtphoneno, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 430, 230, -1));
        jPanel1.add(txtfirstname1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 230, -1));

        checkboxcash.setText("Cash");
        jPanel1.add(checkboxcash, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 510, -1, -1));

        checkboxewallet.setText("E-wallets");
        checkboxewallet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkboxewalletActionPerformed(evt);
            }
        });
        jPanel1.add(checkboxewallet, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 510, -1, 20));

        checkboxbank.setText("Bank Deposit");
        jPanel1.add(checkboxbank, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 490, -1, 20));

        checkboxcard.setText("credit/Debit card");
        checkboxcard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkboxcardActionPerformed(evt);
            }
        });
        jPanel1.add(checkboxcard, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 490, -1, 20));

        btncancel.setBackground(new java.awt.Color(0, 51, 102));
        btncancel.setFont(new java.awt.Font("Verdana Pro Semibold", 1, 12)); // NOI18N
        btncancel.setForeground(new java.awt.Color(255, 255, 255));
        btncancel.setText("Cancel");
        btncancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncancelActionPerformed(evt);
            }
        });
        jPanel1.add(btncancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 560, 90, 30));

        btnregister.setBackground(new java.awt.Color(0, 51, 102));
        btnregister.setFont(new java.awt.Font("Verdana Pro Semibold", 1, 12)); // NOI18N
        btnregister.setForeground(new java.awt.Color(255, 255, 255));
        btnregister.setText("Register");
        btnregister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnregisterActionPerformed(evt);
            }
        });
        jPanel1.add(btnregister, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 560, 90, 30));

        picdonation.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/images (1).jpg"))); // NOI18N
        jPanel1.add(picdonation, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 0, 230, 160));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setText("Donor Registration Form");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 100, 210, 40));

        lblcountry1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblcountry1.setText("Country");
        jPanel1.add(lblcountry1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 70, 30));

        rbtnfemale.setText("Female");
        jPanel1.add(rbtnfemale, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 260, 60, -1));

        rbtnmale1.setText("Male");
        jPanel1.add(rbtnmale1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 60, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtemailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtemailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtemailActionPerformed

    private void txtphonenoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtphonenoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtphonenoActionPerformed

    private void txtflastnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtflastnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtflastnameActionPerformed

    private void txtcountryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcountryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcountryActionPerformed

    private void checkboxewalletActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkboxewalletActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkboxewalletActionPerformed

    private void checkboxcardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkboxcardActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkboxcardActionPerformed

    private void btncancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btncancelActionPerformed

    private void btnregisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnregisterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnregisterActionPerformed

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
    private javax.swing.JButton btncancel;
    private javax.swing.JButton btnregister;
    private javax.swing.JCheckBox checkboxbank;
    private javax.swing.JCheckBox checkboxcard;
    private javax.swing.JCheckBox checkboxcash;
    private javax.swing.JCheckBox checkboxewallet;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblcountry;
    private javax.swing.JLabel lblcountry1;
    private javax.swing.JLabel lblemail;
    private javax.swing.JLabel lblfirstname;
    private javax.swing.JLabel lbllastname;
    private javax.swing.JLabel lblname;
    private javax.swing.JLabel lblpaymentpreferences;
    private javax.swing.JLabel lblphoneno;
    private javax.swing.JLabel lblworldvision;
    private javax.swing.JLabel picdonation;
    private javax.swing.JRadioButton rbtnfemale;
    private javax.swing.JRadioButton rbtnmale1;
    private javax.swing.JTextField txtcountry;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txtfirstname1;
    private javax.swing.JTextField txtflastname;
    private javax.swing.JTextField txtphoneno;
    // End of variables declaration//GEN-END:variables
}
