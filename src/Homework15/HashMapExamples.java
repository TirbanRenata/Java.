package Homework15;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapExamples {
    public static void main(String... args) {
        HashMap<String, Integer> dulciuri = new HashMap<>();
        dulciuri.put("Ciocolata", 10);
        dulciuri.put("Bomboane", 5);
        System.out.println("HashMap: " + dulciuri);

        //2

        System.out.println("Number of key-value iin the hashMap: " + dulciuri.size());

        //3
        HashMap<String, Integer> dulciuri2 = new HashMap<>();
        dulciuri2.putAll(dulciuri);
        System.out.println(dulciuri2);

        //4
        dulciuri2.clear();

        //5
        System.out.println("Is hashMap empty?");
        if (dulciuri2.isEmpty()) {
            System.out.println("Yes,is empty.");
        } else {
            System.out.println("No, is not empty.");
        }

        //6
        HashMap<String, Integer> clone = (HashMap<String, Integer>) dulciuri.clone();
        System.out.println("Cloned HashMap: " + clone);

        //7
        String key = "Ciocolata";
        if (dulciuri.containsKey(key)) {
            System.out.println("Map contains the key: " + key);
        } else {
            System.out.println("Map does not contain the key: " + key);
        }

        //8
        Integer value = 10;
        if (dulciuri.containsValue(value)) {
            System.out.println("Map contains the value: " + value);
        } else {
            System.out.println("Map does not contain the value: " + value);
        }

        //9
        Set<Entry<String, Integer>> entrySet = dulciuri.entrySet();
        System.out.println("Set view of the mappings: " + entrySet);

        //10
        System.out.println("Value for " + key + " is: " + dulciuri.get(key));

        //11

        Set<String> keySet = dulciuri.keySet();
        System.out.println("Set view of the keys: " + keySet);

        //12

        Collection<Integer> values = dulciuri.values();
        System.out.println("Collection view of the values: " + values);

    }


}

