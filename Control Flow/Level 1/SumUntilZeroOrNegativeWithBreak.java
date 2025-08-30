import java.util.Scanner;

/**
 * Sums double numbers until the user enters 0 or a negative number, using break.
 */
public class SumUntilZeroOrNegativeWithBreak {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double total = 0.0;
        while (true) {
            double value = input.nextDouble();
            if (value <= 0.0) break;
            total += value;
        }
        System.out.println("Total = " + total);
        input.close();
    }
}
