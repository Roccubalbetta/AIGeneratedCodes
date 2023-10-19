import java.util.ArrayList;
import java.util.List;

class Library {
    private List<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public List<Book> getBooks() {
        return books;
    }

    /* ChatGPT solution */
    public List<Book> searchBooksByAuthor(String author) {
        List<Book> booksByAuthor = new ArrayList<>();
        for (Book book : books) {
            if (book.getAuthor().equalsIgnoreCase(author)) {
                booksByAuthor.add(book);
            }
        }
        return booksByAuthor;
    }

    /* Llama solution */
    public List<Book> getBooksByAuthor(String author) {
        List<Book> booksByAuthor = new ArrayList<>();
        for (Book book : books) {
            if (book.getAuthor().equals(author)) {
                booksByAuthor.add(book);
            }
        }
        return booksByAuthor;
    }
}

class Book {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }


}



public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        library.addBook(new Book("The Great Gatsby", "F. Scott Fitzgerald"));
        library.addBook(new Book("To Kill a Mockingbird", "Harper Lee"));

        List<Book> booksInLibrary = library.getBooks();
        for (Book book : booksInLibrary) {
            System.out.println("Title: " + book.getTitle() + ", Author: " + book.getAuthor());
        }

        // Search for books by a specific author ChatGPT
        String authorToSearch = "F. Scott Fitzgerald";
        List<Book> booksByAuthor = library.searchBooksByAuthor(authorToSearch);

        if (booksByAuthor.isEmpty()) {
            System.out.println("No books found by author: " + authorToSearch);
        } else {
            System.out.println("Books by author " + authorToSearch + ":");
            for (Book book : booksByAuthor) {
                System.out.println("Title: " + book.getTitle() + ", Author: " + book.getAuthor());
            }
        }

        // Search for books by a specific author Llama
        String authorToSearchLlama = "F. Scott Fitzgerald";
        List<Book> booksByAuthorLlama = library.getBooksByAuthor(authorToSearchLlama);
        System.out.println("Books by " + authorToSearchLlama + ":");
        for (Book book : booksByAuthorLlama) {
            System.out.println("Title: " + book.getTitle() + ", Author: " + book.getAuthor());
        }
    }
}