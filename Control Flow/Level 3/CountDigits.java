import java.util.Scanner;

/**
 * Counts digits in an integer (absolute value).
 */
public class CountDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long number = input.nextLong();
        number = Math.abs(number);
        if (number == 0) {
            System.out.println(1);
            input.close();
            return;
        }
        int count = 0;
        while (number != 0) {
            number /= 10;
            count++;
        }
        System.out.println(count);
        input.close();
    }
}
