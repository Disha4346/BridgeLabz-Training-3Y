import java.util.Scanner;

/**
 * Program: L3_EmployeeBonusCalculator
 * Task: For 10 employees, random 5-digit salary and random years of service; compute bonuses and totals.
 */
public class L3_EmployeeBonusCalculator {

    public static int[][] generateSalaryAndYears(int employees) {
        int[][] data = new int[employees][2]; // [salary, years]
        for (int i = 0; i < employees; i++) {
            int salary = (int)(Math.random() * 90000) + 10000; // 5-digit
            int years = (int)(Math.random() * 11); // 0-10 years
            data[i][0] = salary;
            data[i][1] = years;
        }
        return data;
    }

    public static double[][] computeNewSalaryAndBonus(int[][] salaryYears) {
        double[][] result = new double[salaryYears.length][2]; // [newSalary, bonus]
        for (int i = 0; i < salaryYears.length; i++) {
            int salary = salaryYears[i][0];
            int years = salaryYears[i][1];
            double rate = years > 5 ? 0.05 : 0.02;
            double bonus = salary * rate;
            double newSalary = salary + bonus;
            result[i][0] = newSalary;
            result[i][1] = bonus;
        }
        return result;
    }

    public static void displayTotals(int[][] salaryYears, double[][] newSalaryBonus) {
        long sumOld = 0;
        double sumNew = 0.0;
        double totalBonus = 0.0;
        System.out.println("Emp	OldSalary	Years	NewSalary	Bonus");
        for (int i = 0; i < salaryYears.length; i++) {
            int oldSalary = salaryYears[i][0];
            int years = salaryYears[i][1];
            double newSalary = newSalaryBonus[i][0];
            double bonus = newSalaryBonus[i][1];
            sumOld += oldSalary;
            sumNew += newSalary;
            totalBonus += bonus;
            System.out.printf("%d	%d		%d		%.2f		%.2f%n", i + 1, oldSalary, years, newSalary, bonus);
        }
        System.out.printf("Total Old Salary: %d%n", sumOld);
        System.out.printf("Total New Salary: %.2f%n", sumNew);
        System.out.printf("Total Bonus: %.2f%n", totalBonus);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Press Enter to generate 10 employees...");
        scanner.nextLine();

        int[][] salaryYears = generateSalaryAndYears(10);
        double[][] newSalaryBonus = computeNewSalaryAndBonus(salaryYears);
        displayTotals(salaryYears, newSalaryBonus);
        scanner.close();
    }
}
