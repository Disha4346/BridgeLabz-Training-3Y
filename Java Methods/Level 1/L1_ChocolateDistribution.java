import java.util.Scanner;

/**
 * Program: L1_ChocolateDistribution
 * Task: Divide chocolates among children; print each share and remaining.
 */
public class L1_ChocolateDistribution {

    // Returns array [remainder, quotient]
    public static int[] findRemainderAndQuotient(int number, int divisor) {
        int quotient = number / divisor;
        int remainder = number % divisor;
        return new int[] { remainder, quotient };
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of chocolates: ");
        int numberOfChocolates = scanner.nextInt();
        System.out.print("Enter number of children: ");
        int numberOfChildren = scanner.nextInt();

        if (numberOfChildren <= 0) {
            System.out.println("Number of children must be greater than zero.");
        } else {
            int[] result = findRemainderAndQuotient(numberOfChocolates, numberOfChildren);
            int remainingChocolates = result[0];
            int eachChildGets = result[1];
            System.out.println("Each child gets: " + eachChildGets + " chocolates");
            System.out.println("Remaining chocolates: " + remainingChocolates);
        }
        scanner.close();
    }
}
