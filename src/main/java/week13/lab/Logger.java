package week13.lab;

public class Logger {
    private static Logger instance;

    public Logger() {
    }

    public void log(String message) {
        System.out.println("Message: " + message);
    }

    public void logInfo(String message) {
        System.out.println("Information: " + message);
    }

    public void logWarning(String message) {
        System.out.println("WARNING: " + message);
    }

    public void logError(String message) {
        System.out.println("ERROR: " + message);
    }

    public static Logger getInstance() {
        synchronized (Logger.class) {
            if (instance == null) {
                instance = new Logger();
            }
        }
        return instance;
    }
}
