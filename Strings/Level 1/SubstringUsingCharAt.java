// Q2: Create a substring using charAt() and compare with substring()
// File: SubstringUsingCharAt.java
import java.util.Scanner;

public class SubstringUsingCharAt {

    public static String substringUsingCharAt(String text, int start, int end) {
        if (text == null) return null;
        if (start < 0 || end < 0 || start > end || start > text.length()) {
            throw new IllegalArgumentException("Invalid start/end for substring.");
        }
        StringBuilder sb = new StringBuilder();
        int safeEnd = Math.min(end, text.length());
        for (int i = start; i < safeEnd; i++) {
            sb.append(text.charAt(i));
        }
        return sb.toString();
    }

    public static boolean compareStrings(String a, String b) {
        if (a == null || b == null) return false;
        if (a.length() != b.length()) return false;
        for (int i = 0; i < a.length(); i++) if (a.charAt(i) != b.charAt(i)) return false;
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter text: ");
            String text = sc.next();
            System.out.print("Enter start index: ");
            int start = sc.nextInt();
            System.out.print("Enter end index: ");
            int end = sc.nextInt();

            String userSub = substringUsingCharAt(text, start, end);
            String builtInSub = text.substring(start, Math.min(end, text.length()));

            System.out.println("User substring: " + userSub);
            System.out.println("Built-in substring: " + builtInSub);
            System.out.println("Are equal? " + compareStrings(userSub, builtInSub));
        } catch (Exception e) {
            System.out.println("Exception: " + e);
        } finally {
            sc.close();
        }
    }
}
