package day02;
import java.util.Scanner;
public class IntOperation {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

        // Declare integer variables
        int a, b, c;

        // Get input values for a, b, and c
        System.out.print("Enter value for a (int): ");
        a = input.nextInt();

        System.out.print("Enter value for b (int): ");
        b = input.nextInt();

        System.out.print("Enter value for c (int): ");
        c = input.nextInt();

        // Perform operations using operator precedence
        int result1 = a + b * c;       // Multiplication has higher precedence than addition
        int result2 = a * b + c;       // Multiplication first, then addition
        int result3 = c + a / b;       // Division first, then addition
        int result4 = a % b + c;       // Modulus first, then addition

        // Output the results
        System.out.println("The results of Int Operations are:");
        System.out.println("a + b * c = " + result1);
        System.out.println("a * b + c = " + result2);
        System.out.println("c + a / b = " + result3);
        System.out.println("a % b + c = " + result4);

        
	}

}
