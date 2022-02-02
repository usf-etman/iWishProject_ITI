/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.AdditmManuallyUI;
import java.sql.SQLException;
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
 * @author JESSY
 */
public class AddManuallyController {
    int result;
    Item itm;
    AddManuallyController(Stage stage){
    AdditmManuallyUI manualUI = new AdditmManuallyUI();
            Scene scene = new Scene(manualUI);
            stage.setScene(scene);
            stage.show();
            manualUI.getBtnback().addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent event) {
            ServerController s=new ServerController(stage);
        }
            
            
            });
            manualUI.getAdditmBTN().addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent event) {
            try {
                 itm=new Item(manualUI.getDescTXT().getText(),manualUI.getNameTXT().getText() ,manualUI.getPriceTXT().getText());
                result = DAO.AddItem(itm);
                if(result != -1){
                 manualUI.getRsltLBL().setText("Added Successfully");
                }
                else{
                    manualUI.getRsltLBL().setText("couldn't add item");
                }
            } catch (SQLException ex) {
                Logger.getLogger(AddManuallyController.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
    });
           //manualUI.getAdditmBTN().
    }
    
}
