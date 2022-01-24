/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.MainscreenUI;
import View.ResetPasswordUI;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.eclipse.jetty.util.thread.ReservedThreadExecutor;

/**
 *
 * @author Youssef
 */
public class MainscreenController {

    MainscreenController(Stage stage) {
        MainscreenUI mainView = new MainscreenUI();
        Scene scene = new Scene(mainView);

        stage.setScene(scene);
        stage.show();
        
        mainView.getBtnItems().addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                ResetPasswordUI registerView = new ResetPasswordUI();
                Scene scene = new Scene(registerView);

                stage.setScene(scene);
                stage.show();
                ResetPasswordController rc = new ResetPasswordController(stage, registerView);
            }
        });
    }
}
