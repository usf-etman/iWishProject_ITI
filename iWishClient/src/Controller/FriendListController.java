/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.FriendsListUI;
import java.util.Vector;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.event.EventType;
import javafx.scene.Scene;
import javafx.stage.Stage;
import model.PendingRequest;

import model.User;

/**
 *
 * @author salma
 */
public class FriendListController {
          User selectedItm;
          PendingRequest rqust;
    FriendListController(Stage stage) {

        FriendsListUI mainView = new FriendsListUI();
        Scene scene = new Scene(mainView);

        stage.setScene(scene);
        stage.show();

        Vector<User> userVector = ParentController.reurnSuggestFriend();
        //System.out.printlitmVector.size());
        for (int i = 0; i < userVector.size(); i++) {
            mainView.getTableSuggest().getItems().add(userVector.get(i));

        }
        
      
                mainView.getTableSuggest().setOnMouseClicked(new EventHandler<javafx.scene.input.MouseEvent>() {
            @Override

            public void handle(javafx.scene.input.MouseEvent event) {
                selectedItm = mainView.getTableSuggest().getSelectionModel().getSelectedItem();
                rqust = new PendingRequest(selectedItm.getUID(),ParentController.getMy_info().getUID());
                System.out.println(rqust);
            }

        });

         mainView.getBtn_Add().addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (rqust != null) {
                    int rqustStatus = ParentController.addPndingRequest(rqust);
                    if(rqustStatus != -1)
                    {  
                        System.out.println("added successfully");
                        mainView.getTableSuggest().getItems().remove(selectedItm);
                    }
                    else{
                        
                        System.out.println("try again");
                    }
                }
                else{
                      System.out.println("try again");   
                }
            }

        });
    }

}
