/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.LoginUI;
import View.MainscreenUI;
import View.RegisterUI;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author Youssef
 */
public class LoginController {

    LoginController(Stage stage, LoginUI root) {
        root.getBtnLogin().addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                MainscreenUI mainView = new MainscreenUI();
                Scene scene = new Scene(mainView);

                stage.setScene(scene);
                stage.show();
            }
        }); 
        root.getLnkSignup().addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                RegisterUI registerView = new RegisterUI();
                Scene scene = new Scene(registerView);

                stage.setScene(scene);
                stage.show();
                RegisterController rc = new RegisterController(stage, registerView);
            }
        }); 
                
    }
}
