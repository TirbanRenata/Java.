package Homework16;

public enum LightColor {
    RED("Stop", 30),
    YELLOW("Caution", 5),
    GREEN("Go", 45);

    public static void main(String[] args){
        for (LightColor color : LightColor.values()) {
            System.out.println(color + ": " + color.getAction() + " for " + color.getDuration() + " seconds.");
        }
    }

    private  String action;
    private int duration;

   LightColor(String action,int duration){
        this.action = action;
        this.duration = duration;
    }


    public String getAction() {
        return action;
    }

    public int getDuration() {
        return duration;
    }
}
