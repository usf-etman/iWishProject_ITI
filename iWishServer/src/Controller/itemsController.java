/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.itemsUI;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.stage.Stage;
import model.DAO;
import model.Item;

/**
 *
 * @author Youssef
 */
public class itemsController {

    itemsController(Stage stage) {
        try {
            itemsUI iUI = new itemsUI();
            Scene scene = new Scene(iUI);
            stage.setScene(scene);
            stage.show();
            Vector<Item> itmVector = DAO.SelectItems();
            for (int i = 0; i < itmVector.size(); i++) {
                iUI.getTableItems().getItems().add(itmVector.get(i));
               
            }

            iUI.getBtnInsert().addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent event) {
                    AddManuallyController amc = new AddManuallyController((stage));
                }
            });
            
            iUI.getBtnAmazon().addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent event) {
                    AmazonController ac = new AmazonController(stage);
                }
            });
        } catch (SQLException ex) {
            Logger.getLogger(itemsController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
