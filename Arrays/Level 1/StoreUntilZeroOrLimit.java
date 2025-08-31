import java.util.Scanner;

/**
 * Program 4 (Level 1)
 * Stores up to 10 positive numbers or until user enters 0/negative, then prints sum.
 */
public class StoreUntilZeroOrLimit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] values = new double[10];
        int index = 0;

        // Infinite-like loop with two stop conditions
        while (true) {
            System.out.print("Enter a positive number (0 or negative to stop): ");
            if (!sc.hasNextDouble()) {
                System.err.println("Invalid input. Please enter a number.");
                sc.next();
                continue;
            }
            double val = sc.nextDouble();
            if (val <= 0) {
                break;
            }
            if (index == values.length) {
                System.out.println("Reached maximum capacity of 10 values.");
                break;
            }
            values[index++] = val;
        }

        double total = 0.0;
        for (int i = 0; i < index; i++) {
            total += values[i];
        }

        System.out.print("You entered: ");
        for (int i = 0; i < index; i++) {
            System.out.print(values[i] + (i < index - 1 ? ", " : ""));
        }
        System.out.println();
        System.out.println("Total = " + total);

        sc.close();
    }
}
