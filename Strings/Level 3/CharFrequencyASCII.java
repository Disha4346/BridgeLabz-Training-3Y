// L3-Q4: Frequency of characters using ASCII array; return 2D
// File: CharFrequencyASCII.java
import java.util.*;

public class CharFrequencyASCII {
    public static String[][] frequencyTable(String text) {
        int[] freq = new int[256];
        for (int i = 0; i < text.length(); i++) freq[text.charAt(i) & 0xFF]++;
        int count = 0;
        for (int f : freq) if (f > 0) count++;
        String[][] table = new String[count][2];
        int k = 0;
        for (int i = 0; i < 256; i++) if (freq[i] > 0) {
            table[k][0] = String.valueOf((char)i);
            table[k][1] = String.valueOf(freq[i]);
            k++;
        }
        return table;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String t = sc.nextLine();
        String[][] tab = frequencyTable(t);
        System.out.println("Char	Freq");
        for (String[] r : tab) System.out.println(r[0] + "	" + r[1]);
        sc.close();
    }
}
