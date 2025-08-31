// Q9: Convert to uppercase manually and compare with toUpperCase()
// File: ToUpperManualCompare.java
import java.util.Scanner;

public class ToUpperManualCompare {
    public static String toUpperManual(String text) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (c >= 'a' && c <= 'z') {
                sb.append((char)(c - 32));
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }
    public static boolean compare(String a, String b) {
        if (a.length() != b.length()) return false;
        for (int i = 0; i < a.length(); i++) if (a.charAt(i) != b.charAt(i)) return false;
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text line: ");
        String text = sc.nextLine();
        String manual = toUpperManual(text);
        String builtin = text.toUpperCase();
        System.out.println("Manual:  " + manual);
        System.out.println("Built-in:" + builtin);
        System.out.println("Equal? " + compare(manual, builtin));
        sc.close();
    }
}
