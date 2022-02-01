/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.MainscreenUI;
import View.RechargeUI;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import model.Recharge;
import model.User;


public class RechargeController  {
   
    RechargeController(Stage stage, RechargeUI root) {
            root.getBtn_confirm().addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                
                if (root.getTxt_card_number().getText().length() < 1) {
                    root.getCardNumberError().setText("Card number must not be null!");
                } else {
                    root.getCardNumberError().setText("");
                }
                
                if (root.getTxt_mm().getText().length() < 1) {
                    root.getMmError().setText("MM null!");
                } else {
                    root.getMmError().setText("");
                }
                
                if (root.getTxt_yy().getText().length() < 1) {
                    root.getYyError().setText("YY null!");
                } else {
                    root.getYyError().setText("");
                }
                
                if (root.getTxt_cvv().getText().length() < 1) {
                    root.getCvvError().setText("CVV null!");
                } else {
                    root.getCvvError().setText("");
                }
                
                if (root.getTxt_first_name().getText().length() < 1) {
                    root.getFirstNameError().setText("First name must not be null!");
                } else {
                    root.getFirstNameError().setText("");
                }
                
                if (root.getTxt_last_name().getText().length() < 1) {
                    root.getLastNameError().setText("Last name must not be null!");
                } else {
                    root.getLastNameError().setText("");
                }
                
                if (root.getTxt_Amount().getText().length() < 1) {
                    root.getAmountError().setText("Amount must not be null!");
                } else {
                    root.getAmountError().setText("");
                }
                
                if (root.getTxt_card_number().getText().length() > 0
                        && root.getTxt_mm().getText().length() > 0
                        && root.getTxt_yy().getText().length() > 0
                        && root.getTxt_cvv().getText().length() > 0
                        && root.getTxt_first_name().getText().length() > 0
                        && root.getTxt_last_name().getText().length() > 0
                        && root.getTxt_Amount().getText().length() > 0){
                    
                int userId=ParentController.getMy_info().getUID();    
                System.out.println("userId "+userId);
                String userName=ParentController.getMy_info().getUsername();
                Recharge recharge = new Recharge(userId,userName,root.getTxt_Amount().getText());
                //Recharge recharge = new Recharge(root.getTxt_card_number().getText(), root.getTxt_mm().getText(), root.getTxt_cvv().getText(), root.getTxt_yy().getText(),root.getTxt_first_name().getText(),root.getTxt_last_name().getText(),root.getTxt_Amount().getText(),userName);
                
                User rechargeStatus = ParentController.getRechargeInfo(recharge, "Recharge");
                System.out.println("rechargeStatus "+rechargeStatus);
                root.getRechargeError().setText(String.valueOf(rechargeStatus));
                
                if(rechargeStatus!=null){
                    ParentController.setMy_info(rechargeStatus);
                    MainscreenController mc = new MainscreenController(stage);
 
                }
                else{
                    System.out.println("No Success");
                }

                   
                }
                
               
            }
        });
    }
}
