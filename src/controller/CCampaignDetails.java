/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import model.*;

public class CCampaignDetails {
     public void addCampaign(int campaign_id,String campaign_name,String category,String start_date,String end_date,Double target_amount,String description)
   {
       MCampaignDetails addC = new MCampaignDetails ();
       addC.addCampaign(campaign_id,campaign_name,category,start_date,end_date,target_amount,description);
   } 
    
    public void updateCampaign(String campaign_id,String campaign_name,String category,String start_date,String end_date, String target_amount,String description)
   {
       MCampaignDetails  updateC = new MCampaignDetails ();
       updateC.updateCampaign(campaign_id,campaign_name,category,start_date,end_date,target_amount,description);
   }
    public void deleteCampaign(String campaign_id) 
    {
        MCampaignDetails  deleteC = new MCampaignDetails ();
        deleteC.deleteCampaign(campaign_id);
    }   
}
