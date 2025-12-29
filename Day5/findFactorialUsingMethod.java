import java.util.Scanner;

//finding factorial using method

public class findFactorialUsingMethod {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();

        findFactorial(n);
          
    }


    public static void findFactorial(int n){
    //loop
    if(n<0){
        System.out.println("Invalid");
        return;
    }
    int factorial=1;

    for(int i=1;i<=n;i++){
        factorial=factorial*i;
    }
    System.out.println(factorial);
    return;
   
}

}


// import java.util.Scanner;

// //finding factorial normally

// public class findFactorialUsingMethod {
//     public static void main(String args[]){
//         Scanner sc= new Scanner(System.in);
//         int n=sc.nextInt();

// if(n<0){
//         System.out.println("Invalid");
        
//     }
//     int factorial=1;

//     for(int i=1;i<=n;i++){
//         factorial=factorial*i;
//     }
//     System.out.println(factorial);
    
// }
// }