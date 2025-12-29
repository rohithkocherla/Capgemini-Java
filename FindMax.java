import java.util.Scanner;

public class FindMax {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number: ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();

        if(a>b && a>c){
            System.out.println("a is the max num");
        }
        else if(b>a && b>c){
            System.out.println("b is the max num");
        }
        else{
            System.out.println("c is the max num");
        }
        
    }
}
