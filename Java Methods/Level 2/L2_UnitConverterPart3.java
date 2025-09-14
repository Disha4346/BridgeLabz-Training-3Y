import java.util.Scanner;

/**
 * Program: L2_UnitConverterPart3
 * Task: Convert F<->C, pounds<->kg, gallons<->liters using static methods.
 */
public class L2_UnitConverterPart3 {

    public static double convertFahrenheitToCelsius(double fahrenheit) {
        double celsius = (fahrenheit - 32) * 5.0 / 9.0;
        return celsius;
    }

    public static double convertCelsiusToFahrenheit(double celsius) {
        double fahrenheit = (celsius * 9.0 / 5.0) + 32.0;
        return fahrenheit;
    }

    public static double convertPoundsToKilograms(double pounds) {
        double pounds2kilograms = 0.453592;
        return pounds * pounds2kilograms;
    }

    public static double convertKilogramsToPounds(double kilograms) {
        double kilograms2pounds = 2.20462;
        return kilograms * kilograms2pounds;
    }

    public static double convertGallonsToLiters(double gallons) {
        double gallons2liters = 3.78541;
        return gallons * gallons2liters;
    }

    public static double convertLitersToGallons(double liters) {
        double liters2gallons = 0.264172;
        return liters * liters2gallons;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Fahrenheit for F->C: ");
        double f = scanner.nextDouble();
        System.out.print("Enter Celsius for C->F: ");
        double c = scanner.nextDouble();
        System.out.print("Enter pounds for lb->kg: ");
        double pounds = scanner.nextDouble();
        System.out.print("Enter kilograms for kg->lb: ");
        double kilograms = scanner.nextDouble();
        System.out.print("Enter gallons for gal->L: ");
        double gallons = scanner.nextDouble();
        System.out.print("Enter liters for L->gal: ");
        double liters = scanner.nextDouble();

        System.out.println("F->C: " + convertFahrenheitToCelsius(f));
        System.out.println("C->F: " + convertCelsiusToFahrenheit(c));
        System.out.println("lb->kg: " + convertPoundsToKilograms(pounds));
        System.out.println("kg->lb: " + convertKilogramsToPounds(kilograms));
        System.out.println("gal->L: " + convertGallonsToLiters(gallons));
        System.out.println("L->gal: " + convertLitersToGallons(liters));
        scanner.close();
    }
}
