import java.util.List;
import java.util.ArrayList;

public class Lists{
    public static void main(String[] args) {
        List al=new ArrayList();
        al.add(10);
        al.add(10.2);
        al.add("Rohit");
        al.add('R');
        al.add(false);
        System.out.println(al);
        System.out.println(al.size());
        al.add(15);
         System.out.println(al);
        System.out.println(al.size());
        al.add("LPU");
        al.add('a');
         System.out.println(al);
        System.out.println(al.size());
        al.add(null);
        System.out.println(al);
    }
}