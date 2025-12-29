import java.util.Scanner;

public class EvenProduct {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int evenprod=1;
        
        while(n>0){
            int last=n%10;
            if(last%2==0){
            evenprod=evenprod*last;
            }


            n=n/10;
        }
        System.out.println(evenprod);
    }
}
