//Write a regular expression to validate a date in the format: dd-mm-yyyy
public class problem7 {
    public static void main(String[] args) {
        System.out.println("20-12-2004".matches("\\d+{2}[-][0-9]{2}[-][0-9]{4}"));
    }
    
}
