import java.util.Scanner;

/**
 * Program: L3_CalendarDisplay
 * Task: Display a calendar for a given month and year.
 */
public class L3_CalendarDisplay {

    private static final String[] MONTHS = {
            "January","February","March","April","May","June",
            "July","August","September","October","November","December"
    };

    private static final int[] DAYS_IN_MONTH = {
            31,28,31,30,31,30,31,31,30,31,30,31
    };

    public static boolean isLeapYear(int year) {
        if (year < 1582) return false;
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static int daysInMonth(int month, int year) {
        int days = DAYS_IN_MONTH[month - 1];
        if (month == 2 && isLeapYear(year)) days = 29;
        return days;
    }

    // Zeller's congruence modified to get first day: 0=Sun..6=Sat
    public static int firstDayOfMonth(int month, int year) {
        int q = 1;
        int m = month;
        int y = year;
        if (m < 3) {
            m += 12;
            y -= 1;
        }
        int K = y % 100;
        int J = y / 100;
        int h = (q + (13 * (m + 1)) / 5 + K + (K / 4) + (J / 4) + 5 * J) % 7;
        int d = ((h + 6) % 7); // convert to 0=Sun..6=Sat
        return d;
    }

    public static void displayCalendar(int month, int year) {
        String monthName = MONTHS[month - 1];
        int days = daysInMonth(month, year);
        int first = firstDayOfMonth(month, year);

        System.out.printf("     %s %d%n", monthName, year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        for (int i = 0; i < first; i++) {
            System.out.print("    ");
        }

        for (int day = 1; day <= days; day++) {
            System.out.printf("%3d ", day);
            if ((first + day) % 7 == 0) {
                System.out.println();
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter month (1-12): ");
        int month = scanner.nextInt();
        System.out.print("Enter year: ");
        int year = scanner.nextInt();
        if (month < 1 || month > 12) {
            System.out.println("Invalid month.");
        } else {
            displayCalendar(month, year);
        }
        scanner.close();
    }
}
