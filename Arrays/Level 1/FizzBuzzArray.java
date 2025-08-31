import java.util.Scanner;

/**
 * Program 10 (Level 1)
 * FizzBuzz using a String array to save results from 0..N.
 */
public class FizzBuzzArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number;
        while (true) {
            System.out.print("Enter a positive integer N: ");
            if (!sc.hasNextInt()) {
                System.err.println("Invalid input. Enter a whole number.");
                sc.next();
                continue;
            }
            number = sc.nextInt();
            if (number < 0) {
                System.err.println("Enter a non-negative integer.");
                continue;
            }
            break;
        }

        String[] results = new String[number + 1];
        for (int i = 0; i < results.length; i++) {
            if (i == 0) {
                results[i] = "0";
            } else if (i % 3 == 0 && i % 5 == 0) {
                results[i] = "FizzBuzz";
            } else if (i % 3 == 0) {
                results[i] = "Fizz";
            } else if (i % 5 == 0) {
                results[i] = "Buzz";
            } else {
                results[i] = Integer.toString(i);
            }
        }

        for (int i = 0; i < results.length; i++) {
            System.out.println("Position " + i + " = " + results[i]);
        }

        sc.close();
    }
}
