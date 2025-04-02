package LibrarySystem;

import java.util.ArrayList;

class Library {
    private ArrayList<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    //Kütüphaneye yeni kitaplar ekler
    public void addBook(String title, String author) {
        Book newBook = new Book(title, author);
        books.add(newBook);
        System.out.println("Book successfully added. ISBN: " + newBook.getIsbn());
    }

    //Kütüphanedeki tüm kitapları görüntülemek
    public void displayBooks() {
        if (books.isEmpty()) {
            System.out.println("The library is empty.");
        } else {
            for (Book book : books) {
                System.out.println(book);
            }
        }
    }

    //Başlığa göre kitap aramak
    public void searchBook(String query) {
        boolean found = false;
        for (Book book : books) {
            if (book.getTitle().toLowerCase().contains(query.toLowerCase())) {
                System.out.println("\nBook found: \n\n" + book);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No books found matching the query.");
        }
    }

    //Kitap ödünç almak
    public void borrowBook(String isbn) {
        for (Book book : books) {
            if (book.getIsbn().equals(isbn)) {
                book.borrowBook();
                return;
            }
        }
        System.out.println("Book not found or already borrowed.");
    }

    //Kitap iade etmek
    public void returnBook(String isbn) {
        for (Book book : books) {
            if (book.getIsbn().equals(isbn)) {
                book.returnBook();
                return;
            }
        }
        System.out.println("Book not found.");
    }
}