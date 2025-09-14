import java.util.Arrays;
import java.util.Scanner;

/**
 * Program: L2_RandomFourDigitStats
 * Task: Generate five 4-digit random values; compute average, min, max.
 */
public class L2_RandomFourDigitStats {

    public static int[] generate4DigitRandomArray(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = (int)(Math.random() * 9000) + 1000;
        }
        return arr;
    }

    public static double[] findAverageMinMax(int[] numbers) {
        if (numbers.length == 0) return new double[]{0, 0, 0};
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        long sum = 0L;
        for (int n : numbers) {
            sum += n;
            if (n < min) min = n;
            if (n > max) max = n;
        }
        double avg = sum / (double) numbers.length;
        return new double[]{avg, min, max};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter how many 4-digit random numbers to generate (suggested 5): ");
        int size = scanner.nextInt();
        if (size <= 0) {
            System.out.println("Size must be positive.");
            scanner.close();
            return;
        }

        int[] arr = generate4DigitRandomArray(size);
        double[] stats = findAverageMinMax(arr);

        System.out.println("Generated: " + Arrays.toString(arr));
        System.out.println("Average: " + stats[0] + ", Min: " + (int)stats[1] + ", Max: " + (int)stats[2]);
        scanner.close();
    }
}
