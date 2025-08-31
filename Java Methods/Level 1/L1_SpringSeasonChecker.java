import java.util.Scanner;

/**
 * Program: L1_SpringSeasonChecker
 * Task: Given month and day, print whether it is Spring Season (Mar 20 to Jun 20).
 */
public class L1_SpringSeasonChecker {

    // Returns true if date is between March 20 and June 20 inclusive.
    public static boolean isSpringSeason(int month, int day) {
        // Months: 1=Jan ... 12=Dec
        if (month < 1 || month > 12 || day < 1 || day > 31) return false;

        // Mar 20..31
        if (month == 3 && day >= 20 && day <= 31) return true;
        // Apr full
        if (month == 4 && day >= 1 && day <= 30) return true;
        // May full
        if (month == 5 && day >= 1 && day <= 31) return true;
        // Jun 1..20
        if (month == 6 && day >= 1 && day <= 20) return true;
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter month (1-12): ");
        int month = scanner.nextInt();
        System.out.print("Enter day (1-31): ");
        int day = scanner.nextInt();

        boolean spring = isSpringSeason(month, day);
        System.out.println(spring ? "It's a Spring Season" : "Not a Spring Season");
        scanner.close();
    }
}
