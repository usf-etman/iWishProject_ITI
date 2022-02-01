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
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import model.DAO;
import model.Item;

/**
 *
 * @author Youssef
 */
public class itemsController {

    Item selectedItm;
    Item rqust;

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

            iUI.getTableItems().setOnMouseClicked(new EventHandler<javafx.scene.input.MouseEvent>() {
                @Override
                public void handle(MouseEvent event) {
                    selectedItm=iUI.getTableItems().getSelectionModel().getSelectedItem();
                    rqust = new Item(selectedItm.getId());
                    System.out.println(rqust);
                }

            });
            iUI.getBtnDelete().addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent event) {
                        int  rqustStatus = 0;
                    if (rqust != null) {
                  
                            try {
                                rqustStatus = DAO.DeleteItem(rqust);
                            } catch (SQLException ex) {
                                Logger.getLogger(itemsController.class.getName()).log(Level.SEVERE, null, ex);
                            }
                              
                    if (rqustStatus != -1) {
                        System.out.println("removed successfully");
                      iUI.getTableItems().getItems().remove(selectedItm);
                    } else {

                        System.out.println("try again");
                    }
                } else {
                    System.out.println("try again");
                }
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
