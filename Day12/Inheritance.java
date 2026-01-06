

class Father{
    static int a=10;
    public static void test(){
        System.out.println("Father class method");
    }
    static{
        System.out.println("SIB Father class");
    }
}
class Son extends Father{
    static int b=20;
    public static void demo(){
        System.out.println("Son class static method");
    }
    static{
        System.out.println("SIB son class");
    }
}
public class Inheritance {
    public static void main(String[] args) {
        System.out.println("maiin start");
        System.out.println(Father.a);
        Father.test();
        System.out.println(Son.b);
        Son.demo();
    //    Father.test();
    //    System.out.println(Son.a);
    //    System.out.println(Son.b);
    //    Son.demo();
       System.out.println("main end");
              
    }
}