package day02;
import java.util.Scanner;
public class AreaOfTriangle {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

        // Get base and height from user
        System.out.print("Enter base in cm: ");
        double base = input.nextDouble();

        System.out.print("Enter height in cm: ");
        double height = input.nextDouble();

        // Calculate area in square centimeters
        double areaSqCm = 0.5 * base * height;

        // Convert to square inches (1 inch = 2.54 cm, so 1 sq inch = 2.54^2)
        double areaSqInch = areaSqCm / (2.54 * 2.54);

        // Display the result
        System.out.println("The Area of the triangle in sq inch is " + areaSqInch + 
                           " and sq cm is " + areaSqCm);

	}

}
