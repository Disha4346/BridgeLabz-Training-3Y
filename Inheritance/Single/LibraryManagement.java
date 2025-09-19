class Book {
    private String title;
    private int publicationYear;

    public Book(String title, int publicationYear) {
        this.title = title;
        this.publicationYear = publicationYear;
    }

    public String getTitle() {
        return title;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void displayInfo() {
        System.out.println("Book: " + title + " | Year: " + publicationYear);
    }
}

class Author extends Book {
    private String name;
    private String bio;

    public Author(String title, int publicationYear, String name, String bio) {
        super(title, publicationYear);
        this.name = name;
        this.bio = bio;
    }

    @Override
    public void displayInfo() {
        System.out.println("Book: " + getTitle() + " | Year: " + getPublicationYear() +
                           " | Author: " + name + " | Bio: " + bio);
    }
}

public class LibraryManagement {
    public static void main(String[] args) {
        Author a1 = new Author("The Great Adventure", 2020, "John Smith", "Loves writing fantasy novels.");
        a1.displayInfo();
    }
}
