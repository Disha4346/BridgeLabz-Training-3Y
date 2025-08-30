import java.util.Scanner;

/**
 * Prints odd/even between 1..N (Level 2).
 */
public class OddEvenUpToN_Level2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        if (number < 1) {
            System.out.println("Enter a natural number (>=1).");
            input.close();
            return;
        }
        for (int i = 1; i <= number; i++) {
            System.out.println(i + " -> " + ((i % 2 == 0) ? "even" : "odd"));
        }
        input.close();
    }
}
