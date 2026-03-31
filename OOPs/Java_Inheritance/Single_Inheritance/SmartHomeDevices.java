class Device {
	String deviceId;
	String status;
	
	// Constructor to initialize properties 
	Device(String id, String status){
		this.deviceId = id;
		this.status = status;
	}
}

// Derived class from superclass
class Thermostat extends Device{
	int temperatureSetting;
	
	// Constructor to initialize properties and inherit superclass properties
	Thermostat(String id, String status, int temp){
		super(id, status);
		this.temperatureSetting = temp;
	}
	
	// Method to display output 
	void displayStatus() {
		System.out.println("Device ID : " +deviceId);
		System.out.println("Status : " +status);
		System.out.println("Temperature : " +temperatureSetting +"°C");
    }
}

// Main Class
public class SmartHomeDevices{
    // Main method for displaying output
	public static void main(String [] args) {
		Thermostat ts = new Thermostat("TS-110", "Active", 20);
		ts.displayStatus();
	}
}