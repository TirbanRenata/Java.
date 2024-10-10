package Homework18;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConcatenateString {
    public static void main(String... args){
        List<String> strings = Arrays.asList("one","two","three","four");
        System.out.println(strings.stream().collect(Collectors.joining(",")));

    }
}
