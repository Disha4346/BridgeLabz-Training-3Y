import java.util.Scanner;

/**
 * Simple calculator using switch...case.
 */
public class CalculatorSwitch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double first = input.nextDouble();
        double second = input.nextDouble();
        String op = input.next();
        double result;
        switch (op) {
            case "+": result = first + second; System.out.println(result); break;
            case "-": result = first - second; System.out.println(result); break;
            case "*": result = first * second; System.out.println(result); break;
            case "/":
                if (second == 0) System.out.println("Division by zero error");
                else System.out.println(first / second);
                break;
            default: System.out.println("Invalid Operator");
        }
        input.close();
    }
}
