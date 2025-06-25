public class Book {
    String title;
    String author;
    double price;

    // Default constructor
    Book() {
        title = "Unknown";
        author = "Unknown";
        price = 0.0;
    }

    // Parameterized constructor
    Book(String t, String a, double p) {
        title = t;
        author = a;
        price = p;
    }

    void displayBook() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: ₹" + price);
    }

    public static void main(String[] args) {
        Book defaultBook = new Book();
        System.out.println("Default Book:");
        defaultBook.displayBook();

        Book paramBook = new Book("The Alchemist", "Paulo Coelho", 350.0);
        System.out.println("\nParameterized Book:");
        paramBook.displayBook();
    }
}
