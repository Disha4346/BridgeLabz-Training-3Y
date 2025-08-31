import java.util.Arrays;
import java.util.Scanner;

/**
 * Program: L3_FootballTeamHeightsStats
 * Task: For a team of 11, generate random heights (150-250 cm), find shortest, tallest, mean.
 */
public class L3_FootballTeamHeightsStats {

    public static int[] createRandomHeights(int size, int minCm, int maxCm) {
        int[] heights = new int[size];
        for (int i = 0; i < size; i++) {
            heights[i] = (int)(Math.random() * (maxCm - minCm + 1)) + minCm;
        }
        return heights;
    }

    public static int sumArray(int[] array) {
        int sum = 0;
        for (int v : array) sum += v;
        return sum;
    }

    public static double mean(int[] array) {
        return sumArray(array) / (double) array.length;
    }

    public static int min(int[] array) {
        int m = Integer.MAX_VALUE;
        for (int v : array) if (v < m) m = v;
        return m;
    }

    public static int max(int[] array) {
        int m = Integer.MIN_VALUE;
        for (int v : array) if (v > m) m = v;
        return m;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // User input for reproducibility (optional) - size fixed 11 as per problem.
        System.out.print("Press Enter to generate 11 random heights between 150 and 250 cm...");
        scanner.nextLine();

        int[] heights = createRandomHeights(11, 150, 250);
        System.out.println("Heights: " + Arrays.toString(heights));
        System.out.println("Shortest: " + min(heights) + " cm");
        System.out.println("Tallest: " + max(heights) + " cm");
        System.out.println("Mean height: " + mean(heights) + " cm");
        scanner.close();
    }
}
