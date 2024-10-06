package Homework17;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

interface Max{
    Integer findMax(List<Integer> numbers);
}
public class MaxValue {
    public static void main(String... args){

        Max maxValue = numbers -> {
            if (numbers == null  || numbers.isEmpty()) {
                return null;
            }

            int max = numbers.get(0);
            for (int number : numbers) {
                if (number > max) {
                    max = number;
                }
            }
            return max;
        };
        List<Integer> numbers = Arrays.asList(3, 5, 10, 88, 2);
        Integer max = maxValue.findMax(numbers);
        System.out.println("Maximum value: " + max);
    }
}
