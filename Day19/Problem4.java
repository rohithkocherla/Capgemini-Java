import java.util.HashSet;

class Problem4 {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<>();

        hs.add("Apple");
        hs.add("Banana");
        hs.add("Mango");

        for (String fruit : hs) {
            System.out.println(fruit);
        }
    }
}

