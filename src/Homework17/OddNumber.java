package Homework17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@FunctionalInterface
interface OddFilter {
    List<Integer> filterOddNumbers(List<Integer> numbers);
}
public class OddNumber {
    public static void main(String... args) {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

        OddFilter oddFilter = (nums) -> {
            List<Integer> oddNumbers = new ArrayList<>();
            for (Integer num : nums) {
                if (num % 2 != 0) {
                    oddNumbers.add(num);
                }
            }
            return oddNumbers;
        };

        List<Integer> oddNumbers = oddFilter.filterOddNumbers(numbers);

        System.out.println("Odd Numbers: " + oddNumbers);
    }
}
