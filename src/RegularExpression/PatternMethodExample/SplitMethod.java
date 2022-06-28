package RegularExpression.PatternMethodExample;
import java.util.regex.Pattern;
public class SplitMethod {
    public static void main(String[] args) {

        Pattern pattern = Pattern.compile(":");

        String[] split = pattern.split("one:two:three", 2); // limit used to limit to specific num of lines

        for (String element: split){
            System.out.println("element: " + element);
        }
    }
}
