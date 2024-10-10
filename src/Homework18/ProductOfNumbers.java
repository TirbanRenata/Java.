package Homework18;

import java.util.Arrays;
import java.util.List;

public class ProductOfNumbers {
    public static void main(String... args){
        List<String> numbers = Arrays.asList("1","2","3","4","5");
        Integer product = numbers.stream()
                .map(Integer::parseInt)
                .reduce(1,(a,b)-> a*b);
        System.out.println(product);
    }
}
