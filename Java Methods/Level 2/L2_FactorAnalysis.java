import java.util.Arrays;
import java.util.Scanner;

/**
 * Program: L2_FactorAnalysis
 * Task: Find factors of a number, and compute sum, sum of squares, product.
 */
public class L2_FactorAnalysis {

    // Returns all positive factors of number in ascending order.
    public static int[] findFactors(int number) {
        if (number <= 0) return new int[]{};
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) count++;
        }
        int[] factors = new int[count];
        int idx = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) factors[idx++] = i;
        }
        return factors;
    }

    public static long sumOfArray(int[] array) {
        long sum = 0L;
        for (int v : array) sum += v;
        return sum;
    }

    public static long sumOfSquares(int[] array) {
        long sum = 0L;
        for (int v : array) sum += (long) v * v;
        return sum;
    }

    public static long productOfArray(int[] array) {
        long product = 1L;
        for (int v : array) product *= v;
        return product;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();
        if (number <= 0) {
            System.out.println("Please enter a positive integer.");
            scanner.close();
            return;
        }

        int[] factors = findFactors(number);
        System.out.println("Factors of " + number + ": " + Arrays.toString(factors));
        System.out.println("Sum of factors: " + sumOfArray(factors));
        System.out.println("Sum of squares of factors: " + sumOfSquares(factors));
        System.out.println("Product of factors: " + productOfArray(factors));
        scanner.close();
    }
}
