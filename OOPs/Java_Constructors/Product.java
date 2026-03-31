public class Product {
    String productName;
    double price;
    static int totalProducts = 0;  // Class variable

    // Constructor to initialize product and increment total count
    Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
        totalProducts++;  // Increase count whenever a product is created
    }

    // Instance method to display product details
    void displayProductDetails() {
        System.out.println("Product Name: " + productName);
        System.out.println("Price: ₹" + price);
    }

    // Class method to display total number of products
    static void displayTotalProducts() {
        System.out.println("Total Products Created: " + totalProducts);
    }

    public static void main(String[] args) {
        Product p1 = new Product("Laptop", 55000);
        Product p2 = new Product("Smartphone", 30000);
        Product p3 = new Product("Headphones", 2000);

        p1.displayProductDetails();
        System.out.println();

        p2.displayProductDetails();
        System.out.println();

        p3.displayProductDetails();
        System.out.println();

        // Display total products using class method
        Product.displayTotalProducts();
    }
}
