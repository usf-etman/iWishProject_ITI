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
                msg = dis.readLine();
                JSONObject jmsg = new JSONObject(msg);
                String key = jmsg.getString("Key");
                String value = jmsg.getString("Value");
                switch (key) {
                    case "Register":
                        Gson gson = new Gson();
                        User user = gson.fromJson(value, User.class);
                        boolean registerStatus = DAO.AddUser(user);
                        jmsg = new JSONObject();
                        jmsg.put("Key", "Register");
                        jmsg.put("Value", registerStatus);
                        ps.println(jmsg);
                        break;
                    case "forget":
                        Gson gson2 = new Gson();
                        User user2 = gson2.fromJson(value, User.class);
                        boolean forgetStatus = DAO.selectuser(user2);
                        jmsg = new JSONObject();
                        jmsg.put("Key", "forget");
                        jmsg.put("Value", forgetStatus);
                        ps.println(jmsg);
                        break;
                    case "reset":
                        Gson gson3 = new Gson();
                        User user3 = gson3.fromJson(value, User.class);
                        boolean resetStatus = DAO.update(user3);
                        jmsg = new JSONObject();
                        jmsg.put("Key", "reset");
                        jmsg.put("Value", resetStatus);
                        ps.println(jmsg);
                        break;
                    case "login":
                        Gson gsonlog = new Gson();
                        User userlog = gsonlog.fromJson(value, User.class);
                        boolean loginStatus = DAO.loginuser(userlog);
                        jmsg = new JSONObject();
                        jmsg.put("Key", "login");
                        jmsg.put("Value", loginStatus);
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
