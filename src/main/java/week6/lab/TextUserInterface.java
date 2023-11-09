package week6.lab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class TextUserInterface {
    private Scanner reader;
    private Dictionary dictionary;

    public TextUserInterface(Scanner reader, Dictionary dictionary) {
        this.reader = reader;
        this.dictionary = dictionary;
    }

    public void start() {
        List<String> options = Arrays.asList("add", "translate");
        String input = "";

        while (!input.equals("quit")) {
            input = this.reader.nextLine().toLowerCase();

            if (!options.contains(input)) {
                continue;
            }

            switch (input) {
                case "add" -> {
                    System.out.print("In Finnish: ");
                    String finnishWord = this.reader.nextLine().toLowerCase();
                    System.out.print("Translation: ");
                    String translation = this.reader.nextLine().toLowerCase();
                    this.dictionary.add(finnishWord, translation);
                }
                case "translate" -> {
                    System.out.print("Give a word: ");
                    String finnishWord = this.reader.nextLine().toLowerCase();
                    System.out.println(this.dictionary.translate(finnishWord));
                }
            }
        }
        System.out.println("Cheers!");
    }
}
