import java.util.Scanner;

/**
 * Determines if a given (month, day) is in Spring Season: Mar 20 to Jun 20.
 */
public class SpringSeason {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int month = input.nextInt(); // 1..12
        int day = input.nextInt();   // 1..31 (roughly)
        boolean isSpring = 
            (month == 3 && day >= 20 && day <= 31) ||
            (month == 4 && day >= 1 && day <= 30) ||
            (month == 5 && day >= 1 && day <= 31) ||
            (month == 6 && day >= 1 && day <= 20);
        System.out.println(isSpring ? "Its a Spring Season" : "Not a Spring Season");
        input.close();
    }
}
