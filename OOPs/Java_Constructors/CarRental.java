public class CarRental {
    String customerName;
    String carModel;
    int rentalDays;
    double dailyRate;

    // Default constructor
    CarRental() {
        customerName = "Guest";
        carModel = "Standard";
        rentalDays = 1;
        dailyRate = 1000.0;
    }

    // Parameterized constructor
    CarRental(String customerName, String carModel, int rentalDays, double dailyRate) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
        this.dailyRate = dailyRate;
    }

    // Method to calculate total cost
    double calculateTotalCost() {
        return rentalDays * dailyRate;
    }

    void displayRental() {
        System.out.println("Customer: " + customerName);
        System.out.println("Car Model: " + carModel);
        System.out.println("Rental Days: " + rentalDays);
        System.out.println("Total Cost: ₹" + calculateTotalCost());
    }

    public static void main(String[] args) {
        CarRental rental1 = new CarRental();  // Default rental
        System.out.println("Default Rental:");
        rental1.displayRental();

        CarRental rental2 = new CarRental("Nikhil", "Hyundai Creta", 5, 1800.0);
        System.out.println("\nCustom Rental:");
        rental2.displayRental();
    }
}
