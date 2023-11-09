package week6.lab;

public class StringUtils {
    public static boolean included(String word, String searched) {
        return word.toLowerCase().contains(searched.toLowerCase());
    }
}
