package Homework18;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TransformedList {
    public static void main(String... args){
        List<String> strings = Arrays.asList("Hello","World","Java","Streams");
        List<Integer> lenght = strings.stream().map(String::length).collect(Collectors.toList());
        System.out.println(lenght);
    }
}
