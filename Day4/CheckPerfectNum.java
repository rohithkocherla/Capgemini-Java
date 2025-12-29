import java.util.Scanner;
//check given num is perfect or not
public class CheckPerfectNum {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum=0;

        for(int i=1;i<n;i++){
            if(n%i==0){
                sum+=i;
                System.out.println("factor"+ i);
            }
        }
        if(sum==n){
            System.out.println("perfect square");
        }
        else{
            System.out.println("Not a perfect square");
        }
    }
}
