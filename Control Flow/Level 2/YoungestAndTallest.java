import java.util.Scanner;

/**
 * Finds youngest and tallest among three friends Amar, Akbar, Anthony.
 */
public class YoungestAndTallest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int ageAmar = input.nextInt();
        int ageAkbar = input.nextInt();
        int ageAnthony = input.nextInt();
        int hAmar = input.nextInt();
        int hAkbar = input.nextInt();
        int hAnthony = input.nextInt();

        // Youngest (smallest age)
        int minAge = ageAmar;
        String youngest = "Amar";
        if (ageAkbar < minAge) { minAge = ageAkbar; youngest = "Akbar"; }
        if (ageAnthony < minAge) { minAge = ageAnthony; youngest = "Anthony"; }

        // Tallest (largest height)
        int maxH = hAmar;
        String tallest = "Amar";
        if (hAkbar > maxH) { maxH = hAkbar; tallest = "Akbar"; }
        if (hAnthony > maxH) { maxH = hAnthony; tallest = "Anthony"; }

        System.out.println("Youngest: " + youngest + " (" + minAge + ")");
        System.out.println("Tallest: " + tallest + " (" + maxH + ")");
        input.close();
    }
}
