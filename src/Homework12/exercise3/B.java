package Homework12.exercise3;

public class B extends Marks{
    private int subject1;
    private int subject2;
    private int subject3;
    private int subject4;

    public B(int subject1, int subject2, int subject3, int subject4){
        this.subject1 = subject1;
        this.subject2 = subject2;
        this.subject3 = subject3;
        this.subject4 = subject4;
    }
    @Override
    public double getPercentage(){
        return (subject1 +subject2 +subject3 + subject4)/4.0;
    }
}
