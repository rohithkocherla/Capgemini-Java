public class ArrayOutOfBoundExceptionDemo {
    public static void main(String[] args) {
        try{
            int a[]=new int[5];
            a[6]=15;
            System.out.println(a[6]);

        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);

        }
        System.out.println("handled...");
    }
}
