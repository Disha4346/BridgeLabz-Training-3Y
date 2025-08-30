import java.util.Scanner;

/**
 * Checks if the first number is the smallest among three numbers.
 */
public class FirstIsSmallest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        int number3 = input.nextInt();
        boolean isSmallest = number1 <= number2 && number1 <= number3;
        System.out.println("Is the first number the smallest? " + isSmallest);
        input.close();
    }
}
