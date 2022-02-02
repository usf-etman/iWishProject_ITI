/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.RegisterUI;
import java.util.regex.Pattern;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import model.User;

public class RegisterController {

    RegisterController(Stage stage, RegisterUI root) {
        root.getBtn_signup().addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                // checking for null values
                if (root.getTxt_user_name().getText().length() < 1) {
                    root.getUsernameError().setText("Enter a username");
                } else {
                    root.getUsernameError().setText("");
                }

                if (root.getTxt_password().getText().length() < 1) {
                    root.getPasswordError().setText("Enter a password");
                } else {
                    root.getPasswordError().setText("");
                }

                if (root.getTxt_email().getText().length() < 1) {
                    root.getEmailError().setText("Enter an email");
                } else {
                    root.getEmailError().setText("");
                }

                if (root.getTxt_security().getText().length() < 1) {
                    root.getSecurityError().setText("Answer security question");
                } else {
                    root.getSecurityError().setText("");
                }

                // checking for email format
                String regexPattern = "^(.+)@(\\S+)$";
                boolean emailMatch = Pattern.compile(regexPattern)
                        .matcher(root.getTxt_email().getText())
                        .matches();

                if (!emailMatch) {
                    if(root.getTxt_email().getText().length() > 1){
                    root.getEmailError().setText("Enter the email in the right format");
                    }
                    return;
                } else {
                    root.getSignupError().setText("");
                }

                // saving user information
                User user = new User(root.getTxt_user_name().getText(), root.getTxt_email().getText(),
                        root.getTxt_password().getText(), root.getTxt_security().getText());

                boolean registerStatus = ParentController.getUserInfo(user, "Register");
                root.getUsernameError().setText(String.valueOf(registerStatus));
                if (registerStatus==true) {
      
                LoginController lc = new LoginController(stage);
                   //MainscreenController mc = new MainscreenController(stage);
                } else {
                    root.getEmailError().setText("Email already exists");
                }
            }
        });
        
        root.getLmk_login().addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>() {
             @Override
            public void handle(ActionEvent event) {
                LoginController lc = new LoginController(stage);
            }
        });
    }
}
