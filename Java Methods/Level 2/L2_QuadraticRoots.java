import java.util.Arrays;
import java.util.Scanner;

/**
 * Program: L2_QuadraticRoots
 * Task: Find roots of ax^2 + bx + c using Math.sqrt and Math.pow.
 */
public class L2_QuadraticRoots {

    public static double[] findQuadraticRoots(double a, double b, double c) {
        double delta = (b * b) - (4.0 * a * c);
        if (a == 0) return new double[]{}; // not a quadratic
        if (delta > 0) {
            double sqrtDelta = Math.sqrt(delta);
            double root1 = (-b + sqrtDelta) / (2.0 * a);
            double root2 = (-b - sqrtDelta) / (2.0 * a);
            return new double[] { root1, root2 };
        } else if (delta == 0) {
            double root = (-b) / (2.0 * a);
            return new double[] { root };
        } else {
            return new double[]{}; // as per instructions, return empty if negative discriminant
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a: ");
        double a = scanner.nextDouble();
        System.out.print("Enter b: ");
        double b = scanner.nextDouble();
        System.out.print("Enter c: ");
        double c = scanner.nextDouble();

        double[] roots = findQuadraticRoots(a, b, c);
        if (roots.length == 0) {
            System.out.println("No real roots.");
        } else if (roots.length == 1) {
            System.out.println("One real root: " + roots[0]);
        } else {
            System.out.println("Two real roots: " + Arrays.toString(roots));
        }
        scanner.close();
    }
}
