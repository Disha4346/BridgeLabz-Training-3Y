// Q1: Compare two strings using charAt() vs equals()
// File: CompareStrings.java
import java.util.Scanner;

public class CompareStrings {
    // Compare two strings using charAt()
    public static boolean compareUsingCharAt(String a, String b) {
        if (a == null || b == null) return false;
        if (a.length() != b.length()) return false;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != b.charAt(i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter first string: ");
            String first = sc.next();
            System.out.print("Enter second string: ");
            String second = sc.next();

            boolean charAtEqual = compareUsingCharAt(first, second);
            boolean equalsEqual = first.equals(second);

            System.out.println("charAt() comparison: " + charAtEqual);
            System.out.println("equals() comparison: " + equalsEqual);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}
