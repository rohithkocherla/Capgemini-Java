

class Father{
    static int a=10;
    static int b=30;
    void display(int a){
        this.a=a;
        System.out.println(this.a);

    }
    {
        System.out.println(Father.a);
    }
    public static void test(){
        
        System.out.println("Father class static method");
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
       Son obj=new Son();
       System.out.println(obj.b);
       Father obj1=new Father();
       System.out.println(obj1.b);

       obj.demo();
       obj1.display(45);
      
       
      

       System.out.println("main end");
              
    }
}