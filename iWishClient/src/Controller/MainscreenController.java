/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.MainscreenUI;
import View.ResetPasswordUI;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author Youssef
 */
public class MainscreenController {

    MainscreenController(Stage stage) {
        MainscreenUI mainView = new MainscreenUI();
        Scene scene = new Scene(mainView);

        stage.setScene(scene);
        stage.show();
        
        System.out.println(String.valueOf(ParentController.getUID()));
        
        mainView.getBtnItems().addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                AddItemController AIC = new AddItemController(stage);
            }
        });
    }
}