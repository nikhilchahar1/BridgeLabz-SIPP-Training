package day02;

public class ProfitAndLoss {

	public static void main(String[] args) {
		// Given Cost Price and Selling Price
        double costPrice = 129;
        double sellingPrice = 191;

        // Calculate profit
        double profit = sellingPrice - costPrice;

        // Calculate profit percentage
        double profitPercent = (profit / costPrice) * 100;

        // Display all values in a single print statement with multiline text
        System.out.println("The Cost Price is INR " + costPrice + " and Selling Price is INR " + sellingPrice + "\n" +
                           "The Profit is INR " + profit + " and the Profit Percentage is " + profitPercent);
   
	}

}
