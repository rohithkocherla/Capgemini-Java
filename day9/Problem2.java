class Problem2 {
    int id;
    String name;

    Problem2(int id, String name) {
        this.id = id;
        this.name = name;
    }

    void display() {
        System.out.println(id + " " + name);
    }

    public static void main(String[] args) {
        Problem2 obj = new Problem2(101, "Rohith");
        obj.display();
    }
}
