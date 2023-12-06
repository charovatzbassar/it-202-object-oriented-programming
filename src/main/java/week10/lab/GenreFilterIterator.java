package week10.lab;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.function.Consumer;

public class GenreFilterIterator implements Iterator<Song> {
    private ArrayList<Song> songs;
    private String targetGenre;
    private int currentIndex = 0;

    public GenreFilterIterator(ArrayList<Song> songs, String targetGenre) {
        this.songs = songs;
        this.targetGenre = targetGenre;
    }

    @Override
    public boolean hasNext() {
        while (currentIndex < songs.size() && songs.get(currentIndex).getGenre().equals(this.targetGenre)) {
            currentIndex++;  // Skip even numbers
        }
        return currentIndex < songs.size();
    }

    @Override
    public Song next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        return songs.get(currentIndex++);
    }

}
}
