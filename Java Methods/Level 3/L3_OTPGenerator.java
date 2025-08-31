import java.util.Arrays;
import java.util.Scanner;

/**
 * Program: L3_OTPGenerator
 * Task: Generate 10 six-digit OTPs; ensure not all are identical (basic uniqueness check).
 */
public class L3_OTPGenerator {

    public static int generateSixDigitOTP() {
        return (int)(Math.random() * 900000) + 100000;
    }

    public static boolean allUnique(int[] otps) {
        for (int i = 0; i < otps.length; i++) {
            for (int j = i + 1; j < otps.length; j++) {
                if (otps[i] == otps[j]) return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Press Enter to generate 10 OTPs...");
        scanner.nextLine();

        int[] otps = new int[10];
        for (int i = 0; i < 10; i++) otps[i] = generateSixDigitOTP();

        System.out.println("Generated OTPs: " + Arrays.toString(otps));
        boolean unique = allUnique(otps);
        System.out.println("All OTPs are unique? " + unique);
        scanner.close();
    }
}
