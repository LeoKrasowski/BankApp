package com.mycompany.bankapp.Model;

import java.util.ArrayList;

public class User {
    private int id;
    private String firstName;
    private String lastName;
    private String email;
    
    private ArrayList <Account> accounts = new ArrayList <>();
    
    public User(){
       
    }

    public int getId(){
        return id;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public String getEmail(){
        return email;
    }

    public void setId(int id){
        this.id = id;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public void setEmail(String email){
        this.email = email;
    }
    
    public ArrayList<Account> getAccounts(){
        return accounts;
    }
    
    public void setAccounts(ArrayList<Account> accounts){
        this.accounts = accounts;
    }
}

