package com.example.myproject;

public class User {

    private String emailAddress ;

    private String password ;

    private String userId;


    public User(String userId,String emailAddress,String password){
        this.userId = userId;
        this.emailAddress = emailAddress;
        this.password = password;
    }

    public String getEmailAddress() {
        return emailAddress;
    }



    public String getUserId() {
        return userId;
    }








}
