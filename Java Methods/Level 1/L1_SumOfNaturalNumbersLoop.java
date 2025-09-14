import java.util.Scanner;

/**
 * Program: L1_SumOfNaturalNumbersLoop
 * Task: Compute sum of n natural numbers using a loop.
 */
public class L1_SumOfNaturalNumbersLoop {

    // Computes the sum 1 + 2 + ... + n for n >= 0.
    public static long sumUpToN(int n) {
        long sum = 0L;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n (natural number): ");
        int n = scanner.nextInt();

        if (n < 0) {
            System.out.println("Please enter a non-negative integer.");
        } else {
            long sum = sumUpToN(n);
            System.out.println("Sum of first " + n + " natural numbers = " + sum);
        }
        scanner.close();
    }
}
