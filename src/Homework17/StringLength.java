package Homework17;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@FunctionalInterface
interface StringLengthComparator{
    int compare(String s1,String s2);
}
public class StringLength {
    public static void main(String... args){
        List<String> words = new ArrayList<>(Arrays.asList("school","pen","satchel","notebooks"));
        StringLengthComparator lengthComparator = (s1,s2)  -> Integer.compare(s1.length(), s2.length());
        words.sort((s1, s2) -> lengthComparator.compare(s1,s2));
        System.out.println("Sorted words by length: " + words);


    }
}
