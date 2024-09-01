
// Assumption taken
// only one copy of a book exists i.e Quantity of a book is atmost =1

public class Book {

    private String isbn; // isbn : acts as a key to identify each book uniquely
    private String title; // book title
    private String author; // author's name
    private int publicationYear; // publishing year of book
    private boolean isBorrowed; // flag to know if book has been borrowed or not

    // constructor
    public Book(String isbn, String title, String author, int publicationYear) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
        this.isBorrowed = false;
    }

    // to get isbn of the book
    public String getIsbn() {
        return isbn;
    }

    // to get title of the book
    public String getTitle() {
        return title;
    }

    // to get author name of the book
    public String getAuthor() {
        return author;
    }

    // to get publication year of the book
    public int getpublicationYear() {
        return publicationYear;
    }

    // to know if book is borrowed or not
    public boolean isBorrowed() {
        return isBorrowed;
    }

    public void borrowBook() {
        if (isBorrowed == false) {
            isBorrowed = true;
        } else {
            throw new IllegalStateException("Book is not available for borrowing!");
        }
    }

    public void returnBook() {
        isBorrowed = false;
    }

    // overriding to String method
    public String toString() {
        return "ISBN:" + isbn + "\n Title:" + title + "\n Author:" + author + "\n Year:" + publicationYear
                + "\n isBorrowed:"
                + isBorrowed;

    }
}