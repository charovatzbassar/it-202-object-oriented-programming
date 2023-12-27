package week13.lab.problem3;

public class CamelCaseFormatter implements TextFormatter {
    @Override
    public String formatText(String text) {
        String[] words = text.split("[\\s_]+");
        String result = words[0].toLowerCase();
        for (int i = 1; i < words.length; i++) {
            result = result.concat(words[i].substring(0,1).toUpperCase() + words[i].substring(1).toLowerCase());
        }
        return result;
    }
}
