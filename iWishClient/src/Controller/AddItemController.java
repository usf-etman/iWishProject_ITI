/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.AddItemUI;
import View.RegisterUI;
import java.util.Vector;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.stage.Stage;
import model.Item;

/**
 *
 * @author JESSY
 */
public class AddItemController {

    AddItemController(Stage stage) {
        AddItemUI additmView = new AddItemUI();
        Scene scene = new Scene(additmView);
        stage.setScene(scene);
        stage.show();
        Vector<Item> itmVector = ParentController.getAllItems();
        //System.out.println(itmVector.size());
        for (int i = 0; i < itmVector.size(); i++) {
            additmView.getTableView().getItems().add(itmVector.get(i));
        }

        additmView.getBtnAddIIem().addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                RegisterUI registerView = new RegisterUI();
                Scene scene = new Scene(registerView);

                stage.setScene(scene);
                stage.show();
                RegisterController rc = new RegisterController(stage, registerView);
            }
        });
    }
}
