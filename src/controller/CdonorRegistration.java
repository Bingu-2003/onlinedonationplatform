/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import model.*;


public class CdonorRegistration {
    
    public void registerDonor(int donor_id,String donor_name,String gender,String address,String email, String phone)
   {
       MdonorRegistration regD = new MdonorRegistration();
       regD.registerDonor(donor_id, donor_name,gender,address,email,phone);
   } 
    
    public void updateDonor(String donor_id,String donor_name,String gender,String address,String email, String phone)
   {
       MdonorRegistration updateD = new MdonorRegistration ();
       updateD.updateDonor(donor_id, donor_name,gender,address,email,phone);
   }
    public void deleteDonor(String donor_id) 
    {
        MdonorRegistration deleteD = new MdonorRegistration();
        deleteD.deleteDonor(donor_id);
    }   
   }
    


    
    
    
    
