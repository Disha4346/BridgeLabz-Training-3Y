// Q10: Convert to lowercase manually and compare with toLowerCase()
// File: ToLowerManualCompare.java
import java.util.Scanner;

public class ToLowerManualCompare {
    public static String toLowerManual(String text) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (c >= 'A' && c <= 'Z') {
                sb.append((char)(c + 32));
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
        String manual = toLowerManual(text);
        String builtin = text.toLowerCase();
        System.out.println("Manual:  " + manual);
        System.out.println("Built-in:" + builtin);
        System.out.println("Equal? " + compare(manual, builtin));
        sc.close();
    }
}
