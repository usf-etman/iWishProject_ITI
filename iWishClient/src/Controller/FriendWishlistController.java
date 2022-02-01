/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.FriendWishlistUI;
import java.util.Vector;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.SpinnerValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import model.Item;

/**
 *
 * @author JESSY
 */
public class FriendWishlistController {
    Item selectedwish;
     FriendWishlistController(Stage stage,int FID) {
        FriendWishlistUI friendWishlistUI = new FriendWishlistUI();        
        Scene scene = new Scene(friendWishlistUI);
        stage.setScene(scene);
        stage.show();
        
       friendWishlistUI.getLblName().setText(ParentController.getMy_info().getUsername());
        
        Vector<Item> itmVector = ParentController.getFriendwishlist(FID);
         System.out.println(itmVector.size());
        //System.out.println(itmVector.size());
        for (int i = 0; i < itmVector.size(); i++) {

            friendWishlistUI.getTableView().getItems().add(itmVector.get(i));
        }
        
        friendWishlistUI.getTableView().setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                selectedwish = friendWishlistUI.getTableView().getSelectionModel().getSelectedItem();
                 SpinnerValueFactory<Integer> ValueFactory = new SpinnerValueFactory.IntegerSpinnerValueFactory(0, Integer.parseInt(selectedwish.getPrice()));
        ValueFactory.setValue(1);
        friendWishlistUI.getSpinAmount().setValueFactory(ValueFactory);
            }
        });
    
}
}