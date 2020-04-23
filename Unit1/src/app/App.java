package app;

public class App { 
    public static void main(final String[] args) throws Exception {
    
        System.out.println("start first loop");
    for (int i = 20; i > 0; i ++){
        System.out.println(i);
        if (i == 10){
            for (int j = 0; j < 5; j++){
                 System.out.println(i);
                 
        }
      }  
    }
    System.out.println("end first loop");   
    System.out.println("start second loop");
    for (int i = 0; i <= 36; i = i + 4){
        System.out.println(i);
        if (i % 12 == 0){
            System.out.println("Hey!");
        }
    
    }
    System.out.println("End second loop");

        
    
    }
}

     
            
        
        
    


 
    

        


       
    
      
    
 




    


        