public class regex4 {
    public static void main(String[] args) {
        System.out.println("Suraj".matches("Sur+aj"));
        System.out.println("SURAJ".matches("S+U+R+A+J"));
        System.out.println("suraj".matches(".*"));
        System.out.println("suuraaj".matches("su+ra+j"));
        System.out.println("Sura@#j".matches(".*"));
        System.out.println("12345".matches(".*"));
    }
}
