class Problem3 {
    int a, b;

    Problem3() {
        a = 10;
        b = 20;
    }

    Problem3(int x, int y) {
        a = x;
        b = y;
    }

    void display() {
        System.out.println(a + " " + b);
    }

    public static void main(String[] args) {
        Problem3 obj1 = new Problem3();
        Problem3 obj2 = new Problem3(50, 60);

        obj1.display();
        obj2.display();
    }
}
