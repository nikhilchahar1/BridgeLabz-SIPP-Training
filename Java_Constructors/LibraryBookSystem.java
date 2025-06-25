public class Book {
    String title;
    String author;
    double price;
    boolean availability;

    // Constructor to initialize book details
    Book(String title, String author, double price, boolean availability) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.availability = availability;
    }

    // Method to borrow the book
    void borrowBook() {
        if (availability) {
            availability = false;
            System.out.println("You have successfully borrowed: " + title);
        } else {
            System.out.println("Sorry, the book '" + title + "' is not available.");
        }
    }

    void displayBook() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: ₹" + price);
        System.out.println("Available: " + (availability ? "Yes" : "No"));
    }

    public static void main(String[] args) {
        Book b1 = new Book("Atomic Habits", "James Clear", 450.0, true);
        b1.displayBook();
        b1.borrowBook();
        b1.borrowBook();  // Try borrowing again to see status
    }
}
