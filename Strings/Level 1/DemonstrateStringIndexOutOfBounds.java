// Q5: Demonstrate StringIndexOutOfBoundsException (generate and handle)
// File: DemonstrateStringIndexOutOfBounds.java
import java.util.Scanner;

public class DemonstrateStringIndexOutOfBounds {
    public static void generateException(String text) {
        // Accessing beyond length
        System.out.println(text.charAt(text.length())); // always out of bounds
    }
    public static void handleException(String text) {
        try {
            System.out.println(text.charAt(text.length()));
        } catch (StringIndexOutOfBoundsException sie) {
            System.out.println("Handled StringIndexOutOfBoundsException: " + sie.getMessage());
        } catch (RuntimeException re) {
            System.out.println("Handled RuntimeException: " + re.getMessage());
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.nextLine();
        // Uncomment to generate abrupt stop:
        // generateException(text);
        handleException(text);
        sc.close();
    }
}
