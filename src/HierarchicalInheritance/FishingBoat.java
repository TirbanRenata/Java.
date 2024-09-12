package HierarchicalInheritance;

public class FishingBoat extends Boat {
    private int fishCapacity;
    private String typeOffNet;

    public FishingBoat(int length, int weight, int fishCapacity, String typeOffNet) {
        super(length, weight);
        this.fishCapacity = fishCapacity;
        this.typeOffNet = typeOffNet;
    }

    public void castNet() {
        System.out.println("Casting the " + typeOffNet + " net");
    }

    @Override
    public String toString() {
        return "FishingBoat [fishCapacity=" + fishCapacity + " kg, typeOfNet=" + typeOffNet
                + ", length=" + length + " meters, weight=" + weight + " kg]";

    }
}
