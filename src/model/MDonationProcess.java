/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import java.sql.*;

public class MDonationProcess {
    public void doneDonation(int donor_id, String donor_name,String campaign_name,Double donation_amount, String payment_method,String date)
    {
        try {         
 
            String query = "INSERT INTO donate (donor_id, donor_name, campaign_name, donation_amount, payment_method, date) VALUES (?, ?, ?, ?, ?, ?)";
            
            PreparedStatement stmt = DBConnection.createDBConnection().prepareStatement(query);

           
            stmt.setInt(1, donor_id);
            stmt.setString(2, donor_name);
            stmt.setString(3, campaign_name);
            stmt.setDouble(4, donation_amount);
            stmt.setString(5, payment_method);
            stmt.setString(6, date);  
          
            int rowsInserted = stmt.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("Donation process is Done.");
            }
        } catch(SQLException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
         
}
