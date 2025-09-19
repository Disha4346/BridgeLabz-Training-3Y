class Device {
    private String deviceId;
    private String status;

    public Device(String deviceId, String status) {
        this.deviceId = deviceId;
        this.status = status;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public String getStatus() {
        return status;
    }

    public void displayStatus() {
        System.out.println("Device ID: " + deviceId + " | Status: " + status);
    }
}

class Thermostat extends Device {
    private double temperatureSetting;

    public Thermostat(String deviceId, String status, double temperatureSetting) {
        super(deviceId, status);
        this.temperatureSetting = temperatureSetting;
    }

    @Override
    public void displayStatus() {
        System.out.println("Thermostat ID: " + getDeviceId() + " | Status: " + getStatus() +
                           " | Temperature: " + temperatureSetting + "°C");
    }
}

public class SmartHomeDevices {
    public static void main(String[] args) {
        Thermostat t1 = new Thermostat("TH001", "ON", 24.5);
        t1.displayStatus();
    }
}
