package week7.lecture;

import java.util.Objects;

record AnimalRecord(String name, int age, int numOfLegs) {}
// literally the same thing
public class Animal {
    private final String NAME;
    private final int AGE;
    private final int NUM_OF_LEGS;

    public Animal(String NAME, int AGE, int NUM_OF_LEGS) {
        this.NAME = NAME;
        this.AGE = AGE;
        this.NUM_OF_LEGS = NUM_OF_LEGS;
    }

    public String getNAME() {
        return NAME;
    }

    public int getAGE() {
        return AGE;
    }

    public int getNUM_OF_LEGS() {
        return NUM_OF_LEGS;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "NAME='" + NAME + '\'' +
                ", AGE=" + AGE +
                ", NUM_OF_LEGS=" + NUM_OF_LEGS +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(NAME, AGE, NUM_OF_LEGS);
    }

    @Override
    public boolean equals(Object o) {
        Animal animal = (Animal) o;
        return this.NAME.equals(animal.getNAME()) && this.AGE == animal.getAGE() && this.NUM_OF_LEGS == animal.getNUM_OF_LEGS();
    }
}

class Testable {
    public static void main(String[] args) {

    }
}
