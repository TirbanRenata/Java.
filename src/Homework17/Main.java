package Homework17;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

@FunctionalInterface
interface ListFilter<T> {
    List<T> filter(List<T> list, Predicate<T> predicate);
}

    public class Main {
    public static void main(String[] args) {
        ListFilter<Integer> intListFilter = (list, predicate) -> {
            List<Integer> result = new ArrayList<>();
            for (Integer item : list) {
                if (predicate.test(item)) {
                    result.add(item);
                }
            }
            return result;
        };


        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);

        List<Integer> evenNumbers = intListFilter.filter(numbers, n -> n % 2 == 0);
        System.out.println(evenNumbers);
    }
}

