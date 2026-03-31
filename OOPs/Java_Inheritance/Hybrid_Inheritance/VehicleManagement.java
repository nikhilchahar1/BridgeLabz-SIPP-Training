// Superclass representing a generic vehicle
class Vehicle {
    String model;
    int maxSpeed;

    Vehicle(String model, int maxSpeed) {
        this.model = model;
        this.maxSpeed = maxSpeed;
    }

    void displayInfo() {
        System.out.println("Model: " + model);
        System.out.println("Max Speed: " + maxSpeed + " km/h");
    }
}

// Interface representing refuelable behavior
interface Refuelable {
    void refuel();
}

// Subclass representing an electric vehicle
class ElectricVehicle extends Vehicle {
    int batteryCapacity; // in kWh

    ElectricVehicle(String model, int maxSpeed, int batteryCapacity) {
        super(model, maxSpeed);
        this.batteryCapacity = batteryCapacity;
    }

    void charge() {
        displayInfo();
        System.out.println("Battery Capacity: " + batteryCapacity + " kWh");
        System.out.println("Charging the electric vehicle...");
    }
}

// Subclass representing a petrol vehicle that implements Refuelable
class PetrolVehicle extends Vehicle implements Refuelable {
    int fuelTankCapacity; // in liters

    PetrolVehicle(String model, int maxSpeed, int fuelTankCapacity) {
        super(model, maxSpeed);
        this.fuelTankCapacity = fuelTankCapacity;
    }

    public void refuel() {
        displayInfo();
        System.out.println("Fuel Tank Capacity: " + fuelTankCapacity + " liters");
        System.out.println("Refueling the petrol vehicle...");
    }
}

// Main class to test the hybrid inheritance system
public class VehicleManagement {
    public static void main(String[] args) {
        ElectricVehicle ev = new ElectricVehicle("Tesla Model 3", 250, 75);
        PetrolVehicle pv = new PetrolVehicle("Maruti Swift", 180, 42);

        System.out.println("---- Electric Vehicle ----");
        ev.charge();

        System.out.println("\n---- Petrol Vehicle ----");
        pv.refuel();
    }
}
