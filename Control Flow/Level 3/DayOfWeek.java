import java.util.Scanner;

/**
 * Computes day of week (0=Sunday..6=Saturday) for a given date using Zeller's congruence (Gregorian).
 */
public class DayOfWeek {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int m = input.nextInt(); // month (1=Jan,...,12=Dec)
        int d = input.nextInt(); // day
        int y = input.nextInt(); // year
        // Adjust months for Zeller: March=3..January=13, February=14 of previous year
        if (m < 3) {
            m += 12;
            y -= 1;
        }
        int K = y % 100;      // year of the century
        int J = y / 100;      // zero-based century
        int h = (d + (13*(m + 1))/5 + K + K/4 + J/4 + (5*J)) % 7;
        // h=0->Saturday,1->Sunday,...,6->Friday. Convert to 0=Sunday..6=Saturday
        int dow = (h + 6) % 7;
        System.out.println(dow);
        input.close();
    }
}
