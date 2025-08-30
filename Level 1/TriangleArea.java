import java.util.Scanner;

/**
 * Computes area of a triangle from base and height.
 */
public class TriangleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double base = input.nextDouble();
        double height = input.nextDouble();
        double areaCm2 = 0.5 * base * height;
        double areaIn2 = areaCm2 / 6.4516; // 1 sq in = 6.4516 sq cm
        System.out.println("Area in square cm = " + areaCm2 + ", in square inches = " + areaIn2);
        input.close();
    }
}
