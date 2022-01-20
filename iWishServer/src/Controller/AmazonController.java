/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.AmazonUI;
import com.gargoylesoftware.htmlunit.html.DomAttr;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import model.ItemScraper;
import model.Item;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Platform;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.input.MouseButton;
import javafx.stage.Stage;
import model.DAO;

/**
 *
 * @author Youssef
 */
public class AmazonController {

    Item selectedItem;
    
    AmazonController(Stage stage) {
        AmazonUI amznUI = new AmazonUI();
        Scene scene = new Scene(amznUI);
        stage.setScene(scene);
        stage.show();
        
        amznUI.getBtnElectronics().addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>() {
            String searchUrl = "https://www.amazon.eg/-/en/gp/new-releases/electronics/ref=zg_bsnr_nav_0";

            @Override
            public void handle(ActionEvent event) {
                amznUI.getLblTest().setText("");
                ItemThread itemTh = new ItemThread(searchUrl, amznUI);
                itemTh.start();
            }
        });

        amznUI.getBtnFashion().addEventHandler(ActionEvent.ACTION, new EventHandler() {
            String searchUrl = "https://www.amazon.eg/-/en/gp/new-releases/fashion/ref=zg_bsnr_nav_0";

            @Override
            public void handle(Event event) {
                amznUI.getLblTest().setText("");
                ItemThread itemTh = new ItemThread(searchUrl, amznUI);
                itemTh.start();
            }
        });

        amznUI.getTableItems().setOnMouseClicked(new EventHandler<javafx.scene.input.MouseEvent>() {
            @Override
            public void handle(javafx.scene.input.MouseEvent event) {
                selectedItem = amznUI.getTableItems().getSelectionModel().getSelectedItem();
                amznUI.getLblAdded().setText("");
            }
        });
        
        amznUI.getBtnAdd().addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if(selectedItem != null){
                    try {
                        DAO.AddItem(selectedItem);
                        amznUI.getLblAdded().setText("Added successfuly");
                    } catch (SQLException ex) {
                        Logger.getLogger(AmazonController.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        });
    }

    class ItemThread extends Thread {

        String searchUrl;
        AmazonUI amznUI;

        public ItemThread(String searchUrl, AmazonUI amznUI) {
            this.searchUrl = searchUrl;
            this.amznUI = amznUI;
        }

        public void run() {
            List<DomAttr> prodLinks = ItemScraper.scrapeLinks(searchUrl);
            if (prodLinks.size() == 0) {
                Platform.runLater(new Runnable() {
                    public void run() {
                        amznUI.getLblTest().setText("Please Try Again");
                    }
                });
            }
            for (int i = 0; i < prodLinks.size(); i++) {
                try {
                    Item item = ItemScraper.getItem(prodLinks.get(i), i + 1);
                    final int count = i;
                    Platform.runLater(new Runnable() {
                        public void run() {
                            amznUI.getLblTest().setText(String.valueOf(count + 1) + "/30");
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
