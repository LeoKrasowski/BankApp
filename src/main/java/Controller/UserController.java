package Controller;

import java.util.Scanner;
import com.mycompany.bankapp.Model.User;


public class UserController {
    
    public void createUser(){
        
      Scanner input = new Scanner(System.in);
      
      System.out.println("Enter you name");
      
      String userName = input.nextLine();
      System.out.println("you name is " + userName);
         
      System.out.println("Enter you surname");
      
      String userSurname = input.nextLine();
      System.out.println("you surname is " + userSurname);
      
      System.out.println("Enter you email");
      
      String userEmail = input.nextLine();
      System.out.println("you email is " + userEmail);
      
      User newUser = new User();
      
      newUser.setFirstName(userName);
      newUser.setLastName(userSurname);
      newUser.setEmail(userEmail);
      
    }
    
    
}
