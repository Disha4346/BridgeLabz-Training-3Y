import java.util.Scanner;

/**
 * Program 5 (Level 2)
 * Reads a number, stores digits in an array, and prints the reverse number.
 */
public class ReverseNumberUsingArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long number;
        while (true) {
            System.out.print("Enter a non-negative integer: ");
            if (!sc.hasNextLong()) { System.err.println("Enter whole number."); sc.next(); continue; }
            number = sc.nextLong();
            if (number < 0) { System.err.println("Must be non-negative."); continue; }
            break;
        }

        // Count digits
        int count = (number == 0) ? 1 : 0;
        long tmp = number;
        while (tmp > 0) { count++; tmp /= 10; }

        // Store digits
        int[] digits = new int[count];
        if (number == 0) {
            digits[0] = 0;
        } else {
            for (int i = 0; i < count; i++) {
                digits[i] = (int)(number % 10);
                number /= 10;
            }
        }

        // Reverse digits into another array and print
        int[] reversed = new int[count];
        for (int i = 0; i < count; i++) {
            reversed[i] = digits[count - 1 - i];
        }

        System.out.print("Reversed number digits: ");
        for (int i = 0; i < reversed.length; i++) {
            System.out.print(reversed[i]);
        }
        System.out.println();

        sc.close();
    }
}
