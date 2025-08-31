// L2-Q5: Count vowels and consonants
// File: VowelConsonantCount.java
import java.util.Scanner;

public class VowelConsonantCount {

    public static String charType(char c) {
        if (c >= 'A' && c <= 'Z') c = (char)(c + 32);
        if (c >= 'a' && c <= 'z') {
            if (c=='a'||c=='e'||c=='i'||c=='o'||c=='u') return "Vowel";
            return "Consonant";
        }
        return "Not a Letter";
    }

    public static int[] countVC(String text) {
        int v = 0, c = 0;
        for (int i = 0; i < text.length(); i++) {
            String type = charType(text.charAt(i));
            if ("Vowel".equals(type)) v++;
            else if ("Consonant".equals(type)) c++;
        }
        return new int[]{v, c};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String t = sc.nextLine();
        int[] res = countVC(t);
        System.out.println("Vowels: " + res[0] + ", Consonants: " + res[1]);
        sc.close();
    }
}
