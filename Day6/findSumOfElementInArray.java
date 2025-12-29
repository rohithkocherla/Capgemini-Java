import java.util.Scanner;

public class findSumOfElementInArray {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;

        int arr[]=new int[n];
        
        for(int i=0;i<n;i++){
            System.out.println("enter elements: ");
            arr[i]=sc.nextInt(); 
            
        }

        
        System.out.println("sum of all elements: ");
        for(int i=0;i<n;i++){
            sum+=arr[i];
                
            
    }
    System.out.println(sum);

}
}