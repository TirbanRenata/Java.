package HierarchicalInheritance;

public class Boat {
    public int length;
    public int weight;

    public Boat(int length, int weight){
        this.length = length;
        this.weight = weight;
    }

    public void sail(){
        System.out.println("The boat is sailing");
    }
    @Override
    public String toString() {
        return "Boat [length=" + length + " meters, weight=" + weight + " kg]";
    }
}
