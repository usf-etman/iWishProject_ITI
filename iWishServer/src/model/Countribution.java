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
public class Countribution {
    private int CONTRIBUTION_ID;
    private int Contributer_ID;
    private int Wish_Owner_ID;
    private int Item_ID;
    private int Amount;

   

    public Countribution( int Contributer_ID, int Wish_Owner_ID, int Item_ID, int Amount) {
        
        this.Contributer_ID = Contributer_ID;
        this.Wish_Owner_ID = Wish_Owner_ID;
        this.Item_ID = Item_ID;
        this.Amount = Amount;
    }

    public int getCONTRIBUTION_ID() {
        return CONTRIBUTION_ID;
    }

    public void setCONTRIBUTION_ID(int CONTRIBUTION_ID) {
        this.CONTRIBUTION_ID = CONTRIBUTION_ID;
    }
    
    
    

    
    
    public int getContributer_ID() {
        return Contributer_ID;
    }

    public void setContributer_ID(int Contributer_ID) {
        this.Contributer_ID = Contributer_ID;
    }

    public int getWish_Owner_ID() {
        return Wish_Owner_ID;
    }

    public void setWish_Owner_ID(int Wish_Owner_ID) {
        this.Wish_Owner_ID = Wish_Owner_ID;
    }

    public int getItem_ID() {
        return Item_ID;
    }

    public void setItem_ID(int Item_ID) {
        this.Item_ID = Item_ID;
    }

    public int getAmount() {
        return Amount;
    }

    public void setAmount(int Amount) {
        this.Amount = Amount;
    }


}
