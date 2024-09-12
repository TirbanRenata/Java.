package MultilevelInheritance;

public class Car {
    public String make;
    public String model;
    public int year;

    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    void start() {
        System.out.println("Car is starting");
    }

    void stop() {
        System.out.println("Car is stopping");
    }

    void accelerate() {
        System.out.println("Car is accelerating");
    }

    @Override
    public String toString() {
        return "Car [make=" + make + ", model=" + model + ", year=" + year + "]";

    }
}