package day02;

public class VolOfEarth {

	public static void main(String[] args) {
		// Radius of the Earth in kilometers
        double radiusKm = 6378;

        // Constant for PI
        double pi = 3.14;

        // Volume of sphere formula: (4/3) * π * r³
        double volumeKm3 = (4.0 / 3.0) * pi * Math.pow(radiusKm, 3);

        // Convert km³ to mi³ (1 km = 0.621371 miles => (km³ to mi³ = 0.621371³))
        double kmToMilesFactor = Math.pow(0.621371, 3);
        double volumeMiles3 = volumeKm3 * kmToMilesFactor;

        // Output
        System.out.println("The volume of earth in cubic kilometers is " + volumeKm3 +
                           " and cubic miles is " + volumeMiles3);
    

	}

}
