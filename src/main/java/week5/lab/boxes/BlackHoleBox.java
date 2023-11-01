package week5.lab.boxes;

import week5.lab.Box;
import week5.lab.Thing;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class BlackHoleBox extends Box {
    private ArrayList<Thing> things;
    public BlackHoleBox() {
        super(0);
        this.things = new ArrayList<Thing>();
    }

    @Override
    public void add(Thing item) {
        things.add(item);
    }

    @Override
    public boolean isInTheBox(Thing thing) {
        return false;
    }
}
