package Homework13;

public class TestPolymorphism {
    public static void main(String[] args) {
        Parent parent;
        parent = new Subclass1();
        parent.print();

        parent = new Subclass2();
        parent.print();
    }
}
    class Parent{
        void print(){
            System.out.println("Parent class. ");
        }
    }
    class Subclass1 extends Parent {
        void print(){
            System.out.println("Subclass1");
        }
    }
    class Subclass2 extends Parent {
        void print(){
            System.out.println("Subclass2");
        }
    }

