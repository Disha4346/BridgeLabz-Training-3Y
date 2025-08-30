import java.util.Scanner;

/**
 * Reads marks of Physics, Chemistry, Maths; computes percentage and prints grade & remarks.
 * (Simple rubric used when not specified.)
 */
public class MarksPercentageGrade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double physics = input.nextDouble();
        double chemistry = input.nextDouble();
        double maths = input.nextDouble();
        double total = physics + chemistry + maths;
        double percentage = total / 3.0;

        String grade;
        String remarks;
        if (percentage >= 90) { grade = "A+"; remarks = "Outstanding"; }
        else if (percentage >= 80) { grade = "A"; remarks = "Excellent"; }
        else if (percentage >= 70) { grade = "B"; remarks = "Good"; }
        else if (percentage >= 60) { grade = "C"; remarks = "Satisfactory"; }
        else if (percentage >= 50) { grade = "D"; remarks = "Needs Improvement"; }
        else { grade = "F"; remarks = "Fail"; }

        System.out.println("Average = " + percentage + "%, Grade = " + grade + ", Remarks = " + remarks);
        input.close();
    }
}
