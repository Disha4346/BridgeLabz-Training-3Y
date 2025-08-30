import java.util.Scanner;

/**
 * Converts Celsius to Fahrenheit.
 */
public class CelsiusToFahrenheit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double c = input.nextDouble();
        double f = (c * 9/5) + 32;
        System.out.println("Fahrenheit = " + f);
        input.close();
    }
}
