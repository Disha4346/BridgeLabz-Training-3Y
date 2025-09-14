import java.util.Arrays;
import java.util.Scanner;

/**
 * Program: L3_NumberCheckerSet3
 * Task: reverse digits array, compare arrays, palindrome, duck (per prompt), using static methods.
 */
public class L3_NumberCheckerSet3 {

    public static int[] digitsArray(int number) {
        number = Math.abs(number);
        if (number == 0) return new int[]{0};
        int temp = number, count = 0;
        while (temp > 0) { count++; temp /= 10; }
        int[] d = new int[count];
        for (int i = count - 1; i >= 0; i--) { d[i] = number % 10; number /= 10; }
        return d;
    }

    public static int[] reverse(int[] arr) {
        int[] r = new int[arr.length];
        for (int i = 0; i < arr.length; i++) r[i] = arr[arr.length - 1 - i];
        return r;
    }

    public static boolean arraysEqual(int[] a, int[] b) {
        if (a.length != b.length) return false;
        for (int i = 0; i < a.length; i++) if (a[i] != b[i]) return false;
        return true;
    }

    public static boolean isPalindrome(int number) {
        int[] d = digitsArray(number);
        int[] r = reverse(d);
        return arraysEqual(d, r);
    }

    // per prompt definition
    public static boolean isDuckNumber(int number) {
        int[] d = digitsArray(number);
        for (int x : d) if (x != 0) return true;
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter integer: ");
        int number = scanner.nextInt();

        int[] digits = digitsArray(number);
        int[] reversed = reverse(digits);

        System.out.println("Digits: " + Arrays.toString(digits));
        System.out.println("Reversed: " + Arrays.toString(reversed));
        System.out.println("Arrays equal? " + arraysEqual(digits, reversed));
        System.out.println("Palindrome? " + isPalindrome(number));
        System.out.println("Duck? " + isDuckNumber(number));
        scanner.close();
    }
}
