package day02;
import java.util.Scanner;
public class CalculateTotalPrice {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

        // Read unit price and quantity
        System.out.print("Enter unit price (INR): ");
        double unitPrice = input.nextDouble();

        System.out.print("Enter quantity: ");
        int quantity = input.nextInt();

        // Calculate total price
        double totalPrice = unitPrice * quantity;

        // Output
        System.out.println("The total purchase price is INR " + totalPrice + 
                           " if the quantity is " + quantity + 
                           " and unit price is INR " + unitPrice);

	}

}
