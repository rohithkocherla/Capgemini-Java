import java.util.Scanner;

public class thirdLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();

        if(n<3){
            System.out.println("invalid");
            return;
        }

        int arr[]=new int[n];

        for(int i=0;i<n;i++){
            System.out.println("enter elements");
            arr[i]=sc.nextInt();
        }
        int largest=Integer.MIN_VALUE;
        int secondLargest=Integer.MIN_VALUE;
        int thirdLargest=Integer.MIN_VALUE;

        for(int i=0;i<n;i++){
            if(arr[i]>largest){
                thirdLargest=secondLargest;
                secondLargest=largest;
                largest=arr[i];
            }
            else if(arr[i]<largest && arr[i]>secondLargest){
                thirdLargest=secondLargest;
                secondLargest=arr[i];
            }
            else if(arr[i]<secondLargest && arr[i]>thirdLargest){
                thirdLargest=arr[i];

            }
        }
        System.out.println("largest: "+ largest);
        System.out.println("second largest: "+secondLargest);
        System.out.println("thirdLargest"+thirdLargest);
    }
}
