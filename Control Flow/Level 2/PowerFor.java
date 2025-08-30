import java.util.Scanner;

/**
 * Computes number^power using a for loop.
 */
public class PowerFor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long number = input.nextLong();
        long power = input.nextLong();
        if (power < 0) {
            System.out.println("Power must be non-negative for this simple loop-based version.");
            input.close();
            return;
        }
        long result = 1;
        for (long i = 1; i <= power; i++) result *= number;
        System.out.println(number + "^" + power + " = " + result);
        input.close();
    }
}
