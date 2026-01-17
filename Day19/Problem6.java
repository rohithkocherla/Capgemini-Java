import java.util.HashSet;

class Problem6 {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<>();

        hs.add("A");
        hs.add("B");

        hs.clear();

        System.out.println(hs);
    }
}
