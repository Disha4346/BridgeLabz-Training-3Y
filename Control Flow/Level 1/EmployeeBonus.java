import java.util.Scanner;

/**
 * Computes 5% bonus if years of service > 5.
 */
public class EmployeeBonus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double salary = input.nextDouble();
        int years = input.nextInt();
        if (years > 5) {
            System.out.println("Bonus = " + (0.05 * salary));
        } else {
            System.out.println("Bonus = 0.0");
        }
        input.close();
    }
}
