import java.util.Scanner;

public class SimpleCalculater {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
     
        System.out.println("Enter a num: ");
          double a=sc.nextDouble();
        System.out.println("enter b num: ");
        double b=sc.nextDouble();
        System.out.println("Enter oreration");
        char operation=sc.next().charAt(0);
        double result=0;
        switch(operation){
            case '+':
                result = a+b;
                break;
            case '-':
                result=a-b;
                break;

            case '*':
                result=a*b;
                break;
            case '/':
                result=a/b;
                break;
                

            default:
                System.out.println("Invalid");

        
        }
           System.out.println("Result: "+result);
    }
}
