package Homework12.exercise4;

public abstract class AbstractClass {

    public AbstractClass(){
        System.out.println("This is constructor of abstract class");
    }

    public abstract void a_method();

    public void normal_method(){
        System.out.println("This is a normal method of abstract class");
    }
}
