package week5.lab.boxes;

import week5.lab.Box;
import week5.lab.Thing;

import java.util.ArrayList;

public class MaxWeightBox extends Box {
    private double currentWeight;
    private ArrayList<Thing> things;
    private double maxWeight;
    public MaxWeightBox(double maxWeight) {
        super(maxWeight);
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

}
