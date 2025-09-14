import java.util.Scanner;

/**
 * Program: L1_QuotientRemainderCalculator
 * Task: Input two integers; print quotient and remainder.
 */
public class L1_QuotientRemainderCalculator {

    // Returns array [remainder, quotient]
    public static int[] findRemainderAndQuotient(int number, int divisor) {
        int quotient = number / divisor;
        int remainder = number % divisor;
        return new int[] { remainder, quotient };
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = scanner.nextInt();
        System.out.print("Enter divisor: ");
        int divisor = scanner.nextInt();

        if (divisor == 0) {
            System.out.println("Divisor cannot be zero.");
        } else {
            int[] rq = findRemainderAndQuotient(number, divisor);
            System.out.println("Quotient: " + rq[1] + ", Remainder: " + rq[0]);
        }
        scanner.close();
    }
}
