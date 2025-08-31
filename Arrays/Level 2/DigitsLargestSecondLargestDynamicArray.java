import java.util.Scanner;

/**
 * Program 4 (Level 2)
 * Like Program 3 but grows the digits array dynamically to include all digits.
 */
public class DigitsLargestSecondLargestDynamicArray {
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
            while (number != 0) {
                if (index == maxDigit) {
                    // grow by 10
                    int newMax = maxDigit + 10;
                    int[] temp = new int[newMax];
                    for (int i = 0; i < maxDigit; i++) temp[i] = digits[i];
                    digits = temp;
                    maxDigit = newMax;
                }
                digits[index++] = (int)(number % 10);
                number /= 10;
            }
        }

        int largest = 0, secondLargest = 0;
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
