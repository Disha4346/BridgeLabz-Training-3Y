import java.util.Scanner;

/**
 * Program 6 (Level 1)
 * Calculates mean height of 11 football players.
 */
public class FootballTeamMeanHeight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] heights = new double[11];
        for (int i = 0; i < heights.length; i++) {
            while (true) {
                System.out.print("Enter height (in cm) for player " + (i + 1) + ": ");
                if (!sc.hasNextDouble()) {
                    System.err.println("Invalid input. Enter a number.");
                    sc.next();
                    continue;
                }
                double h = sc.nextDouble();
                if (h <= 0 || h > 300) {
                    System.err.println("Invalid height. Enter a positive value <= 300.");
                    continue;
                }
                heights[i] = h;
                break;
            }
        }

        double sum = 0.0;
        for (int i = 0; i < heights.length; i++) {
            sum += heights[i];
        }
        double mean = sum / heights.length;
        System.out.printf("Mean height of the team = %.2f cm%n", mean);

        sc.close();
    }
}
