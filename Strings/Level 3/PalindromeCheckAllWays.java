// L3-Q7: Palindrome check (iterative, recursive, arrays)
// File: PalindromeCheckAllWays.java
import java.util.*;

public class PalindromeCheckAllWays {

    public static boolean isPalindromeIterative(String s) {
        int i = 0, j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) return false;
            i++; j--;
        }
        return true;
    }

    public static boolean isPalindromeRecursive(String s, int i, int j) {
        if (i >= j) return true;
        if (s.charAt(i) != s.charAt(j)) return false;
        return isPalindromeRecursive(s, i+1, j-1);
    }

    public static boolean isPalindromeUsingArrays(String s) {
        char[] orig = s.toCharArray();
        char[] rev = new char[orig.length];
        for (int i = 0; i < orig.length; i++) rev[i] = s.charAt(orig.length - 1 - i);
        for (int i = 0; i < orig.length; i++) if (orig[i] != rev[i]) return false;
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String t = sc.nextLine();
        System.out.println("Iterative: " + isPalindromeIterative(t));
        System.out.println("Recursive: " + isPalindromeRecursive(t, 0, t.length()-1));
        System.out.println("Arrays   : " + isPalindromeUsingArrays(t));
        sc.close();
    }
}
