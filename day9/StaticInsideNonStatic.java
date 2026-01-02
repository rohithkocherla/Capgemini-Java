public class StaticInsideNonStatic{
    static int a=10;
    public void test(){
        System.out.println("test start");
        System.out.println("Directly: "+a);
        System.out.println("with the help of ClassName: "+ StaticInsideNonStatic.a);
        System.out.println("with the help of: "+this.a);
        System.out.println("test end");
    }
    public static void main(String[] args) {
        System.out.println("main start");
        StaticInsideNonStatic ref=new StaticInsideNonStatic();
        ref.test();
        System.out.println("main end");
        
    }
}