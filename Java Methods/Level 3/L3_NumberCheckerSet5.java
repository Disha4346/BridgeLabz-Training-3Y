import java.util.Scanner;

/**
 * Program: L3_NumberCheckerSet5
 * Task: perfect, abundant, deficient, strong numbers using static methods.
 */
public class L3_NumberCheckerSet5 {

    public static int sumOfProperDivisors(int number) {
        if (number <= 1) return 0;
        int sum = 1;
        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                sum += i;
                if (i != number / i) sum += number / i;
            }
        }
        return sum;
    }

    public static boolean isPerfect(int number) {
        if (number <= 0) return false;
        return sumOfProperDivisors(number) == number;
    }

    public static boolean isAbundant(int number) {
        if (number <= 0) return false;
        return sumOfProperDivisors(number) > number;
    }

    public static boolean isDeficient(int number) {
        if (number <= 0) return false;
        return sumOfProperDivisors(number) < number;
    }

    public static long factorial(int n) {
        long f = 1L;
        for (int i = 2; i <= n; i++) f *= i;
        return f;
    }

    public static boolean isStrong(int number) {
        int n = Math.abs(number);
        if (n == 0) return false;
        int temp = n;
        long sum = 0L;
        while (temp > 0) {
            int d = temp % 10;
            sum += factorial(d);
            temp /= 10;
        }
        return sum == n;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter integer: ");
        int number = scanner.nextInt();

        System.out.println("Perfect? " + isPerfect(number));
        System.out.println("Abundant? " + isAbundant(number));
        System.out.println("Deficient? " + isDeficient(number));
        System.out.println("Strong? " + isStrong(number));
        scanner.close();
    }
}
