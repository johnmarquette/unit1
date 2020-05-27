package app;
import java.util.Scanner;

public class App { 
    public static void main(final String[] args) throws Exception {
    Account account1 = new Account();
    Scanner input = new Scanner(System.in);
    System.out.println("Create Account");
    account1.name = "John Marquette";
    System.out.println(account1.name);
    account1.startingamount = 500;
    System.out.println(account1.startingamount);
    account1.password = "Ollie";
    System.out.println(account1.password);
    System.out.println("Account created, please log in");
    System.out.println("Enter your name");
    String name = input.nextLine();
    System.out.println("Enter your password");
    if (name == "John Marquette"){
    }
    if (password == "Ollie"){
        System.out.println("Access Granted, welcome John Marquette");
    }
    System.out.println("What would you like to do?");
    System.out.println("Press 1 to check balance, 2 to withdraw money, 3 to change password.");
    int choice = input.nextInt();
    System.out.println("How much money would you like to withdraw?");
    int money = input.nextInt();
    System.out.println("You withdrew 200 dollars.");
    System.out.println("Your current balance is now 300.");
    }
}


     
            
        
        
    


 
    

        


       
    
      
    
 




    


        