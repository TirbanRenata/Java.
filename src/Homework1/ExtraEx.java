package Homework1;
import java.util.Arrays;
import java.util.Scanner;

public class ExtraEx {
    public static void main(String[] args) {
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
    }
}
