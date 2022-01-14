package server;



import java.io.DataInputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author JESSY
 */
public class Server {

    ServerSocket myserverSocket;
    Socket s;
    DataInputStream dis;
    PrintStream ps;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new Server();
    }

    public Server() {

        try {
            myserverSocket = new ServerSocket(5005);
            s = myserverSocket.accept();
            dis = new DataInputStream(s.getInputStream());
            ps = new PrintStream(s.getOutputStream());
            String msg = dis.readLine();
            System.out.println(msg);
            ps.println("message arrived");

        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            try {
                ps.close();
                dis.close();
                s.close();
                myserverSocket.close();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }

    }

}
