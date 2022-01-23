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
import java.net.ServerSocket;
import java.net.Socket;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javax.swing.JOptionPane;
import model.DAO;
import model.User;
import org.json.JSONException;
import org.json.JSONObject;

/**
 *
 * @author Youssef
 */
public class ServerController {

    ServerSocket server;
    ServerUI root;

    ServerController(Stage stage) {
        try {
            root = new ServerUI();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();

            root.getTxtLog().appendText("Service started\n");
            server = new ServerSocket(5566);
            root.getTxtLog().appendText("Listening...\n");
            ServerListener serverListener = new ServerListener();
            Thread th = new Thread(serverListener);
            th.start();

            root.getBtnAdd().addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent event) {
                    itemsController ic = new itemsController(stage);
                }
            });
        } catch (IOException ex) {
            Logger.getLogger(ServerController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    class ServerListener implements Runnable {

        @Override
        public void run() {
            while (true) {
                try {
                    Socket waiter = server.accept();
                    if (waiter.isConnected()) {
                        String IP = String.valueOf(waiter.getInetAddress());
                        Platform.runLater(new Runnable() {
                            public void run() {
                                root.getTxtLog().appendText(IP + " has connected\n");
                                root.getLblClients().setText(ClientHandler.getClientsNum());
                            }
                        });
                    }
                    ClientHandler clientHandler = new ClientHandler(waiter, root);
                    clientHandler.start();
                } catch (IOException ex) {
                    Logger.getLogger(ServerController.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
}

class ClientHandler extends Thread {

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
                        Gson gson = new Gson(); // Or use new GsonBuilder().create();
                        User user = gson.fromJson(value, User.class); // deserializes json into target2
                        boolean registerStatus = DAO.AddUser(user);
                        root.getTxtLog().appendText(String.valueOf(registerStatus));
                        ps.println(registerStatus);
                    case "forget":
                        Gson gson2 = new Gson(); // Or use new GsonBuilder().create();
                        User user2 = gson2.fromJson(value, User.class); // deserializes json into target2
                        //  boolean registerStatuss = DAO.selectuser(user2);
                        boolean result = DAO.selectuser(user2);
                        ps.println(result);
                    case "reset":
                        Gson gson3 = new Gson(); // Or use new GsonBuilder().create();
                        User user3 = gson3.fromJson(value, User.class); // deserializes json into target2
                        //  boolean registerStatuss = DAO.selectuser(user2);
                        boolean result2 = DAO.update(user3);
                        ps.println(result2);

                    case "login":
                        Gson gsonlog = new Gson(); // Or use new GsonBuilder().create();
                        User userlog = gsonlog.fromJson(value, User.class); // deserializes json into target2
                        boolean resultlog = DAO.loginuser(userlog);
                        ps.println(resultlog);

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

    public String getMsg() {
        return msg;
    }

    public static String getClientsNum() {
        return (String.valueOf(clientsVector.size()));
    }
}
