import java.util.Scanner;

/**
 * Program: L1_WindChillCalculator
 * Task: Calculate wind chill given temperature and wind speed.
 */
public class L1_WindChillCalculator {

    // Calculates wind chill using provided formula.
    public static double calculateWindChill(double temperature, double windSpeed) {
        double windChill = 35.74 + 0.6215 * temperature + (0.4275 * temperature - 35.75) * Math.pow(windSpeed, 0.16);
        return windChill;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter air temperature (°F): ");
        double temperature = scanner.nextDouble();
        System.out.print("Enter wind speed (mph): ");
        double windSpeed = scanner.nextDouble();

        double windChill = calculateWindChill(temperature, windSpeed);
        System.out.println("Wind Chill Temperature: " + windChill);
        scanner.close();
    }
}
