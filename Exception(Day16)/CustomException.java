import java.util.Scanner;

class NotEligibleException extends Exception {
    public NotEligibleException(String msg) {
        super(msg);
    }
}

public class CustomException {
    public static void main(String[] args) {
        System.out.println("Main Start");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age: ");
        int age = sc.nextInt();

        try {
            eligibleForVoting(age);
        } catch (NotEligibleException e) {
            e.printStackTrace();
        }

        System.out.println("Main End");
        sc.close();
    }

    public static void eligibleForVoting(int age) throws NotEligibleException {
        if (age >= 18) {
            System.out.println("Eligible for voting");
        } else {
            throw new NotEligibleException("Your age is below 18");
        }
    }
}
