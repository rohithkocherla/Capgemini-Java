import java.util.Scanner;

public class DigitSeperation {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a num: ");
        int n = sc.nextInt();
        

        while (n>0){
            int last = n % 10;
            
          System.out.println(last + " ");
            n = n / 10;  

        }
       
    }
}
