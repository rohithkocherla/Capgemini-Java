//wjp that take a number and divide with the sum of digits of the number then the remainder 0 then it niven number
import java.util.Scanner;
public class NivenNum {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp=n;
        int sum=0;

        while (n>0) {
            int last=n%10;
            sum+=last;
            n=n/10;
        }
        if(temp%sum==0){                //24%6==0  true
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
}
