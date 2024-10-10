package Homework17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortWords {
    public static void main(String... args){
        List<String> words = new ArrayList<>(Arrays.asList("water","juice","food","gym"));
        words.sort((s1,s2)-> s1.compareTo(s2));
        System.out.println("Alphabetical order: " + words);

        words.sort((s1,s2)-> s2.compareTo(s1));
        System.out.println(words);
    }
}
