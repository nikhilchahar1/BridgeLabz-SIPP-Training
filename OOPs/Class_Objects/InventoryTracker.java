public class InventoryTracker {
    // Item class with basic attributes
    static class Item {
        int itemCode;
        String itemName;
        double price;

        // Constructor to initialize item
        Item(int itemCode, String itemName, double price) {
            this.itemCode = itemCode;
            this.itemName = itemName;
            this.price = price;
        }
    }

    public static void main(String[] args) {
        // Create an item
        Item item = new Item(101, "Wireless Mouse", 750.00);

        // Quantity to calculate total cost
        int quantity = 3;

        // Display item details
        System.out.println("Item Code: " + item.itemCode);
        System.out.println("Item Name: " + item.itemName);
        System.out.println("Price per Unit: ₹" + item.price);

        // Calculate and display total cost
        double totalCost = item.price * quantity;
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Cost: ₹" + totalCost);
    }
}
