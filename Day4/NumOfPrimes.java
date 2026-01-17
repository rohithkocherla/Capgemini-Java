import java.util.Scanner;

public class NumOfPrimes {
     public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();

       //if(n==0 || n==1)
       
       if(n%2==0){
        System.out.println("not prime");
       }
       else{
        System.out.println("prime");
       }
   
      }}
     
