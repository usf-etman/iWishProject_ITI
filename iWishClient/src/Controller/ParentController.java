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

/**
 *
 * @author Youssef
 */
public class ParentController {

    static Socket socket;
    static DataInputStream dis;
    static PrintStream ps;

    static {
        try {
            socket = new Socket("127.0.0.1", 5566);
            dis = new DataInputStream(socket.getInputStream());
            ps = new PrintStream(socket.getOutputStream());
        } catch (IOException ex) {
            Logger.getLogger(ParentController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static boolean register(User user) {
        Gson gson = new Gson(); // Or use new GsonBuilder().create();
        String json = gson.toJson(user); // serializes target to Json
        JsonObject msg = new JsonObject();
        msg.addProperty("Key", "Register");
        msg.addProperty("Value", json);
        ps.println(msg);
        
        try {
            boolean registerStatus = dis.readBoolean();
            return registerStatus;
        } catch (IOException ex) {
            Logger.getLogger(RegisterController.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
}
