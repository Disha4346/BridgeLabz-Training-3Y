import java.util.Scanner;

/**
 * Determines if a given year (>= 1582) is a leap year using a single logical condition.
 */
public class LeapYearLogical {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int year = input.nextInt();
        if (year >= 1582 && ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))) {
            System.out.println("Leap Year");
        } else {
            System.out.println("Not a Leap Year");
        }
        input.close();
    }
}
