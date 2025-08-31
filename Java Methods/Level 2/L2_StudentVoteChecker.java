import java.util.Scanner;

/**
 * Program: L2_StudentVoteChecker
 * Task: Read ages of 10 students and check voting eligibility.
 */
public class L2_StudentVoteChecker {

    public static boolean canStudentVote(int age) {
        if (age < 0) return false;
        return age >= 18;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] ages = new int[10];

        for (int i = 0; i < ages.length; i++) {
            System.out.print("Enter age of student " + (i + 1) + ": ");
            ages[i] = scanner.nextInt();
        }

        for (int i = 0; i < ages.length; i++) {
            boolean eligible = canStudentVote(ages[i]);
            System.out.println("Student " + (i + 1) + " (age " + ages[i] + "): " + (eligible ? "Can vote" : "Cannot vote"));
        }
        scanner.close();
    }
}
