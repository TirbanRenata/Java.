package Homework15;

import com.sun.source.tree.Tree;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;

public class HashSetExamples {
    public static  void main(String... args) {
        HashSet<String> animals = new HashSet<>();
        animals.add("Cat");
        animals.add("Dog");
        System.out.println("HashSet: " + animals);

        //2
        for(String animal : animals){
            System.out.println(animal);
        }
        //3
        System.out.println("Number of elements: " + animals.size());

        //4
        animals.clear();
        System.out.println("HashSet after clearing: "+ animals);

        //5
        if(animals.isEmpty()){
            System.out.println("HashSet is empty.");
        }else{
            System.out.println("HashSet is not empty.");
        }

        //6
        HashSet<String> cloneAnimals = (HashSet<String>) animals.clone();
        System.out.println("Cloned HashSet: " + cloneAnimals);

        //7
        animals.add("Dog");
        animals.add("Cat");
        animals.add("Lion");
        String[] array = animals.toArray(new String[0]);
        System.out.println("Array: ");
        for(String animal : animals){
            System.out.println(animal);
        }

        //8
        TreeSet <String> treeSet = new TreeSet<>(animals);
        System.out.println("TreeSet: " + treeSet);

        //9
        List<String> list = new ArrayList<>(animals);
        System.out.println("ArrayList: " + animals);

        //10
        HashSet<String> animals2 = new HashSet<>();
        animals2.add("Lion");
        animals2.add("Elephant");
        System.out.println("Are the two HashSets equal? " + animals.equals(animals2));

        //11
        animals.retainAll(animals2);
        System.out.println("Common elements: " + animals);

        //12
        animals2.clear();
    }
}
