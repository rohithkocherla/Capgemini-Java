public class program1 {
    //wjp create instant initializer to execute non statoc block
    
    //class area or global area+
    {
        //non static block or instance initializer block
        System.out.println("non static block executed");
    }
    public static void main(String[] args) {
        System.out.println("main start");
        System.out.println("main end");
    }
    //non static method
    public void test(){
        System.out.println("test method executed.");
    }
    //static block
    static{
        System.out.println("static block executed");
        program1 ref = new program1();
        ref.test();
    }
    
}
