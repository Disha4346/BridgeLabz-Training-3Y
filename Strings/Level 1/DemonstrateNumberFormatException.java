// Q7: Demonstrate NumberFormatException using Integer.parseInt on non-number
// File: DemonstrateNumberFormatException.java
import java.util.Scanner;

public class DemonstrateNumberFormatException {
    public static void generate(String text) {
        int val = Integer.parseInt(text); // may throw
        System.out.println("Parsed value: " + val);
    }
    public static void handle(String text) {
        try {
            int val = Integer.parseInt(text);
            System.out.println("Parsed value: " + val);
        } catch (NumberFormatException nfe) {
            System.out.println("Handled NumberFormatException: " + nfe.getMessage());
        } catch (RuntimeException re) {
            System.out.println("Handled RuntimeException: " + re.getMessage());
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a text (number or not): ");
        String text = sc.nextLine();
        // Uncomment to see abrupt termination:
        // generate(text);
        handle(text);
        sc.close();
    }
}
