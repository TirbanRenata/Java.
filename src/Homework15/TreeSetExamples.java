package Homework15;

import com.sun.source.tree.Tree;

import java.util.Collections;
import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExamples {
    public static void main(String... args) {
        TreeSet<String> colors = new TreeSet<>();
        colors.add("Red");
        colors.add("Yellow");
        System.out.println("Colors: " + colors);

        //2
        Iterator<String> iterator = colors.iterator();

        while (iterator.hasNext()) {
            String color = iterator.next();
            System.out.println("Color : " + color);
        }

        //3
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("Blue");
        treeSet.add("Pink");

        colors.addAll(treeSet);
        System.out.println("colors + treeSet: " + colors);

        //4

        System.out.println("Reserve order: " + colors.descendingSet());

        //5

        System.out.println("First element: " + colors.getFirst());
        System.out.println("Last element: " + colors.getLast());

        //6

        treeSet = (TreeSet<String>) colors.clone();
        System.out.println("TreeSet: " + treeSet);

        //7
        System.out.println("The number of elements: " + treeSet.size());

        //8
        if (treeSet.equals(colors)) {
            System.out.println("Both are equal");
        } else {
            System.out.println("Are not equal");
        }

        //9
        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(1);
        numbers.add(5);
        numbers.add(10);
        numbers.add(4);
        numbers.add(18);
        numbers.add(2);
        numbers.add(3);
        System.out.println("Numbers: " + numbers);
        System.out.println("The numbers less than 7: " + numbers.headSet(7));

        //10
        int givenElement = 8;
        Integer ceilingElement = numbers.ceiling(givenElement);
        if (ceilingElement != null) {
            System.out.println("Element greater than or equal to " + givenElement + " is: " + ceilingElement);
        } else {
            System.out.println("No element greater than or equal to " + givenElement + " found.");
        }

        //11
        Integer floorElement = numbers.floor(givenElement);
        if (floorElement != null) {
            System.out.println("Element less than or equal to " + givenElement + " is: " + floorElement);
        } else {
            System.out.println("No element less than or equal to " + givenElement + " found.");
        }

        //12
        Integer higherElement = numbers.higher(10);

        if (higherElement != null) {
            System.out.println("Element strictly greater than 10 is: " + higherElement);
        } else {
            System.out.println("No element strictly greater than 10 found.");
        }

        //13
        Integer lowerElement = numbers.lower(12);

        if (lowerElement != null) {
            System.out.println("Element strictly less than 12 is: " + lowerElement);
        } else {
            System.out.println("No element strictly less than 12 found.");
        }

        //14
        System.out.println("Retrieve and remove the first element: "+numbers.pollFirst());
        System.out.println("Numbers after removing first element: " + numbers);

        //15
        System.out.println("Retrieve and remove the last element: "+numbers.pollLast());

        //16
        numbers.remove(10);
        System.out.println("Numbers: " + numbers);

    }


}

