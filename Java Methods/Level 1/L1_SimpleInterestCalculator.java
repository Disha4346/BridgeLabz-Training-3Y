import java.util.Scanner;

/**
 * Program: L1_SimpleInterestCalculator
 * Task: Input Principal, Rate, and Time; calculate Simple Interest using a method.
 * Best Practices: variables for all values, clear names, comments.
 */
public class L1_SimpleInterestCalculator {

    // Calculates simple interest given principal, rate, and time.
    public static double calculateSimpleInterest(double principal, double ratePercent, double timeYears) {
        double simpleInterest = (principal * ratePercent * timeYears) / 100.0;
        return simpleInterest;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Principal amount: ");
        double principal = scanner.nextDouble();

        System.out.print("Enter Rate of Interest (in % per annum): ");
        double ratePercent = scanner.nextDouble();

        System.out.print("Enter Time (in years): ");
        double timeYears = scanner.nextDouble();

        double simpleInterest = calculateSimpleInterest(principal, ratePercent, timeYears);

        System.out.println("The Simple Interest is " + simpleInterest +
                " for Principal " + principal + ", Rate of Interest " + ratePercent + " and Time " + timeYears + " years.");
        scanner.close();
    }
}
