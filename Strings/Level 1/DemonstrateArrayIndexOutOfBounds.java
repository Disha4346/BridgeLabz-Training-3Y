// Q8: Demonstrate ArrayIndexOutOfBoundsException
// File: DemonstrateArrayIndexOutOfBounds.java
import java.util.Scanner;

public class DemonstrateArrayIndexOutOfBounds {
    public static void generate(String[] names) {
        System.out.println(names[names.length]); // out of bounds
    }
    public static void handle(String[] names) {
        try {
            System.out.println(names[names.length]);
        } catch (ArrayIndexOutOfBoundsException aio) {
            System.out.println("Handled ArrayIndexOutOfBoundsException: " + aio.getMessage());
        } catch (RuntimeException re) {
            System.out.println("Handled RuntimeException: " + re.getMessage());
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of names: ");
        int n = sc.nextInt();
        sc.nextLine();
        String[] names = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Name " + (i+1) + ": ");
            names[i] = sc.nextLine();
        }
        // Uncomment to cause abrupt exception:
        // generate(names);
        handle(names);
        sc.close();
    }
}
