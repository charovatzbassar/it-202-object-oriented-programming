package week6.lab;

import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;

    public Library() {
        this.books = new ArrayList<Book>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void printBooks() {
        for (Book book : books) {
            System.out.println(book);
        }
    }

    public ArrayList<Book> searchByTitle(String title) {
        ArrayList<Book> foundBooks = new ArrayList<Book>();

        for (Book book : books) {
            if (StringUtils.included(book.getTitle(), title)) {
                foundBooks.add(book);
            }
        }

        return foundBooks;
    }

    public ArrayList<Book> searchByPublisher(String publisher) {
        ArrayList<Book> foundBooks = new ArrayList<Book>();

        for (Book book : books) {
            if (StringUtils.included(book.getPublisher(), publisher)) {
                foundBooks.add(book);
            }
        }

        return foundBooks;
    }

    public ArrayList<Book> searchByYear(int year) {
        ArrayList<Book> foundBooks = new ArrayList<Book>();

        for (Book book : books) {
            if (book.getYear() == year) {
                foundBooks.add(book);
            }
        }

        return foundBooks;
    }
}
