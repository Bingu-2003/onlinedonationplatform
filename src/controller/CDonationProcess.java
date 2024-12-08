/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import model.*;

public class CDonationProcess {
    
    public void doneDonation(int donor_id,String donor_name,String campaign_name,Double donation_amount,String payment_method,String date)
   {
       MDonationProcess done = new MDonationProcess();
       done.doneDonation(donor_id, donor_name,campaign_name,donation_amount,payment_method,date);
   } 
}
