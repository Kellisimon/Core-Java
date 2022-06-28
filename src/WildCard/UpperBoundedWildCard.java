package WildCard;

import java.util.Arrays;
import java.util.List;

public class UpperBoundedWildCard {

    public static void main(String[] args) {

        List<Integer> intList = Arrays.asList(10,20,30,40);
        System.out.println("Total sum is: " + sum(intList));

        List<Double> doubleList = Arrays.asList(12.3, 45.6, 56.7, 1.4);
        System.out.println("Total sum is: " + sum(doubleList));
    }

    private static double sum(List<?extends Number> myList) {
        double sum = 0.0;
        for(Number iterator: myList){
            sum = sum + iterator.doubleValue();
        }
        return sum;
        }

}

