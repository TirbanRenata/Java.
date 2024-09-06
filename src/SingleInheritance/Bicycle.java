package SingleInheritance;

public class Bicycle {
    public int speed;
    public int gear;

       public Bicycle(int speed, int gear){
           this.speed = speed;
           this.gear = gear;
       }
       public void changeGear(int newGear){
        gear = newGear;
           System.out.println("Gear change to: " + gear);
       }
       public void speedUp(int increment){
            speed += increment;
           System.out.println("Speed increased by " + increment + " to:" + speed);
       }
       public void applyBrake(int decrement){
            speed -= decrement;
           System.out.println("Speed decreased by " + decrement + "to: "+ speed);
       }
}
