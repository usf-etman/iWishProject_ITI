/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.FriendWishlistUI;
import java.util.Vector;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.SpinnerValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import model.Countribution;
import model.Item;

/**
 *
 * @author JESSY
 */
public class FriendWishlistController {

    Item selectedwish;
    Countribution countribution;
    int currentValue;

    FriendWishlistController(Stage stage, int FID) {
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

        friendWishlistUI.getSpinAmount().valueProperty().addListener(new ChangeListener<Integer>() {
            @Override
            public void changed(ObservableValue<? extends Integer> arg0, Integer arg1, Integer arg2) {
                currentValue = friendWishlistUI.getSpinAmount().getValue();
                
            }

        });

        friendWishlistUI.getSpinAmount().focusedProperty().addListener((observable, oldValue, newValue) -> {
            if (!newValue) {
                friendWishlistUI.getSpinAmount().increment(0); // won't change value, but will commit editor
            }
        });

        friendWishlistUI.getTableView().setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                selectedwish = friendWishlistUI.getTableView().getSelectionModel().getSelectedItem();
                SpinnerValueFactory<Integer> ValueFactory = new SpinnerValueFactory.IntegerSpinnerValueFactory(0, Integer.parseInt(selectedwish.getPrice()));
                ValueFactory.setValue(1);
                friendWishlistUI.getSpinAmount().setValueFactory(ValueFactory);

            }

        });

        friendWishlistUI.getBtnContribute().addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("currout " + currentValue);
                countribution = new Countribution(ParentController.getMy_info().getUID(), FID, selectedwish.getId(), currentValue);
                if (countribution != null) {
                    System.out.println(countribution.getAmount());

                    int countributionStatus = ParentController.addCountribution(countribution);

                    if (countributionStatus != -1) {
                        System.out.println("Thank you for sharing");
                        friendWishlistUI.getLblResult().setText("Thank you for contribution!");
                        
                        friendWishlistUI.getTableView().getItems().removeAll(itmVector);
                        
                        Vector<Item> itmVector = ParentController.getFriendwishlist(FID);
                        System.out.println(itmVector.size());
                        for (int i = 0; i < itmVector.size(); i++) {
                            friendWishlistUI.getTableView().getItems().add(itmVector.get(i));
                        }

                    } else {

                        System.out.println("try again");
                        friendWishlistUI.getLblResult().setText("OOOOOPS..! there are an issue");
                        
                    }
                } else {
                    System.out.println("no item selected");
                }
            }
        });

    }
}
