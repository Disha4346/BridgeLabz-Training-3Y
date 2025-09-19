// Parent Class
class Cab {
    protected double baseFare;

    Cab(double baseFare) {
        this.baseFare = baseFare;
    }

    void startRide() {
        System.out.printf("Ride Started... Base Fare: \u20B9%.2f%n", baseFare);
    }

    void showFare() {
        System.out.printf("Total Fare: \u20B9%.2f%n", baseFare);
    }
}

// Mini extends Cab
class Mini extends Cab {
    protected double extraCharge;

    Mini(double baseFare, double extraCharge) {
        super(baseFare);
        this.extraCharge = extraCharge;
    }

    @Override
    void showFare() {
        double totalFare = baseFare + extraCharge;
        System.out.printf("Mini Cab Fare: \u20B9%.2f%n", totalFare);
    }
}

// Sedan extends Cab
class Sedan extends Cab {
    protected double luxuryCharge;

    Sedan(double baseFare, double luxuryCharge) {
        super(baseFare);
        this.luxuryCharge = luxuryCharge;
    }

    @Override
    void showFare() {
        double totalFare = baseFare + luxuryCharge;
        System.out.printf("Sedan Cab Fare: \u20B9%.2f%n", totalFare);
    }
}

// SUV extends Sedan
class SUV extends Sedan {
    protected double extraCharge;

    SUV(double baseFare, double luxuryCharge, double extraCharge) {
        super(baseFare, luxuryCharge);
        this.extraCharge = extraCharge;
    }

    @Override
    void showFare() {
        double totalFare = baseFare + luxuryCharge + extraCharge;
        System.out.printf("SUV Cab Fare: \u20B9%.2f%n", totalFare);
    }
}

// Main Class
public class OLAExample {
    public static void main(String[] args) {
        Mini miniRide = new Mini(100, 50);
        Sedan sedanRide = new Sedan(100, 100);
        SUV suvRide = new SUV(100, 100, 150);

        System.out.println("=== Ola Ride Details ===");
        miniRide.startRide();
        miniRide.showFare();

        sedanRide.startRide();
        sedanRide.showFare();

        suvRide.startRide();
        suvRide.showFare();
    }
}
