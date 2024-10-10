package Homework18;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MostFrequentlyWord {
    public static void main(String... args){
        List<String> sentences = Arrays.asList("Hello World","Hello Everyone","Welcome to the World of Java");
        Map<String,Long> wordFrequency = sentences.stream()
                .flatMap(sentence->Arrays.stream(sentence.split("\\s+")))
                .collect(Collectors.groupingBy(word->word,Collectors.counting()));

        String mostFrequentWord = Collections.max(wordFrequency.entrySet(), Map.Entry.comparingByValue()).getKey();
        System.out.println("Most frequent word: " + mostFrequentWord);
        System.out.println("Frequency: " + wordFrequency.get(mostFrequentWord));



    }
}
