package week5.lecture;

public class Book implements Readable {
    private String title;
    private int numOfPages;
    private int currentPage;

    public Book(String title, int numOfPages) {
        this.title = title;
        this.numOfPages = numOfPages;
        this.currentPage = 1;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getNumOfPages() {
        return numOfPages;
    }

    public void setNumOfPages(int numOfPages) {
        this.numOfPages = numOfPages;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;

        if (!(obj instanceof Book)) return false;

        Book b = (Book) obj;

        return this.title.equals(b.title) && this.numOfPages == b.numOfPages;
    }

    @Override
    public String read() {
        this.currentPage++;
        return "Currently on page " + numOfPages;
    }
}
