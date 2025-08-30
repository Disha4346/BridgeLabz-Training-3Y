import java.util.Scanner;

/**
 * Prints all factors of a positive integer using while loop.
 */
public class FactorsWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        if (number <= 0) {
            System.out.println("Enter a positive integer.");
            input.close();
            return;
        }
        int counter = 1;
        while (counter <= number) {
            if (number % counter == 0) System.out.println(counter);
            counter++;
        }
        input.close();
    }
}
