/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import oracle.jdbc.OracleDriver;

/**
 *
 * @author JESSY
 */
public class DAO extends ParentConnection{
    
    public static int AddItem(Item itm) throws SQLException{
        
    int result = -1;
        //DriverManager.registerDriver(new OracleDriver());
        //Connection con = DriverManager.getConnection("jdbc:oracle:thin:@//iwishdb.casanqki8ga6.us-east-1.rds.amazonaws.com:1521/iwishdb","root","iwishroot");
       PreparedStatement  pst = con.prepareStatement("insert into Item(Item_ID,Item_Descreption,Item_Name,Item_Price) values(Item_seq.nextval,?,?,?)", ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
         //pst.setInt(1,itm.getItem_ID());
        pst.setString(1,itm.getDesc());
           pst.setString(2,itm.getName());
        pst.setInt(3, Integer.parseInt(itm.getPrice()));
     
        
        result = pst.executeUpdate();
         pst.close();
        con.close();
    return result;
    }
    
    public static int AddUser(User user) throws SQLException{
        
    int result = -1;
        //DriverManager.registerDriver(new OracleDriver());
        //Connection con = DriverManager.getConnection("jdbc:oracle:thin:@//iwishdb.casanqki8ga6.us-east-1.rds.amazonaws.com:1521/iwishdb","root","iwishroot");
        PreparedStatement pst = con.prepareStatement("insert into User_Info(User_ID, User_Email, User_password, User_Name, User_Balance, USER_SEQ_ANSWER) "
                + "values(Item_seq.nextval,?,?,?,0,?)", ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);

        pst.setString(1,user.getEmail());
        pst.setString(2,user.getPassword());
        pst.setString(3,user.getUsername());
        pst.setString(4,user.getSecurityQuestion());
        
        result = pst.executeUpdate();
        pst.close();
        //con.close();
    return result;
    }
}
