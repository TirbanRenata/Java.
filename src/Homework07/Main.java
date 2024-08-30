package Homework07;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        displayTodayDate();
//        displayDateComponents();
//        createSpecificDate();
//        areDatesEqual();
//        isTodaySpecificDate();
//        displayCurrentTime();
//        addWeeksToToday();
//        findDayOfWeek();
//        daysBetween();
//        elapsedTimeSince();
        convertToTimeZone();
    }
    public static void displayTodayDate(){
        LocalDate date = LocalDate.now();
        System.out.println("Today's date: "+ date);

//        LocalDate today = LocalDate.now();
//        String date = today.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
//        System.out.println(date);
    }

    public static void displayDateComponents(){
      LocalDate date = LocalDate.now();
      int year = date.getYear();
      int month = date.getMonthValue();
      int day = date.getDayOfMonth();
      System.out.println("Year: " + year);
      System.out.println("Month: " + month);
      System.out.println("Day: " + day);

    }

    public static void createSpecificDate(){
        LocalDate specificDate = LocalDate.of(2025, 8, 19);
        System.out.println("Specific date: "+ specificDate);
    }

    public static void areDatesEqual(){
        String firstDate =  "2024-05-13";
        String secondDate =  "2024-12-04";
        System.out.println(firstDate.equals(secondDate));

    }

    public static void isTodaySpecificDate(){
        LocalDate today = LocalDate.now();
        String date = "2019-12-10";
        System.out.println("Is Today a specific date? "+ today.equals(date));
    }

    public static void displayCurrentTime(){
        LocalTime currentTime = LocalTime.now();
        String time = currentTime.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
        System.out.println("Current time: "+ time);
    }

    public static void addWeeksToToday(){
        LocalDate currentDate = LocalDate.now();
        LocalDate futureDate = currentDate.plusWeeks(4);
        System.out.println("Date after four weeks: "+ futureDate);
    }

    public static void findDayOfWeek(){
        LocalDate today = LocalDate.now();
        String dayOfWeek = today.getDayOfWeek().toString();
        System.out.println("Day of week: "+ dayOfWeek);
    }

    public static void daysBetween(){

        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter the first date (yyyy-MM-dd): ");
        LocalDate firstDate = LocalDate.parse(scanner.nextLine());

        System.out.println("Enter the second date (yyyy-MM-dd): ");
        LocalDate secondDate = LocalDate.parse(scanner.nextLine());

        System.out.println("The difference between firstDate and secondDate is: " + (secondDate.toEpochDay() - firstDate.toEpochDay()));


        scanner.close();


    }






    public static void elapsedTimeSince(){
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        String inputTime = "08:25:45";

        try {

            LocalTime pastTime = LocalTime.parse(inputTime, timeFormatter);
            LocalTime now = LocalTime.now();

            Duration duration = Duration.between(pastTime, now);

            long hours = duration.toHours();
            long minutes = duration.toMinutes() % 60;
            long seconds = duration.getSeconds() % 60;


            System.out.println("Elapsed time: " + hours + " hours, " + minutes + " minutes, " + seconds + " seconds.");
        } catch (DateTimeParseException e) {

            System.out.println("Invalid time format. Please use HH:MM:SS.");
        }
    }

    public static void convertToTimeZone() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter date and time (YYYY-MM-DD HH:MM:SS): ");
        String dateTimeInput = scanner.nextLine();

        System.out.println("Enter timezone (e.g., America/New_York, America/Los_Angeles): ");
        String timezone = scanner.nextLine();
        scanner.close();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        try {
            LocalDateTime localDateTime = LocalDateTime.parse(dateTimeInput, formatter);

            ZonedDateTime systemZonedDateTime = localDateTime.atZone(ZoneId.systemDefault());

            ZonedDateTime targetZonedDateTime = systemZonedDateTime.withZoneSameInstant(ZoneId.of(timezone));

            DateTimeFormatter outputFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss ");
            System.out.println("Converted date and time: " + targetZonedDateTime.format(outputFormatter));

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }



}
