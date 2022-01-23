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
import javax.swing.JOptionPane;
import model.User;

/**
 *
 * @author salma
 */
public class ResetPasswordController {

    ResetPasswordController(Stage stage, ResetPasswordUI root) {

        root.getBtn_confirm().addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                User user = new User(root.getTxt_user().getText(),root.getTxt_email().getText(),root.getTxt_newpass().getText());

                boolean status = ParentController.getUserInfo(user, "reset");
                //root.getUsernameError().setText(String.valueOf(registerStatus));
                if (status == true) {
                    LoginUI mainView = new LoginUI();
                    Scene scene = new Scene(mainView);

                    stage.setScene(scene);
                    stage.show();
                   LoginController lc = new LoginController(stage, mainView);

                } else {
                   
                    JOptionPane.showMessageDialog(null, "not updated ");

                }

            }
        });
    }
}
