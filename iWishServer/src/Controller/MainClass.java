/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.serverUI;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import model.DAO;
import model.Item;

/**
 *
 * @author Youssef
 */
public class MainClass extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        serverController sc = new serverController(stage);
        DAO.AddItem(new Item("laptop2","name2",150));
    }

    public static void main(String[] args) {
        launch(args);
    }
}
