package Homework12.exercise6;

public class Area extends Shape{

    public void RectangleArea(double length, double breadth) {
        double area = length * breadth;
        System.out.println("Area of rectangle: " + area);
    }
    public void SquareArea(double side){
        double area = side * side;
        System.out.println("Area of square: "+ area);
        }

    public void CircleArea(double radius){
        double area = radius *radius * Math.PI;
        System.out.println("Area of circle: "+ area);
    }

}
