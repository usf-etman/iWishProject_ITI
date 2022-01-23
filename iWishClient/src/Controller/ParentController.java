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
    static String registerStatus;
    static String loginStatus;
    static String status;

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
            registerStatus = dis.readLine();
            boolean boolStatus = Boolean.parseBoolean(registerStatus);
            //return registerStatus;
            System.out.println(registerStatus);
            System.out.println(boolStatus);
            return boolStatus;
            /*if (registerStatus == "true") {
                return true;
            } else {
                return false;
            }*/
            //return registerStatus;
        } catch (IOException ex) {
            Logger.getLogger(RegisterController.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }

    }
       public static boolean login(User user) {
        Gson gson = new Gson(); // Or use new GsonBuilder().create();
        String json = gson.toJson(user); // serializes target to Json
        JsonObject msg = new JsonObject();
        msg.addProperty("Key", "login");
        msg.addProperty("Value", json);
        ps.println(msg);

        try {
            loginStatus = dis.readLine();
            boolean boolStatus = Boolean.parseBoolean(loginStatus);
            //return registerStatus;
            System.out.println(loginStatus);
            System.out.println(boolStatus);
            return boolStatus;
        } catch (IOException ex) {
            Logger.getLogger(RegisterController.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }

    }
    
    
    public static boolean Forget(User user) {
        Gson gson = new Gson(); // Or use new GsonBuilder().create();
        String json = gson.toJson(user); // serializes target to Json
        JsonObject msg = new JsonObject();
        msg.addProperty("Key", "forget");
        msg.addProperty("Value", json);
        ps.println(msg);

        try {
            status = dis.readLine();
            boolean boolStatus = Boolean.parseBoolean(status);

            return boolStatus;

        } catch (IOException ex) {
            Logger.getLogger(ForgetPasswordController.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }

    }

    public static boolean Reset(User user) {
        Gson gson = new Gson(); // Or use new GsonBuilder().create();
        String json = gson.toJson(user); // serializes target to Json
        JsonObject msg = new JsonObject();
        msg.addProperty("Key", "reset");
        msg.addProperty("Value", json);
        ps.println(msg);

        try {
            status = dis.readLine();
            boolean boolStatus = Boolean.parseBoolean(status);

            return boolStatus;

        } catch (IOException ex) {
            Logger.getLogger(ResetPasswordController.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }

    }

}
