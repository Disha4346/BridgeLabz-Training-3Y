import java.util.Scanner;

/**
 * Program: L3_DistanceAndLineEquation
 * Task: Euclidean distance and line equation between two points.
 */
public class L3_DistanceAndLineEquation {

    public static double distance(double x1, double y1, double x2, double y2) {
        double dx = x2 - x1;
        double dy = y2 - y1;
        return Math.sqrt(dx * dx + dy * dy);
    }

    // returns [m, b] for y = m*x + b
    public static double[] lineEquation(double x1, double y1, double x2, double y2) {
        if (x1 == x2) {
            throw new IllegalArgumentException("Vertical line: slope undefined.");
        }
        double m = (y2 - y1) / (x2 - x1);
        double b = y1 - m * x1;
        return new double[]{m, b};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter x1 y1: ");
        double x1 = scanner.nextDouble(); double y1 = scanner.nextDouble();
        System.out.print("Enter x2 y2: ");
        double x2 = scanner.nextDouble(); double y2 = scanner.nextDouble();

        double dist = distance(x1, y1, x2, y2);
        System.out.println("Distance = " + dist);

        try {
            double[] mb = lineEquation(x1, y1, x2, y2);
            System.out.println("Line equation: y = " + mb[0] + " * x + " + mb[1]);
        } catch (IllegalArgumentException e) {
            System.out.println("Line equation: vertical line (undefined slope).");
        }
        scanner.close();
    }
}
