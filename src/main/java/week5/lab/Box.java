package week5.lab;

import week5.lab.boxes.AbstractBox;

import java.util.ArrayList;
public class Box extends AbstractBox implements ToBeStored {
    private ArrayList<Thing> things;
    private double currentWeight;
    private double maxWeight;

    public Box(double maxWeight) {
        this.maxWeight = maxWeight;
        this.things = new ArrayList<Thing>();
        this.currentWeight = 0;
    }

    @Override
    public void add(Thing item) {
        if ((currentWeight + item.weight()) > maxWeight) {
            System.out.println("Item exceeds max weight");
        } else {
            things.add(item);
            this.currentWeight += item.weight();

        }
    }

    @Override
    public boolean isInTheBox(Thing thing) {
        return this.things.contains(thing);
    }

    @Override
    public String toString() {
        return "AbstractBox: " + things.size() + " things, total weight: " + this.currentWeight + " kg";
    }

    @Override
    public double weight() {
        return 0;
    }
}
