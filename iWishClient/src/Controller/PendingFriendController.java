/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.PendingFriendUI;
import java.util.Vector;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.stage.Stage;
import model.PendingRequest;
import model.User;

/**
 *
 * @author Mariem
 */
public class PendingFriendController {
     User selectedItm;
     PendingRequest rqust;
    PendingFriendController(Stage stage) {
       
       PendingFriendUI mainView = new PendingFriendUI();
        Scene scene = new Scene(mainView);
        stage.setScene(scene);
        stage.show();
        
        mainView.getBtn_items().addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event) {
                
                AddItemController AIC = new AddItemController(stage);
            }
        });
        mainView.getBtn_friends().addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event) {
                
                FriendListController flc=new FriendListController(stage);
            }
        });
        
        Vector<User> pendingVector = ParentController.reurnapendingFriend();
        for (int i = 0; i < pendingVector.size(); i++) {
        mainView.getPendingTable().getItems().add(pendingVector.get(i));
        }
       mainView.getPendingTable().setOnMouseClicked(new EventHandler<javafx.scene.input.MouseEvent>() {
            @Override

            public void handle(javafx.scene.input.MouseEvent event) {
                selectedItm = mainView.getPendingTable().getSelectionModel().getSelectedItem();
                rqust = new PendingRequest(selectedItm.getUID(), ParentController.getMy_info().getUID());
                System.out.println(rqust.getUser_ID());
            }

        });
       
       mainView.getBtn_accept().addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (rqust != null) {
                    int friendtStatus = ParentController.addtofriendlist(rqust);
                    if (friendtStatus != -1) {
                        System.out.println("added successfully");
                        mainView.getPendingTable().getItems().remove(selectedItm);
                    } else {

                        System.out.println("try again");
                    }
                } else {
                    System.out.println("try again");
                }
            }

        });
       
        mainView.getBtn_decline().addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (rqust != null) {
                    int rqustStatus = ParentController.delPndingRequest(rqust);
                    if (rqustStatus != -1) {
                        System.out.println("deleted successfully");
                        mainView.getPendingTable().getItems().remove(selectedItm);
                    } else {

                        System.out.println("try again");
                    }
                } else {
                    System.out.println("try again");
                }
            }

        });
        }
    

    }
