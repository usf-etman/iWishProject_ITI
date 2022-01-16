/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.LoginUI;
import View.MainscreenUI;
import View.ForgetPassUI;
import View.ResetPasswordUI;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author salma
 */
public class ForgetPasswordController {

    ForgetPasswordController(Stage stage, ForgetPassUI root) {

        root.getBtn_send().addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                ResetPasswordUI mainView = new ResetPasswordUI() {};
                Scene scene = new Scene(mainView);

                stage.setScene(scene);
                stage.show();
            }
        });
    }
}
