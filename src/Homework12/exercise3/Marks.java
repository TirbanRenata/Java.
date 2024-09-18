package Homework12.exercise3;

public abstract class Marks {
    abstract double getPercentage();

    public static void main(String... args){
        Marks studentA = new A(85, 90, 88);
        Marks studentB = new B(75, 80, 85, 90);

        System.out.println("Percentage of Student A: " + studentA.getPercentage() + "%");
        System.out.println("Percentage of Student B: " + studentB.getPercentage() + "%");
    }
}
