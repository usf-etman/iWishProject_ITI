/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.ForgetPassUI;
import View.LoginUI;
import View.RegisterUI;
import java.util.regex.Pattern;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import model.User;

/**
 *
 * @author Youssef
 */
public class LoginController{

    LoginController(Stage stage) {
        LoginUI root = new LoginUI();
        Scene scene = new Scene(root);

        stage.setScene(scene);
        stage.show();
        root.getBtnLogin().addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                root.loadScreen();
                root.getTxtEmailError().setText("");
                root.getTxtPassError().setText("");
                root.getLoginError().setText("");

                if (root.getTxtUname().getText().length() < 1) {
                    root.unloadScreen();
                    root.getTxtEmailError().setText("Email must not be null!");
                }

                if (root.getTxtPass().getText().length() < 1) {
                    root.unloadScreen();
                    root.getTxtPassError().setText("password must not be null!");
                }
                // checking for email format
                String regexPattern = "^(.+)@(\\S+)$";
                boolean emailMatch = Pattern.compile(regexPattern)
                        .matcher(root.getTxtUname().getText())
                        .matches();

                if (!emailMatch) {
                    root.unloadScreen();
                    root.getLoginError().setText("Sorry, you have to enter the email in the right format");
                    //return;
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
                                    root.unloadScreen();
                                    root.getTxtEmailError().setText("Incorrect email or password");
                                }
                            }); 
                            stop();
                        }
                    }
                }.start();
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
