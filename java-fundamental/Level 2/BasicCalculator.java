package btech.third.comp;

import java.util.Scanner;

class BasicCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean keepRunning = true; // to control loop

        while (keepRunning) {
            // ask for first number
            System.out.print("Enter first number: ");
            double number1 = sc.nextDouble();

            // ask for second number
            System.out.print("Enter second number: ");
            double number2 = sc.nextDouble();

            // calculate all operations
            double addition = number1 + number2;
            double subtraction = number1 - number2;
            double multiplication = number1 * number2;
            String division;
            if (number2 == 0) {
                division = "undefined (division by zero)";
            } else {
                division = String.valueOf(number1 / number2);
            }

            // print in required format
            System.out.println("The addition, subtraction, multiplication, and division value of 2 numbers " 
                + number1 + " and " + number2 + " is " 
                + addition + ", " + subtraction + ", " + multiplication + ", and " + division);

            // ask if user wants to continue
            System.out.print("Do you want to perform another calculation? (yes/no): ");
            String choice = sc.next().toLowerCase();
            if (choice.equals("no") || choice.equals("n")) {
                keepRunning = false;
                System.out.println("Calculator closed. Goodbye!");
            }
        }
        sc.close(); // close scanner
    }
}
