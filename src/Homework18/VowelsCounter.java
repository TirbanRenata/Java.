package Homework18;

import java.util.Arrays;
import java.util.List;

public class VowelsCounter {
    public static void main(String... args) {
        String sentence = "Hello World";
        List<Character> vowels = Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U');
        long vowelsCount = sentence.chars()
                 .mapToObj(c->(char)c)
                .filter(vowels::contains)
                .count();
        System.out.println(vowelsCount);
    }
}
