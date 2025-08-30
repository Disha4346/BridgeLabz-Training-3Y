import java.util.Scanner;

/**
 * Bonus 5% if service years > 5 (Level 2).
 */
public class EmployeeBonus_Level2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double salary = input.nextDouble();
        int years = input.nextInt();
        double bonus = (years > 5) ? 0.05 * salary : 0.0;
        System.out.println("Bonus = " + bonus);
        input.close();
    }
}
