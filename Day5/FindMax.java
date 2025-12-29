import java.util.Scanner;

public class FindMax {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        int max=findMax(5,6,9);
        System.out.println(max);
        System.out.println(findMin(4,88,44));
        System.out.println(isPrime(17));
    }
    public static int findMax(int a,int b,int c){
    if(a>b && a>c) return a;
    else if(b>a && b>c) return b;
    else return c;
        
    }
    public static int findMin(int a,int b,int c){
    if(b>a && c>a) return a;
    else if(a>b && c>b) return b;
    else return c;
    }
    public static boolean isPrime(int a){
        if(a==0 || a==1) return false;
        for(int i=2;i<a;i++){
            if(a%i==0) return false;
        }
        return true;
    }
    
}
