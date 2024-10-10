package Homework18;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Person {
   private String firstName;
    private String lastName;
    int age;
    public Person(String firstName, String lastName, int age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }
    public String toString(){
        return firstName + " " + lastName + ", Age: " + age;
    }

}

public class Main {
    public static void main(String... args) {
        List<Person> people = Arrays.asList(new Person("Tirban","Renata",20),new Person("Smith","Alice",17));
        List<Person> adults = people.stream()
                .filter(person -> person.age>18)
                .collect(Collectors.toList());
        System.out.println(adults);
    }

}

