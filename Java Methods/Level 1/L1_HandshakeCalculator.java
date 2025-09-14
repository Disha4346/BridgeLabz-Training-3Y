import java.util.Scanner;

/**
 * Program: L1_HandshakeCalculator
 * Task: Compute maximum handshakes using combination formula nC2.
 */
public class L1_HandshakeCalculator {

    // Uses combination formula to compute number of handshakes.
    public static long calculateMaxHandshakes(int numberOfStudents) {
        long n = numberOfStudents;
        long handshakes = (n * (n - 1)) / 2;
        return handshakes;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int numberOfStudents = scanner.nextInt();

        long totalHandshakes = calculateMaxHandshakes(numberOfStudents);
        System.out.println("Maximum possible handshakes: " + totalHandshakes);
        scanner.close();
    }
}
