package RegularExpression.PatternMethodExample;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class PatternCompileEx {
    public static void main(String[] args) {

        String text = "Java is cool";
        String patternText = ".*cool";
        Pattern pattern = Pattern.compile(patternText, Pattern.CASE_INSENSITIVE);

        Matcher matcher = pattern.matcher(text);
        boolean isMatched = matcher.matches();

        System.out.println(isMatched);
    }
}
