// L2-Q6: Display each character with type (Vowel/Consonant/Not a Letter)
// File: CharacterTypeTable.java
import java.util.Scanner;

public class CharacterTypeTable {

    public static String charType(char c) {
        if (c >= 'A' && c <= 'Z') c = (char)(c + 32);
        if (c >= 'a' && c <= 'z') {
            if (c=='a'||c=='e'||c=='i'||c=='o'||c=='u') return "Vowel";
            return "Consonant";
        }
        return "Not a Letter";
    }

    public static String[][] classify(String text) {
        String[][] table = new String[text.length()][2];
        for (int i = 0; i < text.length(); i++) {
            table[i][0] = String.valueOf(text.charAt(i));
            table[i][1] = charType(text.charAt(i));
        }
        return table;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String t = sc.nextLine();
        String[][] res = classify(t);
        System.out.println("Char	Type");
        for (String[] row : res) System.out.println(row[0] + "	" + row[1]);
        sc.close();
    }
}
