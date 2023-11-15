package week7.lab.problem1;

public class ClassLogger implements Logger {
    private String loggerName;

    public ClassLogger(String loggerName) {
        this.loggerName = loggerName;
    }

    @Override
    public String logMessage(String message) {
        return message + " (" + this.loggerName + ")";
    }
}
