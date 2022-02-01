/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import static Controller.ParentController.loginStatus;
import View.ForgetPassUI;
import View.LoginUI;
import View.MainscreenUI;
import View.RegisterUI;
import View.ResetPasswordUI;
import java.util.regex.Pattern;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.stage.Stage;
import model.User;

/**
 *
 * @author Youssef
 */
public class LoginController extends ParentController {

    LoginController(Stage stage, LoginUI root) {
        root.getBtnLogin().addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                root.getTxtEmailError().setText("Email must not be null!");
                if (root.getTxtUname().getText().length() < 1) {
                    root.getTxtEmailError().setText("Email must not be null!");
                } else {
                    root.getTxtEmailError().setText("");
                }

                if (root.getTxtPass().getText().length() < 1) {
                    root.getTxtPassError().setText("password must not be null!");
                } else {
                    root.getTxtPassError().setText("");
                }
                // checking for email format
                String regexPattern = "^(.+)@(\\S+)$";
                boolean emailMatch = Pattern.compile(regexPattern)
                        .matcher(root.getTxtUname().getText())
                        .matches();

                if (!emailMatch) {
                    root.getLoginError().setText("Sorry, you have to enter the email in the right format");
                    return;
                } else {
                    root.getLoginError().setText("");
                }
                 User user = new User();
                 user.setEmail(root.getTxtUname().getText());
                 user.setPassword(root.getTxtPass().getText());
               
                User loginStatus = ParentController.login(user);
                root.getTxtEmailError().setText(String.valueOf(loginStatus));
                if (loginStatus != null) { //from the server
                    ParentController.setMy_info(loginStatus);
                    MainscreenController mc = new MainscreenController(stage); // current user mainscreen
                } else {
                    root.getTxtEmailError().setText("Email does't exist");
                }
            }
        });
        root.getLnkSignup().addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                //AddItemController AIC = new AddItemController(stage);
                RegisterUI registerView = new RegisterUI();
                Scene scene = new Scene(registerView);

                stage.setScene(scene);
                stage.show();
                RegisterController rc = new RegisterController(stage, registerView);
            }
        });
        root.getBtnForget().addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                ForgetPassUI resetview = new ForgetPassUI();
                Scene scene = new Scene(resetview);
                stage.setScene(scene);
                stage.show();
                ForgetPasswordController ec = new ForgetPasswordController(stage, resetview);
            }

        });
    }
}
