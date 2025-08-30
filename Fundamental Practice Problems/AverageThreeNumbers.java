import java.util.Scanner;

/**
 * Computes average of three numbers.
 */
public class AverageThreeNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double avg = (a + b + c) / 3.0;
        System.out.println("Average = " + avg);
        input.close();
    }
}
