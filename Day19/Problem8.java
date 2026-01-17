import java.util.Set;         
import java.util.HashSet;     

class Problem8 {
    public static void main(String[] args) {

        //Create Set reference using HashSet object
        Set<Integer> set = new HashSet<>();

        // Adding elements to the HashSet
        set.add(10);
        set.add(20);
        set.add(30);

        // Duplicate element (will not be added)
        set.add(10);

        //Display complete HashSet
        System.out.println("Set elements are:");

        // Iterate through HashSet using for-each loop
        for (int value : set) {
            System.out.println(value);
        }

        // Check if element exists
        if (set.contains(20)) {
            System.out.println("20 is present in the set");
        }

        //Remove an element from HashSet
        set.remove(30);

        //Display size of the HashSet
        System.out.println("Size of set: " + set.size());
    }
}
