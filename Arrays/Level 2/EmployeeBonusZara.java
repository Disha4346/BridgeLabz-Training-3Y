import java.util.Scanner;

/**
 * Program 1 (Level 2)
 * Calculates bonus for 10 employees at Zara based on years of service and salary.
 *  - 5% if years > 5, else 2%.
 * Prints total bonus payout, total old salary, and total new salary.
 */
public class EmployeeBonusZara {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int EMP_COUNT = 10;
        double[] salaries = new double[EMP_COUNT];
        double[] years = new double[EMP_COUNT];
        double[] bonus = new double[EMP_COUNT];
        double[] newSalary = new double[EMP_COUNT];

        // Input with validation; repeat on invalid
        for (int i = 0; i < EMP_COUNT; i++) {
            // Salary
            while (true) {
                System.out.print("Enter salary for employee " + (i + 1) + ": ");
                if (!sc.hasNextDouble()) { System.err.println("Enter a valid number."); sc.next(); continue; }
                double s = sc.nextDouble();
                if (s <= 0) { System.err.println("Salary must be positive."); continue; }
                salaries[i] = s;
                break;
            }
            // Years of service
            while (true) {
                System.out.print("Enter years of service for employee " + (i + 1) + ": ");
                if (!sc.hasNextDouble()) { System.err.println("Enter a valid number."); sc.next(); continue; }
                double y = sc.nextDouble();
                if (y < 0) { System.err.println("Years cannot be negative."); continue; }
                years[i] = y;
                break;
            }
        }

        double totalBonus = 0.0, totalOld = 0.0, totalNew = 0.0;
        for (int i = 0; i < EMP_COUNT; i++) {
            double rate = years[i] > 5.0 ? 0.05 : 0.02;
            bonus[i] = salaries[i] * rate;
            newSalary[i] = salaries[i] + bonus[i];
            totalBonus += bonus[i];
            totalOld += salaries[i];
            totalNew += newSalary[i];
        }

        System.out.printf("Total Bonus Payout: %.2f%n", totalBonus);
        System.out.printf("Total Old Salary: %.2f%n", totalOld);
        System.out.printf("Total New Salary: %.2f%n", totalNew);

        sc.close();
    }
}
