package day02;
import java.util.Scanner;
public class DoubleOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

        // Declare double variables
        double a, b, c;

        // Get input values
        System.out.print("Enter value for a (double): ");
        a = input.nextDouble();

        System.out.print("Enter value for b (double): ");
        b = input.nextDouble();

        System.out.print("Enter value for c (double): ");
        c = input.nextDouble();

        // Perform operations with proper precedence
        double result1 = a + b * c;       // Multiplication first
        double result2 = a * b + c;       // Multiplication then addition
        double result3 = c + a / b;       // Division then addition
        double result4 = a % b + c;       // Modulus then addition

        // Output results
        System.out.println("The results of Double Operations are:");
        System.out.println("a + b * c = " + result1);
        System.out.println("a * b + c = " + result2);
        System.out.println("c + a / b = " + result3);
        System.out.println("a % b + c = " + result4);
	}

}
