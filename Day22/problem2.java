// Write a regular expression to validate an email ID with the following conditions:
// 	Username part can contain:
// 	letters (a–z, A–Z)
// 	digits (0–9)
// 	special characters: . _ % + -
// 	Must contain @
// 	Domain name should contain only letters
// 	Extension should contain at least 2 letters
public class problem2 {
    public static void main(String[] args) {
        
    
    System.out.println("rohith88+@gmail.com".matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z]+.[a-zA-Z]{2,}$"));

}
}