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
public class WishList {

    private int Wish_ID;
    private int User_ID;
    private int Item_ID;
    private int Item_Price;

    public WishList( int User_ID, int Item_ID, int Item_Price) {
       
        this.User_ID = User_ID;
        this.Item_ID = Item_ID;
        this.Item_Price = Item_Price;
    }

    public int getWish_ID() {
        return Wish_ID;
    }

    public void setWish_ID(int Wish_ID) {
        this.Wish_ID = Wish_ID;
    }

    public int getUser_ID() {
        return User_ID;
    }

    public void setUser_ID(int User_ID) {
        this.User_ID = User_ID;
    }

    public int getItem_ID() {
        return Item_ID;
    }

    public void setItem_ID(int Item_ID) {
        this.Item_ID = Item_ID;
    }

    public int getItem_Price() {
        return Item_Price;
    }

    public void setItem_Price(int Item_Price) {
        this.Item_Price = Item_Price;
    }
    
    

}
