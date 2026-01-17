import java.util.HashSet;

class Problem5 {
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>();

        hs.add(1);
        hs.add(2);

        System.out.println("Size: " + hs.size());
        System.out.println("Is Empty: " + hs.isEmpty());
    }
}
