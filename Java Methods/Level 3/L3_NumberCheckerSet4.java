import java.util.Scanner;

/**
 * Program: L3_NumberCheckerSet4
 * Task: prime, neon, spy, automorphic, buzz checks using static methods.
 */
public class L3_NumberCheckerSet4 {

    public static boolean isPrime(int number) {
        if (number <= 1) return false;
        if (number == 2) return true;
        if (number % 2 == 0) return false;
        for (int i = 3; i * i <= number; i += 2) {
            if (number % i == 0) return false;
        }
        return true;
    }

    public static boolean isNeon(int number) {
        long square = (long) number * number;
        int sum = 0;
        long temp = Math.abs(square);
        if (temp == 0) return number == 0;
        while (temp > 0) {
            sum += (int) (temp % 10);
            temp /= 10;
        }
        return sum == Math.abs(number);
    }

    public static boolean isSpy(int number) {
        int n = Math.abs(number);
        if (n == 0) return false;
        int sum = 0, product = 1;
        while (n > 0) {
            int d = n % 10;
            sum += d;
            product *= d;
            n /= 10;
        }
        return sum == product;
    }

    public static boolean isAutomorphic(int number) {
        long square = (long) number * number;
        String nStr = String.valueOf(Math.abs(number));
        String sStr = String.valueOf(Math.abs(square));
        return sStr.endsWith(nStr);
    }

    public static boolean isBuzz(int number) {
        return number % 7 == 0 || Math.abs(number) % 10 == 7;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter integer: ");
        int number = scanner.nextInt();

        System.out.println("Prime? " + isPrime(number));
        System.out.println("Neon? " + isNeon(number));
        System.out.println("Spy? " + isSpy(number));
        System.out.println("Automorphic? " + isAutomorphic(number));
        System.out.println("Buzz? " + isBuzz(number));
        scanner.close();
    }
}
