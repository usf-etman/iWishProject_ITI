/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

public class Recharge {
    String cardNumber;
    String mm;
    String cvv;
    String yy;
    String firstName;
    String lastName;
    String userName;
    String amount;
    int userId; 
    
    public Recharge(){
    
    }
    
    

    public Recharge(String cardNumber, String mm, String cvv, String yy, String firstName, String lastName,String amount,String userName) {
        this.cardNumber = cardNumber;
        this.mm = mm;
        this.cvv = cvv;
        this.yy = yy;
        this.firstName = firstName;
        this.lastName = lastName;
        this.amount=amount;
        this.userName=userName;
        
    }
    
    public Recharge(int userId,String userName,String amount){
        this.userId=userId;
        this.amount=amount;
        this.userName=userName;
    }

        
    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getMm() {
        return mm;
    }

    public void setMm(String mm) {
        this.mm = mm;
    }

    public String getCvv() {
        return cvv;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }

    public String getYy() {
        return yy;
    }

    public void setYy(String yy) {
        this.yy = yy;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

   

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }
    
    
}
