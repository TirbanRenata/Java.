package Homework16;

import java.util.Map;
import java.util.EnumMap;

public class DayScheduler {
    private Map<Day, String> schedule = new EnumMap<>(Day.class);

    public void addActivity(Day day, String activity) {
        schedule.put(day, activity);
    }

    public String getActivity(Day day) {
        return schedule.getOrDefault(day, "No activity scheduled");
    }

    public static void main(String[] args) {
        DayScheduler scheduler = new DayScheduler();
        scheduler.addActivity(Day.MONDAY, "Work and Gym");
        scheduler.addActivity(Day.TUESDAY, "Work");
        System.out.println("Monday's activity: " + scheduler.getActivity(Day.MONDAY));
        System.out.println("Tuesday's activity: " + scheduler.getActivity(Day.TUESDAY));
        System.out.println("Wednesday's activity: " + scheduler.getActivity(Day.WEDNESDAY));
        System.out.println("Thursday's activity: " + scheduler.getActivity(Day.THURSDAY));
        System.out.println("Friday's activity: " + scheduler.getActivity(Day.FRIDAY));
        System.out.println("Saturday's activity: " + scheduler.getActivity(Day.SATURDAY));
        System.out.println("Sunday's activity: " + scheduler.getActivity(Day.SUNDAY));
    }
}
enum Day{
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;
}