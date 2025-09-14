import java.util.Scanner;

/**
 * Program: L1_TrigonometryCalculator
 * Task: Calculate sine, cosine, tangent for an angle in degrees.
 */
public class L1_TrigonometryCalculator {

    // Returns array [sin, cos, tan] for given angle in degrees.
    public static double[] calculateTrigonometricFunctions(double angleDegrees) {
        double radians = Math.toRadians(angleDegrees);
        double sine = Math.sin(radians);
        double cosine = Math.cos(radians);
        double tangent = Math.tan(radians);
        return new double[] { sine, cosine, tangent };
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter angle (degrees): ");
        double angleDegrees = scanner.nextDouble();

        double[] results = calculateTrigonometricFunctions(angleDegrees);
        System.out.println("sin = " + results[0] + ", cos = " + results[1] + ", tan = " + results[2]);
        scanner.close();
    }
}
