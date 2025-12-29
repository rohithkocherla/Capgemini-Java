import java.util.Scanner;

public class findProductOfElements {
     public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int product=1;

        int arr[]=new int[n];
        
        for(int i=0;i<n;i++){
            System.out.println("enter elements: ");
            arr[i]=sc.nextInt();

            
            
        }

        
        System.out.println("product of all elements: ");
        for(int i=0;i<n;i++){
            product+=arr[i];
                
            
    }
    System.out.println(product);

}
}
