package LibrarySystem;

class Book {
    private String title;
    private String author;
    private String isbn;
    private boolean isBorrowed;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.isbn = generateISBN(title, author);
        this.isBorrowed = false;
    }

    /*Kitap isminin ilk 3 harfi yazar isminin ilk 3 harfi ve ikisinin ascii
    karakterleri toplamı ile oluşturulan algoritma isbn numarasını verir.*/
    private String generateISBN(String title, String author) {
        String titlePart = title.length() >= 3 ? title.substring(0, 3).toUpperCase() : title.toUpperCase();
        String authorPart = author.length() >= 3 ? author.substring(0, 3).toUpperCase() : author.toUpperCase();
        int titleAsciiSum = titlePart.chars().sum();
        int authorAsciiSum = authorPart.chars().sum();
        int checksum = (titleAsciiSum + authorAsciiSum) % 1000;
        return titlePart + authorPart + String.format("%03d", checksum);
    }

    public String getTitle() {
        return title;
    }

    public String getIsbn() {
        return isbn;
    }

    //Kitap ödünç almak
    public void borrowBook() {
        if (!isBorrowed) {
            isBorrowed = true;
            System.out.println("Book borrowed: " + title);
        } else {
            System.out.println("This book is already borrowed.");
        }
    }

    //Kitap iade etmek
    public void returnBook() {
        if (isBorrowed) {
            isBorrowed = false;
            System.out.println("Book returned: " + title);
        } else {
            System.out.println("This book is already in the library.");
        }
    }

    @Override
    public String toString() {
        return "Book: " + title + "\nAuthor: " + author + "\nISBN: " + isbn + "\nStatus: " + (isBorrowed ? "Borrowed" : "Available" + "\n----------------------------");
    }
}