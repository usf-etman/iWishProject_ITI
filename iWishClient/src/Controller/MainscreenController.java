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

    Item selectedItm;

    MainscreenController(Stage stage) {

        MainscreenUI mainView = new MainscreenUI();
        Scene scene = new Scene(mainView);
        stage.setScene(scene);
        stage.show();

        mainView.getLblName().setText(ParentController.getMy_info().getUsername());
        //mainView.getLblBalance().setText(String.valueOf(ParentController.getMy_info().getBalance()));
        int mybalance = ParentController.getMyBalance(ParentController.getMy_info().getUID());
        mainView.getLblBalance().setText(String.valueOf(mybalance));
        
        Vector<Item> itms = ParentController.displayWishlist();
        TreeItem treeRoot = new TreeItem(new Item(0, "Wishlist & Contributors", "...", ""));
        TreeItem itm = null;
        System.out.println(itms);
        for (int i = 0; i < itms.size(); i++) {
            if (itms.get(i).getDesc().equals("k")) {
                if (i != 0) {
                    treeRoot.getChildren().add(itm);
                }
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
        mainView.getBtnFriends().addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

                FriendListController flc = new FriendListController(stage);
            }
        });

        mainView.getBtnNotifications().addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

                PendingFriendController pf = new PendingFriendController(stage);
            }

        });

          mainView.getBtnSignout().addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event) {
                
                LoginController lc = new LoginController(stage);
            }
        
        });
        
        mainView.getBtnRecharge().addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                RechargeController rc = new RechargeController(stage);
            }
        });

        mainView.getBtnRemove().addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                ParentController.removeWish(selectedItm.getId());

                Vector<Item> itms = ParentController.displayWishlist();
                TreeItem treeRoot = new TreeItem(new Item(0, "Wishlist & Contributors", "...", ""));
                TreeItem itm = null;
                System.out.println(itms);
                for (int i = 0; i < itms.size(); i++) {
                    if (itms.get(i).getDesc().equals("k")) {
                        if (i != 0) {
                            treeRoot.getChildren().add(itm);
                        }
                        itm = new TreeItem(itms.get(i));
                    } else {
                        itm.getChildren().add(new TreeItem(itms.get(i)));
                    }
                }
                treeRoot.getChildren().add(itm);
                treeRoot.setExpanded(true);
                mainView.getTblWishlist().setRoot(treeRoot);
            }
        });

        mainView.getTblWishlist().setOnMouseClicked(new EventHandler<javafx.scene.input.MouseEvent>() {
            @Override
            public void handle(javafx.scene.input.MouseEvent event) {
                TreeItem selected = mainView.getTblWishlist().getSelectionModel().getSelectedItem();
                if (selected.getParent().equals(treeRoot)) {
                    System.out.println("this is an item");
                    mainView.getBtnRemove().setDisable(false);
                    selectedItm = (Item) selected.getValue();
                } else {
                    System.out.println("This is a contributor");
                    mainView.getBtnRemove().setDisable(true);
                }
            }
        });
    }
}
