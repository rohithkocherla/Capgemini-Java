import java.util.Scanner;
public class SumOfDigits {
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int sum  = 0;

    while(n>0){//987
        int last=n%10;
        sum+=last;
        // System.out.println(last);
        n=n/10;//987

    }
    System.out.print(sum);

}
}
