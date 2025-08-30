package btech.third.comp;
// Program to find side of square from perimeter
// Formula: perimeter = 4 * side

import java.util.*;

public class SquareSide {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input perimeter
        System.out.print("Enter perimeter of square: ");
        double perimeter = sc.nextDouble();

        // Check for invalid input
        if (perimeter <= 0) {
            System.out.println("Perimeter must be a positive number.");
            return;
        }

        // Formula
        double side = perimeter / 4;

        // Output
        System.out.println("The length of the side is " + side + " whose perimeter is " + perimeter);
    }
}
