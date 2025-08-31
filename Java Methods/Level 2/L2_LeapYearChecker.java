import java.util.Scanner;

/**
 * Program: L2_LeapYearChecker
 * Task: Check if year >= 1582 is a leap year.
 */
public class L2_LeapYearChecker {

    public static boolean isLeapYear(int year) {
        if (year < 1582) return false;
        boolean divisibleBy4 = (year % 4 == 0);
        boolean notDivisibleBy100 = (year % 100 != 0);
        boolean divisibleBy400 = (year % 400 == 0);
        return (divisibleBy4 && notDivisibleBy100) || divisibleBy400;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter year (>= 1582): ");
        int year = scanner.nextInt();
        boolean result = isLeapYear(year);
        System.out.println("Year " + year + (result ? " is" : " is not") + " a Leap Year.");
        scanner.close();
    }
}
