import java.util.Scanner;

/**
 * Checks whether a number is a Harshad (Niven) number.
 */
public class HarshadNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int n = Math.abs(number);
        int sum = 0;
        int temp = n;
        while (temp != 0) {
            sum += (temp % 10);
            temp /= 10;
        }
        if (sum == 0) {
            System.out.println("Not a Harshad Number");
        } else {
            System.out.println((n % sum == 0) ? "Harshad Number" : "Not a Harshad Number");
        }
        input.close();
    }
}
