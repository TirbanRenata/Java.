package Homework16;

import java.util.Objects;

public class Rectangle {
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.height = height;
        this.width = width;

    }

    @Override
    public boolean equals(Object o) {
        if (o == null) {
            return false;
        }
        if (o == this) {
            return true;
        }
        if (!(o instanceof Rectangle))
            return false;
        Rectangle rectangle = (Rectangle) o;
        return rectangle.height == this.height && Objects.equals(this.width, rectangle.width);
    }

    @Override
    public int hashCode() {
        return Objects.hash(width, height);
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public static void main(String... args) {

        Rectangle rectangle1 = new Rectangle(3, 6);
        Rectangle rectangle2 = new Rectangle(3, 6);

        System.out.println("Rectangle 1 equals Rectangle 2: " + rectangle1.equals(rectangle2));
        System.out.println("Hashcodes are equal: " + (rectangle1.hashCode() == rectangle2.hashCode()));
    }


}

