public class regularExpr3 {
    public static void main(String[] args) {
        System.out.println("Aditya".matches("Adit+ya"));
        System.out.println("AAAddddiiityaaa".matches("A*d+i*t+y*a*"));
        System.out.println("Additttyyyya".matches("A*d*i*t*y*a"));
        System.out.println("dityaaaa".matches("d*i*t*y*a*"));
        System.out.println("Adtttyya".matches("Adt+y+a"));


    }
}
