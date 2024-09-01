
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // creating an object of library class
        Library library = new Library();
        Scanner scanner = new Scanner(System.in);

        // Asks user to enter choice and perform tasks until they enter 5 to quit.

        while (true) {
            System.out.println("\n Library Management System");
            System.out.println("Enter 1 To Add a Book");
            System.out.println("Enter 2 To Borrow a Book");
            System.out.println("Enter 3 To Return a Book:");
            System.out.println("Enter 4 To view Available Books:");
            System.out.println("Enter 5 To Quit");
            System.out.println("\nEnter your choice:");

            int choice = scanner.nextInt();
            scanner.nextLine();

            try {
                switch (choice) {
                    // To Add book : Taking details from user

                    case 1:
                        System.out.println("Enter ISBN:");
                        String isbn = scanner.nextLine();
                        System.out.println("Enter Book Title:");
                        String title = scanner.nextLine();
                        System.out.println("Enter Author Name:");
                        String author = scanner.nextLine();
                        System.out.println("Enter Publication Year:");
                        int year = scanner.nextInt();
                        library.addBook(new Book(isbn, title, author, year)); // adds the book to the library
                        System.out.println("Book added successfully.");
                        break;

                    // To Borrow Book : Taking details from user about the book

                    case 2:
                        System.out.println("Enter ISBN of the book to borrow:");
                        isbn = scanner.nextLine();
                        library.borrowBook(isbn); // sets the availability of book to unavailable
                        System.out.println("Book borrowed successfully.");
                        break;

                    // To return a book : Taking deyails from user about the book

                    case 3:
                        System.out.println("Enter ISBN of the book to return:");
                        isbn = scanner.nextLine();
                        library.returnBook(isbn); // sets the availability of book to available
                        System.out.println("Book returned successfully.");
                        break;

                    // To view the available books

                    case 4:
                        System.out.println("Available Books are :");
                        library.viewAvailableBooks();
                        break;

                    // To stop accessing the library

                    case 5:
                        System.out.println("Quit");
                        scanner.close();
                        return;

                    default:
                        System.out.println("Invalid choice. Please enter appropriate choice.");
                }
            } catch (Exception e) {

                System.out.println(e.getMessage());
            }

        }
    }
}
