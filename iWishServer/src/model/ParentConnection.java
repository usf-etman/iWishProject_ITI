/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import oracle.jdbc.OracleDriver;

/**
 *
 * @author JESSY
 */
public class ParentConnection {
static   Connection con ;
//static PreparedStatement pst;
   //PreparedStatement pst = null;
   //public ParentConnection() { 
static{
    try {
         DriverManager.registerDriver(new OracleDriver());
         con = DriverManager.getConnection("jdbc:oracle:thin:@//iwishdb.casanqki8ga6.us-east-1.rds.amazonaws.com:1521/iwishdb","root","iwishroot");
    } catch (SQLException ex) {
        Logger.getLogger(ParentConnection.class.getName()).log(Level.SEVERE, null, ex);
    }
           
   }
}
