package Homework18;

import java.util.Arrays;

public class Sum {
    public static void main(String... args){
        Integer[] numbers = {1,2,3,4,5};
        int sum = Arrays.stream(numbers)
                .reduce(0,(a,b)->a+b);
        System.out.println("Sum="+sum);
    }
}
