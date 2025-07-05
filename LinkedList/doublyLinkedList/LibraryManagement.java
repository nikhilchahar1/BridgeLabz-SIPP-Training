class Book {
    String title, author, genre;
    int bookId;
    boolean isAvailable;
    Book next, prev;

    Book(int bookId, String title, String author, String genre, boolean isAvailable) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.isAvailable = isAvailable;
    }
}

class Library {
    private Book head = null, tail = null;

    void addAtBeginning(Book b) {
        if (head == null) head = tail = b;
        else {
            b.next = head;
            head.prev = b;
            head = b;
        }
    }

    void addAtEnd(Book b) {
        if (tail == null) head = tail = b;
        else {
            tail.next = b;
            b.prev = tail;
            tail = b;
        }
    }

    void addAtPosition(Book b, int pos) {
        if (pos <= 1 || head == null) { addAtBeginning(b); return; }
        Book temp = head;
        for (int i = 1; i < pos - 1 && temp.next != null; i++) temp = temp.next;
        if (temp.next == null) addAtEnd(b);
        else {
            b.next = temp.next;
            b.prev = temp;
            temp.next.prev = b;
            temp.next = b;
        }
    }

    void removeById(int id) {
        Book temp = head;
        while (temp != null && temp.bookId != id) temp = temp.next;
        if (temp == null) { System.out.println("Book ID not found."); return; }
        if (temp == head) head = head.next;
        if (temp == tail) tail = tail.prev;
        if (temp.prev != null) temp.prev.next = temp.next;
        if (temp.next != null) temp.next.prev = temp.prev;
        System.out.println("Book removed: " + temp.title);
    }

    void search(String keyword) {
        Book temp = head;
        boolean found = false;
        while (temp != null) {
            if (temp.title.equalsIgnoreCase(keyword) || temp.author.equalsIgnoreCase(keyword)) {
                printBook(temp);
                found = true;
            }
            temp = temp.next;
        }
        if (!found) System.out.println("No matching books found.");
    }

    void updateAvailability(int id, boolean status) {
        Book temp = head;
        while (temp != null) {
            if (temp.bookId == id) {
                temp.isAvailable = status;
                System.out.println("Availability updated for Book ID " + id);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Book ID not found.");
    }

    void displayForward() {
        System.out.println("\nBooks in Library (Forward):");
        Book temp = head;
        while (temp != null) {
            printBook(temp);
            temp = temp.next;
        }
    }

    void displayReverse() {
        System.out.println("\nBooks in Library (Reverse):");
        Book temp = tail;
        while (temp != null) {
            printBook(temp);
            temp = temp.prev;
        }
    }

    int countBooks() {
        int count = 0;
        Book temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    private void printBook(Book b) {
        System.out.println("ID: " + b.bookId + ", Title: " + b.title + ", Author: " + b.author +
                ", Genre: " + b.genre + ", Available: " + (b.isAvailable ? "Yes" : "No"));
    }
}

public class LibraryManagement {
    public static void main(String[] args) {
        Library lib = new Library();

        lib.addAtEnd(new Book(1, "1984", "George Orwell", "Dystopian", true));
        lib.addAtBeginning(new Book(2, "The Hobbit", "J.R.R. Tolkien", "Fantasy", true));
        lib.addAtPosition(new Book(3, "Sapiens", "Yuval Noah Harari", "History", false), 2);

        lib.displayForward();
        lib.displayReverse();

        lib.search("Sapiens");
        lib.updateAvailability(3, true);

        lib.removeById(2);
        lib.displayForward();

        System.out.println("\nTotal Books: " + lib.countBooks());
    }
}
