// L2-Q1: Find string length without using length(), by catching exception
// File: LengthWithoutBuiltin.java
import java.util.Scanner;

public class LengthWithoutBuiltin {
    public static int lengthWithoutLength(String text) {
        int count = 0;
        while (true) {
            try {
                text.charAt(count);
                count++;
            } catch (StringIndexOutOfBoundsException e) {
                break;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter word (no spaces): ");
        String s = sc.next();
        System.out.println("User length: " + lengthWithoutLength(s));
        System.out.println("Built-in length: " + s.length());
        sc.close();
    }
}
