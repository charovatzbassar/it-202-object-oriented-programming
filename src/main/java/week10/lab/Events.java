package week10.lab;

import java.io.*;
import java.util.List;
import java.util.Random;

public class Events {
    private static final int numOfRecords = 1000000;
    private static final String[] eventTypes = {"Login", "Logout", "Purchase", "ViewPage", "Error"};
    public void generateEventsFile(String filename) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(
                new FileWriter(filename)
        );
        Random rnd = new Random();
        for (int i = 0; i < numOfRecords; i++) {
            bufferedWriter.write("Timestamp: " + System.currentTimeMillis() +
                    "\nEvent Type: " + eventTypes[rnd.nextInt(eventTypes.length)] +
                    "\nID: " + rnd.nextInt(1000) + "\n\n");
        }
        bufferedWriter.close();
    }

    public void readEventsFile(String filename) throws IOException{
        BufferedReader bufferedReader = new BufferedReader(
                new FileReader(filename)
        );
        List<String> lines = bufferedReader.lines().toList();

        for (String line : lines)
            System.out.println(line);

        bufferedReader.close();
    }

}
