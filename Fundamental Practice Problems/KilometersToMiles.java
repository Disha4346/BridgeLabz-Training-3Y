import java.util.Scanner;

/**
 * Converts kilometers to miles using 1 km = 0.621371 miles.
 */
public class KilometersToMiles {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double km = input.nextDouble();
        double miles = km * 0.621371;
        System.out.println("Miles = " + miles);
        input.close();
    }
}
