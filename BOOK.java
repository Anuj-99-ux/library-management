public class Book {
    // Attributes
    private String title;
    private String author;

    // Constructor to initialize title and author
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    // Method to display book information
    public void displayInfo() {
        System.out.println("Book Title: " + this.title);
        System.out.println("Author: " + this.author);
    }

    // Main method to test the Book class
    public static void main(String[] args) {
        // Creating an instance of Book
        Book book1 = new Book("To Kill a Mockingbird", "Harper Lee");
        
        // Displaying book information
        book1.displayInfo();
    }
}
