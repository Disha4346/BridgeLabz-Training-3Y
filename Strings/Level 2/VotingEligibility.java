// L2-Q8: Random ages & voting eligibility table
// File: VotingEligibility.java
import java.util.*;

public class VotingEligibility {

    public static int[] randomAges(int n) {
        int[] ages = new int[n];
        for (int i = 0; i < n; i++) ages[i] = 10 + (int)(Math.random() * 70); // 10..79
        return ages;
    }

    public static String[][] canVoteTable(int[] ages) {
        String[][] table = new String[ages.length][2];
        for (int i = 0; i < ages.length; i++) {
            boolean valid = ages[i] >= 0;
            boolean can = valid && ages[i] >= 18;
            table[i][0] = String.valueOf(ages[i]);
            table[i][1] = String.valueOf(can);
        }
        return table;
    }

    public static void display(String[][] table) {
        System.out.println("Age	CanVote");
        for (String[] row : table) System.out.println(row[0] + "	" + row[1]);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students (default 10): ");
        int n = sc.hasNextInt() ? sc.nextInt() : 10;
        int[] ages = randomAges(n);
        String[][] table = canVoteTable(ages);
        display(table);
        sc.close();
    }
}
