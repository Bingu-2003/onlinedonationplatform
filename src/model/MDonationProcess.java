/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import java.sql.*;

public class MDonationProcess {
    public void doneDonation(int donor_id, String donor_name,String campaign_name,Double donation_amount, String payment_method,String date)
    {
        try
        {
            Statement st = DBConnection.createDBConnection().createStatement();
            int rowsInserted = st.executeUpdate("insert into donate values(' "+donor_id+" ' , ' "+donor_name+" ',' "+campaign_name+"','"+donation_amount+"','"+payment_method+"','"+date+"')");
            
            if (rowsInserted > 0) {
             System.out.println("Donation process is Done.");
           }
        }
        catch(SQLException e)
        {
            System.err.println(e.getMessage());
        }
    }
         
}
