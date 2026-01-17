import java.util.ArrayList;

import java.util.Collections;
import java.util.List;

public class program2 {
    public static void main(String[] args) {
        List<Integer> a=new ArrayList<Integer>();
        a.add(10);
        a.add(5);
        a.add(20);
        a.add(15);
        a.add(25);
        a.add(2,12);
        System.out.println(a);
        if(a.contains(15)){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }
        Collections.sort(a);
        a.remove(1);
        System.out.println(a);
        System.out.println(a.size());
    

    }
}
