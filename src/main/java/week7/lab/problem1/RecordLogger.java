package week7.lab.problem1;

import java.util.Objects;

public record RecordLogger(String loggerName) implements Logger {
    public RecordLogger {
        Objects.requireNonNull(loggerName);
    }

    @Override
    public String logMessage(String message) {
        return message + " (" + loggerName + ")";
    }
}
