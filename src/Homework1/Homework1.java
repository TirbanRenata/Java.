package Homework1;

import java.util.Arrays;
import java.util.Scanner;

public class Homework1 {
    public static void main(String[] args) {


            //The exercises from ppt
            //ex 1
            String firstName = "Tirban";
            String lastName = "Renata";
            System.out.println("My name is: " + firstName + " " + lastName);
            int age = 20;
            System.out.println("My age is: " + age);
            String favouriteColor="Red";
            System.out.println("My favourite color is: " + favouriteColor);
            //ex2

            int x = 5;
            System.out.println("x= " + x);
            double a = 50.2d;
            System.out.println("a= " + a);
            char b = 'R';
            System.out.println("b= " + b);
            String homework = "Basic data types";
            System.out.println("homework = " + homework);

            //ex3
            int rezAddition= (int) (x+a);
            System.out.println("rezAddition= " + rezAddition);
            int rezSubtraction= (int) (x-a);
            System.out.println("rezSubtraction= " + rezSubtraction);
            int rezMultiplication= (int) (x*a);
            System.out.println("rezMultiplication= " + rezMultiplication);
            int rezDivision= (int) (x/a);
            System.out.println("rezDivision= " + rezDivision);
            int rezModulus= (int) (x%a);
            System.out.println("rezModulus= " + rezModulus);






            System.out.println(Arrays.toString(args));
            Scanner scanner = new Scanner(System.in);
            System.out.println("Introduceti primul numar: ");
            int number1 = scanner.nextInt();
            System.out.println("Introduceti al doilea numar: ");
            int number2 = scanner.nextInt();
            int sum = number1 + number2;
            System.out.println("Suma numerelor este: " + sum);
            System.out.println("Are you a student?");

            //ex 1 from docx
            boolean isStudent = scanner.nextBoolean();
            if (isStudent == true) {
                System.out.println("I am a student.");
            } else {
                System.out.println("I am not a student");
            }
            scanner.close();


//            OthersExercisers();
        }


    public static void OthersExercisers() {
//ex1
            int myAge = 20;
            System.out.println("My age is " + myAge);
            double height = 1.70d;
            System.out.println("My height is " + height + "m");
            char firstLetter = 'R';
            System.out.println("My first letter of my name is " + firstLetter);
            //        boolean isStudent=true;
            //        System.out.println("I am a student: " + isStudent);

//ex2
            int myFriendAge = 22;
            System.out.println("My friend age is " + myFriendAge);
            int addition = myFriendAge + myAge;
            System.out.println("Addition is " + addition);
            int subtraction = myFriendAge - myAge;
            System.out.println("Subtraction is " + subtraction);
            int multiplication = myFriendAge * myAge;
            System.out.println("Multiplication is " + multiplication);
            int division = myFriendAge / myAge;
            System.out.println("Division is " + division);
//ex3
            String myName = "Renata";
            String lastName = "Andrada";
            String fullName = myName + " " + lastName;
            System.out.println("Full name is: " + fullName);
//ex4
            //        double kmToBeius = 18.5d;
            //        double kmToPartyFromBeius = 0.7d;
            //        int subtractionKm= (int) (kmToBeius-kmToPartyFromBeius);
            //        System.out.println("Subtraction Km is " + subtractionKm);
            int myInt = 42;
            double myDouble = myInt;  // Implicit casting: int to double

            System.out.println("Integer value: " + myInt);
            System.out.println("Double value: " + myDouble);

            double myDouble2 = 42.99;
            int myInt2 = (int) myDouble2;  // Explicit casting: double to int

            System.out.println("Double value: " + myDouble2);
            System.out.println("Integer value: " + myInt2);

//ex5
            int lenght = 20;
            int width = 10;
            int area = lenght * width;
            System.out.println("Area is " + area);
//ex6
            int average = (lenght + width + area)/3;
            System.out.println("The average is: " + average);
//ex7
            double weight = 58.2d;
            double bmi = weight / (height * height);
            System.out.println("BMI is " + bmi);
            // Determine the BMI category
            if (bmi < 18.5) {
                System.out.println("You are underweight.");
            } else if (bmi >= 18.5 && bmi < 24.9) {
                System.out.println("You have a normal weight.");
            } else if (bmi >= 25 && bmi < 29.9) {
                System.out.println("You are overweight.");
            } else {
                System.out.println("You are obese.");
            }
//ex8
            double radius = 5.0;
            double pi=3.14159265359d;
            //double circleArea=Math.PI * radius * radius;
            double circleArea = pi * radius * radius ;
            System.out.println("Area is " + area);
            double circumference = 2 * Math.PI * radius;
            System.out.println("Circumference is " + circumference);
//ex9
            double celsius = 25.0;
            double fahrenheit = (celsius * 9/5) + 32;
            System.out.println(celsius + " degrees Celsius is equal to " + fahrenheit + " degrees Fahrenheit.");


        }
    }

