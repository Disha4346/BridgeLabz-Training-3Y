import java.util.Scanner;

/**
 * Program 5 (Level 1)
 * Stores and prints multiplication table for given number from 6 to 9.
 */
public class MultiplicationTable6To9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number;
        while (true) {
            System.out.print("Enter an integer for the multiplication table (6..9): ");
            if (!sc.hasNextInt()) {
                System.err.println("Invalid input. Please enter an integer.");
                sc.next();
                continue;
            }
            number = sc.nextInt();
            break;
        }

        int[] results = new int[4]; // for 6,7,8,9
        for (int i = 0; i < results.length; i++) {
            results[i] = number * (i + 6);
        }

        for (int i = 0; i < results.length; i++) {
            System.out.println(number + " * " + (i + 6) + " = " + results[i]);
        }

        sc.close();
    }
}
