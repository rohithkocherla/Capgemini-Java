import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class PatternMatcher {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("AB(\\d{4})");
        Matcher m = p.matcher("MH12AB1234");
        while (m.find()) {
            System.out.println(m.group());
            System.out.println(m.group(1));
            
        }

    }
}
