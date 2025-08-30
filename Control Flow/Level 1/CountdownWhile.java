import java.util.Scanner;

/**
 * Counts down from the given number to 1 using a while loop.
 */
public class CountdownWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int counter = input.nextInt();
        while (counter >= 1) {
            System.out.println(counter);
            counter--;
        }
        input.close();
    }
}
