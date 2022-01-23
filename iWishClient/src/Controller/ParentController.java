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
import java.util.logging.Level;
import java.util.logging.Logger;
import model.User;
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
    static boolean blockingFlag = true;
    static boolean responseFlag;

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

    public static boolean getUserInfo(User user, String key){
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
        return responseFlag;
    }
    
    static class ClientListener extends Thread {

        public void run() {
            try {
                while (true) {
                    String msg = dis.readLine();
                    JSONObject jmsg = new JSONObject(msg);
                    String key = jmsg.getString("Key");
                    switch (key) {
                        default:
                            responseFlag = jmsg.getBoolean("Value");
                            blockingFlag = false;
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
