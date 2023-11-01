package week5.lab;

import java.util.Objects;

public class Thing implements ToBeStored {
    private double weight;

    public Thing(double weight) {
        if (this.weight >= 0) {
            this.weight = weight;
        } else {
            throw new IllegalArgumentException();
        }
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public double weight() {
        return this.weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Thing thing = (Thing) o;
        return Double.compare(thing.weight, weight) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(weight);
    }
}
