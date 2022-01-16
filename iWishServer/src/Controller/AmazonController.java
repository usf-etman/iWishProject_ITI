/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.AmazonUI;
import View.itemsUI;
import model.ItemScraper;
import model.Item;
import java.util.Vector;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author Youssef
 */
public class AmazonController {
    AmazonController(Stage stage){
        AmazonUI amznUI = new AmazonUI();
        Scene scene = new Scene(amznUI);
        stage.setScene(scene);
        stage.show();
        
        amznUI.getBtnElectronics().addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>() {
            String searchUrl = "https://www.amazon.eg/-/en/gp/new-releases/electronics/ref=zg_bsnr_nav_0";
            @Override
            public void handle(ActionEvent event) {
                Vector<Item> itemsVector = ItemScraper.scrapeItems(searchUrl);
                fillTable(amznUI, itemsVector);
            }
        });
        
        amznUI.getBtnFashion().addEventHandler(ActionEvent.ACTION, new EventHandler() {
            String searchUrl = "https://www.amazon.eg/-/en/gp/new-releases/fashion/ref=zg_bsnr_nav_0";
            @Override
            public void handle(Event event) {
                Vector<Item> itemsVector = ItemScraper.scrapeItems(searchUrl);
                fillTable(amznUI, itemsVector);
            }
        });
    }
    
    public static void fillTable(AmazonUI amznUI, Vector<Item> itemsVector){
        for(int i=0; i<itemsVector.size(); i++){
            String itemName = itemsVector.get(i).getName();
            String itemPrice = itemsVector.get(i).getPrice();
            String itemDesc = itemsVector.get(i).getDesc();
            Item item = new Item(itemName, itemPrice, itemDesc);
            Platform.runLater(new Runnable(){
                public void run(){
                    amznUI.getLblTest().setText("HAHAHA");
                    amznUI.getTableItems().getItems().add(item);
                }
            });
        }
    }
}
