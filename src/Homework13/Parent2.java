package Homework13;


public class Parent2 {

    int value = 100;
}
class Child extends Parent2 {
    int value = 200;
}
class Test {
    public static  void main(String[] args){
        Parent2 parent = new Child();
        System.out.println(parent.value);
    }
}
