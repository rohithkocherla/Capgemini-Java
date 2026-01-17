import java.util.HashSet;

class Problem2 {
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>();

        hs.add(5);
        hs.add(15);
        hs.add(25);

        hs.remove(15);

        System.out.println(hs);
    }
}

