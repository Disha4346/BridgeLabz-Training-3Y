package btech.third.comp;

// Program to calculate quotient and remainder
// Operators: / for quotient and % for remainder

import java.util.Scanner;

class QuotientRemainder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input two numbers
        System.out.print("Enter first number: ");
        int number1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int number2 = sc.nextInt();

        // Check for divide by zero
        if (number2 == 0) {
            System.out.println("Cannot divide by zero.");
            return;
        }

        // Calculation
        int quotient = number1 / number2;
        int remainder = number1 % number2;

        // Output
        System.out.println("The Quotient is " + quotient + " and Reminder is " + remainder +
                           " of two number " + number1 + " and " + number2);
        sc.close();
    }
}
