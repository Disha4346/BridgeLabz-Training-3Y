import java.util.Scanner;

/**
 * Program 8 (Level 1)
 * Stores the factors of a number in a dynamically resized array and prints them.
 */
public class FactorsOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number;
        while (true) {
            System.out.print("Enter a positive integer: ");
            if (!sc.hasNextInt()) {
                System.err.println("Invalid input. Enter a whole number.");
                sc.next();
                continue;
            }
            number = sc.nextInt();
            if (number <= 0) {
                System.err.println("Enter a positive integer greater than 0.");
                continue;
            }
            break;
        }

        int maxFactor = 10;
        int[] factors = new int[maxFactor];
        int index = 0;

        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                if (index == maxFactor) {
                    // Grow array
                    int newMax = maxFactor * 2;
                    int[] tmp = new int[newMax];
                    for (int j = 0; j < maxFactor; j++) tmp[j] = factors[j];
                    factors = tmp;
                    maxFactor = newMax;
                }
                factors[index++] = i;
            }
        }

        System.out.print("Factors of " + number + ": ");
        for (int i = 0; i < index; i++) {
            System.out.print(factors[i] + (i < index - 1 ? ", " : ""));
        }
        System.out.println();

        sc.close();
    }
}
