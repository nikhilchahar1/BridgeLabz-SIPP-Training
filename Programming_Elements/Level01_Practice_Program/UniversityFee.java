package day02;

public class UniversityFee {

	public static void main(String[] args) {
		// Fixed fee and discount percent
        double courseFee = 125000;
        double discountPercent = 10;

        // Calculate discount amount
        double discountAmount = (discountPercent / 100) * courseFee;

        // Calculate final amount after discount
        double finalFee = courseFee - discountAmount;

        // Output
        System.out.println("The discount amount is INR " + discountAmount + 
                           " and final discounted fee is INR " + finalFee);
    
	}

}
