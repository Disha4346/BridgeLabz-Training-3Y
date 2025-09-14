public class VehicleTest {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("MH12AB1234", "Raj", "Car");
        Vehicle v2 = new Vehicle("MH14CD5678", "Neha", "Bike");

        v1.displayVehicleDetails();
        v2.displayVehicleDetails();

        Vehicle.updateRegistrationFee(2000.0);

        System.out.println("\nAfter updating registration fee:\n");
        v1.displayVehicleDetails();
        v2.displayVehicleDetails();
    }
}
