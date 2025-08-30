/**
 * Converts 10.8 km to miles given 1 km = 1.6 miles.
 */
public class KmToMilesFixed {
    public static void main(String[] args) {
        double km = 10.8;
        double miles = km / 1.6;
        System.out.println("The distance " + km + " km in miles is " + miles);
    }
}
