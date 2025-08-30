import java.util.Scanner;

/**
 * Computes sum of n natural numbers using for and compares with formula n(n+1)/2.
 */
public class SumNaturalNumbersForVsFormula {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long n = input.nextLong();
        if (n < 0) {
            System.out.println("Not a Natural number");
            input.close();
            return;
        }
        long sumFor = 0;
        for (long i = 1; i <= n; i++) sumFor += i;
        long sumFormula = n * (n + 1) / 2;
        System.out.println("For sum = " + sumFor + ", Formula sum = " + sumFormula + 
                           ", Match = " + (sumFor == sumFormula));
        input.close();
    }
}
