package week5.lab.boxes;

import week5.lab.Box;
import week5.lab.Thing;

public class OneThingBox extends Box {
    private Thing thing;
    public OneThingBox() {
        super(0);
    }

    @Override
    public void add(Thing item) {
        this.thing = item;
    }
}
