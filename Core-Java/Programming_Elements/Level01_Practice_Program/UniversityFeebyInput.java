package day02;
import java.util.Scanner;
public class UniversityFeebyInput {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

        // Take course fee and discount percent from user
        System.out.print("Enter course fee (INR): ");
        double fee = input.nextDouble();

        System.out.print("Enter discount percentage: ");
        double discountPercent = input.nextDouble();

        // Calculate discount amount
        double discountAmount = (discountPercent / 100) * fee;

        // Calculate final fee after applying discount
        double finalFee = fee - discountAmount;

        // Output
        System.out.println("The discount amount is INR " + discountAmount +
                           " and final discounted fee is INR " + finalFee);

	}

}
