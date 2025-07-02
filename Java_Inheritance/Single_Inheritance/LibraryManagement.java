class Book{
	String title;
	int publicationYear;
	
	// Constructor to initialize superclass properties
	Book (String booktitle, int year){
		this.title = booktitle;
		this.publicationYear = year;
	}
}

// Derived class from superclass
class Author extends Book{
	String name;
	String bio;
	
	// Constructor to inherit superclass properties and additional properties
	Author(String booktitle, int year, String authorName, String authorBio){
		super(booktitle, year);
		this.name = authorName;
		this.bio = authorBio;
	}
	
	// Method to display output
	void display() {
		System.out.println("Book Title : " +title);
		System.out.println("Author Name : " +name);
		System.out.println("Publication Year : " +publicationYear);
		System.out.println("Author Bio : " +bio);
	}
}

// Main class
class LibraryManagement{
	// Main method to display data
	public static void main(String[] args) {
		Author au = new Author("Rich Dad Poor Dad", 1997, "Robert T.Kiyosaki", "He is an entrepreneur");
		au.display();
	}
}