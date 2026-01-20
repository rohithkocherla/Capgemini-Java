interface F11{
    void greet();
}
interface F12{
    int add(int a,int b);
}
public class FunctionalInterface{
    public static void main(String[] args) {
        F11 ref1=new F11(){
            public void greet(){
                System.out.println("Hello world using anonymous class");
            }
        };
        ref1.greet();

        F11 ref2 = () ->System.out.println("Hello world using lamda");
        ref2.greet();
        System.out.println("--------------------------");

        F12 ref3=new F12() {
            public int add(int a,int b){
                return a+b;
            }
        };
        System.out.println("anonymous class :"+ref3.add(10,20));

        F12 obj=(a,b) ->a+b;
        System.out.println(obj.add(10,20));;
    }
}