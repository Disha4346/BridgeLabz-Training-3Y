import java.util.Scanner;

/**
 * Program: L2_UnitConverterPart2
 * Task: Convert yards<->feet, meters<->inches, inches->cm using static methods.
 */
public class L2_UnitConverterPart2 {

    public static double convertYardsToFeet(double yards) {
        double yards2feet = 3.0;
        return yards * yards2feet;
    }

    public static double convertFeetToYards(double feet) {
        double feet2yards = 0.333333;
        return feet * feet2yards;
    }

    public static double convertMetersToInches(double meters) {
        double meters2inches = 39.3701;
        return meters * meters2inches;
    }

    public static double convertInchesToMeters(double inches) {
        double inches2meters = 0.0254;
        return inches * inches2meters;
    }

    public static double convertInchesToCentimeters(double inches) {
        double inches2cm = 2.54;
        return inches * inches2cm;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter value for yards->feet: ");
        double yards = scanner.nextDouble();
        System.out.print("Enter value for feet->yards: ");
        double feet = scanner.nextDouble();
        System.out.print("Enter value for meters->inches: ");
        double meters = scanner.nextDouble();
        System.out.print("Enter value for inches->meters: ");
        double inches = scanner.nextDouble();
        System.out.print("Enter value for inches->centimeters: ");
        double inches2 = scanner.nextDouble();

        System.out.println("Yards to Feet: " + convertYardsToFeet(yards));
        System.out.println("Feet to Yards: " + convertFeetToYards(feet));
        System.out.println("Meters to Inches: " + convertMetersToInches(meters));
        System.out.println("Inches to Meters: " + convertInchesToMeters(inches));
        System.out.println("Inches to Centimeters: " + convertInchesToCentimeters(inches2));
        scanner.close();
    }
}
