import java.util.Scanner;

/**
 * Computes area of circle from radius.
 */
public class CircleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double r = input.nextDouble();
        double area = Math.PI * r * r;
        System.out.println("Area = " + area);
        input.close();
    }
}
