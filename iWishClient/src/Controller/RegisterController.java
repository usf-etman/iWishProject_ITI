/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.LoginUI;
import View.RegisterUI;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.regex.Pattern;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.event.EventType;
import javafx.fxml.Initializable;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class RegisterController {

    RegisterController(Stage stage, RegisterUI root) {
        root.getBtn_signup().addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                // checking for null values
                 root.getUsernameError().setText("username must not be null!");
                if (root.getTxt_user_name().getText().length() < 1) {
                    root.getUsernameError().setText("username must not be null!");
                } else {
                    root.getUsernameError().setText("");
                }

                if (root.getTxt_password().getText().length() < 1) {
                    root.getPasswordError().setText("password must not be null!");
                } else {
                    root.getPasswordError().setText("");
                }

                if (root.getTxt_email().getText().length() < 1) {
                    root.getEmailError().setText("email must not be null!");
                } else {
                    root.getEmailError().setText("");
                }

                if (root.getTxt_security().getText().length() < 1) {
                    root.getSecurityError().setText("security text must not be null!");
                } else {
                    root.getSecurityError().setText("");
                }

                if (root.getUsernameError().getText().length() > 0
                        || root.getPasswordError().getText().length() > 0
                        || root.getEmailError().getText().length() > 0
                        || root.getSecurityError().getText().length() > 0) {
                    return;
                }

                // checking for email format
                String regexPattern = "^(.+)@(\\S+)$";
                boolean emailMatch = Pattern.compile(regexPattern)
                        .matcher(root.getTxt_email().getText())
                        .matches();

                if (!emailMatch) {
                    root.getSignupError().setText("Sorry, you have to enter the email in the right format");
                    return;
                } else {
                    root.getSignupError().setText("");
                }
            }
           });
    }
}
