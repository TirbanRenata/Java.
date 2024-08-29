package Homework08;

import java.util.ArrayList;
import java.util.Scanner;

public class Diary {

    private static ArrayList<String> diary = new ArrayList<>();


    public static void main(String[] args) {

        diary.add("2024-05-13: My birthday");
        diary.add("2023-10-01: First day at college");
        diary.add("2024-06-01: Summer");

        Scanner scanner = new Scanner(System.in);
        String command;

        System.out.println("Personal Diary Menu:");
        System.out.println("1. Add Entry");
        System.out.println("2. Edit Entry");
        System.out.println("3. Delete Entry");
        System.out.println("4. Display Entries");
        System.out.println("5. Exit");
        System.out.print("Choose an option: ");
        command = scanner.nextLine();

        switch (command) {
            case "1":
                addEntry(scanner);
                break;
            case "2":
                editEntry(scanner);
                break;
            case "3":
                deleteEntry(scanner);
                break;
            case "4":
                displayEntries();
                break;
            case "5":
                System.out.println("Exiting the diary.");
                break;
            default:
                System.out.println("Invalid option. Please choose again.");
        }


        scanner.close();
    }

    private static void addEntry(Scanner scanner) {
        System.out.print("Enter the date (YYYY-MM-DD): ");
        String date = scanner.nextLine();
        System.out.print("Enter the diary entry: ");
        String entry = scanner.nextLine();
        String entryString = date + ": " + entry;


        for (String item : diary) {
            if (item.startsWith(date + ":")) {
                System.out.println("An entry for this date already exists.");
                return;
            }
        }
        diary.add(entryString);
        System.out.println("Entry added successfully.");
    }


    private static void editEntry(Scanner scanner) {
        System.out.print("Enter the date of the entry to edit (YYYY-MM-DD): ");
        String date = scanner.nextLine();
        System.out.print("Enter the new diary entry: ");
        String newEntry = scanner.nextLine();
        String newEntryString = date + ": " + newEntry;

        boolean found = false;
        for (int i = 0; i < diary.size(); i++) {
            if (diary.get(i).startsWith(date + ":")) {
                diary.set(i, newEntryString);
                System.out.println("Entry updated successfully.");
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("No entry found for the given date.");
        }
    }

    private static void deleteEntry(Scanner scanner) {
        System.out.print("Enter the date of the entry to delete (YYYY-MM-DD): ");
        String date = scanner.nextLine();
        boolean found = false;
        for (int i = 0; i < diary.size(); i++) {
            if (diary.get(i).startsWith(date + ":")) {
                diary.remove(date);
                System.out.println("Entry deleted successfully.");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("No entry found for the given date.");
        }


    }


    private static void displayEntries() {
        System.out.println("Diary Entries:");
        for (int i = diary.size() - 1; i >= 0; i--) {
            System.out.println(diary.get(i));
        }
    }


}
