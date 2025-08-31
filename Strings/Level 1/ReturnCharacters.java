// Q3: Return all characters using charAt() and compare with toCharArray()
// File: ReturnCharacters.java
import java.util.*;

public class ReturnCharacters {
    public static char[] charsUsingCharAt(String text) {
        char[] out = new char[text.length()];
        for (int i = 0; i < text.length(); i++) out[i] = text.charAt(i);
        return out;
    }
    public static boolean compare(char[] a, char[] b) {
        if (a.length != b.length) return false;
        for (int i = 0; i < a.length; i++) if (a[i] != b[i]) return false;
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.next();
        char[] user = charsUsingCharAt(text);
        char[] builtin = text.toCharArray();
        System.out.println("Arrays equal? " + compare(user, builtin));
        System.out.println("User array: " + Arrays.toString(user));
        System.out.println("Built-in:    " + Arrays.toString(builtin));
        sc.close();
    }
}
