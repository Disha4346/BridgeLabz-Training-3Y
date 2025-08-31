import java.util.Scanner;

/**
 * Program 10 (Level 2)
 * Reads a number, stores digits in an array, and prints frequency of each digit (0-9).
 */
public class DigitFrequencyInNumber {
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

        int[] digits = new int[count];
        if (number == 0) {
            digits[0] = 0;
        } else {
            for (int i = 0; i < count; i++) {
                digits[i] = (int)(number % 10);
                number /= 10;
            }
        }

        int[] freq = new int[10];
        for (int i = 0; i < digits.length; i++) {
            int d = digits[i];
            if (d >= 0 && d <= 9) {
                freq[d]++;
            }
        }

        for (int i = 0; i < freq.length; i++) {
            System.out.println("Digit " + i + " -> " + freq[i]);
        }

        sc.close();
    }
}
