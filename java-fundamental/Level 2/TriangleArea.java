package btech.third.comp;
// area of triangle = 1/2 * base * height
// need to convert cm² to inch² also (1 inch = 2.54 cm)
// I hope my math is not wrong

import java.util.Scanner;

class TriangleArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input base and height
        System.out.print("Enter base in cm: ");
        double base = sc.nextDouble();

        System.out.print("Enter height in cm: ");
        double height = sc.nextDouble();

        // Checking if inputs are valid
        if (base <= 0 || height <= 0) {
            System.out.println("Base and height must be positive values.");
            return; // exit program
        }

        // Formula for area in cm²
        double areaCm = 0.5 * base * height;

        // Conversion to square inches
        double areaInches = areaCm / (2.54 * 2.54);

        // Output in required format
        System.out.printf("The Area of the triangle in sq in is %.4f and sq cm is %.4f%n", areaInches,
                areaCm);
    }
}
