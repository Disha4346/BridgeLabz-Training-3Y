import java.util.Scanner;

/**
 * Program 2 (Level 1)
 * Takes 5 integers into an array; for each prints sign and parity (if positive).
 * Finally compares first and last elements (equal / greater / less).
 */
public class NumberAnalysisAndCompareEnds {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numbers = new int[5];

        // Input: 5 integers with validation
        for (int i = 0; i < numbers.length; i++) {
            while (true) {
                System.out.print("Enter number " + (i + 1) + ": ");
                if (!sc.hasNextInt()) {
                    System.err.println("Invalid input. Please enter an integer.");
                    sc.next();
                    continue;
                }
                numbers[i] = sc.nextInt();
                break;
            }
        }

        // Analyze each number
        for (int i = 0; i < numbers.length; i++) {
            int n = numbers[i];
            if (n > 0) {
                System.out.print("numbers[" + i + "] = " + n + " is Positive and ");
                System.out.println(n % 2 == 0 ? "Even" : "Odd");
            } else if (n < 0) {
                System.out.println("numbers[" + i + "] = " + n + " is Negative");
            } else {
                System.out.println("numbers[" + i + "] = 0 is Zero");
            }
        }

        // Compare first and last elements
        int first = numbers[0];
        int last = numbers[numbers.length - 1];
        if (first == last) {
            System.out.println("First and last elements are equal (" + first + ").");
        } else if (first > last) {
            System.out.println("First element (" + first + ") is greater than last (" + last + ").");
        } else {
            System.out.println("First element (" + first + ") is less than last (" + last + ").");
        }

        sc.close();
    }
}
