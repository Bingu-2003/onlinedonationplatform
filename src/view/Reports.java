
package view;
import java.sql.*;
import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.view.JasperViewer;
import java.util.HashMap;
import javax.swing.JOptionPane;


public class Reports extends javax.swing.JFrame {

   
    public Reports() {
       
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnCampaignReport = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnCampaignReport.setText("Print");
        btnCampaignReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCampaignReportActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(530, Short.MAX_VALUE)
                .addComponent(btnCampaignReport)
                .addGap(198, 198, 198))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(128, 128, 128)
                .addComponent(btnCampaignReport)
                .addContainerGap(431, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCampaignReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCampaignReportActionPerformed
    
       try {
        // Establish database connection
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/Donation", "root", "");

        // SQL query for campaign-wise report data
        String sql = "SELECT c.campaign_name AS CampaignName, " +
                     "c.target_amount AS TargetAmount, " +
                     "IFNULL(SUM(d.donation_amount), 0) AS TotalDonations, " +
                     "(c.target_amount - IFNULL(SUM(d.donation_amount), 0)) AS RemainingAmount " +
                     "FROM Campaign c " +
                     "LEFT JOIN Donate d ON c.campaign_name = d.campaign_name " +
                     "GROUP BY c.campaign_id, c.campaign_name, c.target_amount";

        // Prepare the SQL query and get the result set
        PreparedStatement pst = conn.prepareStatement(sql);
        ResultSet rs = pst.executeQuery();

        // Generate JasperReport using the result set as a data source
        String reportPath = "path/to/your_report.jasper"; // Replace with the actual .jasper file path
        JRResultSetDataSource jrDataSource = new JRResultSetDataSource(rs);
        JasperPrint jasperPrint = JasperFillManager.fillReport(reportPath, new HashMap<>(), jrDataSource);

        // Display the report in a viewer
        JasperViewer.viewReport(jasperPrint, false);

        // Close resources
        rs.close();
        pst.close();
        conn.close();

    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "SQL Error: " + ex.getMessage());
    } catch (JRException ex) {
        JOptionPane.showMessageDialog(null, "JasperReports Error: " + ex.getMessage());
    }


    }//GEN-LAST:event_btnCampaignReportActionPerformed

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
            java.util.logging.Logger.getLogger(Reports.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Reports.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Reports.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Reports.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Reports().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCampaignReport;
    // End of variables declaration//GEN-END:variables
}
