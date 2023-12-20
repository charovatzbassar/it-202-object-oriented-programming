package week12.lab;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class ClientHandler implements Runnable {

    @Override
    public void run() {

    }

    public static void socketClient(String address, int port, String msg) {
        try {
            Socket connection = new Socket(address, port);
            OutputStream outputStream = connection.getOutputStream();

            outputStream.write(msg.getBytes());

            outputStream.close();
            connection.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
