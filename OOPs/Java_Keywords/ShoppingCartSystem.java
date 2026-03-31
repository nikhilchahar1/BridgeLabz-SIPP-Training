class Product {
    static double discount = 10.0; // Discount in percentage shared by all products

    final int productID;
    String productName;
    double price;
    int quantity;

    // Constructor using 'this'
    Product(int productID, String productName, double price, int quantity) {
        this.productID = productID;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    // Static method to update discount
    static void updateDiscount(double newDiscount) {
        discount = newDiscount;
    }

    // Method to print product details after instanceof check
    void printDetails(Object obj) {
        if (obj instanceof Product) {
            Product p = (Product) obj;
            System.out.println("Product ID: " + p.productID);
            System.out.println("Name: " + p.productName);
            System.out.println("Price: $" + p.price);
            System.out.println("Quantity: " + p.quantity);
            System.out.println("Discount: " + discount + "%");
        } else {
            System.out.println("Invalid product object.");
        }
    }
}

public class ShoppingCartSystem {
    public static void main(String[] args) {
        Product p1 = new Product(201, "Laptop", 75000, 1);
        Product p2 = new Product(202, "Mouse", 500, 2);

        p1.printDetails(p1);
        p2.printDetails(p2);

        // Update the discount for all products
        Product.updateDiscount(15.0);

        System.out.println("\nAfter updating discount:");
        p1.printDetails(p1);
    }
}
