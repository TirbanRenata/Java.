package MultilevelInheritance;

public class ElectricCar extends Car {
    public int batteryCapacity;
    public int range;

    public ElectricCar(String make, String model, int year, int batteryCapacity, int range) {
        super(make, model, year);
        this.batteryCapacity = batteryCapacity;
        this.range = range;
    }

    void charge() {
        System.out.println("Electric car is charging");
    }

    @Override
    public String toString() {
        return "ElectricCar [batteryCapacity=" + batteryCapacity + " kWh, range=" + range + " km, "
                + "make=" + make + ", model=" + model + ", year=" + year + "]";

    }
}
