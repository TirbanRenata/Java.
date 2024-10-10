package Homework17;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

interface ContainsTheElement<T>{
    boolean contains (List<T> list, T item);
}

public class GenericExample {
    public static void main(String... args){
        List<String> elements = new ArrayList<>(Arrays.asList("Tricou", "Pantaloni","Manusi","Bluza"));
        ContainsTheElement<String> element = (list, item) -> list.contains(item);
        boolean containsNumber = element.contains(elements,"Bluza");
        System.out.println("Lista contine 'bluza'? : " + containsNumber);
    }
}
