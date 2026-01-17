import java.util.Set;
import java.util.HashSet;

class Problem7 {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        set.add("Rohit");
        set.add("Ramesh");
        set.add("Ramu");
        set.add("Somu");

        System.out.println("Size: " + set.size());
        System.out.println("Contains Java: " + set.contains("Somu"));
    }
}
