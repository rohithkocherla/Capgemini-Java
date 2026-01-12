public class ArthimeticException {

    public static void main(String[] args) {

        System.out.println("Program Start");

        try {
            int a = 10/0;
            System.out.println(a);
           
        } 
        catch (ArithmeticException e) {
            System.out.println(e);
        }

        System.out.println("Program End");
    }
}


