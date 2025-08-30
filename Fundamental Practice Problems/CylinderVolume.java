import java.util.Scanner;

/**
 * Computes volume of a cylinder from radius and height.
 */
public class CylinderVolume {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double r = input.nextDouble();
        double h = input.nextDouble();
        double volume = Math.PI * r * r * h;
        System.out.println("Volume = " + volume);
        input.close();
    }
}
