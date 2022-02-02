/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.RechargeUI;
import View.MainscreenUI;
import java.util.Vector;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.TreeItem;
import javafx.stage.Stage;
import model.Item;

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

        
        Vector<Item> itms = ParentController.displayWishlist();
        TreeItem treeRoot = new TreeItem(new Item(0, "Wishlist & Contributors", "...", ""));
        TreeItem itm = null;
        System.out.println(itms);
        for(int i=0; i<itms.size(); i++){
            if(itms.get(i).getDesc().equals("k")){
                if(i != 0){treeRoot.getChildren().add(itm);}
                itm = new TreeItem(itms.get(i));
            } else {
                itm.getChildren().add(new TreeItem(itms.get(i)));
            }
        }
        treeRoot.getChildren().add(itm);
        treeRoot.setExpanded(true);
        mainView.getTblWishlist().setRoot(treeRoot);
        
        mainView.getBtnItems().addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                AddItemController AIC = new AddItemController(stage);
            }
           
        });
        mainView.getBtnFriends().addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event) {
                
                FriendListController flc=new FriendListController(stage);
            }
        });
        
         mainView.getBtnNotifications().addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event) {
                
                PendingFriendController pf=new PendingFriendController(stage);
            }
        
        });
        
         mainView.getBtnRecharge().addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>() {
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

