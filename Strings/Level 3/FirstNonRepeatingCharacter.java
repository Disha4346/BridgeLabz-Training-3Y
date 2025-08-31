// L3-Q3: First non-repeating character using ASCII frequency
// File: FirstNonRepeatingCharacter.java
import java.util.Scanner;

public class FirstNonRepeatingCharacter {
    public static Character firstNonRepeat(String text) {
        int[] freq = new int[256];
        for (int i = 0; i < text.length(); i++) freq[text.charAt(i) & 0xFF]++;
        for (int i = 0; i < text.length(); i++) if (freq[text.charAt(i) & 0xFF] == 1) return text.charAt(i);
        return null;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String t = sc.nextLine();
        Character c = firstNonRepeat(t);
        System.out.println(c == null ? "No non-repeating character." : "First non-repeating: " + c);
        sc.close();
    }
}
