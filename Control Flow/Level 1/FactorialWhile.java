import java.util.Scanner;

/**
 * Computes factorial of a natural number using while loop.
 */
public class FactorialWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        if (n < 0) {
            System.out.println("Enter a non-negative integer.");
            input.close();
            return;
        }
        long fact = 1;
        int i = 1;
        while (i <= n) {
            fact *= i;
            i++;
        }
        System.out.println("Factorial(" + n + ") = " + fact);
        input.close();
    }
}
