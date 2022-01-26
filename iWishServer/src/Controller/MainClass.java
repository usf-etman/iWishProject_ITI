/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.stage.Stage;
import model.DAO;
import model.WishList;

/**
 *
 * @author Youssef
 */
public class MainClass extends Application {

    @Override
    public void start(Stage stage) throws Exception {
 //WishList lst  = new WishList(7, 263, 2, 3006);
   //DAO.AddToWishlist(lst);
        ServerController sc = new ServerController(stage);
        stage.setOnCloseRequest(e -> {
            Platform.exit();
            System.exit(0);
        });

    }

    public static void main(String[] args) throws SQLException {

        launch(args);

    }
}
