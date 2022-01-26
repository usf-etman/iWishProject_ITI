/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.PendingFriendUI;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author Mariem
 */
public class PendingFriendController {
     PendingFriendController(Stage stage){
      PendingFriendUI mainView = new PendingFriendUI();
        Scene scene = new Scene(mainView);

        stage.setScene(scene);
        stage.show();
     }
}
