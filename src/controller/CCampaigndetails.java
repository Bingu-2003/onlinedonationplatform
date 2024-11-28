/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import model.*;




public class CCampaigndetails {
    
       public void addProject(int project_id, String project_name, String category, String start_date, String end_date,double target_amount,String description)
   {
       MCampaigndetails add = new MCampaigndetails();
        add.addProject(project_id,project_name,category,start_date,end_date,target_amount,description);
      
   }
}
