package HierarchicalInheritance;

public class SpeedBoat extends Boat{
    private int maxSpeed;
    private String engineType;

    public SpeedBoat(int length, int weight, int maxSpeed, String engineType){
       super(length,weight);
        this.maxSpeed = maxSpeed;
        this.engineType = engineType;
    }

    public void turboBoost(){
        System.out.println("Turbo Boost is activated!".toUpperCase() + "Max speed: "+ maxSpeed);
    }
    @Override
    public String toString() {
        return "SpeedBoat [maxSpeed=" + maxSpeed + " km/h, engineType=" + engineType
                + ", length=" + length + " meters, weight=" + weight + " kg]";
    }
}
