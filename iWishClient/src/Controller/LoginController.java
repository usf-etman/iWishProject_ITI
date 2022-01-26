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

    LoginController(Stage stage) {
        LoginUI root = new LoginUI();
        Scene scene = new Scene(root);

        stage.setScene(scene);
        stage.show();
        root.getBtnLogin().addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                root.loadScreen();

                if (root.getTxtUname().getText().length() < 1) {
                    root.getTxtEmailError().setText("Email must not be null!");
                }

                if (root.getTxtPass().getText().length() < 1) {
                    root.getTxtPassError().setText("password must not be null!");
                }
                // checking for email format
                String regexPattern = "^(.+)@(\\S+)$";
                boolean emailMatch = Pattern.compile(regexPattern)
                        .matcher(root.getTxtUname().getText())
                        .matches();

                if (!emailMatch) {
                    root.getLoginError().setText("Sorry, you have to enter the email in the right format");
                    return;
                }
                User user = new User();
                user.setEmail(root.getTxtUname().getText());
                user.setPassword(root.getTxtPass().getText());

                new Thread() {
                    public void run() {
                        User loginStatus = ParentController.login(user);
                        if (loginStatus != null) { //from the server
                            ParentController.setMy_info(loginStatus);
                            Platform.runLater(new Runnable(){
                                public void run(){
                                    MainscreenController mc = new MainscreenController(stage);
                                }
                            });  
                        } else {
                            Platform.runLater(new Runnable(){
                                public void run(){
                                    root.getTxtEmailError().setText("Email does't exist");
                                }
                            });                            
                        }
                    }
                }.start();
            }
        });
        root.getLnkSignup().addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                AddItemController AIC = new AddItemController(stage);
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
