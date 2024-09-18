package Homework12.exercise3;

public class A extends Marks{
    private int subject1;
    private int subject2;
    private int subject3;

    public A(int subject1, int subject2, int subject3){
        this.subject1 = subject1;
        this.subject2 = subject2;
        this.subject3 = subject3;
    }
    @Override
    public double getPercentage(){
        return  ((subject1 + subject2 + subject3)/3.0);
    }
}
