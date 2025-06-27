class Book {
    // Static variable shared by all book objects
    static String libraryName = "City Library";

    // Final variable to make isbn unchangeable once assigned
    final String isbn;

    // Instance variables for book details
    String title, author;

    // Constructor using 'this' to avoid ambiguity
    Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    // Static method to display the library name
    static void displayLibraryName() {
        System.out.println("Library: " + libraryName);
    }

    // Method to display book details with instanceof check
    void display() {
        if (this instanceof Book) {
            System.out.println("Title: " + title);
            System.out.println("Author: " + author);
            System.out.println("ISBN: " + isbn);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating book objects
        Book b1 = new Book("Java Basics", "James Gosling", "ISBN001");
        Book b2 = new Book("Effective Java", "Joshua Bloch", "ISBN002");

        // Calling static method using class name
        Book.displayLibraryName();

        // Displaying book details
        b1.display();
        b2.display();
    }
}
