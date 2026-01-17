
import java.util.*;

public class ListIteratorr {
    public static void main(String[] args) {
        String[] a={"suraj","rohit","kalyan","yellandhar"};
        List<String> al=new ArrayList<String>();
        for (String i:a){
            al.add(i);
        }
        System.out.println(al);
        ListIterator<String> ltr=al.listIterator();
        System.out.println("==forward==");
        while(ltr.hasNext()){
            System.out.println(ltr.next());
        }
        System.out.println("==backward==");
        while (ltr.hasPrevious()) {
            System.out.println(ltr.previous());
            
        }
    }
}
