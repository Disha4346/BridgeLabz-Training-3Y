// L2-Q3: Split text and return words with lengths in 2D
// File: WordsWithLengths.java
import java.util.*;

public class WordsWithLengths {

    public static String[] splitManual(String text) {
        int n = text.length();
        int spaces = 0;
        for (int i = 0; i < n; i++) if (text.charAt(i) == ' ') spaces++;
        int wordsCount = spaces + 1;
        String[] res = new String[wordsCount];
        int start = 0, idx = 0;
        for (int i = 0; i <= n; i++) {
            if (i == n || text.charAt(i) == ' ') {
                res[idx++] = text.substring(start, i);
                start = i + 1;
            }
        }
        return res;
    }

    public static String[][] wordsWithLengths(String[] words) {
        String[][] table = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            table[i][0] = words[i];
            table[i][1] = String.valueOf(words[i].length());
        }
        return table;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String s = sc.nextLine();
        String[] words = splitManual(s);
        String[][] table = wordsWithLengths(words);
        System.out.println("Word	Length");
        for (String[] row : table) System.out.println(row[0] + "	" + Integer.parseInt(row[1]));
        sc.close();
    }
}
