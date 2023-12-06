package week10.lab;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.Consumer;

public class GenreFilterIterator implements Iterator<Song> {
    private ArrayList<Song> songs;
    private String targetGenre;

    public GenreFilterIterator(ArrayList<Song> songs, String targetGenre) {
        this.songs = songs;
        this.targetGenre = targetGenre;
    }

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Song next() {
        return null;
    }
}
