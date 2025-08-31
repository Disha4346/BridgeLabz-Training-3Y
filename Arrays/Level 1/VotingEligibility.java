import java.util.Scanner;

/**
 * Program 1 (Level 1)
 * Takes age of 10 students into an array and prints voting eligibility (age >= 18).
 * Demonstrates: create array, access via for loop, input validation, length usage.
 */
public class VotingEligibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Declare an int array for 10 ages
        int[] ages = new int[10];

        // Input: ages with validation (non-negative, reasonable upper bound)
        for (int i = 0; i < ages.length; i++) {
            while (true) {
                System.out.print("Enter age of student " + (i + 1) + ": ");
                if (!sc.hasNextInt()) {
                    System.err.println("Invalid input. Please enter a whole number.");
                    sc.next(); // clear invalid token
                    continue;
                }
                int age = sc.nextInt();
                if (age < 0 || age > 130) {
                    System.err.println("Invalid age. Enter a value between 0 and 130.");
                    continue;
                }
                ages[i] = age;
                break;
            }
        }

        // Process & Output
        for (int i = 0; i < ages.length; i++) {
            int age = ages[i];
            if (age < 0) {
                System.out.println("Student " + (i + 1) + " has invalid age.");
            } else if (age >= 18) {
                System.out.println("Student " + (i + 1) + " with age " + age + " can vote.");
            } else {
                System.out.println("Student " + (i + 1) + " with age " + age + " cannot vote.");
            }
        }

        sc.close();
    }
}
