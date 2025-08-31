// L3-Q5: Frequency using unique characters helper
// File: CharFrequencyUsingUniques.java
import java.util.*;

public class CharFrequencyUsingUniques {

    public static char[] uniqueChars(String text) {
        char[] temp = new char[text.length()];
        int k = 0;
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            boolean seen = false;
            for (int j = 0; j < i; j++) if (text.charAt(j) == c) { seen = true; break; }
            if (!seen) temp[k++] = c;
        }
        char[] res = new char[k];
        for (int i = 0; i < k; i++) res[i] = temp[i];
        return res;
    }

    public static String[][] frequencyUsingUniques(String text) {
        int[] freq = new int[256];
        for (int i = 0; i < text.length(); i++) freq[text.charAt(i) & 0xFF]++;
        char[] uniq = uniqueChars(text);
        String[][] table = new String[uniq.length][2];
        for (int i = 0; i < uniq.length; i++) {
            table[i][0] = String.valueOf(uniq[i]);
            table[i][1] = String.valueOf(freq[uniq[i] & 0xFF]);
        }
        return table;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String t = sc.nextLine();
        String[][] tab = frequencyUsingUniques(t);
        System.out.println("Char	Freq");
        for (String[] r : tab) System.out.println(r[0] + "	" + r[1]);
        sc.close();
    }
}
