package week6.lab;

import java.util.ArrayList;
import java.util.HashMap;

public class Birdwatchers {
    private HashMap<Bird, Integer> observations;

    public Birdwatchers() {
        this.observations = new HashMap<Bird, Integer>();
    }

    public void add(Bird bird) {
        observations.put(bird, 0);
    }

    public String find(String name) {
        Bird[] birdArr = observations.keySet().toArray(new Bird[0]);

        for (Bird bird : birdArr) {
            if (StringUtils.included(bird.getName(), name)) {
                return name;
            }
        }

        return "";
    }
}
