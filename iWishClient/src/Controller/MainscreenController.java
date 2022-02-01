/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.RechargeUI;
import View.MainscreenUI;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author Youssef
 */
public class MainscreenController {

    MainscreenController(Stage stage)
    {
   
        MainscreenUI mainView = new MainscreenUI();
        Scene scene = new Scene(mainView);

        stage.setScene(scene);
        stage.show();
        
        mainView.getLblName().setText(ParentController.getMy_info().getUsername());
        mainView.getLblBalance().setText(String.valueOf(ParentController.getMy_info().getBalance()));

        
        mainView.getBtnItems().addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                AddItemController AIC = new AddItemController(stage);
            }
        });
        
         mainView.getBtn_Recharge().addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                    
                RechargeUI rechargeView = new RechargeUI();
                Scene scene = new Scene(rechargeView);

                stage.setScene(scene);
                stage.show();
                
                RechargeController rc = new RechargeController(stage, rechargeView);
            }
        });
    }
}

