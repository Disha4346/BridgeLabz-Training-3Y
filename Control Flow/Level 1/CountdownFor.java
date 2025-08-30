import java.util.Scanner;

/**
 * Counts down from the given number to 1 using a for loop.
 */
public class CountdownFor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for (int i = n; i >= 1; i--) {
            System.out.println(i);
        }
        input.close();
    }
}
