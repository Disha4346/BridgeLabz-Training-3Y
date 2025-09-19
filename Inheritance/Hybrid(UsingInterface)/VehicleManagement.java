// Superclass
class Vehicle {
    private String model;
    private int maxSpeed;

    public Vehicle(String model, int maxSpeed) {
        this.model = model;
        this.maxSpeed = maxSpeed;
    }

    public String getModel() {
        return model;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void displayInfo() {
        System.out.println("Model: " + model + " | Max Speed: " + maxSpeed + " km/h");
    }
}

// Interface for additional behavior
interface Refuelable {
    void refuel();
}

// Subclass 1: Electric Vehicle
class ElectricVehicle extends Vehicle {
    private int batteryCapacity; // in kWh

    public ElectricVehicle(String model, int maxSpeed, int batteryCapacity) {
        super(model, maxSpeed);
        this.batteryCapacity = batteryCapacity;
    }

    public void charge() {
        System.out.println(getModel() + " is charging with " + batteryCapacity + " kWh battery.");
    }

    @Override
    public void displayInfo() {
        System.out.print("Electric Vehicle -> ");
        super.displayInfo();
        System.out.println("Battery Capacity: " + batteryCapacity + " kWh");
    }
}

// Subclass 2: Petrol Vehicle
class PetrolVehicle extends Vehicle implements Refuelable {
    private double fuelCapacity; // in liters

    public PetrolVehicle(String model, int maxSpeed, double fuelCapacity) {
        super(model, maxSpeed);
        this.fuelCapacity = fuelCapacity;
    }

    @Override
    public void refuel() {
        System.out.println(getModel() + " is refueling with " + fuelCapacity + " liters tank capacity.");
    }

    @Override
    public void displayInfo() {
        System.out.print("Petrol Vehicle -> ");
        super.displayInfo();
        System.out.println("Fuel Capacity: " + fuelCapacity + " L");
    }
}

public class VehicleManagement {
    public static void main(String[] args) {
        ElectricVehicle ev = new ElectricVehicle("Tesla Model S", 250, 100);
        PetrolVehicle pv = new PetrolVehicle("Honda City", 180, 40);

        ev.displayInfo();
        ev.charge();

        System.out.println();

        pv.displayInfo();
        pv.refuel();
    }
}
