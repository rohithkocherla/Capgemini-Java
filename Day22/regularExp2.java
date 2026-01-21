public class regularExp2 {
    public static void main(String[] args) {
        System.out.println("jjjj".matches("S*j*"));
        System.out.println("jjjjjjjjjjjjjj".matches("j*"));
        System.out.println("Sj".matches("S*j"));
        System.out.println("SSj".matches("S*j"));
        System.out.println("SSSj".matches("S*j"));
        System.out.println("sSj".matches("S*j"));
        System.out.println("Sjjj".matches("S*j*"));
        System.out.println("Sjjj".matches("S*j"));
        System.out.println("Sssj".matches("Ss*j"));
        System.out.println("jjj".matches("S*j"));
        
        System.out.println();
        
        System.out.println("colr".matches("color?r"));
        System.out.println("color".matches("color?r"));
        System.out.println("coloor".matches("color?r"));
        System.out.println("abc".matches("ab(c)?"));
        System.out.println("ab".matches("ab(c)?"));
        System.out.println("abcd".matches("ab(c)?"));
        System.out.println();

    }
}
