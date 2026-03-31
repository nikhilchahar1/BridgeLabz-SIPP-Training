public class ShoppingCart {
    static class CartItem {
        String itemName;
        double price;
        int quantity;

        // Method to add item details to the cart
        void addItem(String name, double itemPrice, int qty) {
            itemName = name;
            price = itemPrice;
            quantity = qty;
        }

        // Method to remove item from the cart (set quantity to 0)
        void removeItem() {
            quantity = 0;
        }

        // Method to display total cost
        void displayTotalCost() {
            double total = price * quantity;
            System.out.println("Item: " + itemName);
            System.out.println("Quantity: " + quantity);
            System.out.println("Total Cost: ₹" + total);
        }
    }

    public static void main(String[] args) {
        CartItem item = new CartItem();

        // Add item to cart
        item.addItem("Laptop", 50000.0, 1);
        item.displayTotalCost();

        // Remove item from cart
        item.removeItem();
        item.displayTotalCost();
    }
}
