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
public class DAO {
    
    public static int AddItem(Item itm) throws SQLException{
        
    int result = -1;
        DriverManager.registerDriver(new OracleDriver());
        Connection con = DriverManager.getConnection("jdbc:oracle:thin:@//iwishdb.casanqki8ga6.us-east-1.rds.amazonaws.com:1521/iwishdb","root","iwishroot");
        PreparedStatement pst = con.prepareStatement("insert into Item(Item_ID,Item_Descreption,Item_Name,Item_Price) values(Item_seq.nextval,?,?,?)", ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
         //pst.setInt(1,itm.getItem_ID());
        pst.setString(1,itm.getItem_Descreption());
           pst.setString(2,itm.getItem_Name());
        pst.setInt(3, Integer.parseInt(itm.getItem_Price()));
     
        
        result = pst.executeUpdate();
         pst.close();
        con.close();
    return result;
    }
    
    
}
