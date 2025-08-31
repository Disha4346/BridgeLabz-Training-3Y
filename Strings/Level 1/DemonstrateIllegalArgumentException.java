// Q6: Demonstrate IllegalArgumentException via substring(start>end)
// File: DemonstrateIllegalArgumentException.java
import java.util.Scanner;

public class DemonstrateIllegalArgumentException {
    public static void generate(String text, int start, int end) {
        // This will throw if start > end
        System.out.println(text.substring(start, end));
    }
    public static void handle(String text, int start, int end) {
        try {
            System.out.println(text.substring(start, end));
        } catch (IllegalArgumentException iae) {
            System.out.println("Handled IllegalArgumentException: " + iae.getMessage());
        } catch (RuntimeException re) {
            System.out.println("Handled RuntimeException: " + re.getMessage());
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.next();
        System.out.print("Enter start index: ");
        int s = sc.nextInt();
        System.out.print("Enter end index: ");
        int e = sc.nextInt();
        // Uncomment to see abrupt termination:
        // generate(text, e, s); // purposely reversed
        handle(text, e, s); // reversed intentionally to trigger handling
        sc.close();
    }
}
