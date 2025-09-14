import java.util.Scanner;

/**
 * Program: L2_UnitConverterPart1
 * Task: Convert km<->miles, meters<->feet using static methods.
 */
public class L2_UnitConverterPart1 {

    public static double convertKmToMiles(double km) {
        double km2miles = 0.621371;
        return km * km2miles;
    }

    public static double convertMilesToKm(double miles) {
        double miles2km = 1.60934;
        return miles * miles2km;
    }

    public static double convertMetersToFeet(double meters) {
        double meters2feet = 3.28084;
        return meters * meters2feet;
    }

    public static double convertFeetToMeters(double feet) {
        double feet2meters = 0.3048;
        return feet * feet2meters;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter value for km->miles: ");
        double km = scanner.nextDouble();
        System.out.print("Enter value for miles->km: ");
        double miles = scanner.nextDouble();
        System.out.print("Enter value for meters->feet: ");
        double meters = scanner.nextDouble();
        System.out.print("Enter value for feet->meters: ");
        double feet = scanner.nextDouble();

        System.out.println("Km to Miles: " + convertKmToMiles(km));
        System.out.println("Miles to Km: " + convertMilesToKm(miles));
        System.out.println("Meters to Feet: " + convertMetersToFeet(meters));
        System.out.println("Feet to Meters: " + convertFeetToMeters(feet));
        scanner.close();
    }
}
