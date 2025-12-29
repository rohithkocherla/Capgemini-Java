import java.util.Scanner;

//find prime elements in array.
public class findPrimeElementInArray {

    //method to check prime
    static boolean isPrime(int num) {
        if (num <= 1) return false;

        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int arr[]=new int[n];//arr declaration

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("prime elements are: ");
        for(int i=0;i<n;i++){
            if(isPrime (arr[i])){     //prime check
                System.out.println(arr[i]);
            }
        }

    }
}
