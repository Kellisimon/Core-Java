package WildCard;

import java.util.Arrays;
import java.util.List;

public class UnBoundedWildCard {
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(10,20,30,40);
        print(intList);

        List<Double> numList = Arrays.asList(10.4,20.4,30.3,40.0);
        print(numList);

    }

    private static void print(List<?> myList) {
        System.out.println(myList);
    }
}
