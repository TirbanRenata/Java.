package Homework16;

public enum TrafficLight {
    RED(30, "Stop"),
    YELLOW(5, "Caution"),
    GREEN(45, "Go");

    private final int duration;
    private final String action;

    TrafficLight(int duration, String action) {
        this.duration = duration;
        this.action = action;
    }

    public int getDuration() {
        return duration;
    }

    public String getAction() {
        return action;
    }

    public static void main(String[] args) {
        for (TrafficLight light : TrafficLight.values()) {
            System.out.println(light.name() + ": " + light.getAction() + " for " + light.getDuration() + " seconds");
        }
    }
}

