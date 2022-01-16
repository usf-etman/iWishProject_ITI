/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.itemsUI;
import View.ServerUI;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.stage.Stage;

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
                    ClientHandler clientHandler = new ClientHandler(waiter);
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
    static Vector<ClientHandler> clientsVector = new Vector<ClientHandler>();

    ClientHandler(Socket waiter) throws IOException {
        dis = new DataInputStream(waiter.getInputStream());
        ps = new PrintStream(waiter.getOutputStream());
        ClientHandler.clientsVector.add(this);
    }

    @Override
    public void run() {
        while (true) {
            try {
                msg = dis.readLine();
                if (msg.equals("closing")) {

                    ClientHandler.clientsVector.remove(this);
                }
            } catch (IOException ex) {
                Logger.getLogger(ClientHandler.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public String getMsg() {
        return msg;
    }

    public static String getClientsNum() {
        return (String.valueOf(clientsVector.size() + 1));
    }
}
