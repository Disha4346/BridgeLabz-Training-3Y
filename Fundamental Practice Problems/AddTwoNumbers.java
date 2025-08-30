import java.util.Scanner;

/**
 * Adds two numbers input by user.
 */
public class AddTwoNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        System.out.println("Sum = " + (a + b));
        input.close();
    }
}
