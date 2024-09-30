package Homework16;

public enum CarType {
    SUV("SUV", "Honda", 35000),
    ELECTRIC("Electric", "Tesla", 65000),
    SPORTS("Sports", "Porsche", 90000);

    private final String type;
    private final String manufacturer;
    private final double averagePrice;

    CarType(String type, String manufacturer, double averagePrice) {
        this.type = type;
        this.manufacturer = manufacturer;
        this.averagePrice = averagePrice;
    }

    @Override
    public String toString() {
        return  "Type: " +type+ ", manufacturer:  " + manufacturer +" , price: " + averagePrice;
    }

    public static void main(String[] args) {
        for (CarType car : CarType.values()) {
            System.out.println(car);
        }
    }
}
