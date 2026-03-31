public class MobilePhoneDetails {
    static class MobilePhone {
        String brand;
        String model;
        double price;

        // Constructor to initialize phone
        MobilePhone(String brand, String model, double price) {
            this.brand = brand;
            this.model = model;
            this.price = price;
        }
    }

    public static void main(String[] args) {
        MobilePhone phone = new MobilePhone("Samsung", "Galaxy S24", 74999.0);

        // Display details
        System.out.println("Brand: " + phone.brand);
        System.out.println("Model: " + phone.model);
        System.out.println("Price: ₹" + phone.price);
    }
}
