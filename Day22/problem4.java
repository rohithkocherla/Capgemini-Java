//  Write a regular expression to validate a username with these rules:
// 	Must start with a letter
// 	Can contain letters, digits, and underscore (_)
// 	Length should be between 5 and 15 characters
public class problem4 {
    public static void main(String[] args) {
        System.out.println("Rohitjii_1f3".matches("^[A-Za-z][A-Za-z_0-9]{4,14}$"));
    }
    
}
