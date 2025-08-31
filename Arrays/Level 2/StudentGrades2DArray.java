import java.util.Scanner;

/**
 * Program 9 (Level 2)
 * Uses a 2D array to store marks for 3 subjects per student, then computes % and grade.
 */
public class StudentGrades2DArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number;
        while (true) {
            System.out.print("Enter number of students (>0): ");
            if (!sc.hasNextInt()) { System.err.println("Enter integer."); sc.next(); continue; }
            number = sc.nextInt();
            if (number <= 0) { System.err.println("Must be > 0."); continue; }
            break;
        }

        int[][] marks = new int[number][3]; // [phy, chem, math]
        double[] pct = new double[number];
        char[] grade = new char[number];

        for (int i = 0; i < number; i++) {
            marks[i][0] = readMark(sc, "Physics", i);
            marks[i][1] = readMark(sc, "Chemistry", i);
            marks[i][2] = readMark(sc, "Maths", i);
            pct[i] = (marks[i][0] + marks[i][1] + marks[i][2]) / 3.0;
            grade[i] = gradeFromPercentage(pct[i]);
        }

        System.out.println("Physics\tChemistry\tMaths\t%\tGrade");
        for (int i = 0; i < number; i++) {
            System.out.printf("%d\t\t%d\t\t%d\t%.2f\t%c%n",
                    marks[i][0], marks[i][1], marks[i][2], pct[i], grade[i]);
        }

        sc.close();
    }

    private static int readMark(Scanner sc, String subject, int idx) {
        while (true) {
            System.out.print("Enter " + subject + " marks for student " + (idx + 1) + " (0..100): ");
            if (!sc.hasNextInt()) { System.err.println("Enter integer 0..100."); sc.next(); continue; }
            int m = sc.nextInt();
            if (m < 0 || m > 100) { System.err.println("Marks out of range 0..100."); continue; }
            return m;
        }
    }

    private static char gradeFromPercentage(double p) {
        if (p >= 90) return 'A';
        if (p >= 75) return 'B';
        if (p >= 60) return 'C';
        if (p >= 40) return 'D';
        return 'F';
    }
}
