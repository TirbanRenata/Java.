package MultilevelInheritance;

public class Tesla extends ElectricCar{
    private String autopilotVersion;

    public Tesla(String make, String model,int year,int batteryCapacity, int range, String autopilotVersion){
        super(make,model,year,batteryCapacity,range);
        this.autopilotVersion = autopilotVersion;
    }

    void enableAutopilot(){
        System.out.println("Autopilot version " + autopilotVersion + " enabled");
    }
    @Override
    public String toString() {
        return "Tesla [autopilotVersion=" + autopilotVersion + ", batteryCapacity=" + batteryCapacity + " kWh, range=" + range
                + " km, make=" + make + ", model=" + model + ", year=" + year + "]";
    }
}
