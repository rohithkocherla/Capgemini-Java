public class globalVariableLocalVariable {
    public static void main(String args[]){
        System.out.println("main start");
        A.test();
        System.out.println("main end");
    }
    static{
        System.out.println("Welcome to LPU");
    }
}
class A{
    static{
        System.out.println("Welcome to Class A");
    }
    public static void test(){
        System.out.println("start test");
        System.out.println("end test");
    }
}
