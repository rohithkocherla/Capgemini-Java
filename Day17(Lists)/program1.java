
import java.util.ArrayList;
import java.util.*;

public class program1 {

    public static void main(String[] args) {
        List<String > al=new ArrayList<>();
        al.add("Ramu");
        al.add("rohii");
        al.add("kiran");
        al.add("yashuu");
        al.add("trilock");
        al.add(null);
        System.out.println(al.remove("Ramu"));
        System.out.println(al);
        System.out.println(al.contains(al));
        System.out.println(al.contains("rohii"));
        System.out.println(al.remove(1));
        System.out.println(al);
        
        al.containsAll(al);
        al.contains("trilock");
        System.out.println(al.contains("trilock"));
      
        
        
        System.out.println(al);
        


    }
    
}
