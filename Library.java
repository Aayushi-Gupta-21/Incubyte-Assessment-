import java.util.HashMap;
import java.util.Map;

public class Library {

    // using map to keep track of books in library
    // where key=book.getisbn();
    // where value=book;
    private Map<String, Book> books;

    public Library() {
        books = new HashMap<>();
    }

    // method to add book
    public void addBook(Book book) {
        if (!books.containsKey(book.getIsbn())) {
            books.put(book.getIsbn(), book);
        } else {
            throw new IllegalArgumentException("Book with this ISBN already exists!");// if book already exists
        }

    }

    // method to borrow book
    public void borrowBook(String isbn) {
        if (books.containsKey(isbn)) {
            books.get(isbn).borrowBook();
        } else {
            // when trying to borrow a book whose record does not exist in library
            throw new IllegalArgumentException("Book not found!");
        }
    }

    // method to return a book
    public void returnBook(String isbn) {
        if (books.containsKey(isbn)) {
            books.get(isbn).returnBook();
        } else {
            // when trying to return a book whose record does not exist in library
            throw new IllegalArgumentException("Book not found!");
        }
    }

    // method to view available books
    public void viewAvailableBooks() {
        for (Book book : books.values()) {
            if (book.isBorrowed() == false) { // not allowing borrowed books to be viewed
                System.out.println(book);
            } else {
                System.out.println("Book not found.");
            }
        }
    }

}