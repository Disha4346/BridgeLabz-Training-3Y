public class CarRental {
    String customerName;
    String carModel;
    int rentalDays;
    double dailyRate = 50.0;

    public CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }

    public double calculateTotalCost() {
        return dailyRate * rentalDays;
    }
}
