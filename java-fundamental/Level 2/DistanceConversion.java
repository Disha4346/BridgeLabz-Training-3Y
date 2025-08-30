package btech.third.comp;

// Program to convert distance in feet to yards and miles
// 1 yard = 3 feet, 1 mile = 1760 yards

import java.util.Scanner;

class DistanceConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input distance in feet
        System.out.print("Enter distance in feet: ");
        double feet = sc.nextDouble();

        if (feet < 0) {
            System.out.println("Distance cannot be negative.");
            sc.close();
            return;
        }

        // Conversion
        double yards = feet / 3;
        double miles = yards / 1760;

        // Output
        System.out.printf("The distance in yards is %.6f while the distance in miles is %.6f%n", yards, miles);
        sc.close();
    }
}
