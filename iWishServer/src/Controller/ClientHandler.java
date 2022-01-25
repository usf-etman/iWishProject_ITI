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
import model.User;
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
                String value = jmsg.getString("Value");//parsing user json object
                Gson gson;
                switch (key) {
                    case "Register":
                        gson = new Gson();
                        User user = gson.fromJson(value, User.class);
                        boolean registerStatus = DAO.AddUser(user);
                        jmsg = new JSONObject();
                        jmsg.put("Key", "Register");
                        jmsg.put("Value", registerStatus);
                        ps.println(jmsg);
                        break;
                    case "forget":
                        gson = new Gson();
                        User user2 = gson.fromJson(value, User.class);
                        boolean forgetStatus = DAO.selectuser(user2);
                        jmsg = new JSONObject();
                        jmsg.put("Key", "forget");
                        jmsg.put("Value", forgetStatus);
                        ps.println(jmsg);
                        break;
                    case "reset":
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
                        User userlog = gson.fromJson(value, User.class); //converts from json string to Java Object
                        User loginStatus = DAO.loginUser(userlog);
                        String json = gson.toJson(loginStatus); // convert loginstatus from java object to json
                        jmsg = new JSONObject();
                        jmsg.put("Key", "login");
                        jmsg.put("Value", json);
                        ps.println(jmsg);
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
