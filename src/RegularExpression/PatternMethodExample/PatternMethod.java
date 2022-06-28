package RegularExpression.PatternMethodExample;
import java.util.regex.Pattern;
public class PatternMethod {
    public static void main(String[] args) {

        String s1 = "Pattern";
        Pattern myPattern = Pattern.compile(s1);


        String s2 = myPattern.pattern();
        System.out.println(s2);
    }
}
