/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bankapp.Model;

public class Account {
    private int id;
    private String iban;
    private String name;
    private AccountType type;
    private Currency currency;
    
    public Account(){
        
    }
    
    public int getId(){
        return id;
    }
    
    public String getIban(){
        return iban;
    }
    
    public String getName(){
        return name;
    }
    
    public AccountType getType(){
        return type;
    }
    
    public Currency getCurrency(){
       return currency;
    }
    
    public void setId(int id){
        this.id = id;
    }
    
    public void setIban(String iban){
        this.iban = iban;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public void setType(AccountType type){
        this.type = type;
    }
    
    public void setCurrency (Currency currency){
        this.currency = currency;
    }
}
