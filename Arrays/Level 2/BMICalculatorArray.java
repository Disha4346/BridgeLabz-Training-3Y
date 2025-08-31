import java.util.Scanner;

/**
 * Program 6 (Level 2)
 * BMI for N persons using separate arrays for height, weight, BMI, and status.
 * BMI = weight(kg) / (height(m))^2
 */
public class BMICalculatorArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number;
        while (true) {
            System.out.print("Enter number of persons (>0): ");
            if (!sc.hasNextInt()) { System.err.println("Enter integer."); sc.next(); continue; }
            number = sc.nextInt();
            if (number <= 0) { System.err.println("Must be > 0."); continue; }
            break;
        }

        double[] weights = new double[number];
        double[] heights = new double[number];
        double[] bmis = new double[number];
        String[] status = new String[number];

        for (int i = 0; i < number; i++) {
            // weight
            while (true) {
                System.out.print("Enter weight (kg) of person " + (i + 1) + ": ");
                if (!sc.hasNextDouble()) { System.err.println("Enter number."); sc.next(); continue; }
                double w = sc.nextDouble();
                if (w <= 0 || w > 500) { System.err.println("Invalid weight."); continue; }
                weights[i] = w;
                break;
            }
            // height
            while (true) {
                System.out.print("Enter height (meters) of person " + (i + 1) + ": ");
                if (!sc.hasNextDouble()) { System.err.println("Enter number."); sc.next(); continue; }
                double h = sc.nextDouble();
                if (h <= 0 || h > 3) { System.err.println("Invalid height in meters."); continue; }
                heights[i] = h;
                break;
            }
        }

        for (int i = 0; i < number; i++) {
            bmis[i] = weights[i] / (heights[i] * heights[i]);
            status[i] = bmiStatus(bmis[i]);
        }

        System.out.println("Height(m)\tWeight(kg)\tBMI\t\tStatus");
        for (int i = 0; i < number; i++) {
            System.out.printf("%.2f\t\t%.2f\t\t%.2f\t%s%n", heights[i], weights[i], bmis[i], status[i]);
        }

        sc.close();
    }

    // Determine weight status based on BMI
    private static String bmiStatus(double bmi) {
        if (bmi < 18.5) return "Underweight";
        if (bmi < 25.0) return "Normal";
        if (bmi < 30.0) return "Overweight";
        return "Obesity";
    }
}
