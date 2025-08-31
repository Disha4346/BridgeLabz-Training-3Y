import java.util.Arrays;
import java.util.Scanner;

/**
 * Program: L3_FactorsAdvanced
 * Task: Find factors array; greatest factor; sum, product; product of cubes.
 */
public class L3_FactorsAdvanced {

    public static int[] factors(int number) {
        if (number <= 0) return new int[]{};
        int count = 0;
        for (int i = 1; i <= number; i++) if (number % i == 0) count++;
        int[] f = new int[count];
        int idx = 0;
        for (int i = 1; i <= number; i++) if (number % i == 0) f[idx++] = i;
        return f;
    }

    public static int greatestFactor(int[] factors) {
        if (factors.length == 0) return 0;
        return factors[factors.length - 1];
    }

    public static long sum(int[] array) {
        long s = 0; for (int v : array) s += v; return s;
    }

    public static long product(int[] array) {
        long p = 1; for (int v : array) p *= v; return p;
    }

    public static long productOfCubes(int[] array) {
        long p = 1;
        for (int v : array) {
            long cube = (long) Math.pow(v, 3);
            p *= cube;
        }
        return p;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();
        int[] f = factors(number);

        System.out.println("Factors: " + Arrays.toString(f));
        System.out.println("Greatest factor: " + greatestFactor(f));
        System.out.println("Sum of factors: " + sum(f));
        System.out.println("Product of factors: " + product(f));
        System.out.println("Product of cubes of factors: " + productOfCubes(f));
        scanner.close();
    }
}
