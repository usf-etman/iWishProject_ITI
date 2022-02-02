/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.LoginUI;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.net.ConnectException;
import java.net.Socket;
import java.net.SocketException;
import java.util.HashMap;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Countribution;
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
public class ParentController {

    static Socket socket;
    static DataInputStream dis;
    static PrintStream ps;
    static String loginStatus;
    static String status;

    //private static int UID;
    //static User my_info;
    static User friend_info;
    static User friend_info1;
    static User friend_info2;

    private static User my_info;
    static String responseString;
    static boolean blockingFlag = true;
    static boolean rechargeFlag = true;
    static boolean responseFlag;
    static Item itm;
    static Item mapKey;
    static Vector<Item> itmVector;
    static Vector<User> uservector;
    static Vector<User> uservector1;
    static Vector<User> uservector2;

    static int vectorSize;
    static int mapSize;
    static int blokingCounter;
    static int wshlstStatus;
    static int pendingStatus;
    static int pendingStatus2;
    static int friendStatus;
    static int countributionStatus;

    static {
        try {
            socket = new Socket("127.0.0.1", 5566);
            dis = new DataInputStream(socket.getInputStream());
            ps = new PrintStream(socket.getOutputStream());
            ClientListener clientListener = new ClientListener();
            clientListener.start();
        } catch (ConnectException ex) {
            Logger.getLogger(ParentController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ParentController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static boolean getUserInfo(User user, String key) {  //reset password + register + forget password
        Gson gson = new Gson(); // Or use new GsonBuilder().create();
        String json = gson.toJson(user); // serializes target to Json
        JsonObject msg = new JsonObject();
        msg.addProperty("Key", key);
        msg.addProperty("Value", json);
        ps.println(msg);
        while (blockingFlag) {
            System.out.println("");
        }
        blockingFlag = true;
        return responseFlag; // return flag
    }

    public static User getRechargeInfo(Recharge recharge, String key) {  //reset password + register + forget password

        Gson gson = new Gson(); // Or use new GsonBuilder().create();
        String json = gson.toJson(recharge); // serializes target to Json
        System.out.println("Reg" + json);

        JsonObject msg = new JsonObject();
        msg.addProperty("Key", key);
        msg.addProperty("Value", json);
        ps.println(msg);
        while (blockingFlag) {
            System.out.println("");
        }
        blockingFlag = true;

        User userjava = gson.fromJson(responseString, User.class);
        return userjava;

    }

    public static User login(User user) {
        Gson gson = new Gson(); // Or use new GsonBuilder().create();
        String json = gson.toJson(user); // serializes target to Json

        JsonObject msg = new JsonObject();
        msg.addProperty("Key", "login");
        msg.addProperty("Value", json);
        ps.println(msg);
        while (blockingFlag) {
            System.out.println("");
        }
        blockingFlag = true;
        User userjava = gson.fromJson(responseString, User.class);
        return userjava;
    }

    public static int addWishList(WishList wshlist) {
        Gson gson = new Gson(); // Or use new GsonBuilder().create();
        String json = gson.toJson(wshlist); // serializes target to Json
        JsonObject msg = new JsonObject();
        msg.addProperty("Key", "AddToWishList");
        msg.addProperty("Value", json);
        ps.println(msg);
        while (blockingFlag) {
            System.out.println("");
        }
        blockingFlag = true;
        return wshlstStatus;
    }

    public static int addPndingRequest(PendingRequest rqust) {
        Gson gson = new Gson(); // Or use new GsonBuilder().create();
        String json = gson.toJson(rqust); // serializes target to Json
        JsonObject msg = new JsonObject();
        msg.addProperty("Key", "AddToPending");
        msg.addProperty("Value", json);
        ps.println(msg);
        while (blockingFlag) {
            System.out.println("");
        }
        blockingFlag = true;
        return pendingStatus;
    }

    public static int delPndingRequest(PendingRequest delqust) {
        Gson gson = new Gson(); // Or use new GsonBuilder().create();
        String json = gson.toJson(delqust); // serializes target to Json
        JsonObject msg = new JsonObject();
        msg.addProperty("Key", "DeletefromPending");
        msg.addProperty("Value", json);
        ps.println(msg);
        while (blockingFlag) {
            System.out.println("");
        }
        blockingFlag = true;
        return pendingStatus2;
    }

    public static int addtofriendlist(PendingRequest fr) {
        Gson gson = new Gson(); // Or use new GsonBuilder().create();
        String json = gson.toJson(fr); // serializes target to Json
        JsonObject msg = new JsonObject();
        msg.addProperty("Key", "AddToflist");
        msg.addProperty("Value", json);
        ps.println(msg);
        while (blockingFlag) {
            System.out.println("");
        }
        blockingFlag = true;
        return friendStatus;
    }
    
     public static int addCountribution(Countribution countribution) {
        Gson gson = new Gson(); // Or use new GsonBuilder().create();
        String json = gson.toJson(countribution); // serializes target to Json
        JsonObject msg = new JsonObject();
        msg.addProperty("Key", "addCountribution");
        msg.addProperty("Value", json);
        ps.println(msg);
        while (blockingFlag) {
            System.out.println("");
        }
        blockingFlag = true;
        return countributionStatus;
    }
    
    

    public static Vector<Item> getAllItems() {
        JsonObject msg = new JsonObject();
        msg.addProperty("Key", "ShowItems");
        ps.println(msg);

        while (blockingFlag) {
            System.out.println(" ");

        }
        blockingFlag = true;
        while (blokingCounter < vectorSize) {
            System.out.println(" ");
        }
        return itmVector;

    }

    public static Vector<Item> getFriendwishlist(int FID) {
        JsonObject msg = new JsonObject();
        msg.addProperty("Key", "Friendwishlist");
        msg.addProperty("Value", FID);
        ps.println(msg);

        while (blockingFlag) {
            System.out.println(" ");
        }
        blockingFlag = true;
        while (blokingCounter < vectorSize) {
            System.out.println(blokingCounter + " " + vectorSize);
        }
        System.out.println(itmVector.size());
        return itmVector;

    }

    public static Vector<Item> displayWishlist() {
        JsonObject msg = new JsonObject();
        msg.addProperty("Key", "DisplayWishlist");
        msg.addProperty("Value", my_info.getUID());
        ps.println(msg);

        while (blockingFlag) {
            System.out.println(" ");

        }
        blockingFlag = true;
        while (blokingCounter < vectorSize) {
            System.out.println(" ");
        }
        return itmVector;

    }

    public static Vector<User> reurnSuggestFriend() {

        JsonObject msg = new JsonObject();
        msg.addProperty("Key", "DisplayFriend");
        msg.addProperty("Value", my_info.getUID());
        ps.println(msg);
//blocking untill recieve vector size
        while (blockingFlag) {
            System.out.println(" ");

        }
        blockingFlag = true;
        ///untill equal vector size
        while (blokingCounter < vectorSize) {
            System.out.println(" ");
        }
        return uservector;

    }

    public static Vector<User> reurnallFriend() {

        JsonObject msg = new JsonObject();
        msg.addProperty("Key", "showFriend");
        msg.addProperty("Value", my_info.getUID());
        ps.println(msg);
        //blocking untill recieve vector size
        while (blockingFlag) {
            System.out.println(blockingFlag);

        }
        blockingFlag = true;
        ///untill equal vector size
        while (blokingCounter < vectorSize) {
            System.out.println(blokingCounter);
            System.out.println(vectorSize);
        }
        return uservector1;


    }

    public static Vector<User> reurnapendingFriend() {

        JsonObject msg = new JsonObject();
        msg.addProperty("Key", "pendingfriends");
        msg.addProperty("Value", my_info.getUID());
        ps.println(msg);
//blocking untill recieve vector size
        while (blockingFlag) {
            System.out.println(" ");

        }
        blockingFlag = true;
        ///untill equal vector size
        while (blokingCounter < vectorSize) {
            System.out.println(" ");
            //System.out.println(vectorSize);
        }
        return uservector2;


    }

    public static User getMy_info() {
        return my_info;
    }

    public static void setMy_info(User my_info) {

        ParentController.my_info = my_info;
    }

    static class ClientListener extends Thread {

        public void run() {
            try {
                while (true) {
                    String msg = dis.readLine();
                    Gson gson;
                    JSONObject jmsg = new JSONObject(msg);
                    String key = jmsg.getString("Key");
                    switch (key) {
                        case "login":
                            responseString = jmsg.getString("Value");
                            blockingFlag = false;
                            break;
                        case "Recharge":
                            responseString = jmsg.getString("Value");
                            blockingFlag = false;
                            break;

                        case "VectorSize":
                            itmVector = new Vector<Item>();
                            uservector = new Vector<User>();
                            uservector1 = new Vector<User>();
                            uservector2 = new Vector<User>();
                              uservector1 = new Vector<User>();
                            vectorSize = jmsg.getInt("size");
                            blokingCounter = 0;
                            blockingFlag = false;
                            break;
                        case "Friendwishlist":
                            String wshslt = jmsg.getString("Value");
                            gson = new Gson();
                            itm = gson.fromJson(wshslt, Item.class);
                            itmVector.add(itm);
                            blokingCounter++;
                            break;
                        case "ShowItems":
                            String itmrslt = jmsg.getString("Value");
                            gson = new Gson();
                            itm = gson.fromJson(itmrslt, Item.class);
                            itmVector.add(itm);
                            blokingCounter++;
                            break;
                        case "DisplayFriend":
                            String friendlist = jmsg.getString("Value");
                            Gson gson2 = new Gson();
                            friend_info = gson2.fromJson(friendlist, User.class);
                            uservector.add(friend_info);
                            blokingCounter++;
                            System.out.println(vectorSize);
                            break;
                        case "showFriend":
                            String allfriendlist = jmsg.getString("Value");
                            Gson gson3 = new Gson();
                            friend_info1 = gson3.fromJson(allfriendlist, User.class);
                            uservector1.add(friend_info1);
                            blokingCounter++;
                            System.out.println(vectorSize);
                            break;
                        case "pendingfriends":
                            String peningfriendlist = jmsg.getString("Value");
                            Gson gson4 = new Gson();
                            friend_info2 = gson4.fromJson(peningfriendlist, User.class);
                            uservector2.add(friend_info2);
                            blokingCounter++;
                            System.out.println(vectorSize);
                            break;
                        case "AddToWishList":
                            wshlstStatus = jmsg.getInt("Value");
                            blockingFlag = false;
                            break;
                        case "AddToPending":
                            pendingStatus = jmsg.getInt("Value");
                            blockingFlag = false;
                            break;
                        case "AddToflist":
                            friendStatus = jmsg.getInt("Value");
                            blockingFlag = false;
                            break;
                        case "DeletefromPending":
                            pendingStatus2 = jmsg.getInt("Value");
                            blockingFlag = false;
                            break;
                              case "addCountribution":
                            countributionStatus = jmsg.getInt("Value");
                            blockingFlag = false;
                            break;
                        default:
                            responseFlag = jmsg.getBoolean("Value");
                            blockingFlag = false;
                            System.out.println("responseFlag " + responseFlag);
                            break;
                    }
                }
            } catch (SocketException ex) {
                try {
                    dis.close();
                    ps.close();
                    socket.close();
                    JOptionPane.showMessageDialog(null, "Server is disconnected");
                } catch (IOException ex1) {

                }

            } catch (IOException ex) {
                Logger.getLogger(ParentController.class.getName()).log(Level.SEVERE, null, ex);
            } catch (JSONException ex) {
                Logger.getLogger(ParentController.class.getName()).log(Level.SEVERE, null, ex);
            } 
        }
    }
}
