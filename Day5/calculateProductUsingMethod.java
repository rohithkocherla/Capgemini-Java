// import java.util.Scanner;

// public class calculateProductUsingMethod {
//     public static int calculateProd(int a,int b,int c){
//         int prod=a*b*c;
//         return prod;

//     }
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int a=sc.nextInt();
//         int b=sc.nextInt();
//         int c=sc.nextInt();

//         int prod=calculateProd(a, b, c);
//         System.out.println(prod);
//     }
// }


import java.util.Scanner;

public class calculateProductUsingMethod {
    public static int calculateProd(int a,int b,int c){
        
        return a*b*c;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();

        
        System.out.println("product of nums: "+calculateProd(a, b, c));
    }
}
