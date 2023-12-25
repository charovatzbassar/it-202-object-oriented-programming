package week13.lecture;

public class Singleton {
    private static Singleton instance;

    private Singleton() {
    }

    public static Singleton getInstance() {
        synchronized (Singleton.class) { // at one point in time, two threads cannot access it at the same time
            if (instance == null) {
                instance = new Singleton();
            }
        }
        return instance;
    }
}
