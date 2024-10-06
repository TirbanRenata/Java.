package Homework17;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

interface NameProcess{
    List<String> process(List<String> names);
}
public class UpperCaseExample {
    public static void main(String... args){
        List<String> myName = new ArrayList<>(Arrays.asList("Renata","Andrada"));

        NameProcess toUpperCase = names -> {

          List<String > upperCaseNames = new ArrayList<>();
          for(String name : names){
              upperCaseNames.add(name.toUpperCase());
          }
          return upperCaseNames;
        };

        List<String> upperCaseNames = toUpperCase.process(myName);
        System.out.println(upperCaseNames);
    }
}
