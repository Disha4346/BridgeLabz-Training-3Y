import java.util.Scanner;

/**
 * Checks whether a number is an Armstrong number (sum of cubes of digits equals number).
 * (Classic 3-digit Armstrong, as in 153 = 1^3 + 5^3 + 3^3)
 */
public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int original = number;
        int sum = 0;
        while (number != 0) {
            int d = number % 10;
            sum += d * d * d;
            number /= 10;
        }
        System.out.println((sum == original) ? "Armstrong Number" : "Not an Armstrong Number");
        input.close();
    }
}
