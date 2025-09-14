import java.util.Scanner;

/**
 * Program: L1_TriangularParkRounds
 * Task: Given sides of a triangular park (meters), compute rounds to complete 5km.
 */
public class L1_TriangularParkRounds {

    // Computes number of rounds needed to complete given distanceMeters.
    public static double computeRounds(double sideA, double sideB, double sideC, double distanceMeters) {
        double perimeterMeters = sideA + sideB + sideC;
        if (perimeterMeters <= 0) return 0.0;
        double rounds = distanceMeters / perimeterMeters;
        return rounds;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter side A (meters): ");
        double sideA = scanner.nextDouble();
        System.out.print("Enter side B (meters): ");
        double sideB = scanner.nextDouble();
        System.out.print("Enter side C (meters): ");
        double sideC = scanner.nextDouble();

        double distanceMeters = 5000.0; // 5 km
        double rounds = computeRounds(sideA, sideB, sideC, distanceMeters);

        System.out.println("Perimeter of park: " + (sideA + sideB + sideC) + " meters");
        System.out.println("Rounds required to complete 5 km: " + rounds);
        scanner.close();
    }
}
