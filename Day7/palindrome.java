import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int temp = n;   // store original number
        int rev = 0;

        while (n > 0) {
            int last = n % 10;        // get last digit
            rev = rev * 10 + last;       // reverse logic
            n = n / 10;            // remove last digit
        }

        if (rev == temp) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}

