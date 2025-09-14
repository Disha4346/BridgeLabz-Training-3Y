public class EBook extends Book {

    public EBook(String ISBN, String title, String author) {
        super(ISBN, title, author); // Call the constructor of the superclass
    }

    public void displayInfo() {
        System.out.println("ISBN: " + ISBN);
        System.out.println("Title: " + title);
        System.out.println("Author: " + getAuthor()); // Access private field via getter
    }
}
