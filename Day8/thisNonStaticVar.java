public class thisNonStaticVar {
    public void test(){

        System.out.println("test start");
        System.out.println(this);
        System.out.println("test end");
    }
    public static void main(String[] args) {
        System.out.println("main start");
        thisNonStaticVar ref1=new thisNonStaticVar();
        System.out.println(ref1);
        thisNonStaticVar ref2=new thisNonStaticVar();
        System.out.println(ref2);
        thisNonStaticVar ref3=new thisNonStaticVar();
        System.out.println(ref3);
        ref2.test();
        System.out.println("main end");
        
    }
}
