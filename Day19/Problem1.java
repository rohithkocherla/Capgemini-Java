import java.util.HashSet;

class Problem1 {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<>();

        hs.add("Java");
        hs.add("Python");
        hs.add("C++");

        System.out.println(hs.contains("Java"));
        System.out.println(hs.contains("HTML"));
    }
}
