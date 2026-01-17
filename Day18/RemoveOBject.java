import java.util.*;

public class RemoveOBject{
    public static void main(String[] args) {
        

    int[] a={10,21,23,25,26};
    List<Integer> al=new ArrayList<Integer>();
    for(int i : a) {
        al.add(i);
    } 
    System.out.println(al);
    Iterator<Integer> itr = al.iterator();
    while(itr.hasNext()){
        itr.next();
        itr.remove();
        System.out.println(al);
    }

 }
}


