import java.util.Scanner;

/**
 * Checks whether a number is prime.
 */
public class PrimeCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        if (number <= 1) {
            System.out.println("Not a Prime");
            input.close();
            return;
        }
        boolean isPrime = true;
        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) { isPrime = false; break; }
        }
        System.out.println(isPrime ? "Prime" : "Not a Prime");
        input.close();
    }
}
