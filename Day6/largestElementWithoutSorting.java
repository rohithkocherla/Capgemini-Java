import java.util.Scanner;
public class largestElementWithoutSorting {
   

//find largest element without sorting
     public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        

        int arr[]=new int[n];
        
        for(int i=0;i<n;i++){
            System.out.println("enter elements: ");
            arr[i]=sc.nextInt();

        }

        int largest = arr[0];

        System.out.println("largest element: ");
        for(int i=0;i<n;i++){
             if (arr[i] > largest) {
                largest = arr[i];
            }   
    }
    System.out.println(largest);
}
}
