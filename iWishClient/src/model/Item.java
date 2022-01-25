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

    private int id;
    private String desc;
    private String name;
    private String price;

    public Item(int id, String Item_Name, String Item_Price, String Item_Descreption) {
        this.id = id;
        this.name = Item_Name;
        this.price = Item_Price;
        this.desc = Item_Descreption;
    }
 public Item( String Item_Name, String Item_Price, String Item_Descreption) {
        
        this.name = Item_Name;
        this.price = Item_Price;
        this.desc = Item_Descreption;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

}
