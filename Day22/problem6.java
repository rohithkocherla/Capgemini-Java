//Write a regular expression to validate an Indian vehicle number in the following format:MH12AB1234
public class problem6 {
    public static void main(String[] args) {
        System.out.println("MH12AB1234".matches("^[A-Z]{2}[0-9]{2}[A-Z]{2}[0-9]{4}$"));

    }
    
}
