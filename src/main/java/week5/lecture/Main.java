package week5.lecture;

public class Main {
    public static void main(String[] args) {
        Book b1 = new Book("The Secret History", 640);
        Book b2 = new Book("The Secret History", 640);
        Book b3 = new Book("Stranger", 200);

        if (b2.equals(b1)) System.out.println("They are the same");
    }
}

