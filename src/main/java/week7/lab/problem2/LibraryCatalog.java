package week7.lab.problem2;

import java.util.ArrayList;
import java.util.Optional;

public class LibraryCatalog {
    private ArrayList<Book> books;

    public LibraryCatalog() {
        this.books = new ArrayList<Book>();
    }

    public boolean checkAvailabillityByTitle(String title) {
        return books.stream()
                .anyMatch(book -> book.title().equals(title) && book.availabilityStatus());
    }

    public void getDetails(String author) {
        Optional<Book> foundBook = books.stream().filter(book -> book.author().equals(author)).findFirst();
        System.out.println(foundBook);
    }

    public void updateAvailabilityStatus(Book book) {
        books.stream()
                .map(currentBook -> {
                    if (currentBook.equals(book)) {
                        return new Book(currentBook.title(), currentBook.author(), currentBook.publicationYear(), !currentBook.availabilityStatus());
                    }
                    return currentBook;
                });
    }
}
