import java.util.Scanner;

/**
 * Converts distance in feet to yards and miles.
 */
public class FeetToYardsMiles {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double feet = input.nextDouble();
        double yards = feet / 3;
        double miles = yards / 1760;
        System.out.println(feet + " feet = " + yards + " yards, " + miles + " miles");
        input.close();
    }
}
