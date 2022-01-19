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
import com.google.gson.Gson;
import javafx.stage.Stage;
import model.User;

public class RegisterController extends ParentController {

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

                // saving user information
                User user = new User(root.getTxt_user_name().getText(), root.getTxt_email().getText(),
                        root.getTxt_password().getText(), root.getTxt_security().getText(), "iu");

                Gson gson = new Gson(); // Or use new GsonBuilder().create();
                String json = gson.toJson(user); // serializes target to Json
                ps.println(json);
            }
        });
    }
}
