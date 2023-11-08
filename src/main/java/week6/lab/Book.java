package week6.lab;

public class Book {
    private String title;
    private String publisher;
    private int year;

    public Book(String title, String author, int year) {
        this.title = title;
        this.publisher = author;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public String getPublisher() {
        return publisher;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return this.title + ", " + this.publisher + ", " + this.year;
    }
}
