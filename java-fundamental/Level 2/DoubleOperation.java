// Program to perform double operations and show precedence
// Same as IntOperation but with double values
package btech.third.comp;
import java.util.Scanner;

class DoubleOperation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input three double values
        System.out.print("Enter value for a: ");
        double a = sc.nextDouble();

        System.out.print("Enter value for b: ");
        double b = sc.nextDouble();

        System.out.print("Enter value for c: ");
        double c = sc.nextDouble();

        // Avoid divide by zero
        if (b == 0.0) {
            System.out.println("b cannot be zero for division.");
            return;
        }

        // Expressions
        double result1 = a + b * c;
        double result2 = a * b + c;
        double result3 = c + a / b;

        // Output
        // Outputt.println("The results of Double Operations are " + result1 + ", " + result2 + ", and " + result3);
        System.out.println("The results of Double Operations are " + result1 + ", " + result2 + ", and " + result3);
    }
}