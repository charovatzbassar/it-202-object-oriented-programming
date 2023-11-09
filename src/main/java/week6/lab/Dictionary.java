package week6.lab;

import java.util.ArrayList;
import java.util.HashMap;

public class Dictionary {
    private HashMap<String, String> words;

    public Dictionary() {
        this.words = new HashMap<String, String>();
    }

    public String translate(String word) {
        if (!this.words.containsKey(word)) return null;

        return this.words.get(word);
    }

    public void add(String word, String translation) {
        this.words.put(word, translation);
    }

    public int amountOfWords() {
        return this.words.size();
    }

    public ArrayList<String> translationList() {
        ArrayList<String> translations = new ArrayList<String>();

        for (String word : this.words.keySet()) {
            translations.add(word + " = " + this.words.get(word));
        }

        return translations;
    }
}
