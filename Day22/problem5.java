// OTP and PIN Code Validation
// 	(a) OTP Validation
// 	Write a regular expression to validate a 6-digit OTP.
// 	(b) PIN Code Validation
// 	Write a regular expression to validate a 4-digit PIN.
public class problem5 {
    public static void main(String[] args) {
        System.out.println("498544".matches("\\d{6}"));
        System.out.println("5459".matches("\\d{4}"));
        System.out.println("56459".matches("\\d{4}"));

    }
    
}
