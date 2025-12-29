import java.util.Scanner;

public class findMin {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c= sc.nextInt();
        int min=findMin(a,b,c);
        System.out.println(min);
    }
    public static int findMin(int a,int b,int c){
    if(b>a && c>a) return a;
    else if(a>b && c>b) return b;
    else return c;
        
    }
}
