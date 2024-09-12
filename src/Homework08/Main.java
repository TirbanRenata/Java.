package Homework08;

import java.sql.SQLOutput;
import java.util.*;

public class Main {
    public static void main(String[] args) {
//        shoppingList();
//        wishList();
//        graduateStudents();
//        evenAndOddNumbers();
//        cityNames();
//        linkedList();
//        fruits();
//        movieTitles();
//        binaryToDecimal();

    }


    public static void shoppingList() {
        String[] shoppingList = {"Mere", "Cartofi", "Ciocolata", "Carne", "Pepene"};
        for (String item : shoppingList) {
            System.out.println(item);
        }

    }

    public static void wishList() {
        ArrayList<String> wishList = new ArrayList<>();
        wishList.add("Job");
        wishList.add("Sanatate");
        wishList.add("Caramele");
        System.out.println(wishList);

    }

    public static void graduateStudents() {
        ArrayList<String> studentList = new ArrayList<>();
        ArrayList<String> graduateStudentList = new ArrayList<>();
        studentList.add("Jennifer Aniston");
        studentList.add("Sofia Carpenter");
        studentList.add("Jane Smith");
        studentList.add("Tyler Posey");
        studentList.add("Crystal Reed");
        studentList.add("Dylan O'Brien");
        studentList.add("Shelley Henning");
        studentList.add("Tyler Hoechlin");
        studentList.add("Holland Roden");
        studentList.add("Anastasia Maria");

        graduateStudentList.addAll(studentList);

        for (String item : graduateStudentList) {
            System.out.println(item);
        }

    }

    public static void evenAndOddNumbers() {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int countEvenNumbers = 0;
        int countOddNumbers = 0;
        for (int number : numbers) {
            if (number % 2 == 0) {
                countEvenNumbers++;
            } else {
                countOddNumbers++;
            }
        }
        System.out.println("Even numbers: " + countEvenNumbers);
        System.out.println("Odd numbers: " + countOddNumbers);

    }

    public static void cityNames() {
        ArrayList<String> cities = new ArrayList<>();
        cities.add("Oradea");
        cities.add("Cluj");
        cities.add("Timisoara");
        cities.add("Sibiu");
        cities.add("Brasov");

        Scanner scanner = new Scanner(System.in);
        String cityName;

        while (true) {
            System.out.println("Please, introduce a city name: ");
            cityName = scanner.nextLine();

            if (cities.contains(cityName)) {
                System.out.println("City already exists. Please choose another city name.");
            } else {
                cities.add(cityName);
                System.out.println(cityName + " has been added to the list.");
                break;  // Ieșire,  dacă orașul a fost adăugat cu succes.
            }
        }

        System.out.println("The cities are: " + cities);

        scanner.close();
    }

    public static void linkedList() {
        LinkedList<String> students = new LinkedList<>();
        students.add("Jennifer");
        students.add("Maria");
        students.add("Rosa");
        students.add("Anastasia");
        students.add("Bob");
        students.add("John");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce the student name: ");
        String studentName = scanner.nextLine();
        if (students.contains(studentName)) {
            students.remove(studentName);
            System.out.println(studentName + " has been removed from the list.");
            System.out.println("The remaining students are: " + students);
        } else {
            System.out.println("The student is not on the list. ");
            System.out.println("The students on the list are " + students);
        }

    }

    public static void fruits() {
        ArrayList<String> fruits = new ArrayList<>(Arrays.asList("Apple", "Kiwi", "Banana", "Strawberry", "Blueberry", "Mango", "Cherry"));
        fruits.sort((fruit1, fruit2) -> {
            int lengthCompare = fruit2.length() - fruit1.length();
            if (lengthCompare == 0) {
                return fruit1.compareTo(fruit2);
            }
            return lengthCompare;
        });
        System.out.println(fruits);


    }

    public static void movieTitles() {
        String[] movies = {"Twisters", "It Ends with Us", "Divergent", "Insurgent", "Purple Hearts"};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce the movie title: ");

        String movieTitle = scanner.nextLine();
        boolean found = false;

        for (int i = 0; i < movies.length; i++) {
            if (movies[i].equals(movieTitle)) {
                System.out.println("The movie is found at position: " + i);
                found = true;
                break;
            }

        }
        if (!found) {
            System.out.println("The movie is not found. ");
        }
        scanner.close();


    }

    public static void binaryToDecimal() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the binary number: ");
        String binaryNumber = scanner.nextLine();

        try {
            int decimal = Integer.parseInt(binaryNumber, 2);
            System.out.println(binaryNumber + " = " + decimal);
        } catch (NumberFormatException e) {
            System.out.println("Invalid binary number. ");
        }
        scanner.close();


    }


}


