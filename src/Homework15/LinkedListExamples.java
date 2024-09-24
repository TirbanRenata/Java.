package Homework15;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExamples {
    public  static void main(String[] args){
        LinkedList<String> fruits = new LinkedList<String>();
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Kiwi");
        fruits.add("Pear");
        fruits.add("Cherry");
         //1

        fruits.addLast("Strawberry");
        System.out.println("LinkedList: " + fruits);

        //2
        for(String fruit:fruits){
            System.out.println(fruit);
        }
        System.out.println();
        //3
        for(int i=2;i<fruits.size();i++){
            System.out.println("["+ i + "]" + fruits.get(i));
        }
        System.out.println();

        //4

        Iterator<String> iterator = fruits.descendingIterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println();
        //5
        fruits.add(2,"Orange");
        System.out.println("LinkedList after insert an element at a specific position: " + fruits);
        System.out.println();

        //6
        fruits.addFirst("Peach");
        fruits.addLast("Raspberry");
        System.out.println("Fruits after insert elements at the first and last position: "+ fruits);

        //7
        fruits.offerFirst("Watermelon");
        System.out.println("LinkedList after insert an element at the front of a linkedList:  "+ fruits);

        System.out.println();

        //8
        fruits.offerLast("Plum");
        System.out.println("LinkedList after insert an element at the front of a linkedList:  "+ fruits);

        System.out.println();

        //9
        LinkedList<String> sublist = new LinkedList<>();
        sublist.add("Sour cherry");
        sublist.add("Apricot");
        fruits.addAll(1,sublist);
        System.out.println("Fruits: " + fruits);

        //10
        System.out.println("First occurrence : " + fruits.indexOf("Watermelon"));
        System.out.println("Last occurrence : " + fruits.lastIndexOf("Plum"));

        //11
        for(int i = 0; i <fruits.size();i++){
            System.out.println("Position " + i + " : " + fruits.get(i));
        }

        //12
        fruits.remove("Apricot");
        //System.out.println("Update list: " + fruits);

        //13
        fruits.removeFirst();
        fruits.removeLast();
        System.out.println("Update list: " + fruits);

        //14
        sublist.clear();
        System.out.println("Sublist now : " +sublist);

        //15

        Collections.swap(fruits,1,3);
        System.out.println("LinkedList after swapping: " + fruits);

        //16
        Collections.shuffle(fruits);
        System.out.println("Shuffled LinkedList: " + fruits);

        //17
        sublist.add("Apricot");
        sublist.add("Grape");
        fruits.addAll(sublist);
        System.out.println("LinkedList: " + fruits);

        //18
        sublist = (LinkedList)fruits.clone();
        System.out.println("Cloned linked list: " + fruits);

        //19
        System.out.println("List of fruits: " + fruits);
        String firstElement = fruits.removeFirst();
        System.out.println("First element now: " +fruits.getFirst());

        //20
        System.out.println("First element in the list: " +fruits.peekFirst());

    }

}
