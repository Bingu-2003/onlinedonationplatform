/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import java.sql.*;




public class DBConnection {
    private static Connection con;
 public static Connection createDBConnection()
 {
     try{
         String url ="jdbc:mysql://localhost/donation";
         con=DriverManager.getConnection(url,"root","");
        }
     catch(SQLException e)
     {
         System.err.println(e.getMessage());
     }
     return con;

}
}
