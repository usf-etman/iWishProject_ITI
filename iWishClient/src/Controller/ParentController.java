/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Item;
import model.User;
import model.Recharge;
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
    private static User my_info;
    static String responseString;
    static boolean blockingFlag = true;
    static boolean rechargeFlag = false;
    static boolean responseFlag;
    static Item itm;
    static Vector<Item> itmVector;
    static int vectorSize;
    static int blokingCounter;

    static {
        try {
            socket = new Socket("127.0.0.1", 5566);
            dis = new DataInputStream(socket.getInputStream());
            ps = new PrintStream(socket.getOutputStream());
            ClientListener clientListener = new ClientListener();
            clientListener.start();
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
        System.out.println("Reg"+json);
                
        JsonObject msg = new JsonObject();
        msg.addProperty("Key", key);
        msg.addProperty("Value", json);
        ps.println(msg);
        while (blockingFlag) {
            System.out.println("");
        }
        blockingFlag = true;
      
        User userjava = gson.fromJson(responseString,User.class); 
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
        User userjava = gson.fromJson(responseString,User.class); 
        return userjava; 
    }
         
    public static Vector<Item> getAllItems() {
        JsonObject msg = new JsonObject();
        msg.addProperty("Key", "ShowItems");
        ps.println(msg);

        while (blockingFlag) {
            System.out.println(vectorSize);

        }
        blockingFlag = true;
        while (blokingCounter < vectorSize) {
            System.out.println(blokingCounter);
        }
        return itmVector;

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
                    JSONObject jmsg = new JSONObject(msg);
                    String key = jmsg.getString("Key");
                    switch (key) {
                        case "login":
                            responseString = jmsg.getString("Value"); //from server to client
                            blockingFlag = false;
                            break;
                        case "Recharge":
                            responseString = jmsg.getString("Value");
                            blockingFlag = false;
                            break;
                        case "VectorSize":
                            itmVector = new Vector<Item>();
                            vectorSize = jmsg.getInt("size");
                            blokingCounter = 0;
                            blockingFlag = false;
                            //System.out.println(vectorSize);

                            break;
                        case "ShowItems":

                            String itmrslt = jmsg.getString("Value");
                            Gson gson = new Gson();
                            itm = gson.fromJson(itmrslt, Item.class);
                            itmVector.add(itm);
                            blokingCounter++;
                            System.out.println(vectorSize);

                            break;
                        default:
                            responseFlag = jmsg.getBoolean("Value");
                            blockingFlag = false;
                            System.out.println("responseFlag "+responseFlag);
                            break;
                    }
                }
            } catch (IOException ex) {
                Logger.getLogger(ParentController.class.getName()).log(Level.SEVERE, null, ex);
            } catch (JSONException ex) {
                Logger.getLogger(ParentController.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }
}
