package Homework13;

public class Lemur extends Primate implements HasTail{
    public boolean isTailStriped(){
        return false;
    }
    public int age = 10;
    public static void main(String[] args){
        Lemur lemur = new Lemur();
        System.out.println(lemur.age);
        HasTail hasTail = lemur;
        System.out.println(hasTail.isTailStriped());
        Primate primate = lemur;
        System.out.println(primate.hasHair());

        Lemur lemur3 = (Lemur) primate;
        System.out.println(lemur3.age);
    }
}
class Primate{
    public boolean hasHair(){
        return true;
    }
}
interface HasTail{
    public boolean isTailStriped();
}
