package Homework17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortList {
    public static void main(String... args){
        List<String> strings = new ArrayList<>(Arrays.asList("Kiwi","Banana","Apple","Orange"));
        strings.sort((s1,s2) -> s1.compareTo(s2));
        System.out.println("Sort list: "+strings);
    }
}
