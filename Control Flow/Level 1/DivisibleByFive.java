import java.util.Scanner;

/**
 * Checks if a number is divisible by 5.
 */
public class DivisibleByFive {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Read user input
        int number = input.nextInt();
        // Check divisibility
        boolean divisible = (number % 5 == 0);
        // Display result
        System.out.println("Is the number " + number + " divisible by 5? " + divisible);
        input.close();
    }
}
