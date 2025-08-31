// L3-Q1: BMI for 10 persons with height(cm), weight(kg), BMI, Status
// File: BMICalculator.java
import java.util.*;

public class BMICalculator {

    public static String[][] computeBMI(double[][] hw) {
        String[][] out = new String[hw.length][4];
        for (int i = 0; i < hw.length; i++) {
            double kg = hw[i][0];
            double cm = hw[i][1];
            double m = cm / 100.0;
            double bmi = kg / (m * m);
            String status;
            if (bmi < 18.5) status = "Underweight";
            else if (bmi < 25) status = "Normal";
            else if (bmi < 30) status = "Overweight";
            else status = "Obese";
            out[i][0] = String.format("%.1f", cm);
            out[i][1] = String.format("%.1f", kg);
            out[i][2] = String.format("%.2f", bmi);
            out[i][3] = status;
        }
        return out;
    }

    public static void display(String[][] table) {
        System.out.println("Height(cm)	Weight(kg)	BMI	Status");
        for (String[] r : table) System.out.println(String.join("		", r));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 10;
        double[][] hw = new double[n][2];
        for (int i = 0; i < n; i++) {
            System.out.print("Person " + (i+1) + " weight(kg): ");
            hw[i][0] = sc.nextDouble();
            System.out.print("Person " + (i+1) + " height(cm): ");
            hw[i][1] = sc.nextDouble();
        }
        String[][] res = computeBMI(hw);
        display(res);
        sc.close();
    }
}
