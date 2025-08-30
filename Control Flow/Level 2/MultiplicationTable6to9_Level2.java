import java.util.Scanner;

/**
 * Multiplication table from 6..9 (Level 2).
 */
public class MultiplicationTable6to9_Level2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        for (int i = 6; i <= 9; i++) {
            System.out.println(number + " * " + i + " = " + (number * i));
        }
        input.close();
    }
}
