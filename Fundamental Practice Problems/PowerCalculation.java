import java.util.Scanner;

/**
 * Computes base^exponent using Math.pow.
 */
public class PowerCalculation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double base = input.nextDouble();
        double exponent = input.nextDouble();
        double result = Math.pow(base, exponent);
        System.out.println("Result = " + result);
        input.close();
    }
}
