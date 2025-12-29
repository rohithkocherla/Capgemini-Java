import java.util.Scanner;

public class avgOfLargestAndSmallestNum {
    
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int arr[]=new int[n];

        for(int i=0;i<n;i++){
            System.out.println("enter nums:");
            arr[i]=sc.nextInt();
        }

        int largest=Integer.MIN_VALUE;
        int smallest=Integer.MAX_VALUE;


        for(int i=0;i<n;i++){
            if(arr[i] > largest){
                largest=arr[i];
            }
            if(arr[i] < smallest){
                smallest=arr[i];
            }
        }

       

       

        double average=(largest+smallest)/2;

        System.out.println("largest number"+ largest);
        System.out.println("smallest number"+smallest);
        System.out.println(average+"average number");

}
}