package com.mycompany.bankapp;

import Controller.UserController;


public class BankApp {

    public static void main(String[] args) {
        
        UserController userController = new UserController();
        
        userController.createUser();
    }
}
