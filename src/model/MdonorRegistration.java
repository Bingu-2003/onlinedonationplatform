/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import java.sql.*;
import javax.swing.JOptionPane;

public class MdonorRegistration {
    
    
    
     public void registerDonor(int donor_id, String donor_name,String gender,String address, String email,String phone)
    {
        try
        {
            Statement st = DBConnection.createDBConnection().createStatement();
            int rowsInserted = st.executeUpdate("insert into donor values(' "+donor_id+" ' , ' "+donor_name+" ',' "+gender+"','"+address+"','"+email+"','"+phone+"')");
            
            if (rowsInserted > 0) {
             System.out.println("Donor successfully registered.");
           }
        }
        catch(SQLException e)
        {
            System.err.println(e.getMessage());
        }
         
        
    }
     
     public void updateDonor(String donor_id, String donor_name, String gender, String address, String email, String phone) 
    {
        try 
        {
            Statement st = DBConnection.createDBConnection().createStatement();
            int rowsInserted = st.executeUpdate("UPDATE Donor SET  donor_name = '"+donor_name+"' , gender = '"+ gender+"' , email = '"+email+"' , address = '"+address+"' , phone = '"+phone+"' WHERE donor_id = '"+donor_id+"'");
           
            if (rowsInserted > 0) {
             System.out.println("Donor updated.");
           }
        } 
        catch (SQLException e) {

            System.err.println(e.getMessage());
        }
    }
     
   public void deleteDonor(String donor_id) 
    {
        try 
        {
            Statement st = DBConnection.createDBConnection().createStatement();
            st.executeUpdate("DELETE FROM Donor WHERE donor_id = '"+donor_id+"' ");
            System.out.println("Donor successfully deleted.");

        } 
        catch (SQLException e) 
        {
           System.err.println(e.getMessage());
        }
    }
     
     
   }
   


    

