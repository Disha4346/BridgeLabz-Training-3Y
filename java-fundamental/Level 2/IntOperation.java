package btech.third.comp;

// Program to perform integer operations and show precedence
// Operations: a + b * c, a * b + c, c + a / b, a % b + c

import java.util.Scanner;

class IntOperation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input three integers
        System.out.print("Enter value for a: ");
        int a = sc.nextInt();

        System.out.print("Enter value for b: ");
        int b = sc.nextInt();

        System.out.print("Enter value for c: ");
        int c = sc.nextInt();

        // Avoid divide by zero in expression (a / b)
        if (b == 0) {
            System.out.println("b cannot be zero for division and modulus.");
            return;
        }

        // Expressions
        int result1 = a + b * c;
        int result2 = a * b + c;
        int result3 = c + a / b;
        int result4 = a % b + c;

        // Output
        System.out.println("The Results of Int Operations are: " + result1 + ", " + result2 + ", " + result3 + ", " + result4);
    }
}
