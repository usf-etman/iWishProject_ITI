/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.AmazonUI;
import com.gargoylesoftware.htmlunit.html.DomAttr;
import java.io.IOException;
import java.util.List;
import model.ItemScraper;
import model.Item;
import java.util.logging.Level;
import java.util.logging.Logger;
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

    AmazonController(Stage stage) {
        AmazonUI amznUI = new AmazonUI();
        Scene scene = new Scene(amznUI);
        stage.setScene(scene);
        stage.show();

        amznUI.getBtnElectronics().addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>() {
            String searchUrl = "https://www.amazon.eg/-/en/gp/new-releases/electronics/ref=zg_bsnr_nav_0";

            @Override
            public void handle(ActionEvent event) {
                ItemThread itemTh = new ItemThread(searchUrl, amznUI);
                itemTh.start();
            }
        });

        amznUI.getBtnFashion().addEventHandler(ActionEvent.ACTION, new EventHandler() {
            String searchUrl = "https://www.amazon.eg/-/en/gp/new-releases/fashion/ref=zg_bsnr_nav_0";

            @Override
            public void handle(Event event) {
                ItemThread itemTh = new ItemThread(searchUrl, amznUI);
                itemTh.start();
            }
        });
    }

    class ItemThread extends Thread {

        String searchUrl;
        AmazonUI amznUI;
        
        public ItemThread(String searchUrl, AmazonUI amznUI){
            this.searchUrl = searchUrl;
            this.amznUI = amznUI;
        }
        
        public void run() {
            List<DomAttr> prodLinks = ItemScraper.scrapeLinks(searchUrl);
            for (int i = 0; i < prodLinks.size(); i++) {
                try {
                    Item item = ItemScraper.getItem(prodLinks.get(i));
                    final int count = i;
                    Platform.runLater(new Runnable() {
                        public void run() {
                            amznUI.getLblTest().setText(String.valueOf(count+1)+"/30");
                            amznUI.getTableItems().getItems().add(item);
                        }
                    });
                } catch (IOException ex) {
                    Logger.getLogger(AmazonController.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
}
