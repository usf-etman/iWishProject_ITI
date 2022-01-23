/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

public class User {

    private String username;
    private String email;
    private String password;
    private String securityQuestion;
    //private byte[] hash;

    public User(String username, String email, String password, String securityQuestion) {
        this.username = username;
        this.email = email;
        this.password = password;
        this.securityQuestion = securityQuestion;
        //this.hash = hash;
    }

    public User(String email, String securityQuestion) {
        //this.username = username;
        this.email = email;
        // this.password = password;
        this.securityQuestion = securityQuestion;
        //this.hash = hash;
    }

    public User(String username, String email, String password) {
        this.username = username;
        this.email = email;
        this.password = password;
        //this.securityQuestion = securityQuestion;
        //this.hash = hash;
    }
    public User() {
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getSecurityQuestion() {
        return securityQuestion;
    }
}
