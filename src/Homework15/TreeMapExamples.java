package Homework15;

import java.util.*;

public class TreeMapExamples {
    public static void main(String... args){
        TreeMap<String,Integer> rechizite = new TreeMap<>();
        rechizite.put("Caiete",5);
        rechizite.put("Pixuri",10);
        rechizite.put("Coperte",6);
        rechizite.put("Markere",3);

        System.out.println("TreeMap: "+ rechizite);

        //2
        TreeMap<String,Integer> treeMap = new TreeMap<>();
        treeMap.putAll(rechizite);
        System.out.println("TreeMap: "+ treeMap);

        //3
        String key = "Caiete";
        if (treeMap.containsKey(key)) {
            System.out.println( key + " exists in the TreeMap.");
        } else {
            System.out.println( key + " does not exist in the TreeMap.");
        }

        //4
        Integer value = 5;
        if (treeMap.containsValue(value)) {
            System.out.println( value + " exists in the TreeMap.");
        } else {
            System.out.println( value + " does not exist in the TreeMap.");
        }

        //5

        Set<String> keySet = treeMap.keySet();
        System.out.println("Keys: " + keySet);

        //6
        treeMap.clear();
        System.out.println("TreeMap: " + treeMap);

        //7
        System.out.println("Reserve order: " + rechizite.descendingMap());


        //8
        System.out.println("Greatest Key: " + rechizite.lastKey() + " => " + rechizite.get(rechizite.lastKey()));
        System.out.println("Least Key: " + rechizite.firstKey() + " => " + rechizite.get(rechizite.firstKey()));

        //9
        System.out.println("First (lowest) key: " + rechizite.firstKey());
        System.out.println("Last (highest) key: " + rechizite.lastKey());

        //10
        System.out.println("Reverse order view of keys: " + rechizite.descendingKeySet());

        //11
        String givenKey = "Pixuri";

        var entry = rechizite.floorEntry(givenKey);

        if (entry != null) {
            System.out.println("Key-Value mapping: " + entry);
        } else {
            System.out.println("No key-value mapping found.");
        }

        //12
        String floorKey = rechizite.floorKey("Caiete");

        if (floorKey != null) {
            System.out.println("Greatest key less than or equal to 'caiete' : " + floorKey);
        } else {
            System.out.println("No key found.");
        }

        //13
        System.out.println("Portion of the map with keys less than 'pixuri': " + rechizite.headMap("Pixuri"));

        //14
        System.out.println("Portion of the map with keys less than or equal to 'coperte': " + rechizite.headMap("Coperte",true));
        //15

        String higherKey = rechizite.higherKey("Coperte");

        if (higherKey != null) {
            System.out.println("Least key strictly greater than 'coperte': " + higherKey);
        } else {
            System.out.println("No key found.");
        }


        //16
        var lowerEntry = rechizite.lowerEntry("Pixuri");

        if (lowerEntry != null) {
            System.out.println("Key-Value mapping: " + lowerEntry);
        } else {
            System.out.println("No key-value mapping found.");
        }

        //17
        String lowerKey = rechizite.lowerKey("Coperte");

        if (lowerKey != null) {
            System.out.println("Greatest key strictly less than 'coperte': " + lowerKey);
        } else {
            System.out.println("No key found.");
        }
    }
}
