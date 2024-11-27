/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import java.sql.*;
import javax.swing.JOptionPane;

public class MdonorRegistration {
    
    
    
    
   public void registerDonor(int donor_id, String donor_name, String gender, String address, String email, String phone) {
        // Step 2: Insert the data into the database
    try {
        // Establish a connection
        Connection conn = DBConnection.createDBConnection();

        // Prepare the SQL query
        String sql = "INSERT INTO Donor (Donor_id, Donor_name, gender, address, email, hone) VALUES (?, ?, ?, ?, ?, ?)";
        PreparedStatement pstmt = conn.prepareStatement(sql);

        // Set the parameters
        pstmt.setInt(1, donor_id);
        pstmt.setString(2, donor_name);
        pstmt.setString(3, gender);
        pstmt.setString(4, address);
        pstmt.setString(5, email);
        pstmt.setString(6, phone);

        // Execute the query
        int rowsInserted = pstmt.executeUpdate();
        if (rowsInserted > 0) {
            JOptionPane.showMessageDialog(null, "Donor registered successfully!");
        }

        // Close resources
        pstmt.close();
        conn.close();

    } catch (SQLException ex) {
        ex.printStackTrace();
        JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());
    }
                 
   }}
   


    

