import java.util.Scanner;
//finding factorial of every number

public class factorialOfDigits {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int temp=n;
        int sum=0;
        while(n>0){
            int last=n%10;
            int fact=1;
            for(int i=1;i<=last;i++){
                fact*=i;
            }
            
            System.out.println(fact);
            sum+=fact;
            n=n/10;
        }
        if(sum==temp){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }

       
    }
}
