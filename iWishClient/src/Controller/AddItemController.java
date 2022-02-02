/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import static Controller.ParentController.wshlstStatus;
import View.AddItemUI;
import View.RegisterUI;
import java.util.Vector;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;
import model.Item;
import model.WishList;

/**
 *
 * @author JESSY
 */
public class AddItemController {

    Item selectedItm;
    WishList wshlst = null;

    AddItemController(Stage stage) {
        AddItemUI additmView = new AddItemUI();
        //AddItemUI additmView = new AddItemUI();
        Scene scene = new Scene(additmView);
        stage.setScene(scene);
        stage.show();
        Vector<Item> itmVector = ParentController.getAllItems();

        //System.out.println(itmVector.size());
        for (int i = 0; i < itmVector.size(); i++) {

            additmView.getTableView().getItems().add(itmVector.get(i));
        }

        additmView.getTableView().setOnKeyPressed(new EventHandler<javafx.scene.input.KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {
                selectedItm = additmView.getTableView().getSelectionModel().getSelectedItem(); //item
                wshlst = new WishList(ParentController.getMy_info().getUID(), selectedItm.getId(), Integer.parseInt(selectedItm.getPrice()));
                System.out.println(wshlst);
            }

        });

       additmView.getTableView().setOnMouseClicked(new EventHandler<javafx.scene.input.MouseEvent>() {
            @Override

            public void handle(javafx.scene.input.MouseEvent event) {
                selectedItm = additmView.getTableView().getSelectionModel().getSelectedItem();
                wshlst = new WishList(ParentController.getMy_info().getUID(), selectedItm.getId(), Integer.parseInt(selectedItm.getPrice()));
                System.out.println(wshlst);
            }

        });
        additmView.getBtnAddIIem().addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println(wshlst);
                if (wshlst != null) {
                    int wshlstStatus = ParentController.addWishList(wshlst);
                    if(wshlstStatus != -1)
                    {   additmView.getLblResult().setText("added successfully");
                        System.out.println("added successfully");
                    }
                    else{
                        additmView.getLblResult().setText("can't add item");
                        System.out.println("try again");
                    }
                }
                else{
                    additmView.getLblResult().setText("can't add item, please select an item first");
                }

            }
        });

        additmView.getBtnProfile().addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                MainscreenController msc = new MainscreenController(stage);
            }
        });
        additmView.getBtnItems().addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                AddItemController AIC = new AddItemController(stage);
            }
        });
        
        additmView.getBtnFriends().addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event) {
                
                FriendListController flc=new FriendListController(stage);
            }
        });
        
         additmView.getBtnNotifications().addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event) {
                
                PendingFriendController pf=new PendingFriendController(stage);
            }
        
        });
         
         additmView.getBtnSignout().addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event) {
                
                LoginController lc = new LoginController(stage);
            }
        
        });

    }
}
