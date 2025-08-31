// L3-Q6: Frequency using nested loops & toCharArray(), mark duplicates '0'
// File: CharFrequencyNestedLoops.java
import java.util.*;

public class CharFrequencyNestedLoops {

    public static String[] frequencyNested(String text) {
        char[] arr = text.toCharArray();
        int[] freq = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == '0') continue;
            freq[i] = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] == arr[i]) {
                    freq[i]++;
                    arr[j] = '0'; // mark duplicate
                }
            }
        }
        // Count non-zero entries
        int count = 0;
        for (int i = 0; i < arr.length; i++) if (arr[i] != '0') count++;
        String[] out = new String[count];
        int k = 0;
        for (int i = 0; i < arr.length; i++) if (arr[i] != '0') {
            out[k++] = arr[i] + ":" + freq[i];
        }
        return out;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String t = sc.nextLine();
        String[] res = frequencyNested(t);
        System.out.println("Char:Freq");
        for (String s : res) System.out.println(s);
        sc.close();
    }
}
