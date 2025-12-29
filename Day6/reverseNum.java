import java.util.Scanner;

//WJP for reversing the values of every index.

public class reverseNum {
    public static int reverse(int n){
        int reverse=0;

        while(n>0){
            int last=n%10;
            reverse=reverse*10+last;
            n=n/10;
        }
        return reverse;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter len of arr:");
        int n=sc.nextInt();

        int arr[]=new int[n];
        System.out.println("enter n values:");


        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("reversed ans:");
        for(int i=0;i<n;i++){
            System.out.println(reverse(arr[i]));
        }

    }
}
