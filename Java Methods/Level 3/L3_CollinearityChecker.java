import java.util.Scanner;

/**
 * Program: L3_CollinearityChecker
 * Task: Check collinearity using slope equality and area of triangle methods.
 */
public class L3_CollinearityChecker {

    public static boolean areCollinearBySlope(double x1, double y1, double x2, double y2, double x3, double y3) {
        double ab = (x2 - x1);
        double bc = (x3 - x2);
        double ac = (x3 - x1);
        // Avoid divide by zero: compare cross products instead of slopes directly.
        double lhs = (y2 - y1) * bc;
        double rhs = (y3 - y2) * ab;
        double lhs2 = (y3 - y1) * ab;
        double rhs2 = (y2 - y1) * ac;
        return Math.abs(lhs - rhs) < 1e-9 && Math.abs(lhs2 - rhs2) < 1e-9;
    }

    public static boolean areCollinearByArea(double x1, double y1, double x2, double y2, double x3, double y3) {
        double area = 0.5 * (x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2));
        return Math.abs(area) < 1e-9;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter x1 y1: ");
        double x1 = scanner.nextDouble(); double y1 = scanner.nextDouble();
        System.out.print("Enter x2 y2: ");
        double x2 = scanner.nextDouble(); double y2 = scanner.nextDouble();
        System.out.print("Enter x3 y3: ");
        double x3 = scanner.nextDouble(); double y3 = scanner.nextDouble();

        boolean slope = areCollinearBySlope(x1, y1, x2, y2, x3, y3);
        boolean area = areCollinearByArea(x1, y1, x2, y2, x3, y3);

        System.out.println("Collinear (Slope method): " + slope);
        System.out.println("Collinear (Area method): " + area);
        scanner.close();
    }
}
