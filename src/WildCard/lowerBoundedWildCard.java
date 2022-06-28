package WildCard;

import java.util.Arrays;
import java.util.List;

public class lowerBoundedWildCard {

    public static void main(String[] args) {

        List<Integer> intList = Arrays.asList(10,20,30,40);
        print(intList);


        List<Integer> numList = Arrays.asList(10,20,30,40);
        print(numList);

    }

    private static void print(List<? super Integer> List) {
        System.out.println(List);
    }
}
