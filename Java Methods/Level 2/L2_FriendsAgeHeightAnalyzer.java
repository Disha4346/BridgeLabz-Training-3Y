import java.util.Scanner;

/**
 * Program: L2_FriendsAgeHeightAnalyzer
 * Task: Take ages and heights of Amar, Akbar, Anthony; find youngest and tallest.
 */
public class L2_FriendsAgeHeightAnalyzer {

    public static String findYoungest(String[] names, int[] ages) {
        int minAge = Integer.MAX_VALUE;
        int minIdx = -1;
        for (int i = 0; i < ages.length; i++) {
            if (ages[i] < minAge) { minAge = ages[i]; minIdx = i; }
        }
        return names[minIdx];
    }

    public static String findTallest(String[] names, int[] heights) {
        int maxHeight = Integer.MIN_VALUE;
        int maxIdx = -1;
        for (int i = 0; i < heights.length; i++) {
            if (heights[i] > maxHeight) { maxHeight = heights[i]; maxIdx = i; }
        }
        return names[maxIdx];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] names = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3];
        int[] heights = new int[3];

        for (int i = 0; i < 3; i++) {
            System.out.print("Enter age of " + names[i] + ": ");
            ages[i] = scanner.nextInt();
            System.out.print("Enter height (cm) of " + names[i] + ": ");
            heights[i] = scanner.nextInt();
        }

        System.out.println("Youngest: " + findYoungest(names, ages));
        System.out.println("Tallest: " + findTallest(names, heights));
        scanner.close();
    }
}
