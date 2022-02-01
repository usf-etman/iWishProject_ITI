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
import java.util.Vector;
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

    public static int AddToWishlist(WishList wishlst) throws SQLException {
        int result = -1;
        
        String sql = "insert into Wish_List(Wish_ID,User_ID,Item_ID,Item_Price) values(WishListSEQ.nextval,?,?,?)";
        PreparedStatement pst = con.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
        //pst.setInt(1, wishlst.getWish_ID());
        pst.setInt(1, wishlst.getUser_ID());
        pst.setInt(2, wishlst.getItem_ID());
        pst.setInt(3, wishlst.getItem_Price());
        result = pst.executeUpdate();
        pst.close();
        //System.out.println(result);
        return result;
    }
    public static int DeleteItem(Item itm) throws SQLException {
        int result = -1;
        PreparedStatement pst = con.prepareStatement("delete from Item where Item_ID =? ", ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
        pst.setInt(1,itm.getId());
      
        result = pst.executeUpdate();
        pst.close();
        return result;
    }

    public static Vector<Item> SelectItems() throws SQLException {
        Vector<Item> result = new Vector<Item>();
        PreparedStatement pst = con.prepareStatement("select * from Item", ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
        ResultSet rs = pst.executeQuery();
        while (rs.next()) {
            result.add(new Item(rs.getInt("Item_ID"), rs.getString("Item_Name"), rs.getString("Item_Price"), rs.getString("Item_Descreption")));
        }
        return result;
    }


    public static Vector<User> ReturnFriend(int uid) throws SQLException {
        Vector<User> res = new Vector<User>();
        String sql ="SELECT USER_ID, USER_NAME FROM USER_INFO WHERE USER_ID  NOT IN (SELECT FRIEND_ID FROM FRIEND_LIST WHERE USER_ID=?) AND USER_ID NOT IN (SELECT  USER_ID FROM Pending_Request WHERE Sender_ID=?)  AND USER_ID != ?";
        PreparedStatement pst = con.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
         pst.setInt(1, uid);
        pst.setInt(2, uid);
          pst.setInt(3, uid);
        ResultSet rs = pst.executeQuery();
        while (rs.next()) {
            User selected_user = new User();
            selected_user.setUsername(rs.getString("user_name"));
            selected_user.setUID(rs.getInt("user_ID"));
            // res.add();
            res.add(selected_user);
        }
        return res;

    }

        public static Vector<User> ShowFriend(int uid1) throws SQLException {
        Vector<User> res1 = new Vector<User>();
        PreparedStatement pst = con.prepareStatement("SELECT USER_ID, USER_NAME FROM USER_INFO WHERE USER_ID IN (SELECT FRIEND_ID FROM FRIEND_LIST WHERE USER_ID = ?) AND USER_ID !=?", ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
         pst.setInt(1, uid1);
        pst.setInt(2, uid1);
        ResultSet rs = pst.executeQuery();
        while (rs.next()) {
            User selected_user1 = new User();
            selected_user1.setUsername(rs.getString("user_name"));
            selected_user1.setUID(rs.getInt("user_ID"));
            // res.add();
            res1.add(selected_user1);
        }
        return res1;

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

    public static User loginUser(User user) throws SQLException { //user object
        DriverManager.registerDriver(new OracleDriver());
        PreparedStatement pst = con.prepareStatement("select USER_ID, User_Name, User_Balance from User_Info where USER_EMAIL = ? AND User_password = ? ", ResultSet.TYPE_SCROLL_INSENSITIVE,
                ResultSet.CONCUR_READ_ONLY);

        pst.setString(1, user.getEmail());
        pst.setString(2, user.getPassword());
        ResultSet resultSet = pst.executeQuery();
        User resultUser = new User();

        if (resultSet.next()) {
            resultUser.setUID(resultSet.getInt(1));
            resultUser.setUsername(resultSet.getString(2));
            resultUser.setBalance(resultSet.getInt(3));
            return resultUser;
        } else {
            return null;
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

        PreparedStatement pst = con.prepareStatement("update User_Info set User_Password=?  where User_Email=? and User_Name=?", ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);

        pst.setString(1, user.getPassword());
        pst.setString(2, user.getEmail());
         pst.setString(3,user.getUsername());

        result = pst.executeUpdate();
        //System.out.println(result);
        if (result == 1) {
            return true;
        } else {

            return false;
        }

    }
    
    /////////////////////////////friend requests////////////////////////////////////////////////////////
    public static int AddToPending(PendingRequest pndngRqust) throws SQLException {
        int result = -1;
        
        String sql = "insert into Pending_Request(Request_ID,User_ID,Sender_ID) values(PendingRqustSEQ.nextval,?,?)";
        PreparedStatement pst = con.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
        pst.setInt(1, pndngRqust.getUser_ID());
        pst.setInt(2, pndngRqust.getSender_ID());       
        result = pst.executeUpdate();
        pst.close();       
        return result;
    }

}
