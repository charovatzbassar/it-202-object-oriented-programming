package week5.lab;

public class Book extends Thing {
    private String writer;
    private String name;
    private double weight;

    public Book(String writer, String name, double weight) {
        super(weight);
        this.writer = writer;
        this.name = name;
        this.weight = weight;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return writer + ": " + name;
    }

    @Override
    public double weight() {
        return this.weight;
    }
}
