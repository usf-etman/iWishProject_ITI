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
public class ForgetPasswordController {

    ForgetPasswordController(Stage stage, ForgetPassUI root) {

        root.getBtn_send().addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

                User user = new User(root.getTxt_email0().getText(), root.getTxt_ansquestion().getText());

                boolean status = ParentController.getUserInfo(user, "forget");
                //root.getUsernameError().setText(String.valueOf(registerStatus));
                if (status == true) {
                    ResetPasswordUI mainView = new ResetPasswordUI() ;
                   
                    Scene scene = new Scene(mainView);

                    stage.setScene(scene);
                    stage.show(); 
                    ResetPasswordController k = new ResetPasswordController(stage, mainView);
                    }
                else {
                  System.out.println( "not correct email or answer ");
                  JOptionPane.showMessageDialog(null, "not correct email or answer ");

                }
            }
        });
        root.getLnk_login().addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                LoginUI mainView = new LoginUI() ;
               
                Scene scene = new Scene(mainView);

                stage.setScene(scene);
                stage.show();
                LoginController lc = new LoginController(stage, mainView);
            }

        });
    }
}
