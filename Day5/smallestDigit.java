import java.util.Scanner;

public class smallestDigit {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int smallest=Integer.MAX_VALUE;

        while(n>0){
            int last=n%10;
            if(last<smallest){
                smallest=last;
            }
            n=n/10;
        }
        System.out.println(smallest);


    }
}
