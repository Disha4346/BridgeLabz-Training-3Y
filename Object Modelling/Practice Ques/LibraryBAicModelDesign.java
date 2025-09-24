import java.util.ArrayList;
import java.util.List;

// Book class (Independent entity)
class Book {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getDetails() {
        return title + " by " + author;
    }
}

// Library class (Aggregates books)
class Library {
    private String name;
    private List<Book> books;

    public Library(String name) {
        this.name = name;
        this.books = new ArrayList<>();
    }

    // Add book to library
    public void addBook(Book book) {
        books.add(book);
    }

    // Show all books in library
    public void showBooks() {
        System.out.println("Books in " + name + " Library:");
        for (Book b : books) {
            System.out.println(" - " + b.getDetails());
        }
    }
}

// Main class
public class LibraryBAicModelDesign {
    public static void main(String[] args) {
        // Books exist independently
        Book b1 = new Book("1984", "George Orwell");
        Book b2 = new Book("The Hobbit", "J.R.R. Tolkien");
        Book b3 = new Book("Clean Code", "Robert C. Martin");

        // Two libraries
        Library lib1 = new Library("City Central");
        Library lib2 = new Library("Community");

        // Aggregating same books into different libraries
        lib1.addBook(b1);
        lib1.addBook(b2);

        lib2.addBook(b2);
        lib2.addBook(b3);

        // Display books
        lib1.showBooks();
        lib2.showBooks();
    }
}
