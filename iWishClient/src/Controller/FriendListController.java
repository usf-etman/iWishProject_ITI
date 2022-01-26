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

import model.User;

/**
 *
 * @author salma
 */
public class FriendListController {

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

         mainView.getBtn_Add().addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

            }

        });
    }

}
