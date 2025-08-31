// L2-Q2: Split text into words using charAt() and compare with split()
// File: SplitTextCompare.java
import java.util.*;

public class SplitTextCompare {

    public static int lengthWithoutLength(String text) {
        int count = 0;
        while (true) {
            try { text.charAt(count); count++; }
            catch (StringIndexOutOfBoundsException e) { break; }
        }
        return count;
    }

    public static String[] splitManual(String text) {
        int n = lengthWithoutLength(text);
        int spaces = 0;
        for (int i = 0; i < n; i++) if (text.charAt(i) == ' ') spaces++;
        int wordsCount = spaces + 1;
        int[] spaceIdx = new int[wordsCount - 1];
        int si = 0;
        for (int i = 0; i < n; i++) if (text.charAt(i) == ' ') spaceIdx[si++] = i;
        String[] out = new String[wordsCount];
        int start = 0; si = 0;
        for (int w = 0; w < wordsCount; w++) {
            int end = (w == wordsCount - 1) ? n : spaceIdx[si++];
            StringBuilder sb = new StringBuilder();
            for (int i = start; i < end; i++) sb.append(text.charAt(i));
            out[w] = sb.toString();
            start = end + 1;
        }
        return out;
    }

    public static boolean arraysEqual(String[] a, String[] b) {
        if (a.length != b.length) return false;
        for (int i = 0; i < a.length; i++) if (!a[i].equals(b[i])) return false;
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String line = sc.nextLine();
        String[] manual = splitManual(line);
        String[] builtin = line.split(" ");
        System.out.println("Equal? " + arraysEqual(manual, builtin));
        System.out.println("Manual: " + Arrays.toString(manual));
        System.out.println("Built-in: " + Arrays.toString(builtin));
        sc.close();
    }
}
