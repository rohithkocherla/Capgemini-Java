import java.util.Scanner;

public class largestdigit {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int largest=Integer.MIN_VALUE;

        while(n>0){
            int last=n%10;//7845
            if(last>largest){//5
                largest=last;
            }

            n=n/10;//7845
            
        }
        System.out.println(largest);
    }
}
