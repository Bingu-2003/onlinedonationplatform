/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import java.sql.*;

public class MCampaigndetails {
    public void addProject(int project_id, String project_name, String category, String start_date, String end_date,double target_amount,String description )
    {
        
        try
        {
            Statement st = DBConnection.createDBConnection().createStatement();
            st.executeUpdate("insert into Project values(' "+project_id+" ',' "+project_name+" ', ' "+category+" ', ' "+start_date+" ', ' "+end_date+" ', ' "+target_amount+" ','"+description+"')");
            System.out.println("Project is added.");
        }
        catch(SQLException e)
        {
            System.err.println(e.getMessage());
        }  
    }
    

}
