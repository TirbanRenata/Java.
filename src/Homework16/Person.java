package Homework16;

import java.util.Objects;

public class Person {
    public static void main(String[] args){
        Person person1 = new Person("Ana", 20, "ana.20@gmail.com");
        Person person2 = new Person("Maria", 15, "mariaa@gmail.com");
        Person person3 = new Person("Ana", 20, "ana.other@gmail.com");

        System.out.println("Person 1 equals Person 2: " + person1.equals(person2));
        System.out.println("Person 1 equals Person 3: " + person1.equals(person3));
        System.out.println("Hashcodes are equal (Person 1 and Person 3): " + (person1.hashCode() == person3.hashCode()));
    }

    private String name;
    private int age;
    private String email;

    public Person(String name,int age,String email){
        this.age= age;
        this.name = name;
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if(o == null){
            return  false;
        }
        if(o == this){
            return  true;
        }
        if(!(o instanceof  Person))
            return false;
        Person person = (Person) o;
        return person.age == this.age && Objects.equals(this.name,person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name);
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }



}
