import java.util.Scanner;

/**
 * Program: L3_StudentScoresReport
 * Task: Input number of students; generate random 2-digit PCM scores; compute total, average, percentage; display.
 */
public class L3_StudentScoresReport {

    public static int[][] generatePCMScores(int studentCount) {
        int[][] scores = new int[studentCount][3];
        for (int i = 0; i < studentCount; i++) {
            for (int j = 0; j < 3; j++) {
                scores[i][j] = (int)(Math.random() * 100); // 0..99 two-digit
            }
        }
        return scores;
    }

    // returns [][3] -> [total, averageRounded2dp, percentageRounded2dp]
    public static double[][] computeTotalsAverages(int[][] pcm) {
        double[][] result = new double[pcm.length][3];
        for (int i = 0; i < pcm.length; i++) {
            int total = pcm[i][0] + pcm[i][1] + pcm[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100.0;
            double avgRounded = Math.round(average * 100.0) / 100.0;
            double pctRounded = Math.round(percentage * 100.0) / 100.0;
            result[i][0] = total;
            result[i][1] = avgRounded;
            result[i][2] = pctRounded;
        }
        return result;
    }

    public static void displayScorecard(int[][] pcm, double[][] summary) {
        System.out.println("Idx	Phy	Chem	Math	Total	Avg	%	");
        for (int i = 0; i < pcm.length; i++) {
            System.out.printf("%d	%d	%d	%d	%.0f	%.2f	%.2f%n",
                    i + 1, pcm[i][0], pcm[i][1], pcm[i][2], summary[i][0], summary[i][1], summary[i][2]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = scanner.nextInt();
        if (n <= 0) {
            System.out.println("Invalid number of students.");
            scanner.close();
            return;
        }
        int[][] pcm = generatePCMScores(n);
        double[][] summary = computeTotalsAverages(pcm);
        displayScorecard(pcm, summary);
        scanner.close();
    }
}
