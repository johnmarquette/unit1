package app;
import java.util.Scanner;

public class App { 
    public static void main(final String[] args) throws Exception {
    
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number.");
        int num1 = input.nextInt();
        System.out.println("Enter another number.");
        int num2 = input.nextInt();

        System.out.println("Press 1 for addition, 2 for subtraction, 3 for mutiplication, or 4 for division.");
        int choice = input.nextInt();

        if (choice == 1){
            System.out.println(num1 + num2);
        }
        if (choice == 2){
            System.out.println(num1 - num2);
        }
        if (choice == 3){
            System.out.println(num1 * num2);
        }
        if (choice == 4){
            System.out.println(num1 / num2);
        }

        

        
        
        
        
       
        
        






       
        
        
        
        
        
        
        
            
            
    }
}


     
            
        
        
    


 
    

        


       
    
      
    
 




    


        