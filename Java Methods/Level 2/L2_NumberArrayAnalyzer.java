import java.util.Scanner;

/**
 * Program: L2_NumberArrayAnalyzer
 * Task: Read 5 numbers; positive/negative check; even/odd for positives; compare first and last.
 */
public class L2_NumberArrayAnalyzer {

    public static boolean isPositive(int number) {
        return number >= 0;
    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    // returns 1 if a>b, 0 if equal, -1 if a<b
    public static int compare(int a, int b) {
        if (a > b) return 1;
        if (a == b) return 0;
        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter integer " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        for (int i = 0; i < numbers.length; i++) {
            if (isPositive(numbers[i])) {
                System.out.print(numbers[i] + " is Positive; ");
                System.out.println(isEven(numbers[i]) ? "Even" : "Odd");
            } else {
                System.out.println(numbers[i] + " is Negative");
            }
        }

        int cmp = compare(numbers[0], numbers[numbers.length - 1]);
        if (cmp == 0) System.out.println("First and last elements are equal.");
        else if (cmp > 0) System.out.println("First element is greater than last element.");
        else System.out.println("First element is less than last element.");
        scanner.close();
    }
}
