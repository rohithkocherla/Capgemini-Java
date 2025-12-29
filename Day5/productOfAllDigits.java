import java.util.Scanner;

public class productOfAllDigits {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int prod=1;

        while(n>0){
            int last=n%10;
            prod=prod*last;
            n=n/10;
        }
        System.out.println(prod);
    }
}
