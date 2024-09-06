package SingleInheritance;

public class MountainBike extends Bicycle{
    private String  tireType;
    private String suspension;

        public MountainBike(int speed,int gear,String tireType, String suspension){
          super(speed,gear);
            this.tireType = tireType;
            this.suspension = suspension;
        }

        public void adjustSuspension(String newSuspension){
            suspension = newSuspension;
            System.out.println("Suspension adjusted to "+ suspension);
        }
    @Override
    public String toString() {
        return "MountainBike [speed=" + speed + ", gear=" + gear +
                ", tireType=" + tireType + ", suspension=" + suspension + "]";
    }
}
