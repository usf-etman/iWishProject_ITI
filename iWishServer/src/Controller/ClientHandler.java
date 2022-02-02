/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.ServerUI;
import com.google.gson.Gson;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.net.SocketException;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Platform;
import model.DAO;
import model.Item;
import model.PendingRequest;
import model.User;
import model.Recharge;
import model.WishList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 *
 * @author Youssef
 */
public class ClientHandler extends Thread {

    DataInputStream dis;
    PrintStream ps;
    Socket waiter;
    ServerUI root;
    String IP;
    static Vector<ClientHandler> clientsVector = new Vector<ClientHandler>();

    ClientHandler(Socket waiter, ServerUI root) throws IOException {
        this.waiter = waiter;
        this.root = root;
        IP = String.valueOf(waiter.getInetAddress());
        dis = new DataInputStream(waiter.getInputStream());
        ps = new PrintStream(waiter.getOutputStream());
        ClientHandler.clientsVector.add(this);
    }

    @Override
    public void run() {
        while (true) {
            try {

                String msg = dis.readLine(); //recieve msg from client
                JSONObject jmsg = new JSONObject(msg); //convert msg from string to JSONObject
                String key = jmsg.getString("Key"); //parsing
                String value;
                Gson gson;
                switch (key) {
                    case "Register":
                        gson = new Gson();
                        value = jmsg.getString("Value");
                        User user = gson.fromJson(value, User.class);
                        boolean registerStatus = DAO.AddUser(user);
                        jmsg = new JSONObject();
                        jmsg.put("Key", "Register");
                        jmsg.put("Value", registerStatus);
                        ps.println(jmsg);
                        break;
                    case "Recharge":
                        gson = new Gson();
                        value = jmsg.getString("Value");
                        Recharge recharge = gson.fromJson(value, Recharge.class);
                        User RechargeStatus = DAO.rechargeAmount(recharge);
                        String jsonRecharge = gson.toJson(RechargeStatus); // convert loginstatus from java object to json
                        jmsg = new JSONObject();
                        jmsg.put("Key", "Recharge");
                        jmsg.put("Value", jsonRecharge);
                        ps.println(jmsg);
                        break;
                    case "forget":
                        gson = new Gson();
                        value = jmsg.getString("Value");
                        User user2 = gson.fromJson(value, User.class);
                        boolean forgetStatus = DAO.selectuser(user2);
                        jmsg = new JSONObject();
                        jmsg.put("Key", "forget");
                        jmsg.put("Value", forgetStatus);
                        ps.println(jmsg);
                        break;
                    case "reset":
                        value = jmsg.getString("Value");
                        gson = new Gson();
                        User user3 = gson.fromJson(value, User.class);
                        boolean resetStatus = DAO.update(user3);
                        jmsg = new JSONObject();
                        jmsg.put("Key", "reset");
                        jmsg.put("Value", resetStatus);
                        ps.println(jmsg);
                        break;
                    case "login":
                        gson = new Gson();
                        value = jmsg.getString("Value");
                        User userlog = gson.fromJson(value, User.class); //converts from json string to Java Object
                        User loginStatus = DAO.loginUser(userlog);
                        String jsonUser = gson.toJson(loginStatus); // convert loginstatus from java object to json
                        jmsg = new JSONObject();
                        jmsg.put("Key", "login");
                        jmsg.put("Value", jsonUser);
                        ps.println(jmsg);
                        break;
                    case "ShowItems":
                        Gson gsonItm = new Gson();
                        Vector<Item> ItemResult = DAO.SelectItems();
                        System.out.println(ItemResult.size());
                        jmsg = new JSONObject();
                        jmsg.put("Key", "VectorSize");
                        jmsg.put("size", ItemResult.size());
                        ps.println(jmsg);
                        for (int i = 0; i < ItemResult.size(); i++) {
                            gson = new Gson();
                            String jsonItem = gson.toJson(ItemResult.get(i));
                            jmsg = new JSONObject();
                            jmsg.put("Key", "ShowItems");
                            jmsg.put("size", ItemResult.size());
                            jmsg.put("Value", jsonItem);
                            ps.println(jmsg);
                        }
                        break;
                    case "showFriend":
                        Gson gsonuser1 = new Gson();
                        // String value1;
                        int UID1 = jmsg.getInt("Value");
                        Vector<User> userinfo1 = DAO.ShowFriend(UID1);
                        System.out.println(userinfo1.size());
                        jmsg = new JSONObject();
                        jmsg.put("Key", "VectorSize");
                        jmsg.put("size", userinfo1.size());
                        ps.println(jmsg);
                        for (int i = 0; i < userinfo1.size(); i++) {
                            gson = new Gson();
                            String jsonuser = gson.toJson(userinfo1.get(i));
                            jmsg = new JSONObject();
                            jmsg.put("Key", "showFriend");
                            jmsg.put("size", userinfo1.size());
                            jmsg.put("Value", jsonuser);
                            ps.println(jmsg);
                        }
                        break;
                    case "DisplayFriend":
                        Gson gsonuser = new Gson();
                        int d = 0;
                        // String value1;
                        int UID = jmsg.getInt("Value");
                        Vector<User> userinfo = DAO.ReturnFriend(UID);
                        System.out.println(userinfo.size());
                        jmsg = new JSONObject();
                        jmsg.put("Key", "VectorSize");
                        jmsg.put("size", userinfo.size());
                        ps.println(jmsg);
                        for (int i = 0; i < userinfo.size(); i++) {
                            gson = new Gson();
                            String jsonuser = gson.toJson(userinfo.get(i));
                            jmsg = new JSONObject();
                            jmsg.put("Key", "DisplayFriend");
                            jmsg.put("size", userinfo.size());
                            jmsg.put("Value", jsonuser);
                            ps.println(jmsg);
                        }
                        break;
                    case "pendingfriends":
                        int UIDP = jmsg.getInt("Value");
                        Vector<User> userpending = DAO.PendingFriend(UIDP);
                        System.out.println(userpending.size());
                        jmsg = new JSONObject();
                        jmsg.put("Key", "VectorSize");
                        jmsg.put("size", userpending.size());
                        ps.println(jmsg);
                        for (int i = 0; i < userpending.size(); i++) {
                            gson = new Gson();
                            String jsonuser = gson.toJson(userpending.get(i));
                            jmsg = new JSONObject();
                            jmsg.put("Key", "pendingfriends");
                            jmsg.put("size", userpending.size());
                            jmsg.put("Value", jsonuser);
                            ps.println(jmsg);
                        }
                        break;
                    case "AddToWishList":
                        gson = new Gson();
                        value = jmsg.getString("Value");
                        WishList wshlst = gson.fromJson(value, WishList.class);
                        int wshlstStatus = DAO.AddToWishlist(wshlst);
                        jmsg = new JSONObject();
                        jmsg.put("Key", "AddToWishList");
                        jmsg.put("Value", wshlstStatus);
                        ps.println(jmsg);
                        break;
                    case "AddToPending":
                        gson = new Gson();
                        value = jmsg.getString("Value");
                        PendingRequest pndngRqust = gson.fromJson(value, PendingRequest.class);
                        int pendingStatus = DAO.AddToPending(pndngRqust);
                        jmsg = new JSONObject();
                        jmsg.put("Key", "AddToWishList");
                        jmsg.put("Value", pendingStatus);
                        ps.println(jmsg);
                        break;
                    case "DeletefromPending":
                        gson = new Gson();
                        value = jmsg.getString("Value");
                        PendingRequest delRqust = gson.fromJson(value, PendingRequest.class);
                        int delStatus = DAO.DeleteRequest(delRqust);
                        jmsg = new JSONObject();
                        jmsg.put("Key", "DeletefromPending");
                        jmsg.put("Value", delStatus);
                        ps.println(jmsg);
                        break;
                    case "AddToflist":
                        gson = new Gson();
                        value = jmsg.getString("Value");
                        PendingRequest FriendRqust = gson.fromJson(value, PendingRequest.class);
                        int friendStatus = DAO.AddToFriendlist(FriendRqust);
                        jmsg = new JSONObject();
                        jmsg.put("Key", "AddToflist");
                        jmsg.put("Value", friendStatus);
                        ps.println(jmsg);
                        break;
                    case "DisplayWishlist":
                        gson = new Gson();
                        int userID = jmsg.getInt("Value");
                        Vector<Item> itms = DAO.DisplayWishlist(userID);
                        jmsg = new JSONObject();
                        jmsg.put("Key", "VectorSize");
                        jmsg.put("size", itms.size());
                        ps.println(jmsg);
                        System.out.println(jmsg);
                        for (int i = 0; i < itms.size(); i++) {
                            Item itm = itms.get(i);
                            gson = new Gson();
                            String json = gson.toJson(itm);
                            jmsg = new JSONObject();
                            jmsg.put("Key", "ShowItems");
                            jmsg.put("Value", json);
                            System.out.println(jmsg);
                            ps.println(jmsg);
                        }
                        System.out.println("Done");
                        break;
                           case "Friendwishlist":
                            Gson gsonwish = new Gson();
                            int uid = jmsg.getInt("Value");
                        Vector<Item> wishResult = DAO.SelectFriendwishlist(uid);
                        System.out.println(wishResult.size());
                        jmsg = new JSONObject();
                        jmsg.put("Key", "VectorSize");
                        jmsg.put("size", wishResult.size());
                        ps.println(jmsg);
                        for (int i = 0; i < wishResult.size(); i++) {
                            gson = new Gson();
                            String jsonwish = gson.toJson(wishResult.get(i));
                            jmsg = new JSONObject();
                            jmsg.put("Key", "Friendwishlist");
                            jmsg.put("size", wishResult.size());
                            jmsg.put("Value", jsonwish);
                            ps.println(jmsg);
                        }
                        break;
                }
                //root.getTxtLog().appendText(msg + "\n");
            } catch (SocketException ex) {
                try {
                    dis.close();
                    ps.close();
                    waiter.close();
                    clientsVector.remove(this);
                    Platform.runLater(new Runnable() {
                        public void run() {
                            root.getTxtLog().appendText(IP + " has disconnected\n");
                            root.getLblClients().setText(ClientHandler.getClientsNum());
                        }
                    });
                    this.stop();
                } catch (IOException ex1) {
                    Logger.getLogger(ClientHandler.class.getName()).log(Level.SEVERE, null, ex1);
                }
            } catch (IOException ex) {
                Logger.getLogger(ClientHandler.class.getName()).log(Level.SEVERE, null, ex);
            } catch (JSONException ex) {
                Logger.getLogger(ClientHandler.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(ClientHandler.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public static String getClientsNum() {
        return (String.valueOf(clientsVector.size()));
    }
    
    public static void closeConnections() throws IOException{
        for(int i=0; i<clientsVector.size(); i++){
            clientsVector.get(i).dis.close();
            clientsVector.get(i).ps.close();
            clientsVector.get(i).waiter.close();
            clientsVector.get(i).stop();
        }
    }
}
