package week6.lab;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

class Birdwatchers {
    private HashMap<Bird, Integer> observations;

    public Birdwatchers() {
        this.observations = new HashMap<Bird, Integer>();
    }

    public void add(String name, String latinName) {
        Bird bird = new Bird(name, latinName);
        this.observations.put(bird, 0);
    }


    public void statistics() {
        Bird[] birdArr = this.observations.keySet().toArray(new Bird[0]);

        for (Bird currentBird : birdArr) {
            System.out.println(currentBird + ": " + this.observations.get(currentBird) + " observations");
        }
    }


    public void observation(String name) {
        Bird bird = this.find(name);
        if (bird != null) {
            this.observations.put(bird, this.observations.get(bird) + 1);
        } else {
            System.out.println("Bird not found!");
        }
    }


    public void show(String name) {
        Bird bird = this.find(name);
        if (bird != null) {
            System.out.println(bird + ": " + this.observations.get(bird) + " observations");
        }else {
            System.out.println("Bird not found!");
        }
    }


    public Bird find(String name) {
        Bird[] birdArr = this.observations.keySet().toArray(new Bird[0]);

        for (Bird currentBird : birdArr) {
            if (StringUtils.included(name, currentBird.getName())) {
                return currentBird;
            }
        }

        return null;
    }

    public static void main(String[] args) {


        Birdwatchers bwdb = new Birdwatchers();
        Scanner scanner = new Scanner(System.in);
        List<String> options = Arrays.asList("add", "statistics", "observation", "show");
        String input = "";

        while (!input.equals("quit")) {
            input = scanner.nextLine().toLowerCase();

            if (!options.contains(input)) {
                continue;
            }

            switch (input) {
                case "add" -> {
                    System.out.print("Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Latin Name: ");
                    String latinName = scanner.nextLine();
                    bwdb.add(name, latinName);
                }
                case "statistics" -> bwdb.statistics();
                case "show" -> {
                    System.out.print("What? ");
                    String birdName = scanner.nextLine();
                    bwdb.show(birdName);
                }
                case "observation" -> {
                    System.out.print("What was observed? ");
                    String observedBirdName = scanner.nextLine();
                    bwdb.observation(observedBirdName);
                }
            }
        }
}
}
