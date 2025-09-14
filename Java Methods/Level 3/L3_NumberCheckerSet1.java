import java.util.Arrays;
import java.util.Scanner;

/**
 * Program: L3_NumberCheckerSet1
 * Task: Static utility methods - count digits, digits array, duck, armstrong, largest & second largest, smallest & second smallest.
 * NOTE: Duck number definition used here per prompt: has a non-zero digit present (unconventional; usually duck contains '0' without leading 0).
 */
public class L3_NumberCheckerSet1 {

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

    // As per PDF description: "duck number is a number that has a non-zero digit present in it"
    public static boolean isDuckNumber(int number) {
        int[] d = digitsArray(number);
        for (int x : d) if (x != 0) return true;
        return false;
    }

    public static boolean isArmstrong(int number) {
        int[] d = digitsArray(number);
        int n = d.length;
        long sum = 0;
        for (int x : d) sum += Math.pow(x, n);
        return sum == Math.abs(number);
    }

    public static int[] largestTwo(int[] arr) {
        int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE;
        for (int v : arr) {
            if (v > first) { second = first; first = v; }
            else if (v > second) { second = v; }
        }
        return new int[]{first, second};
    }

    public static int[] smallestTwo(int[] arr) {
        int first = Integer.MAX_VALUE, second = Integer.MAX_VALUE;
        for (int v : arr) {
            if (v < first) { second = first; first = v; }
            else if (v < second) { second = v; }
        }
        return new int[]{first, second};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer to analyze: ");
        int number = scanner.nextInt();

        int[] digits = digitsArray(number);
        System.out.println("Digit count: " + digits.length);
        System.out.println("Digits: " + Arrays.toString(digits));
        System.out.println("Duck Number? " + isDuckNumber(number));
        System.out.println("Armstrong Number? " + isArmstrong(number));

        int[] largest2 = largestTwo(digits);
        int[] smallest2 = smallestTwo(digits);
        System.out.println("Largest and second largest digits: " + Arrays.toString(largest2));
        System.out.println("Smallest and second smallest digits: " + Arrays.toString(smallest2));
        scanner.close();
    }
}
