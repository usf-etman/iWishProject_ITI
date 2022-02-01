/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.ServerUI;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.DAO;
import model.Item;
import model.User;
import model.Recharge;
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
    String msg;
    ServerUI root;
    static Vector<ClientHandler> clientsVector = new Vector<ClientHandler>();

    ClientHandler(Socket waiter, ServerUI root) throws IOException {
        this.root = root;
        dis = new DataInputStream(waiter.getInputStream());
        ps = new PrintStream(waiter.getOutputStream());
        ClientHandler.clientsVector.add(this);
    }

    @Override
    public void run() {
        while (true) {
            try {

                msg = dis.readLine(); //recieve msg from client
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
                        User loginStatus = DAO.rechargeAmount(recharge);
                        String jsonUser = gson.toJson(loginStatus); // convert loginstatus from java object to json
                        jmsg = new JSONObject();
                        jmsg.put("Key", "Recharge");
                        jmsg.put("Value", jsonUser);
   
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
                        User loginStatus1 = DAO.loginUser(userlog);
                        String jsonUser1 = gson.toJson(loginStatus1); // convert loginstatus from java object to json
                        jmsg = new JSONObject();
                        jmsg.put("Key", "login");
                        jmsg.put("Value", jsonUser1);
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
                }
                root.getTxtLog().appendText(msg + "\n");
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
}
