import java.util.regex.*;
public class PatternMatcher2{
    public static void main(String[] args) {
        Pattern pattern=Pattern.compile("\\d{4}");
        Matcher m=pattern.matcher("I am 44552444 of 55251");
        while(m.find()){
            System.out.println(m.group());
        }

    }
}