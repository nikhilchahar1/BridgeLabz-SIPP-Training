package day02;
import java.util.Scanner;
public class KmToMilesbyinput {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

        // Ask for user input in kilometers
        System.out.print("Enter distance in kilometers: ");
        double km = input.nextDouble();

        // Convert to miles using 1 mile = 1.6 km
        double miles = km / 1.6;

        // Output
        System.out.println("The total miles is " + miles + " mile for the given " + km + " km");
   
	}

}
