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
public class Item {
    
   private int Item_ID ;
private String Item_Descreption   ;
private String Item_Name  ;
 private int Item_Price  ;

    public Item( String Item_Descreption, String Item_Name, int Item_Price) {
       // this.Item_ID = Item_ID;
        this.Item_Descreption = Item_Descreption;
        this.Item_Name = Item_Name;
        this.Item_Price = Item_Price;
    }

    public int getItem_ID() {
        return Item_ID;
    }

    public void setItem_ID(int Item_ID) {
        this.Item_ID = Item_ID;
    }

    public String getItem_Descreption() {
        return Item_Descreption;
    }

    public void setItem_Descreption(String Item_Descreption) {
        this.Item_Descreption = Item_Descreption;
    }

    public String getItem_Name() {
        return Item_Name;
    }

    public void setItem_Name(String Item_Name) {
        this.Item_Name = Item_Name;
    }

    public int getItem_Price() {
        return Item_Price;
    }

    public void setItem_Price(int Item_Price) {
        this.Item_Price = Item_Price;
    }

   

    
}
