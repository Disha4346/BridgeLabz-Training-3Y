// L2-Q4: Split text and find shortest and longest words
// File: ShortestLongestWord.java
import java.util.*;

public class ShortestLongestWord {
    public static String[] splitManual(String text) {
        int n = text.length();
        java.util.List<String> words = new ArrayList<>();
        StringBuilder cur = new StringBuilder();
        for (int i = 0; i < n; i++) {
            char c = text.charAt(i);
            if (c == ' ') { words.add(cur.toString()); cur.setLength(0); }
            else cur.append(c);
        }
        words.add(cur.toString());
        return words.toArray(new String[0]);
    }

    public static int[] shortestLongest(String[] words) {
        int minIdx = 0, maxIdx = 0;
        for (int i = 1; i < words.length; i++) {
            if (words[i].length() < words[minIdx].length()) minIdx = i;
            if (words[i].length() > words[maxIdx].length()) maxIdx = i;
        }
        return new int[]{minIdx, maxIdx};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String line = sc.nextLine();
        String[] words = splitManual(line);
        int[] idx = shortestLongest(words);
        System.out.println("Shortest: " + words[idx[0]] + " (" + words[idx[0]].length() + ")");
        System.out.println("Longest:  " + words[idx[1]] + " (" + words[idx[1]].length() + ")");
        sc.close();
    }
}
