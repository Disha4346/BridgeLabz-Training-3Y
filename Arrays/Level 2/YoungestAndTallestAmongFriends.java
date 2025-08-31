import java.util.Scanner;

/**
 * Program 2 (Level 2)
 * Finds the youngest among Amar, Akbar, Anthony and the tallest among them.
 */
public class YoungestAndTallestAmongFriends {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] names = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3];
        double[] heights = new double[3];

        for (int i = 0; i < names.length; i++) {
            // Age input
            while (true) {
                System.out.print("Enter age of " + names[i] + ": ");
                if (!sc.hasNextInt()) { System.err.println("Enter a valid whole number."); sc.next(); continue; }
                int a = sc.nextInt();
                if (a < 0 || a > 130) { System.err.println("Invalid age (0..130)."); continue; }
                ages[i] = a;
                break;
            }
            // Height input
            while (true) {
                System.out.print("Enter height (in cm) of " + names[i] + ": ");
                if (!sc.hasNextDouble()) { System.err.println("Enter a valid number."); sc.next(); continue; }
                double h = sc.nextDouble();
                if (h <= 0 || h > 300) { System.err.println("Invalid height (0..300]."); continue; }
                heights[i] = h;
                break;
            }
        }

        // Find youngest
        int minAgeIdx = 0;
        for (int i = 1; i < ages.length; i++) {
            if (ages[i] < ages[minAgeIdx]) minAgeIdx = i;
        }

        // Find tallest
        int maxHtIdx = 0;
        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > heights[maxHtIdx]) maxHtIdx = i;
        }

        System.out.println("Youngest: " + names[minAgeIdx] + " (" + ages[minAgeIdx] + " years)");
        System.out.println("Tallest: " + names[maxHtIdx] + " (" + heights[maxHtIdx] + " cm)");

        sc.close();
    }
}
