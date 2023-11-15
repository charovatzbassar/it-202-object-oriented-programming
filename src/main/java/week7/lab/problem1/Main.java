package week7.lab.problem1;

public class Main {
    public static void main(String[] args) {
        RecordLogger logger1 = new RecordLogger("Logger 1");
        ClassLogger logger2 = new ClassLogger("Logger 2");

        LoggerFunction getLogger1Message = (message) -> logger1.logMessage(message);
        LoggerFunction getLogger2Message = (message) -> logger2.logMessage(message);

        printLogMessage("Hello from logger 1", getLogger1Message);
        printLogMessage("Hello from logger 2", getLogger2Message);
    }

    public static void printLogMessage(String message, LoggerFunction fn) {
        String result = fn.logMessage(message);
        System.out.println(result);
    }
}

interface LoggerFunction {
    String logMessage(String message);
}
