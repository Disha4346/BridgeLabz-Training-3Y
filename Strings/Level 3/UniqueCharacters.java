// L3-Q2: Unique characters using nested loops; custom length()
// File: UniqueCharacters.java
import java.util.*;

public class UniqueCharacters {
    public static int customLength(String text) {
        int i = 0;
        while (true) {
            try { text.charAt(i); i++; } catch (StringIndexOutOfBoundsException e) { break; }
        }
        return i;
    }
    public static char[] uniqueChars(String text) {
        int n = customLength(text);
        char[] temp = new char[n];
        int k = 0;
        for (int i = 0; i < n; i++) {
            char c = text.charAt(i);
            boolean seen = false;
            for (int j = 0; j < i; j++) {
                if (text.charAt(j) == c) { seen = true; break; }
            }
            if (!seen) temp[k++] = c;
        }
        char[] res = new char[k];
        for (int i = 0; i < k; i++) res[i] = temp[i];
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String t = sc.nextLine();
        char[] u = uniqueChars(t);
        System.out.println("Unique characters: " + Arrays.toString(u));
        sc.close();
    }
}
