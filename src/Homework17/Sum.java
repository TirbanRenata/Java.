package Homework17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


interface SumCalculator{
    int calculateSum(List<Integer> numbers);
}

public class Sum {
    public static  void main(String... args){
        List<Integer> numbers = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        SumCalculator sumCalculator = nums -> {
            int sum = 0;
            for(int number : nums){
                sum+=number;
            }
            return sum;
        };
        System.out.println("Sum: " + sumCalculator.calculateSum(numbers));
    }
}
