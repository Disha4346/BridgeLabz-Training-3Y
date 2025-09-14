import java.util.Scanner;

/**
 * Program: L2_RecursiveSumVsFormula
 * Task: Sum of first n natural numbers using recursion and formula; compare results.
 */
public class L2_RecursiveSumVsFormula {

    // Recursive sum 1..n
    public static long recursiveSum(int n) {
        if (n <= 0) return 0L;
        return n + recursiveSum(n - 1);
    }

    public static long formulaSum(int n) {
        return (long) n * (n + 1) / 2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n (natural number): ");
        int n = scanner.nextInt();

        if (n < 0) {
            System.out.println("Please enter a non-negative integer.");
            scanner.close();
            return;
        }

        long recursive = recursiveSum(n);
        long formula = formulaSum(n);

        System.out.println("Recursive Sum: " + recursive);
        System.out.println("Formula Sum:   " + formula);
        System.out.println("Results " + (recursive == formula ? "match." : "do NOT match."));
        scanner.close();
    }
}
