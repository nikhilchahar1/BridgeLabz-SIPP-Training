public class Vehicle {
    String ownerName;
    String vehicleType;
    static double registrationFee = 5000.0;  // Default fee for all vehicles

    // Constructor to initialize vehicle details
    Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    // Instance method to display vehicle details
    void displayVehicleDetails() {
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Registration Fee: ₹" + registrationFee);
    }

    // Class method to update registration fee
    static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }

    public static void main(String[] args) {
        // Create vehicle objects
        Vehicle v1 = new Vehicle("Nikhil", "Car");
        Vehicle v2 = new Vehicle("Aman", "Bike");

        // Display details before fee update
        System.out.println("Before fee update:\n");
        v1.displayVehicleDetails();
        System.out.println();
        v2.displayVehicleDetails();

        // Update registration fee
        Vehicle.updateRegistrationFee(6000.0);

        // Display details after fee update
        System.out.println("\nAfter fee update:\n");
        v1.displayVehicleDetails();
        System.out.println();
        v2.displayVehicleDetails();
    }
}
