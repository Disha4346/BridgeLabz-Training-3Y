import java.util.Scanner;

/**
 * Program: L2_BMICalculatorForTeam
 * Task: For 10 people, compute BMI and status.
 */
public class L2_BMICalculatorForTeam {

    public static double computeBMI(double weightKg, double heightCm) {
        double heightM = heightCm / 100.0;
        if (heightM <= 0) return 0.0;
        return weightKg / (heightM * heightM);
    }

    public static String bmiStatus(double bmi) {
        if (bmi < 18.5) return "Underweight";
        if (bmi < 25) return "Normal";
        if (bmi < 30) return "Overweight";
        return "Obese";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] data = new double[10][3]; // [weight, height(cm), BMI]
        String[] status = new String[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter weight (kg) for person " + (i + 1) + ": ");
            double weight = scanner.nextDouble();
            System.out.print("Enter height (cm) for person " + (i + 1) + ": ");
            double height = scanner.nextDouble();

            double bmi = computeBMI(weight, height);
            String s = bmiStatus(bmi);

            data[i][0] = weight;
            data[i][1] = height;
            data[i][2] = bmi;
            status[i] = s;
        }

        System.out.println("Idx	Weight(kg)	Height(cm)	BMI		Status");
        for (int i = 0; i < 10; i++) {
            System.out.printf("%d	%.2f		%.2f		%.2f	%s%n", i + 1, data[i][0], data[i][1], data[i][2], status[i]);
        }
        scanner.close();
    }
}
