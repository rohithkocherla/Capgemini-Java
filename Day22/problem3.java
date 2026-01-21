// Write a regular expression to validate a password with the following rules:
// 	Minimum 8 characters
// 	Must contain at least one uppercase letter
// 	Must contain at least one digit
public class problem3 {
    public static void main(String[] args) {
        System.out.println("Rohit1234".matches("^(?=.*[A-Z])(?=.*\\d).{8,}$"));
    }
}
