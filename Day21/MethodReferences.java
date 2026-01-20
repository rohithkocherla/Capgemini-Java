import java.util.*;


interface F1{
    int add(int a,int b);

}
public class MethodReferences {
    public static void main(String[] args) {
        
    F1 obj1=(a,b) -> a+b;
    System.out.println("Using lambda exp: "+obj1.add(20,30));

    F1 obj2=Integer::sum;
    System.out.println("Using Method reference: "+obj2.add(20,30));

    List<String> names=Arrays.asList("kabir","Rohit","Promod");
    System.out.println(names);

    System.out.println("Using lambda exp: ");
    names.forEach(name -> System.out.println(name));
    System.out.println(names);
    names.forEach(System.out::println);
}
}