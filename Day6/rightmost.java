import java.util.Scanner;

public class rightmost {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int arr[]=new int[n];

        for(int i=0;i<n;i++){
            System.out.println("enter nums:");
            arr[i]=sc.nextInt();
        }

        int leader=Integer.MIN_VALUE;
        for(int i=n-1;i>=0;i--){
            if(leader<arr[i]){
                leader=arr[i];
                System.out.println(leader);
            }
        }
}
}