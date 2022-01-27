/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author JESSY
 */
public class PendingRequest {
    private int Request_ID;
    private int User_ID;
    private int Sender_ID;

    public PendingRequest(int User_ID, int Sender_ID) {
        this.User_ID = User_ID;
        this.Sender_ID = Sender_ID;
    }

    public int getRequest_ID() {
        return Request_ID;
    }

    public void setRequest_ID(int Request_ID) {
        this.Request_ID = Request_ID;
    }

    public int getUser_ID() {
        return User_ID;
    }

    public void setUser_ID(int User_ID) {
        this.User_ID = User_ID;
    }

    public int getSender_ID() {
        return Sender_ID;
    }

    public void setSender_ID(int Sender_ID) {
        this.Sender_ID = Sender_ID;
    }
    
    
    
}
