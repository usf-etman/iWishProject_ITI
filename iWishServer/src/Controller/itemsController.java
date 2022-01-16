/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.itemsUI;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author Youssef
 */
public class itemsController {

    itemsController(Stage stage) {
        itemsUI iUI = new itemsUI();
        Scene scene = new Scene(iUI);
        stage.setScene(scene);
        stage.show();
        
        iUI.getBtnAmazon().addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                AmazonController ac = new AmazonController(stage);
            }
        });
    }
}
