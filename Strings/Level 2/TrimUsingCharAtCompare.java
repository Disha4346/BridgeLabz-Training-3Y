// L2-Q7: Trim leading and trailing spaces using charAt(), compare with trim()
// File: TrimUsingCharAtCompare.java
import java.util.Scanner;

public class TrimUsingCharAtCompare {

    public static int[] trimIndices(String text) {
        int start = 0, end = text.length() - 1;
        while (start <= end && text.charAt(start) == ' ') start++;
        while (end >= start && text.charAt(end) == ' ') end--;
        return new int[]{start, end};
    }

    public static String substringUsingCharAt(String text, int start, int end) {
        StringBuilder sb = new StringBuilder();
        for (int i = start; i <= end; i++) sb.append(text.charAt(i));
        return sb.toString();
    }

    public static boolean compare(String a, String b) {
        if (a.length() != b.length()) return false;
        for (int i = 0; i < a.length(); i++) if (a.charAt(i) != b.charAt(i)) return false;
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text with spaces: ");
        String t = sc.nextLine();
        int[] idx = trimIndices(t);
        String user = (idx[0] > idx[1]) ? "" : substringUsingCharAt(t, idx[0], idx[1]);
        String builtin = t.trim();
        System.out.println("User Trim: [" + user + "]");
        System.out.println("Built-in : [" + builtin + "]");
        System.out.println("Equal? " + compare(user, builtin));
        sc.close();
    }
}
