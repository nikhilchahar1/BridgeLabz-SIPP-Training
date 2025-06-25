// Base class: Book
public class Book {
    public String ISBN;           // Public: accessible everywhere
    protected String title;       // Protected: accessible in subclass
    private String author;        // Private: accessible only in this class

    // Constructor
    Book(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    // Public setter for author
    public void setAuthor(String author) {
        this.author = author;
    }

    // Public getter for author
    public String getAuthor() {
        return author;
    }

    // Method to display book details
    public void displayBook() {
        System.out.println("ISBN: " + ISBN);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}

// Subclass: EBook to demonstrate access to public and protected members
class EBook extends Book {
    double fileSizeMB;

    EBook(String ISBN, String title, String author, double fileSizeMB) {
        super(ISBN, title, author);
        this.fileSizeMB = fileSizeMB;
    }

    void displayEBook() {
        System.out.println("E-Book Access Demonstration:");
        System.out.println("Accessing Public ISBN: " + ISBN);      // public
        System.out.println("Accessing Protected Title: " + title); // protected
        System.out.println("File Size: " + fileSizeMB + " MB");

        // Cannot directly access private member author
        System.out.println("Accessing Private Author via Getter: " + getAuthor());
    }

    public static void main(String[] args) {
        // Create a regular book
        Book physicalBook = new Book("978-1234567890", "Java Basics", "John Smith");
        System.out.println("Physical Book:");
        physicalBook.displayBook();

        // Create an ebook
        EBook ebook = new EBook("978-0987654321", "Advanced Java", "Alice Brown", 2.5);
        System.out.println("\n");
        ebook.displayEBook();
    }
}
