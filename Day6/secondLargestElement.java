import java.util.Scanner;

public class secondLargestElement {
    
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        if (n < 2) {
            System.out.println("Second largest element not possible");
            return;
        }

        int arr[] = new int[n];

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {

            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            }
             else if (arr[i] > largest && arr[i] < secondLargest) {
                secondLargest = arr[i];
            }

        }

        System.out.println("Second largest element: " + secondLargest);
    }
}


