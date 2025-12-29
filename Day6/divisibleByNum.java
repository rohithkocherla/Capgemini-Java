import java.util.Scanner;

//take one value and count with how many nums it is dibisibleby

public class divisibleByNum {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        int n = sc.nextInt();

        int arr[]=new int[n];

        for(int i=0;i<n;i++){
            System.out.println("enter nums:");
            arr[i]=sc.nextInt();
        }
        
        System.out.println("enter target value: ");
        int target =sc.nextInt();
        int count=0;
        for(int i=0;i<n;i++){
            if(target%arr[i]==0){
                count++;
            }
        }
        System.out.println(count);
    }
}
