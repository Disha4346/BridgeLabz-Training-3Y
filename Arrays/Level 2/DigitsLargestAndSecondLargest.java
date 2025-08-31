import java.util.Scanner;

/**
 * Program 3 (Level 2)
 * Stores digits of a number into an array (max 10 digits) and finds largest and second largest.
 */
public class DigitsLargestAndSecondLargest {
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

        int maxDigit = 10;
        int[] digits = new int[maxDigit];
        int index = 0;

        if (number == 0) {
            digits[index++] = 0;
        } else {
            while (number != 0 && index < maxDigit) {
                digits[index++] = (int)(number % 10);
                number /= 10;
            }
        }

        int largest = 0;
        int secondLargest = 0;
        for (int i = 0; i < index; i++) {
            int d = digits[i];
            if (d > largest) {
                secondLargest = largest;
                largest = d;
            } else if (d > secondLargest && d < largest) {
                secondLargest = d;
            }
        }

        System.out.println("Largest digit = " + largest);
        System.out.println("Second largest digit = " + secondLargest);

        sc.close();
    }
}
