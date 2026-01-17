class Problem4 {
    int rollNo;
    String course;

    public Problem4() {
        this(1, "Java");
        System.out.println("Default Constructor");
    }

    public Problem4(int rollNo, String course) {
        this.rollNo = rollNo;
        this.course = course;
    }

    public void display() {
        System.out.println(rollNo + " " + course);
    }

    public static void main(String[] args) {
        Problem4 obj = new Problem4();
        obj.display();
    }
}
