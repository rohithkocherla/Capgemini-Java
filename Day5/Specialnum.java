import java.util.Scanner;

public class Specialnum {
    //product+sum=n  special number
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int temp=n;
    int sum=0;
    int prod=1;

    while(n>0){
        int last=n%10;
        sum+=last;
        prod*=last;
        n=n/10;
    }
            if(sum+prod==temp){
            System.out.println("special number");
        }else{
            System.out.println("not a special number");
        }
    
    }

}
