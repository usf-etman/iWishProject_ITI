/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.LoginUI;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author Mariem
 */
public class MainClass extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        LoginUI root = new LoginUI();
        Scene scene = new Scene(root);

        stage.setScene(scene);
        stage.show();
        LoginController lc = new LoginController(stage, root);
        stage.setOnCloseRequest(e -> {
            Platform.exit();
            System.exit(0);
        });

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
