package Homework17;


interface Square{
    double operate(double value);

}
public class SquareRoot {
    public static void main(String[] args){
        Square squareRoot = value -> Math.sqrt(value);
        Square square = value -> value*value;

        System.out.println(squareRoot.operate(16));
        System.out.println(square.operate(4));
    }
}
