import java.util.Scanner;

/**
 * Program 7 (Level 2)
 * BMI calculator using a 2D array: [weight, height, BMI] per person.
 */
public class BMICalculator2DArray {
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

        double[][] personData = new double[number][3]; // [weight, height, BMI]
        String[] weightStatus = new String[number];

        for (int i = 0; i < number; i++) {
            // weight
            while (true) {
                System.out.print("Enter weight (kg) of person " + (i + 1) + ": ");
                if (!sc.hasNextDouble()) { System.err.println("Enter number."); sc.next(); continue; }
                double w = sc.nextDouble();
                if (w <= 0 || w > 500) { System.err.println("Invalid weight."); continue; }
                personData[i][0] = w;
                break;
            }
            // height
            while (true) {
                System.out.print("Enter height (meters) of person " + (i + 1) + ": ");
                if (!sc.hasNextDouble()) { System.err.println("Enter number."); sc.next(); continue; }
                double h = sc.nextDouble();
                if (h <= 0 || h > 3) { System.err.println("Invalid height in meters."); continue; }
                personData[i][1] = h;
                break;
            }
        }

        for (int i = 0; i < number; i++) {
            double w = personData[i][0];
            double h = personData[i][1];
            double bmi = w / (h * h);
            personData[i][2] = bmi;
            weightStatus[i] = bmiStatus(bmi);
        }

        System.out.println("Weight(kg)\tHeight(m)\tBMI\t\tStatus");
        for (int i = 0; i < number; i++) {
            System.out.printf("%.2f\t\t%.2f\t\t%.2f\t%s%n",
                    personData[i][0], personData[i][1], personData[i][2], weightStatus[i]);
        }

        sc.close();
    }

    private static String bmiStatus(double bmi) {
        if (bmi < 18.5) return "Underweight";
        if (bmi < 25.0) return "Normal";
        if (bmi < 30.0) return "Overweight";
        return "Obesity";
    }
}
