class Vehicle {
    static double registrationFee = 5000.0; // Fee common to all vehicles

    final String registrationNumber; // unchangeable
    String ownerName;
    String vehicleType;

    // Constructor using 'this'
    Vehicle(String registrationNumber, String ownerName, String vehicleType) {
        this.registrationNumber = registrationNumber;
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    // Static method to update the registration fee
    static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }

    // Method to display vehicle details after instanceof check
    void displayDetails(Object obj) {
        if (obj instanceof Vehicle) {
            Vehicle v = (Vehicle) obj;
            System.out.println("Registration Number: " + v.registrationNumber);
            System.out.println("Owner Name: " + v.ownerName);
            System.out.println("Vehicle Type: " + v.vehicleType);
            System.out.println("Registration Fee: ₹" + registrationFee);
        } else {
            System.out.println("Invalid vehicle object.");
        }
    }
}

public class VehicleRegistrationSystem {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("DL01AB1234", "Rajesh Kumar", "Car");
        Vehicle v2 = new Vehicle("HR26CD5678", "Meena Sharma", "Bike");

        v1.displayDetails(v1);
        v2.displayDetails(v2);

        // Update registration fee
        Vehicle.updateRegistrationFee(5500.0);

        System.out.println("\nAfter updating registration fee:");
        v1.displayDetails(v1);
    }
}
