import java.util.Scanner;

/**
 * Program 3 (Level 1)
 * Stores and prints multiplication table (1..10) for a given number.
 */
public class MultiplicationTableFrom1To10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number;
        while (true) {
            System.out.print("Enter an integer for the multiplication table: ");
            if (!sc.hasNextInt()) {
                System.err.println("Invalid input. Please enter an integer.");
                sc.next();
                continue;
            }
            number = sc.nextInt();
            break;
        }

        int[] table = new int[10];
        for (int i = 0; i < table.length; i++) {
            table[i] = number * (i + 1);
        }

        for (int i = 0; i < table.length; i++) {
            System.out.println(number + " * " + (i + 1) + " = " + table[i]);
        }

        sc.close();
    }
}
