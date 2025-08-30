import java.util.Scanner;

/**
 * Basic calculator for two numbers performing +,-,*,/.
 */
public class BasicCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double number1 = input.nextDouble();
        double number2 = input.nextDouble();
        System.out.println("Addition = " + (number1 + number2));
        System.out.println("Subtraction = " + (number1 - number2));
        System.out.println("Multiplication = " + (number1 * number2));
        if (number2 != 0)
            System.out.println("Division = " + (number1 / number2));
        else
            System.out.println("Division by zero not allowed");
        input.close();
    }
}
