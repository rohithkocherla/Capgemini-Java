// Write a regular expression to validate a mobile number with the following rules:
// 	Must start with 6, 7, 8, or 9
// 	Must contain exactly 10 digits
public class problem1 {
    public static void main(String[] args) {
        System.out.println("9855465144".matches("^[6-9]\\d{9}$"));
    }
    
}
