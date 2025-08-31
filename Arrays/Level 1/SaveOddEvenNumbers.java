import java.util.Scanner;

/**
 * Program 7 (Level 1)
 * Saves odd and even numbers between 1 and N into separate arrays and prints them.
 */
public class SaveOddEvenNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number;
        while (true) {
            System.out.print("Enter a natural number N: ");
            if (!sc.hasNextInt()) {
                System.err.println("Invalid input. Enter a whole number.");
                sc.next();
                continue;
            }
            number = sc.nextInt();
            if (number <= 0) {
                System.err.println("Not a natural number. Exiting.");
                sc.close();
                return;
            }
            break;
        }

        int size = number / 2 + 1;
        int[] evens = new int[size];
        int[] odds = new int[size];
        int ei = 0, oi = 0;

        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) {
                evens[ei++] = i;
            } else {
                odds[oi++] = i;
            }
        }

        System.out.print("Odd numbers: ");
        for (int i = 0; i < oi; i++) {
            System.out.print(odds[i] + (i < oi - 1 ? ", " : ""));
        }
        System.out.println();
        System.out.print("Even numbers: ");
        for (int i = 0; i < ei; i++) {
            System.out.print(evens[i] + (i < ei - 1 ? ", " : ""));
        }
        System.out.println();

        sc.close();
    }
}
