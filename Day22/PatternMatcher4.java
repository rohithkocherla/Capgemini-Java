import java.util.regex.*;


public class PatternMatcher4 {
    public static void main(String[] args) {
        String str="A1 B2 C3 D";
        Pattern p=Pattern.compile("\\w(?=.*\\d)");
        Matcher m=p.matcher(str);
        while(m.find()){
            System.out.println(m.group());
        }
    }
}
