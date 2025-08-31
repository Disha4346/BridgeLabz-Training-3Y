import java.util.Scanner;

/**
 * Program: L1_NumberSignChecker
 * Task: Check whether a number is positive, negative, or zero.
 */
public class L1_NumberSignChecker {

    // Returns -1 if negative, 1 if positive, 0 if zero.
    public static int signOf(int value) {
        if (value < 0) return -1;
        if (value > 0) return 1;
        return 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        int sign = signOf(number);
        if (sign < 0) System.out.println("Negative");
        else if (sign > 0) System.out.println("Positive");
        else System.out.println("Zero");
        scanner.close();
    }
}
