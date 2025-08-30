import java.util.Scanner;

/**
 * Computes sum of n natural numbers using while and compares with formula n(n+1)/2.
 */
public class SumNaturalNumbersWhileVsFormula {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long n = input.nextLong();
        if (n < 0) {
            System.out.println("Not a Natural number");
            input.close();
            return;
        }
        long sumWhile = 0;
        long counter = 1;
        while (counter <= n) {
            sumWhile += counter;
            counter++;
        }
        long sumFormula = n * (n + 1) / 2;
        System.out.println("While sum = " + sumWhile + ", Formula sum = " + sumFormula + 
                           ", Match = " + (sumWhile == sumFormula));
        input.close();
    }
}
