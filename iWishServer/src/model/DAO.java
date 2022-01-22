/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import com.google.gson.JsonObject;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import oracle.jdbc.OracleDriver;

/**
 *
 * @author JESSY
 */
public class DAO {

    static Connection con;
    static ResultSet rs;

    static {
        try {
            DriverManager.registerDriver(new OracleDriver());
            con = DriverManager.getConnection("jdbc:oracle:thin:@//iwishdb.casanqki8ga6.us-east-1.rds.amazonaws.com:1521/iwishdb", "root", "iwishroot");
        } catch (SQLException ex) {
            Logger.getLogger(DAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static int AddItem(Item itm) throws SQLException {

        int result = -1;
        PreparedStatement pst = con.prepareStatement("insert into Item(Item_ID,Item_Descreption,Item_Name,Item_Price) values(Item_seq.nextval,?,?,?)", ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
        //pst.setInt(1,itm.getItem_ID());
        pst.setString(1, itm.getDesc());
        pst.setString(2, itm.getName());
        pst.setInt(3, Integer.parseInt(itm.getPrice()));

        result = pst.executeUpdate();
        pst.close();
        return result;
    }

    public static boolean AddUser(User user) throws SQLException {

        //select from user_info
        String sql = "select User_Email from User_Info where User_Email=?";
        PreparedStatement pst = con.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
        pst.setString(1, user.getEmail());
        rs = pst.executeQuery();
        if (rs.next()) {
            return false;
        } else {
            // Insert into user_info
            pst = con.prepareStatement("insert into User_Info(User_ID, User_Email, User_password, User_Name, User_Balance, USER_SEQ_ANSWER) "
                    + "values(Item_seq.nextval,?,?,?,0,?)", ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            pst.setString(1, user.getEmail());
            pst.setString(2, user.getPassword());
            pst.setString(3, user.getUsername());
            pst.setString(4, user.getSecurityQuestion());
            pst.executeUpdate();
            pst.close();
            return true;
        }
    }

    public static boolean selectuser(User user) throws SQLException {
        DriverManager.registerDriver(new OracleDriver());

        PreparedStatement pst = con.prepareStatement("select User_Email,USER_SEQ_ANSWER from  User_Info where User_Email=? ", ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
        pst.setString(1, user.getEmail());
        // pst.setString(2, user.getSecurityQuestion());
        ResultSet rs = pst.executeQuery();

        if (rs.next()) {
            return true;
        } else {
            return false;
        }

    }

    public static boolean update(User user) throws SQLException {
        int result = -1;

        DriverManager.registerDriver(new OracleDriver());

        PreparedStatement pst = con.prepareStatement("update User_Info set User_Password=?  where User_Email=? ", ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);

        pst.setString(1, user.getPassword());
        pst.setString(2, user.getEmail());

        result = pst.executeUpdate();
        //System.out.println(result);
        if (result == 1) {
            return true;
        } else {

            return false;
        }

    }

}
