package Homework2;

import java.util.Scanner;

public class homework2 {
    public static void main(String[] args) {
//ex1
        int firstNumber = 20;
        int secondNumber = 12;
        int addition = firstNumber + secondNumber;
        System.out.println("Addition: " + addition);
        int subtraction = firstNumber - secondNumber;
        System.out.println("Subtraction: " + subtraction);
        int multiplication = firstNumber * secondNumber;
        System.out.println("Multiplication: " + multiplication);
        int division = firstNumber / secondNumber;
        System.out.println("Division: " + division);
        int modulus = firstNumber % secondNumber;
        System.out.println("Modulus: " + modulus);

//ex2
        // int a = 10;
        //System.out.println("Postincrement : " + (a++));
        // System.out.println("Preincrement : " + (++a));
        //System.out.println("Postdecrement : " + (a--));
        // System.out.println("Predecrement : " + (--a));

        firstNumber = firstNumber -- + firstNumber ++ - ++ firstNumber - --firstNumber; // 20 + 19 -21 -20 =-2
        System.out.println("First number: " + firstNumber);

//ex3
        if (firstNumber == 0) {
            System.out.println("The firstNumber is zero.");
        }
        else if (!(firstNumber < 0) && firstNumber != 0) {
            System.out.println("The firstNumber is positive.");
        } else {
            System.out.println("The firstNumber is negative.");;
        }
        //ex4
        for (int a = 1; a <= 10; a++) {
            System.out.print(a + " ");
        }
        System.out.println();
        for (int b = 10; b >=1 ; b--) {
            System.out.print(b + " ");
        }
        System.out.println();
//ex5
        int thirdNumber = 5;
        thirdNumber += firstNumber;
        System.out.println("After thirdNumber +=firstNumber , thirdNumber= " + thirdNumber);
        thirdNumber -= secondNumber;
        System.out.println("After thirdNumber-=secondNumber , thirdNumber= " + thirdNumber);
        thirdNumber *= division;
        System.out.println("After thirdNumber*=division , thirdNumber= " + thirdNumber);
        thirdNumber /= modulus;
        System.out.println("After thirdNumber/=modulus , thirdNumber= " + thirdNumber);
        thirdNumber %= division;
        System.out.println("After thirdNumber%=division , thirdNumber= " + thirdNumber);
        thirdNumber &= modulus;//AND
        System.out.println("After thirdNumber &=modulus , thirdNumber= " + secondNumber);
        thirdNumber |= secondNumber;//OR
        System.out.println("After thirdNumber |= secondNumber , thirdNumber= " + thirdNumber);
        thirdNumber ^= modulus;//XOR
        System.out.println("After thirdNumber ^=modulus , thirdNumber= " + thirdNumber);
        thirdNumber <<= secondNumber;//deplasare la stanga
        System.out.println("After thirdNumber <<= secondNumber , thirdNumber= " + thirdNumber);
        thirdNumber >>= secondNumber;//deplasare la dreapta
        System.out.println("After thirdNumber >>= secondNumber , thirdNumber= " + thirdNumber);
        thirdNumber >>>= secondNumber;//deplasare la dreapta fara semn
        System.out.println("After thirdNumber >>>= secondNumber , thirdNumber= " + thirdNumber);

        //ex6
        Scanner scanner=new Scanner(System.in);
        System.out.println("For exercise 6: ");
        System.out.println();
        System.out.println("Enter the first number: ");
        int number1 =scanner.nextInt();
        System.out.println("Enter the second number: ");
        int number2 =scanner.nextInt();
        if(number1< number2)
            System.out.println("First number is less than second number");
        if(number1 > number2)
            System.out.println("First number is greater than second number");

        if(number1 == number2)
            System.out.println("First number is equal to the second number");
        scanner.close();
        System.out.println();
//ex7

        int intValue = 11;
        double doubleValue = 5.5;

        double number = intValue + doubleValue - 5 + ((intValue%doubleValue) * intValue - intValue / doubleValue); // 11 + 5.5 -5 + (0 * 11 - 2)= 11.5 -2 =9.5
        System.out.println("Number= " + number);

        //ex8
        byte byte1 = 10;
        byte byte2 = 40;
        int sum = byte1 + byte2;
        byte result = (byte) sum;
        System.out.println("Result= " + result);

        //ex9
        int lenght = 9;
        int breadth = 5;
        int area = lenght * breadth;
        System.out.println("Area= " + area);

//ex10
        int num= 50;
        int reverseSign= -num;
        System.out.println("Num= " + reverseSign);

//ex11
        boolean boolVal = false;
        boolean boolVal2 = true;
        System.out.println("Denial if boolVal is: " + !boolVal);
        System.out.println("Denial if boolVal2 is: " + !boolVal2);

//ex12
        num ++;
        System.out.println("Num:"+num);
        num--;
        System.out.println("Num becomes:"+num);

//ex13

        double originalPrice = 100;
        double discountPercentage = 20;
        double discountAmount = (originalPrice * discountPercentage) / 100;
        originalPrice -= discountAmount;
        System.out.println("Final price: " + originalPrice);

//ex14
        if(num >= 1 && num <= 100)
            System.out.println("Num " +num+" is in range. ");
        else{
            System.out.println("Num " + num + " is not in range. ");
        }









    }
}

