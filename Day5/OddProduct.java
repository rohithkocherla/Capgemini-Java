import java.util.Scanner;

public class OddProduct {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int oddprod=1;
        
        while(n>0){
            int last=n%10;
            if(last % 2  != 0){
            oddprod=oddprod*last;
            }


            n=n/10;
        }
        System.out.println(oddprod);
    }
}
 

