package Homework15;

import java.util.*;
import java.util.ArrayList;

public class ArrayListExamples {

    public static void main(String... args) {
        // 1
        List<String> colors = new ArrayList<>(Arrays.asList("Brown", "Black", "Purple"));
        colors.add("Red");
        colors.add("Yellow");
        colors.add("Blue");
        colors.add("Pink");
        System.out.println("Initial colors: " + colors);

        // 2
        Iterator<String> iterator = colors.iterator();
        while (iterator.hasNext()) {
            String color = iterator.next();
            System.out.println("Color: " + color);
            if (color.equals("Brown")) {
                iterator.remove();
            }
        }

        // 3
        colors.add(0, "White");
        System.out.println("Colors after adding 'White': " + colors);
        System.out.println();

        // 4
        System.out.println("The color at index 3 is: " + colors.get(3));
        System.out.println();

        // 5
        colors.set(2, "Orange");
        System.out.println("ArrayList after update: " + colors);
        System.out.println();

        // 6
        colors.remove(3);
        System.out.println("List after removing the color at index 3: " + colors);
        System.out.println();

        // 7
        boolean found = colors.contains("Red");
        if (found) {
            System.out.println("The list has the color 'Red'.");
        } else {
            System.out.println("Color 'Red' not found. Adding 'Red' to the list.");
            colors.add("Red");
            System.out.println("Colors: " + colors);
        }
        System.out.println();

        // 8
        System.out.println("ArrayList before sort: " + colors);
        Collections.sort(colors);
        System.out.println("ArrayList after sort: " + colors);

        // 9
        List<String> colors2 = new ArrayList<>(Collections.nCopies(colors.size(), null));
        Collections.copy(colors2, colors);
        System.out.println("Second list (after copy): " + colors2);

        // 10
        Collections.shuffle(colors);
        System.out.println("Shuffled ArrayList: " + colors);

        // 11
        Collections.reverse(colors);
        System.out.println("Reversed list: " + colors);

        // 12
        List<String> extractList = new ArrayList<>(colors.subList(1, 4));
        System.out.println("Extracted list: " + extractList);

        //13

        if(colors.equals(colors2)){
            System.out.println("The two ArrayLists are equal.");
        }
        else{
            System.out.println("The two ArrayList are not equal.");
        }
        System.out.println();

        //14
        System.out.println("ArrayList before swap: " + colors);
//        String temp = colors.get(0);
//        colors.set(0,colors.get(1));
//        colors.set(1,temp);
        Collections.swap(colors,0,1);
        System.out.println("After swap: " + colors);

        //15
        colors.addAll(extractList);
        System.out.println("Joined ArrayList: " + colors);

        //16
        ArrayList<String> cloneList = (ArrayList<String>) ((ArrayList<String>) colors).clone();

        System.out.println("Cloned ArrayList: " + cloneList);

        //17
        cloneList.clear();
        System.out.println("ArrayList after emptying: " + cloneList);

        //18

        if(cloneList.isEmpty()){
            System.out.println("ArrayList 'cloneList' is empty");
        }else{
            System.out.println("ArrayList 'cloneList' is not empty");
        }

        //19

        ((ArrayList<String>) colors).trimToSize();
        System.out.println("ArrayList after trimming capacity: " + colors);

        //20

        System.out.println("Colors: " + colors);
        ((ArrayList<String>) colors).ensureCapacity(11);
        colors.add("Light Blue");
        colors.add("Dark Blue");
        System.out.println("New ArrayList 'colors': "+ colors);

    }
}
