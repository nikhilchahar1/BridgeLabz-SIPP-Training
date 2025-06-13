package day02;
import java.util.Scanner;
public class HeightConverter {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

        // Ask user to enter height in centimeters
        System.out.print("Enter your height in centimeters: ");
        double heightCm = input.nextDouble();

        // Convert cm to total inches
        double totalInches = heightCm / 2.54;

        // Convert inches to feet and remaining inches
        int feet = (int) (totalInches / 12);
        double remainingInches = totalInches % 12;

        // Output
        System.out.println("Your height in cm is " + heightCm + 
                           " while in feet is " + feet + 
                           " and inches is " + remainingInches);

	}

}
