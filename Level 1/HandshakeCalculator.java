import java.util.Scanner;

/**
 * Computes max handshakes among N students using formula n*(n-1)/2.
 */
public class HandshakeCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int handshakes = n * (n - 1) / 2;
        System.out.println("Maximum handshakes = " + handshakes);
        input.close();
    }
}
