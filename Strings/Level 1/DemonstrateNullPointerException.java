// Q4: Demonstrate NullPointerException (generate and handle)
// File: DemonstrateNullPointerException.java
public class DemonstrateNullPointerException {

    public static void generateNPE() {
        String text = null;
        // This will throw a NullPointerException
        System.out.println(text.length());
    }

    public static void handleNPE() {
        String text = null;
        try {
            System.out.println(text.length());
        } catch (NullPointerException npe) {
            System.out.println("Handled NullPointerException: " + npe.getMessage());
        } catch (RuntimeException re) {
            System.out.println("Handled RuntimeException: " + re.getMessage());
        }
    }

    public static void main(String[] args) {
        // Uncomment the following line to see abrupt termination:
        // generateNPE();
        handleNPE();
    }
}
