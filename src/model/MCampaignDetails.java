/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import java.sql.*;

public class MCampaignDetails {
    
      public void addCampaign(int campaign_id, String campaign_name,String category,String start_date, String end_date,Double target_amount,String description)
    {
        try
        {
            Statement st = DBConnection.createDBConnection().createStatement();
            int rowsInserted = st.executeUpdate("insert into Campaign values(' "+campaign_id+" ' , ' "+campaign_name+" ',' "+category+"','"+start_date+"','"+end_date+"','"+target_amount+"','"+description+"')");
            
            if (rowsInserted > 0) {
             System.out.println("new campaign is added.");
           }
        }
        catch(SQLException e)
        {
            System.err.println(e.getMessage());
        }
         
        
    }
     
     public void updateCampaign(String campaign_id, String campaign_name,String category,String start_date, String end_date,String target_amount,String description)
    {
        try 
        {
            Statement st = DBConnection.createDBConnection().createStatement();
            int rowsInserted = st.executeUpdate("UPDATE Campaign SET  campaign_name = '"+campaign_name+"' , category = '"+ category+"' ,start_date = '"+start_date+"' , end_date = '"+end_date+"' , target_amount = '"+target_amount+"',description = '"+description+"' WHERE campaign_id = '"+campaign_id+"'");
           
            if (rowsInserted > 0) {
             System.out.println("Campaign details updated");
           }
        } 
        catch (SQLException e) {

            System.err.println(e.getMessage());
        }
    }
     
   public void deleteCampaign(String campaign_id) 
    {
        try 
        {
            Statement st = DBConnection.createDBConnection().createStatement();
            st.executeUpdate("DELETE FROM Campaign WHERE campaign_id = '"+campaign_id+"' ");
            System.out.println("Campaign successfully deleted.");

        } 
        catch (SQLException e) 
        {
           System.err.println(e.getMessage());
        }
    }
     
    public int getNextCampaignId() {
        int nextId = 1;
        try {
            
            Statement st = DBConnection.createDBConnection().createStatement();
            ResultSet rs = st.executeQuery("SELECT MAX(campaign_id) AS MaxID FROM Campaign");
            
            if (rs.next()) {
                int maxId = rs.getInt("MaxID");
                nextId = maxId + 1; 
            }
            
        } catch (SQLException ex) {
            System.err.println("Error fetching next Campaign ID: " + ex.getMessage());
        }
        
        return nextId;
    }
    
}
