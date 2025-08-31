import java.util.Arrays;
import java.util.Scanner;

/**
 * Program: L3_NumberCheckerSet2
 * Task: Static utility methods - count digits, digits array, sum of digits, sum of squares, Harshad, digit frequency.
 */
public class L3_NumberCheckerSet2 {

    public static int countDigits(int number) {
        number = Math.abs(number);
        if (number == 0) return 1;
        int count = 0;
        while (number > 0) { count++; number /= 10; }
        return count;
    }

    public static int[] digitsArray(int number) {
        number = Math.abs(number);
        int count = countDigits(number);
        int[] digits = new int[count];
        for (int i = count - 1; i >= 0; i--) { digits[i] = number % 10; number /= 10; }
        return digits;
    }

    public static int sumOfDigits(int[] digits) {
        int sum = 0;
        for (int d : digits) sum += d;
        return sum;
    }

    public static int sumOfSquares(int[] digits) {
        int sum = 0;
        for (int d : digits) sum += (int)Math.pow(d, 2);
        return sum;
    }

    public static boolean isHarshad(int number) {
        int[] d = digitsArray(number);
        int s = sumOfDigits(d);
        if (s == 0) return false;
        return Math.abs(number) % s == 0;
    }

    // 2D array [10][2]: digit and frequency
    public static int[][] digitFrequency(int number) {
        int[] d = digitsArray(number);
        int[] freq = new int[10];
        for (int x : d) freq[x]++;
        int[][] result = new int[10][2];
        for (int i = 0; i < 10; i++) {
            result[i][0] = i;
            result[i][1] = freq[i];
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer to analyze: ");
        int number = scanner.nextInt();

        int[] digits = digitsArray(number);
        System.out.println("Digits: " + Arrays.toString(digits));
        System.out.println("Sum of digits: " + sumOfDigits(digits));
        System.out.println("Sum of squares: " + sumOfSquares(digits));
        System.out.println("Harshad? " + isHarshad(number));

        int[][] freq = digitFrequency(number);
        System.out.println("Digit Frequency (digit:count):");
        for (int i = 0; i < freq.length; i++) {
            System.out.println(freq[i][0] + ": " + freq[i][1]);
        }
        scanner.close();
    }
}
