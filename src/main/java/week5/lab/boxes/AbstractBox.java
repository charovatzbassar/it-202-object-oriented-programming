package week5.lab.boxes;

import week5.lab.Thing;

public abstract class AbstractBox {
    public abstract void add(Thing thing);
    public abstract boolean isInTheBox(Thing thing);
}
