public class regex6 {
    public static void main(String[] args) {
        String regex="";
        String[] inputs={
            "Hello World",
            "Java 8",
            "User1 Name",
            "Suraj kumar",
            "A B",
            "Test Case",

            "Hello",
            "Java8",
            "123",
            "HelloWorld",
            "Hello World",
            "Hello  World"};
            for (String s:inputs){
                System.out.println(s + " = "+s.matches(regex));
            }
    }
}
