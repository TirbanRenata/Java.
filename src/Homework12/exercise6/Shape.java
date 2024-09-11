package Homework12.exercise6;

public abstract class Shape {

    public abstract void RectangleArea(double length, double breadth);
    public abstract void SquareArea(double side);
    public abstract void CircleArea(double radius);


    public static void main(String... args){
        Area area = new Area();

        area.RectangleArea(10,15);
        area.SquareArea(7);
        area.CircleArea(5);
    }
}

