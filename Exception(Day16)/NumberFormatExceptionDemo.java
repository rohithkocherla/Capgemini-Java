public class NumberFormatExceptionDemo {
    public static void main(String[] args) {
        try{
            String str="hello";
            int nums=Integer.parseInt(str);
           

        }
        catch (NumberFormatException e){
            System.out.println(e);
        }
        System.out.println("handled");
        
    }
}

