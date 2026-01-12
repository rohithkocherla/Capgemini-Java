public class NullPointerExample {
    public static void main(String[] args) {
        Demo e1 = new Demo();
        e1.display();
    }
}

class Demo {
    public void display() {
        try {
            String str = null;
            System.out.println(str.length());
        } catch (NullPointerException e) {
            System.out.println("NullPointerException occurred");
        }
    }
}
