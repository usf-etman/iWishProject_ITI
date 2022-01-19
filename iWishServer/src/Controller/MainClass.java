/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import javafx.application.Application;
import javafx.stage.Stage;

/**
 *
 * @author Youssef
 */
public class MainClass extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        ServerController sc = new ServerController(stage);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
