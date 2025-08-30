import java.util.Scanner;

/**
 * Computes perimeter of a rectangle.
 */
public class RectanglePerimeter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double length = input.nextDouble();
        double width = input.nextDouble();
        double perimeter = 2 * (length + width);
        System.out.println("Perimeter = " + perimeter);
        input.close();
    }
}
