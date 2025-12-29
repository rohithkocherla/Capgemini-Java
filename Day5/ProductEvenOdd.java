import java.util.Scanner;

public class ProductEvenOdd {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();

        int evensum=0;
        int oddsum=0;

        while(n>0){
            int last=n%10;
           if(n%2==0) {
            evensum+=last;
           }
           if(n%2!=0) {
            oddsum+=last;
           }
            n=n/10;

        }
        System.out.println(evensum);
        System.out.println(oddsum);
        System.out.println(evensum*oddsum);
    }
}
