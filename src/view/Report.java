/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;
import java.awt.BorderLayout;
import model.*;
import java.sql.*;
import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.view.JasperViewer;
import java.util.*;
import javax.swing.JOptionPane;
import java.util.logging.*;
import net.sf.jasperreports.swing.JRViewer;

public class Report extends javax.swing.JFrame {


    public Report() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btngenerate = new javax.swing.JButton();
        lblreport = new javax.swing.JLabel();
        lbldescription = new javax.swing.JLabel();
        lblcharityceylon = new javax.swing.JLabel();
        lblreports = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        reportPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Reports");
        setSize(new java.awt.Dimension(800, 600));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(java.awt.SystemColor.activeCaption);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btngenerate.setBackground(new java.awt.Color(204, 204, 204));
        btngenerate.setFont(new java.awt.Font("Verdana Pro Semibold", 1, 14)); // NOI18N
        btngenerate.setText("Generate Report");
        btngenerate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btngenerateActionPerformed(evt);
            }
        });
        jPanel1.add(btngenerate, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 90, 190, 46));

        lblreport.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lblreport.setText("Campaign Report");
        jPanel1.add(lblreport, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 207, 49));

        lbldescription.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lbldescription.setText("Displays the total donations collected for each campaign.");
        jPanel1.add(lbldescription, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 480, 70));

        lblcharityceylon.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        lblcharityceylon.setForeground(new java.awt.Color(0, 51, 102));
        lblcharityceylon.setText("ChairtyCeylon");
        jPanel1.add(lblcharityceylon, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 10, -1, -1));

        lblreports.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        lblreports.setForeground(new java.awt.Color(0, 0, 153));
        lblreports.setText("Reports");
        jPanel1.add(lblreports, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 30, -1, -1));

        btnBack.setBackground(new java.awt.Color(204, 204, 204));
        btnBack.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnBack.setForeground(new java.awt.Color(0, 0, 51));
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        jPanel1.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 550, -1, 40));

        reportPanel.setLayout(new java.awt.BorderLayout());
        jPanel1.add(reportPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 780, 390));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btngenerateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btngenerateActionPerformed
         
     
        try 
        {
            JasperReport jasperReport = JasperCompileManager.compileReport("C:\\Users\\Binguni\\Desktop\\Money donation system\\src\\view\\report.jrxml"); 
            
            Connection con = DBConnection.createDBConnection();
            
            if (con != null) 
            {
                JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, new HashMap<>(), con);
                JRViewer viewer = new JRViewer(jasperPrint);

                reportPanel.removeAll();
                reportPanel.add(viewer, BorderLayout.CENTER);
                reportPanel.revalidate();
                reportPanel.repaint();
            }
            else 
            {
                JOptionPane.showMessageDialog(this, "Error: Unable to establish database connection.");
            }
        } 
        catch (Exception ex) 
        {
            
            JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage());
        }
    
    
     

         

    }//GEN-LAST:event_btngenerateActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        Dashboard home= new Dashboard();
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
            java.util.logging.Logger.getLogger(Report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Report().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btngenerate;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblcharityceylon;
    private javax.swing.JLabel lbldescription;
    private javax.swing.JLabel lblreport;
    private javax.swing.JLabel lblreports;
    private javax.swing.JPanel reportPanel;
    // End of variables declaration//GEN-END:variables
}
