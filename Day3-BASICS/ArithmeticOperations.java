import java.util.Scanner;
public class ArithmeticOperations {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter num of op: ");
        String s=sc.next();
        System.out.println("Enter the num of variables: ");
        int n=sc.nextInt();

        switch(s){
            case "add":
                if(n==2){
                int a=sc.nextInt();
                int b=sc.nextInt();
                System.out.println(a+b);
                }
                if(n==3){
                int a=sc.nextInt();
                int b=sc.nextInt();
                int c=sc.nextInt();
                System.out.println(a+b+c);
                }
                if(n==4){
                   int a=sc.nextInt();
                int b=sc.nextInt();
                int c=sc.nextInt();
                int d=sc.nextInt();
                System.out.println(a+b+c+d); 
                }
                break;
            case "sub":
                if(n==2){
                int a=sc.nextInt();
                int b=sc.nextInt();
                System.out.println(a-b);
                }
                if(n==3){
                int a=sc.nextInt();
                int b=sc.nextInt();
                int c=sc.nextInt();
                System.out.println(a-b-c);
                }
                if(n==4){
                   int a=sc.nextInt();
                int b=sc.nextInt();
                int c=sc.nextInt();
                int d=sc.nextInt();
                System.out.println(a-b-c-d); 
                }
                break;
            case "mul":
                if(n==2){
                int a=sc.nextInt();
                int b=sc.nextInt();
                System.out.println(a*b);
                }
                if(n==3){
                int a=sc.nextInt();
                int b=sc.nextInt();
                int c=sc.nextInt();
                System.out.println(a*b*c);
                }
                if(n==4){
                   int a=sc.nextInt();
                int b=sc.nextInt();
                int c=sc.nextInt();
                int d=sc.nextInt();
                System.out.println(a*b*c*d); 
                }
                break;
            case "div":
                if(n==2){
                int a=sc.nextInt();
                int b=sc.nextInt();
                System.out.println(a/b);
                }
                
        }

    }
}
