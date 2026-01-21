public class RegularExpressions{
    public static void main(String[] args) {
        System.out.println("Suraj".matches("S...j"));
        System.out.println("Suraj".matches("S..j"));
        System.out.println("Sraj".matches("S...j"));
        System.out.println("Siraj".matches("S...j"));
        System.out.println("Sairaj".matches("S...j"));
        System.out.println("S123j".matches("S...j"));
        System.out.println();
        System.out.println("Sabcj".matches("S+j"));
        System.out.println("Sxxj".matches("S+j"));
        System.out.println("Sj".matches("S+j"));
        System.out.println("SSj".matches("S+j"));
        System.out.println("sSj".matches("S+j"));
        System.out.println("SsJ".matches("S+sJ"));
        System.out.println("SSSj".matches("S+j"));

        
    }
}