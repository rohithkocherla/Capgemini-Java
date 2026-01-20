
interface Factorial{
    int findFactorial(int n);
}
interface F1{
    int add(int a,int b);
}
class AbsBody implements Factorial{
    public int findFactorial(int n){
        int fact=1;
        for(int i=n;i>=1;i--){
            fact=fact*i;
        }
        return fact;
    }
}
public class FunctionalInterface1{
    public static void main(String args[]){
        Factorial ref=new AbsBody();
        System.out.println(ref.findFactorial(4));

        System.out.println("--------------------------");
        //anonymous class
        Factorial ref1=new Factorial() {
            public int findFactorial(int n){
                int fact=1;
                for(int i=n;i>=1;i--){
                    fact=fact*i;
                }   
                return fact;
            }
            
        };
        System.out.println(ref1.findFactorial(5));


    }
}