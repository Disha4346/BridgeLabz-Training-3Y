import java.util.Scanner;

/**
 * Prints multiplication table of a number for 6..9.
 */
public class MultiplicationTable6to9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        for (int i = 6; i <= 9; i++) {
            System.out.println(number + " * " + i + " = " + (number * i));
        }
        input.close();
    }
}
