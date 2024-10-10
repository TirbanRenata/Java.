package Homework17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

interface EvenNum{
    boolean isEven(int number);
}
public class EvenNumbers {
    public static void main(String... args){
        List<Integer> numbers = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15));
        EvenNum evenNum = number -> number % 2 ==0;

        List<Integer> evenNumbers = new ArrayList<>();
        for (Integer number : numbers) {
            if (evenNum.isEven(number)) {
                evenNumbers.add(number);
            }
        }

        System.out.println("Numere pare: " + evenNumbers);
    }
}
