public class BookTest {
    public static void main(String[] args) {
        Book.displayLibraryName();

        Book b1 = new Book("978-0134685991", "Effective Java", "Joshua Bloch");
        Book b2 = new Book("978-0596009205", "Head First Java", "Kathy Sierra");

        b1.displayBookDetails();
        b2.displayBookDetails();
    }
}
