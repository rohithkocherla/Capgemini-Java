import java.util.Scanner;

public class OddFactorial{
    
      public static void main(String args[]){
        
          for(int i=10;i>=1;i--){
               if (i % 2 != 0) {
               int fact = 1;

               for(int j=1;j<=i;j++){
                    fact = fact*j;
               }
               System.out.println("Fatorial of " + i + " is " + fact);
            }
          }
     }
}
        