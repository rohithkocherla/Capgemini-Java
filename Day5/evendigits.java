import java.util.Scanner;
//finding even digits
public class evendigits {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();

        while(n>0){
            int last=n%10;
            if(last%2==0){
                 System.out.println(n);
            }
            n=n/10;
        }
       
    }
}
