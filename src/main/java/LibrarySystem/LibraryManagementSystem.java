package LibrarySystem;

import java.util.Scanner;

public class LibraryManagementSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Library library = new Library();

        //Kullanıcı ekranı: Kullanıcıya hangi işlemleri yapabileceğini gösteren bir ekran.
        while (true) {
            System.out.println("\n--- Welcome to Library Management System ---");
            System.out.println("\nPlease select an option:");
            System.out.println("1. Add a new book");
            System.out.println("2. Display all books");
            System.out.println("3. Search for a book with a title");
            System.out.println("4. Check out a book with ISBN");
            System.out.println("5. Return a book with ISBN");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Book Title: ");
                    String title = scanner.nextLine();
                    System.out.print("Book Author: ");
                    String author = scanner.nextLine();
                    library.addBook(title, author);
                    break;
                case 2:
                    System.out.println("\nAll Books:" + "\n----------------------------");
                    library.displayBooks();
                    break;
                case 3:
                    System.out.print("Enter Book Title: ");
                    String searchQuery = scanner.nextLine();
                    library.searchBook(searchQuery);
                    break;
                case 4:
                    System.out.print("Enter ISBN to Borrow: ");
                    String borrowISBN = scanner.nextLine();
                    library.borrowBook(borrowISBN);
                    break;
                case 5:
                    System.out.print("Enter ISBN to Return: ");
                    String returnISBN = scanner.nextLine();
                    library.returnBook(returnISBN);
                    break;
                case 6:
                    System.out.println("Exiting the library management system.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice, please try again.");
            }
        }
    }
}

