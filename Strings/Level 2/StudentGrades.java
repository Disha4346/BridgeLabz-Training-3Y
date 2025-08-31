// L2-Q10: Student marks -> total, average, percentage, grade
// File: StudentGrades.java
import java.util.*;

public class StudentGrades {

    public static int[][] randomPCM(int students) {
        int[][] pcm = new int[students][3];
        for (int i = 0; i < students; i++) {
            for (int j = 0; j < 3; j++) pcm[i][j] = 35 + (int)(Math.random() * 66); // 35..100
        }
        return pcm;
    }

    public static double round2(double v) {
        return Math.round(v * 100.0) / 100.0;
    }

    public static String gradeFromPct(double pct) {
        if (pct >= 90) return "A+";
        if (pct >= 80) return "A";
        if (pct >= 70) return "B+";
        if (pct >= 60) return "B";
        if (pct >= 50) return "C";
        if (pct >= 40) return "D";
        return "F";
    }

    public static String[][] scorecard(int[][] pcm) {
        int n = pcm.length;
        String[][] table = new String[n][7]; // P,C,M,Total,Average,Percentage,Grade
        for (int i = 0; i < n; i++) {
            int total = pcm[i][0] + pcm[i][1] + pcm[i][2];
            double avg = total / 3.0;
            double pct = (total / 300.0) * 100.0;
            table[i][0] = String.valueOf(pcm[i][0]);
            table[i][1] = String.valueOf(pcm[i][1]);
            table[i][2] = String.valueOf(pcm[i][2]);
            table[i][3] = String.valueOf(total);
            table[i][4] = String.valueOf(round2(avg));
            table[i][5] = String.valueOf(round2(pct));
            table[i][6] = gradeFromPct(pct);
        }
        return table;
    }

    public static void display(String[][] t) {
        System.out.println("P	C	M	Total	Avg	Pct	Grade");
        for (String[] r: t) {
            System.out.println(String.join("	", r));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Students count: ");
        int n = sc.nextInt();
        int[][] pcm = randomPCM(n);
        String[][] table = scorecard(pcm);
        display(table);
        sc.close();
    }
}
